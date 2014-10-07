package fr.openpeople.rdalte.ide.view.contractelement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import fr.labsticc.framework.constraints.core.ICompletionProposal;
import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.core.exception.ConstraintValidationException;
import fr.labsticc.framework.constraints.ide.ConstraintsIDEPlugin;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.model.constraints.provider.ConstraintsItemProviderAdapterFactory;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.emf.view.editor.AbstractEditorCommand;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.IdentifiedElement;
import fr.openpeople.rdal2.model.rdal.RdalFactory;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;
import fr.openpeople.rdalte.ide.RdalIdePlugin;
import fr.openpeople.rdalte.ide.view.AbstractViewPageBusinessDelegate;
import fr.openpeople.rdalte.ide.view.commands.AbstractTraceableToDesignCommand;
import fr.openpeople.rdalte.service.ITraceableToDesignElementBusinessDelegate;
import fr.openpeople.rdalte.service.TraceableToDesignServiceFacade;

public class TraceableToDesignBusinessDelegate extends AbstractViewPageBusinessDelegate implements ITraceableToDesignElementBusinessDelegate {

	private static final AdapterFactory defaultAdapterFactory = RdalIdePlugin.getDefault().getItemProvidersAdapterFactory();

	protected final TraceableToDesignServiceFacade facade;
	
	protected TraceableToDesignBusinessDelegate( final TraceableToDesignServiceFacade p_facade ) {
		facade = p_facade;

		if ( defaultAdapterFactory instanceof ComposedAdapterFactory ) {
			( (ComposedAdapterFactory) defaultAdapterFactory ).addAdapterFactory( new ConstraintsItemProviderAdapterFactory() );
		}
	}

	@Override
	public void persistConstraint(	final String p_languageId,
									final String p_resourceId,
									final String p_constraintText )
	throws ConstraintException, SystemException,	InterruptedException {
		facade.persistConstraint( p_languageId, p_resourceId, p_constraintText );
	}

	@Override
	public String readConstraintText(	final String p_languageId, 
										final String p_resourceId )
	throws SystemException, InterruptedException {
		return facade.readConstraintText( p_languageId, p_resourceId );
	}
	
	@Override
	public TraceableToDesignElementsElement setDesignElements( 	final TraceableToDesignElementsElement p_requirement, 
																final Collection<EObject> p_selectedElements ) 
	throws SystemException, InterruptedException {
		return executeCommand( new AbstractTraceableToDesignCommand( p_requirement ) {
		    	@Override
		    	protected void executeCommand() 
		    	throws SystemException, InterruptedException {
		    		setExecResult( facade.setDesignElements( p_requirement, p_selectedElements ) );
		    	}
	    }, 
	    false );
	}

