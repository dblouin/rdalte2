package fr.openpeople.rdalte.service;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.constraints.core.ICompletionProposal;
import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.core.exception.ConstraintValidationException;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.service.IConstraintServicesFacade;
import fr.labsticc.framework.core.exception.SystemException;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements;
import fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements;
import fr.openpeople.rdal2.model.rdal.Specification;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;

public class TraceableToDesignServiceFacade {

	protected final IConstraintServicesFacade cstFacade;
	
	private final TraceableToDesignAS traceDesignAS;
	
	protected TraceableToDesignServiceFacade(	final IConstraintServicesFacade p_cstFacade,
												final TraceableToDesignAS p_traceDesignAS ) {
		cstFacade = p_cstFacade;
		traceDesignAS = p_traceDesignAS;
	}
	
	protected TraceableToDesignAS getTraceableToDesignAS() {
		return traceDesignAS;
	}

	public List<ICompletionProposal> computeRefElementsCompletionProposals( final TraceableToDesignElementsElement p_requirement ,
																			final String p_constraintText ) 
	throws ConstraintException,	SystemException, InterruptedException {
		final Specification spec = p_requirement.getSpecification();
		traceDesignAS.validateSpecifies( spec );
		
		final FormalLanguageExpression constraintExpr = ( (RefQueryCollectedDesignElements) p_requirement.getOwnedReferencedDesignElements() ).getQueryExpression();
		
		return cstFacade.computeCompletionProposals( 	constraintExpr.getLanguage().getId(),
														p_constraintText,
														traceDesignAS.libraries( constraintExpr ),
														designElementReferences( spec, false ).toArray() );
	}
	
	public ConstraintLanguage constraintLanguage( 	final TraceableToDesignElementsElement p_requirement,
													final String p_languageId ) {
		return traceDesignAS.constraintLanguage( p_requirement, p_languageId );
	}
	
	public Collection<ConstraintLanguage> definedLanguages( final TraceableToDesignElementsElement p_requirement ) {
		return traceDesignAS.definedLanguages( p_requirement );
	}

	public TraceableToDesignElementsElement deleteRefDesignElementsLibraries(	final TraceableToDesignElementsElement p_requirement,
																				final Collection<String> p_libraryIds ) 
    throws SystemException, InterruptedException {
		return traceDesignAS.deleteRefDesignElementsLibraries( p_requirement, p_libraryIds );
	}
	
	public  String languageFileExtension( 	final TraceableToDesignElementsElement p_requirement,
											final String p_languageId ) 
	throws ConstraintValidationException {
		if ( p_languageId == null ) {
			throw new ConstraintValidationException( "Constraint language not set." );
		}
		
		final ConstraintLanguage language = constraintLanguage( p_requirement, p_languageId );
		
		return "*." + language.getName().toLowerCase();
	}

	public List<FormalLanguageLibrary> librariesChoice(	final FormalLanguageExpression p_expression )
	throws SystemException, InterruptedException {
		return traceDesignAS.librariesChoice( p_expression );
	}
	
	public void persistConstraint(	final String p_languageId, 
									final String p_resourceId,
									final String p_constraintText )
	throws ConstraintException, SystemException,	InterruptedException {
		cstFacade.persistConstraint( p_languageId, p_resourceId, p_constraintText );
	}
	
	public String readConstraintText( 	final String p_languageId,
										final String p_resourceId ) 
	throws SystemException,	InterruptedException {
		return cstFacade.readConstraintText( p_languageId, p_resourceId );
	}

	public TraceableToDesignElementsElement setRefDesignElementsConstraintExprText( final TraceableToDesignElementsElement p_requirement,
																					final String p_languageId,
																					final String p_constraintText ) 
	throws SystemException, InterruptedException {
		return traceDesignAS.setRefDesignElementsConstraintExprText( p_requirement, p_languageId, p_constraintText ); 
	}

	public TraceableToDesignElementsElement refreshRefDesignElementsLibraries(	final TraceableToDesignElementsElement p_requirement,
																				final Collection<String> p_libraryIds ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		return traceDesignAS.refreshRefDesignElementsLibraries( p_requirement, p_libraryIds );
	}
	
	public TraceableToDesignElementsElement setDesignElements( 	final TraceableToDesignElementsElement p_requirement, 
																final Collection<EObject> p_selectedElements ) 
	throws SystemException, InterruptedException {
		return traceDesignAS.setDesignElements( p_requirement, p_selectedElements );
	}

	public TraceableToDesignElementsElement setDesignElements( final TraceableToDesignElementsElement p_requirement )
	throws SystemException, ConstraintException, InterruptedException {
		return traceDesignAS.setDesignElements( p_requirement );
	}
	
	public TraceableToDesignElementsElement setRefDesignElementsLibraries( 	final TraceableToDesignElementsElement p_requirement,
																			final Collection<FormalLanguageLibrary> p_libraries ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		return traceDesignAS.setRefDesignElementsLibraries( p_requirement, p_libraries );
	}

	public TraceableToDesignElementsElement setDesignElementRefs( 	final TraceableToDesignElementsElement p_requirement,
																	final Collection<DesignElementReference> p_modelElementRefs ) 
	throws SystemException, InterruptedException {
		return traceDesignAS.setDesignElementRefs( p_requirement, p_modelElementRefs );
	}

	public TraceableToDesignElementsElement setDesignElementRefs( 	final TraceableToDesignElementsElement p_requirement,
																	final String p_languageId,
																	final String p_queryText ) 
	throws SystemException, InterruptedException {
		return traceDesignAS.setDesignElementRefs( p_requirement, p_languageId, p_queryText );
	}

	public List<EObject> designElements( final RefManuallySelectedDesignElements p_refDesignElement ) {
		return traceDesignAS.designElements( p_refDesignElement );
	}

	public Collection<EObject> designElements( final TraceableToDesignElementsElement p_satElement )
	throws SystemException, ConstraintException, InterruptedException {
		return traceDesignAS.designElements( p_satElement );
	}

	public Collection<DesignElementReference> designElementReferences( 	final TraceableToDesignElementsElement p_satElement,
																		final boolean pb_update )
	throws SystemException, ConstraintException, InterruptedException {
		return traceDesignAS.designElementReferences( p_satElement, pb_update );
	}

	public boolean canUseQueryToTraceDesignElements( final TraceableToDesignElementsElement p_traceableElement ) {
		return traceDesignAS.canUseQueryToTraceDesignElements( p_traceableElement );
	}
}
