package fr.openpeople.rdalte.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.core.exception.ConstraintValidationException;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec;
import fr.labsticc.framework.constraints.model.constraints.ConstraintsFactory;
import fr.labsticc.framework.constraints.model.constraints.Expression;
import fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.service.IConstraintServicesFacade;
import fr.labsticc.framework.constraints.service.IConstraintValidationAS;
import fr.labsticc.framework.core.IResourceHandler;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.core.util.FileUtil;
import fr.labsticc.framework.emf.core.object.EMFURIEqualsList;
import fr.labsticc.framework.emf.core.resource.BundleEMFResourceHandler;
import fr.openpeople.rdal2.model.rdal.AbstractGoal;
import fr.openpeople.rdal2.model.rdal.AbstractRequirement;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.RdalFactory;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements;
import fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements;
import fr.openpeople.rdal2.model.rdal.ReferencedDesignElements;
import fr.openpeople.rdal2.model.rdal.Sensitivity;
import fr.openpeople.rdal2.model.rdal.Specification;
import fr.openpeople.rdal2.model.rdal.SystemContext;
import fr.openpeople.rdal2.model.rdal.SystemOverview;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;

public class TraceableToDesignAS {

	private final IConstraintValidationAS validator;
	private final IResourceHandler resourcesHandler;
	private final IConstraintServicesFacade cstFacade;
	
	protected TraceableToDesignAS( 	final IConstraintValidationAS p_validator,
									final IConstraintServicesFacade p_cstFacade ) {
		validator = p_validator;
		cstFacade = p_cstFacade;
		resourcesHandler = new BundleEMFResourceHandler();
	}

	protected IConstraintServicesFacade getConstraintsFacade() {
		return cstFacade;
	}
	
	ConstraintLanguage constraintLanguage( 	final TraceableToDesignElementsElement p_traceableToDesignElem,
											final String p_languageId ) {
		if ( p_languageId != null ) {
			for ( final ConstraintLanguage language : definedLanguages( p_traceableToDesignElem ) ) {
				if ( p_languageId.equals( language.getId() ) ) {
					return language;
				}
			}
		}
		
		return null;
	}
	
	Collection<ConstraintLanguage> definedLanguages( final TraceableToDesignElementsElement p_traceableToDesignElem ) {
		if ( p_traceableToDesignElem == null ) {
			return Collections.emptyList();
		}

		final Specification reqSpec = p_traceableToDesignElem.getSpecification();
		assert reqSpec != null : "A RDAL element should always be contained in a RDAL specification.";
		
		final ConstraintLanguagesSpec langSpec = reqSpec.getConstraintLanguagesSpec();
		// Commenting this assert because the constraint language specification may be set by the user.
		//assert langSpec != null : "A RDAL specification should always have a constraint languages specification.";

		if ( langSpec == null ) {
			return Collections.emptyList();
		}
		
		return langSpec.getOwnedLanguages();
	}
	
	private boolean deleteLibrary( 	final FormalLanguageExpression p_expression,
									final String p_libraryId ) {
		for ( final FormalLanguageLibrary library : p_expression.getUsedLibraries() ) {
			if ( p_libraryId.equals( library.getId() ) ) {
				p_expression.getUsedLibraries().remove( library );
				
				return true;
			}
		}
		
		return false;
	}
	
	protected void deleteLibraries(	final FormalLanguageExpression p_expression,
									final Collection<String> p_libraryIds ) {
		for ( final String libraryId : p_libraryIds ) {
			deleteLibrary( p_expression, libraryId );
		}
		
		// Clean bad libraries due to constraint model change.
		for ( final FormalLanguageLibrary library : new ArrayList<FormalLanguageLibrary>( p_expression.getUsedLibraries() ) ) {
			if ( library.getOwnedExpression() == null ) {
				p_expression.getUsedLibraries().remove( library );
			}
		}
	}

	TraceableToDesignElementsElement deleteRefDesignElementsLibraries(	final TraceableToDesignElementsElement p_traceableToDesignElem,
																		final Collection<String> p_libraryIds ) 
    throws SystemException, InterruptedException {
		final FormalLanguageExpression expression = ( (RefQueryCollectedDesignElements) p_traceableToDesignElem.getOwnedReferencedDesignElements() ).getQueryExpression();
		deleteLibraries( expression, p_libraryIds );
		
		return p_traceableToDesignElem;
	}

	Collection<EObject> designElements( final TraceableToDesignElementsElement p_satElement )
	throws SystemException, ConstraintException, InterruptedException {
		final Collection<DesignElementReference> modelElementReferences = designElementReferences( p_satElement, false );
		
		return designElements( modelElementReferences );
	}