	@Override
	public TraceableToDesignElementsElement setDesignElements( final TraceableToDesignElementsElement p_requirement )
	throws ConstraintException,	SystemException, InterruptedException {
	    return executeConstraintCommand( new AbstractTraceableToDesignCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws ConstraintException, SystemException, InterruptedException {
	    		setExecResult( facade.setDesignElements( p_requirement ) );
	    	}
	    } );
	}

	@Override
    public TraceableToDesignElementsElement setDesignElementRefs( 	final TraceableToDesignElementsElement p_requirement, 
																			final Collection<DesignElementReference> p_modelElementRefs )
    throws SystemException, InterruptedException {
		return executeCommand( new AbstractTraceableToDesignCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( facade.setDesignElementRefs( p_requirement, p_modelElementRefs ) );
	    	}
		}, 
	    false );
	}

    @Override
	public TraceableToDesignElementsElement setDesignElementRefs(	final TraceableToDesignElementsElement p_requirement,
																	final String p_languageId,
																	final String p_queryText )
	throws SystemException,	InterruptedException {
		return executeCommand( new AbstractTraceableToDesignCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( facade.setDesignElementRefs( p_requirement, p_languageId, p_queryText ) );
	    	}
		}, 
	    false );
	}
	
	@Override
	public TraceableToDesignElementsElement deleteRefDesignElementsLibraries(	final TraceableToDesignElementsElement p_requirement,
																				final Collection<String> p_libraryIds )
    throws SystemException, InterruptedException {
	    return executeCommand( new AbstractTraceableToDesignCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( facade.deleteRefDesignElementsLibraries( p_requirement, p_libraryIds ) );
	    	}
	    }, 
	    false );
	}
	
	@Override
	public TraceableToDesignElementsElement setRefDesignElementsLibraries( 	final TraceableToDesignElementsElement p_requirement,
																			final Collection<FormalLanguageLibrary> p_libraries ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
	    try {
			return executeConstraintCommand( new AbstractTraceableToDesignCommand( p_requirement ) {
				
				@Override
				protected void executeCommand() 
				throws ConstraintException, SystemException, InterruptedException {
					setExecResult( facade.setRefDesignElementsLibraries( p_requirement, p_libraries ) );
				}
			} );
		} 
	    catch ( final ConstraintValidationException p_ex ) {
			throw p_ex;
		}
	    catch ( final ConstraintException p_ex ) {
			throw new SystemException( p_ex );
		}
	}

	@Override
	public TraceableToDesignElementsElement refreshRefDesignElementsLibraries(	final TraceableToDesignElementsElement p_requirement,
																				final Collection<String> p_libraryIds ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
	    try {
			final TraceableToDesignElementsElement requirement = executeConstraintCommand( new AbstractTraceableToDesignCommand( p_requirement ) {
				
				@Override
				protected void executeCommand() 
				throws ConstraintException, SystemException, InterruptedException {
					setExecResult( facade.refreshRefDesignElementsLibraries( p_requirement, p_libraryIds ) );
				}
			} );
			
			ConstraintsIDEPlugin.getDefault().saveSpecification();
			
			return requirement;
		} 
	    catch ( final ConstraintValidationException p_ex ) {
			throw p_ex;
		}
	    catch ( final ConstraintException p_ex ) {
			throw new SystemException( p_ex );
		}
	}

	@Override
	public TraceableToDesignElementsElement setRefDesignElementsConstraintExprText( final TraceableToDesignElementsElement p_requirement,
																					final String p_languageId,
																					final String p_constraintText ) 
	throws SystemException, InterruptedException {
	    return executeCommand( new AbstractTraceableToDesignCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( facade.setRefDesignElementsConstraintExprText( 	p_requirement, 
	    																		p_languageId, 
	    																		p_constraintText ) );
	    	}
	    }, 
	    false );
	}

	@Override
	public List<ICompletionProposal> computeRefElementsCompletionProposals(	final TraceableToDesignElementsElement p_requirement,
																			final String p_constraintText )
	throws ConstraintException, SystemException, InterruptedException {
		return facade.computeRefElementsCompletionProposals( p_requirement, p_constraintText );
	}

	@Override
	public Collection<ConstraintLanguage> definedLanguages(	final TraceableToDesignElementsElement p_requirement ) {
		return facade.definedLanguages( p_requirement );
	}

	@Override
	public Collection<DesignElementReference> designElementReferences( final TraceableToDesignElementsElement p_satElement )
	throws SystemException, ConstraintException, InterruptedException {
	    return executeConstraintCommand( new AbstractEditorCommand<Collection<DesignElementReference>>( p_satElement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws ConstraintException, SystemException, InterruptedException {
	    		setExecResult( facade.designElementReferences( p_satElement, true ) );
	    	}
	    } );
	}

	@Override
	public List<FormalLanguageLibrary> librariesChoice(	final FormalLanguageExpression p_expression )
	throws SystemException, InterruptedException {
		return facade.librariesChoice( p_expression );
	}

	@Override
	public String languageFileExtension(	final TraceableToDesignElementsElement p_requirement,
											final String p_languageId ) 
	throws ConstraintValidationException {
		return facade.languageFileExtension( p_requirement, p_languageId );
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EObject> designElementsChoice(	final TraceableToDesignElementsElement p_requirement,
												final RefManuallySelectedDesignElements p_refDesignElement ) {
		final List<DesignElementReference> refs = p_refDesignElement.getOwnedDesignElementRefs();
		final DesignElementReference modelRef;
		
		if ( refs.isEmpty() ) {
			modelRef = RdalFactory.eINSTANCE.createDesignElementReference();
		}
		else {
			modelRef = refs.get( 0 );
		}

		final IItemPropertySource propertySource = (IItemPropertySource) defaultAdapterFactory.adapt( (Object) modelRef, IItemPropertySource.class );
		final IItemPropertyDescriptor propDescriptor = propertySource.getPropertyDescriptor( 	modelRef,
																								RdalPackage.Literals.DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT );
		final Collection<?> choices = propDescriptor.getChoiceOfValues( p_requirement );
		
		// The feature dialog does not support null values
		choices.remove( null );
		choices.removeAll( designElements( p_refDesignElement ) );
		
		return new ArrayList<EObject>( (Collection<EObject>) choices );
	}

	@Override
	public List<EObject> designElements( final RefManuallySelectedDesignElements p_refDesignElement ) {
		return facade.designElements( p_refDesignElement );
	}
	
	private IItemLabelProvider itemLabelProvider( final Object p_object ) {
		return (IItemLabelProvider) defaultAdapterFactory.adapt( p_object, IItemLabelProvider.class );
	}
	
	@Override
	public String getText( final Object p_element ) {
		final IItemLabelProvider lblProvider = itemLabelProvider( p_element );
		
		return lblProvider == null ? String.valueOf( p_element ) : lblProvider.getText( p_element );
	}
	
	@Override
	public Object getImage( final Object p_element ) {
		final IItemLabelProvider lblProvider =  itemLabelProvider( p_element );
		
		if ( lblProvider == null ) {
			return null;
		}
		
		final Object image = lblProvider.getImage( p_element );
		
		if ( image == null ) {
			return null;
		}
		
		return ExtendedImageRegistry.getInstance().getImage( image );
	}

	@Override
	public Collection<EObject> designElements( final TraceableToDesignElementsElement p_satElement )
	throws ConstraintException,	SystemException, InterruptedException {
		return facade.designElements( p_satElement );
	}

	@Override
	public IdentifiedElement setDescriptionText( 	final IdentifiedElement p_element,
													final String p_text )
	throws SystemException, InterruptedException {
	    return executeCommand( new AbstractEditorCommand<IdentifiedElement>( p_element ) {

	    	@Override
	    	protected void executeCommand() 
	    	throws ConstraintException, SystemException, InterruptedException {
	    		p_element.setDescription( p_text );
	    		setExecResult( p_element );
	    	}
	    }, 
	    false );
	}

	@Override
	public boolean canUseQueryToTraceDesignElements( final TraceableToDesignElementsElement p_traceableElement ) {
		return facade.canUseQueryToTraceDesignElements( p_traceableElement );
	}
}