	protected List<EObject> designElements( final Collection<DesignElementReference> p_references ) {
		final List<EObject> context = new EMFURIEqualsList<EObject>();
		
		for ( final DesignElementReference ref : p_references ) {
			if ( ref.getDesignElement() != null ) {
				context.add( ref.getDesignElement() );
			}
		}
		
		return context;
	}

	List<EObject> designElements( final RefManuallySelectedDesignElements p_refDesignElement ) {
		return designElements( p_refDesignElement.getOwnedDesignElementRefs() );
	}

	List<FormalLanguageLibrary> librariesChoice( final FormalLanguageExpression p_expression )
	throws SystemException, InterruptedException {
		final List<FormalLanguageLibrary> choice = new ArrayList<FormalLanguageLibrary>( ( (FormalConstraintLanguage) p_expression.getLanguage() ).getOwnedLibraries() );
		choice.removeAll( p_expression.getUsedLibraries() );
		
		return choice;
	}
	
	protected TraceableToDesignElementsElement setDesignElements( final TraceableToDesignElementsElement p_traceableToDesignElem )
	throws SystemException, ConstraintException, InterruptedException {
		designElementReferences( p_traceableToDesignElem, true );
		
		return p_traceableToDesignElem;
	}

	@SuppressWarnings("unchecked")
	Collection<DesignElementReference> designElementReferences( final TraceableToDesignElementsElement p_satElement,
																final boolean pb_update ) 
	throws SystemException, ConstraintException, InterruptedException {
		final ReferencedDesignElements refElements = p_satElement.getOwnedReferencedDesignElements();
		
		if ( refElements instanceof RefQueryCollectedDesignElements ) {
			final Specification spec = (Specification) EcoreUtil.getRootContainer( p_satElement );
			validateSpecifies( spec );
			
			final FormalLanguageExpression constraintExpr = ( (RefQueryCollectedDesignElements) refElements ).getQueryExpression();
			final Collection<?> results = (Collection<?>) cstFacade.evaluateConstraint( constraintExpr.getLanguage().getId(),
																						constraintExpr.getText(),
																						libraries( constraintExpr ),
																						false,
																						designElements( spec ).toArray() );
			final Collection<DesignElementReference> modelElementReferences = new EMFURIEqualsList<DesignElementReference>(); 
			
			for ( final EObject modelElement : extractDesignElements( results ) ) {
				final DesignElementReference reference = RdalFactory.eINSTANCE.createDesignElementReference();
				reference.setDesignElement( modelElement );
				modelElementReferences.add( reference );
			}
			
			if ( pb_update ) {
				refElements.getOwnedDesignElementRefs().clear();
				refElements.getOwnedDesignElementRefs().addAll( modelElementReferences );
			}
			
			return modelElementReferences;
		}

		return refElements == null ? Collections.EMPTY_LIST : refElements.getOwnedDesignElementRefs();
	}
	
	TraceableToDesignElementsElement setDesignElements( final TraceableToDesignElementsElement p_traceableToDesignElem, 
														final Collection<EObject> p_selectedElements ) 
	throws SystemException, InterruptedException {
		final Collection<DesignElementReference> refs = new ArrayList<DesignElementReference>();
		
		for ( final EObject eObject : p_selectedElements ) {
			final DesignElementReference modelRef = createDesignElementReference( p_traceableToDesignElem );
			modelRef.setDesignElement( eObject );
			refs.add( modelRef );
		}
		
		return setDesignElementRefs( p_traceableToDesignElem, refs );
	}
	
	private DesignElementReference createDesignElementReference( final TraceableToDesignElementsElement p_traceableToDesignElem ) {
		if ( p_traceableToDesignElem instanceof AbstractRequirement ) {
			return RdalFactory.eINSTANCE.createVerifiableDesignElementRef();
		}

		if ( p_traceableToDesignElem instanceof AbstractGoal ) {
			return RdalFactory.eINSTANCE.createSatisfiableDesignElementRef();
		}

		if ( p_traceableToDesignElem instanceof Sensitivity ) {
			return RdalFactory.eINSTANCE.createPrioritizedSatDesignElementRef();
		}
		
		if ( p_traceableToDesignElem instanceof SystemOverview ) {
			return RdalFactory.eINSTANCE.createSystOverviewDesignElemRef();
		}
		
		if ( p_traceableToDesignElem instanceof SystemContext ) {
			return RdalFactory.eINSTANCE.createSystContextDesignElemRef();
		}
		
		return RdalFactory.eINSTANCE.createDesignElementReference();
	}

	TraceableToDesignElementsElement setDesignElementRefs( 	final TraceableToDesignElementsElement p_traceableToDesignElem,
															final Collection<DesignElementReference> p_modelElemRefs ) 
	throws SystemException, InterruptedException {
		ReferencedDesignElements curRefDesignElement = p_traceableToDesignElem.getOwnedReferencedDesignElements();
		
		if ( !( curRefDesignElement instanceof RefManuallySelectedDesignElements ) ) {
			curRefDesignElement = RdalFactory.eINSTANCE.createRefManuallySelectedDesignElements();
			p_traceableToDesignElem.setOwnedReferencedDesignElements( curRefDesignElement );
		}
		
		// Updates the elements
		final RefManuallySelectedDesignElements newElement = (RefManuallySelectedDesignElements) p_traceableToDesignElem.getOwnedReferencedDesignElements();
		newElement.getOwnedDesignElementRefs().clear();
		newElement.getOwnedDesignElementRefs().addAll( p_modelElemRefs );
		
		return p_traceableToDesignElem;
	}
	
	TraceableToDesignElementsElement setRefDesignElementsLibraries( final TraceableToDesignElementsElement p_traceableToDesignElem,
																	final Collection<FormalLanguageLibrary> p_libraries ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		validator.validate( RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS, false, p_traceableToDesignElem );
		
		setExpressionLibraries( ( (RefQueryCollectedDesignElements) p_traceableToDesignElem.getOwnedReferencedDesignElements() ).getQueryExpression(), p_libraries );
		
		return p_traceableToDesignElem;
	}
	
	protected void setExpressionLibraries( 	final FormalLanguageExpression p_expression,
											final Collection<FormalLanguageLibrary> p_libraries ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		validate( p_expression );
		
		p_expression.getUsedLibraries().addAll( p_libraries );
	}
	
	private Collection<EObject> extractDesignElements( final Collection<?> p_results ) {
		final Collection<EObject> elements = new EMFURIEqualsList<EObject>();
		
		if ( !p_results.isEmpty() ) {
			for ( final Object result : p_results ) {
				if ( result instanceof EObject ) {
					elements.add( (EObject) result );
				}
				else if ( result instanceof Collection<?> ) {
					elements.addAll( extractDesignElements( (Collection<?>) result ) );
				}
			}
		}
		
		return elements;
	}

	TraceableToDesignElementsElement setRefDesignElementsConstraintExprText( 	final TraceableToDesignElementsElement p_traceableToDesignElem,
																				final String p_languageId,
																				final String p_constraintText ) 
	throws SystemException, InterruptedException {
		final ConstraintLanguage language = constraintLanguage( p_traceableToDesignElem, p_languageId );
		final RefQueryCollectedDesignElements refDesignElements = (RefQueryCollectedDesignElements) p_traceableToDesignElem.getOwnedReferencedDesignElements(); 
		FormalLanguageExpression cstExpr = refDesignElements.getQueryExpression();
		
		if ( cstExpr == null ) {
			cstExpr = ( FormalLanguageExpression) createExpression( language );
			refDesignElements.setQueryExpression( cstExpr );
		}
		
		cstExpr.setLanguage( language );
		cstExpr.setText( p_constraintText );
		
		return p_traceableToDesignElem; 
	}

	TraceableToDesignElementsElement setDesignElementRefs( 	final TraceableToDesignElementsElement p_traceableToDesignElem,
															final String p_languageId,
															final String p_queryText ) 
	throws SystemException, InterruptedException {
		final RefQueryCollectedDesignElements exprRefDesignElement;
		final FormalLanguageExpression expression;
	
		if ( p_traceableToDesignElem.getOwnedReferencedDesignElements() instanceof RefQueryCollectedDesignElements ) {
			exprRefDesignElement = (RefQueryCollectedDesignElements) p_traceableToDesignElem.getOwnedReferencedDesignElements();
			expression = exprRefDesignElement.getQueryExpression();
			
			if ( expression.getLanguage() == null || !p_languageId.equals( expression.getLanguage().getId() ) ) {
				expression.setLanguage( constraintLanguage( p_traceableToDesignElem, p_languageId ) );
				setDefaultLibraries( expression );
			}
		}
		else {
			exprRefDesignElement = RdalFactory.eINSTANCE.createRefQueryCollectedDesignElements();

			// Preserve the existing refs so that they are not lost when toggling the design elements mode.
			if ( p_traceableToDesignElem.getOwnedReferencedDesignElements() != null ) {
				exprRefDesignElement.getOwnedDesignElementRefs().addAll( p_traceableToDesignElem.getOwnedReferencedDesignElements().getOwnedDesignElementRefs() );
			}
			
			expression = createFormalLanguageExpression( (FormalConstraintLanguage) constraintLanguage( p_traceableToDesignElem, p_languageId ) );
			expression.setLanguage( constraintLanguage( p_traceableToDesignElem, p_languageId ) );
			exprRefDesignElement.setQueryExpression( expression );
			p_traceableToDesignElem.setOwnedReferencedDesignElements( exprRefDesignElement );
		}
		
		expression.setText( p_queryText );
		
		return p_traceableToDesignElem;
	}
	
	protected Expression createExpression( final ConstraintLanguage p_language ) {
		final Expression cstExpr;
		
		if ( p_language instanceof FormalConstraintLanguage ) {
			cstExpr = createFormalLanguageExpression( (FormalConstraintLanguage) p_language );
		}
		else {
			cstExpr = ConstraintsFactory.eINSTANCE.createNaturalLanguageExpression();
		}
		
		return cstExpr;
	}
	
	private FormalLanguageExpression createFormalLanguageExpression( final FormalConstraintLanguage p_language ) {
		final FormalLanguageExpression expression = ConstraintsFactory.eINSTANCE.createFormalLanguageExpression();
		expression.setLanguage( p_language );
		
		setDefaultLibraries( expression );
		
		return expression;
	}
	
	private void setDefaultLibraries( final FormalLanguageExpression p_expression ) {
		p_expression.getUsedLibraries().clear();
		
		if ( p_expression.getLanguage() != null ) {
			for ( final FormalLanguageLibrary library : ((FormalConstraintLanguage) p_expression.getLanguage() ).getOwnedLibraries() ) {
				if ( library.isDefault() ) {
					p_expression.getUsedLibraries().add( library );
				}
			}
		}
	}

	TraceableToDesignElementsElement refreshRefDesignElementsLibraries(	final TraceableToDesignElementsElement p_traceableToDesignElem,
																		final Collection<String> p_libraryIds ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		for ( final String libraryId : p_libraryIds ) {
			try {
				setLibraryText( ( (RefQueryCollectedDesignElements) p_traceableToDesignElem.getOwnedReferencedDesignElements() ).getQueryExpression(), 
								libraryId, 
								libraryContent( libraryId ) );
			}
			catch ( final IOException p_ex ) {
				throw new ResourceAccessException( p_ex );
			}
		}
		
		return p_traceableToDesignElem;
	}

	protected boolean setLibraryText( 	final FormalLanguageExpression p_expression,
										final String p_libraryId,
										final String p_libraryText ) 
	throws SystemException {
		final FormalLanguageLibrary library = findLibrary( p_expression, p_libraryId );
		
		if ( library == null ) {
			return false;
		}

		library.getOwnedExpression().setText( p_libraryText );
		
		// Invalidates the library cache.
		cstFacade.libraryContentChanged( p_expression.getLanguage().getId(), library.getId() );
				
		return true;
	}
	
	private FormalLanguageLibrary findLibrary( 	final FormalLanguageExpression p_expression,
												final String p_libraryId ) {
		final ConstraintLanguage expressionLanguage = p_expression.getLanguage();

		for ( final FormalLanguageLibrary library : ( (FormalConstraintLanguage) expressionLanguage ).getOwnedLibraries() ) {
			if ( p_libraryId.equals( library.getId() ) ) {
				return library;
			}
		}
		
		return null;
	}
	
	protected String libraryContent( final String p_libraryId ) 
	throws IOException, ResourceAccessException {
		String location = resourcesHandler.locateResource( p_libraryId );
		
		if ( location == null ) {
			location = p_libraryId;
		}
		
		return FileUtil.getFileContent( location );
	}

	void validateSpecifies( final Specification p_specification ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		validator.validate( RdalPackage.SPECIFICATION__OWNED_REFERENCED_DESIGN_ELEMENTS, false, p_specification );
	}
	
	void validate( final EObject p_object ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		validator.validate( p_object );
	}

	Map<String, String> libraries( final FormalLanguageExpression p_constraintExpr ) {
		final Map<String, String> libraries = new LinkedHashMap<String, String>();
		
		for ( final FormalLanguageLibrary library : p_constraintExpr.getUsedLibraries() ) {
			final FormalLanguageExpression expression = library.getOwnedExpression();
			
			if ( expression != null ) {
				libraries.put( library.getId(), expression.getText() );
			}
		}
		
		return libraries;
	}

	boolean canUseQueryToTraceDesignElements( final TraceableToDesignElementsElement p_traceableElement ) {
		// Tracing a specification to the design with a query is not allowed because there would be no context
		// to evaluate the query.
		return !( p_traceableElement instanceof Specification );
	}
}
