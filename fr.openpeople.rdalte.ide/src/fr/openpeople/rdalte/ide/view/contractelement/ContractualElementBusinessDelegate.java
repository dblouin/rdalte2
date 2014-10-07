/*******************************************************************************
 * Copyright (c) 2011 Lab-STICC Universite de Bretagne Sud, Lorient.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-B license available
 * at :
 * en : http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
 * fr : http://www.cecill.info/licences/Licence_CeCILL-B_V1-fr.html
 * 
 * Contributors:
 * Dominique BLOUIN (Lab-STICC UBS), dominique.blouin@univ-ubs.fr
 ******************************************************************************/
package fr.openpeople.rdalte.ide.view.contractelement;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;

import fr.labsticc.framework.constraints.core.ICompletionProposal;
import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.core.exception.ConstraintValidationException;
import fr.labsticc.framework.constraints.ide.ConstraintsIDEPlugin;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.service.DefaultConstraintServicesFacade;
import fr.labsticc.framework.constraints.service.IConstraintInterpretationAS;
import fr.labsticc.framework.constraints.service.IConstraintPersistenceAS;
import fr.labsticc.framework.core.exception.SystemException;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;
import fr.openpeople.rdalte.ide.view.commands.AbstractContractualElementCommand;
import fr.openpeople.rdalte.ide.view.commands.RequirementsEditorValidationAS;
import fr.openpeople.rdalte.service.ContractualElementServicesFacade;
import fr.openpeople.rdalte.service.IContractualElementBusinessDelegate;

/**
 * The delegate to perform the business logic related to the requirements model objects. This implementation is
 * especially designed to handle the transactions for the editor and calls appropriate methods on the requirements
 * business facade.
 * 
 * @author <a href="mailto:dominique.blouin@univ-ubs.fr">Dominique Blouin</a>
 */
public class ContractualElementBusinessDelegate extends TraceableToDesignBusinessDelegate implements IContractualElementBusinessDelegate {

	private final ContractualElementServicesFacade reqBusinessFacade;

	public ContractualElementBusinessDelegate( final Map<String, IConstraintInterpretationAS> p_interpreters,
											final Map<String, IConstraintPersistenceAS> p_persistenceServices ) {
		super( new ContractualElementServicesFacade( 	new DefaultConstraintServicesFacade( p_interpreters, p_persistenceServices ), 
												new RequirementsEditorValidationAS() ) );
		reqBusinessFacade = (ContractualElementServicesFacade) facade;
	}
	
	@Override
	public TextualContractualElement deleteLibraries(	final TextualContractualElement p_requirement,
														final Collection<String> p_libraryIds )
    throws SystemException, InterruptedException {
	    return executeCommand( new AbstractContractualElementCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( reqBusinessFacade.deleteLibraries( p_requirement, p_libraryIds ) );
	    	}
	    }, 
	    false );
	}
	
	@Override
	public TextualContractualElement setExpressionLibraries( 	final TextualContractualElement p_requirement,
																final Collection<FormalLanguageLibrary> p_libraries ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
	    try {
			return executeConstraintCommand( new AbstractContractualElementCommand( p_requirement ) {
				
				@Override
				protected void executeCommand() 
				throws ConstraintException, SystemException, InterruptedException {
					setExecResult( reqBusinessFacade.setExpressionLibraries( p_requirement, p_libraries ) );
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
	public TextualContractualElement refreshLibraries(	final TextualContractualElement p_requirement,
														final Collection<String> p_libraryIds ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
	    try {
			final TextualContractualElement requirement = executeConstraintCommand( new AbstractContractualElementCommand( p_requirement ) {
				
				@Override
				protected void executeCommand() 
				throws ConstraintException, SystemException, InterruptedException {
					setExecResult( reqBusinessFacade.refreshLibraries( p_requirement, p_libraryIds ) );
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
	public TextualContractualElement setExpressionText( final TextualContractualElement p_requirement,
														final String p_languageId,
														final String p_constraintText ) 
	throws SystemException, InterruptedException {
	    return executeCommand( new AbstractContractualElementCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( reqBusinessFacade.setExpressionText( p_requirement, p_languageId, p_constraintText ) );
	    	}
	    }, 
	    false );
	}

	@Override
	public TextualContractualElement setExpressionLanguage( final TextualContractualElement p_requirement,
															final String p_languageId ) 
	throws SystemException, InterruptedException {
	    return executeCommand( new AbstractContractualElementCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws SystemException, InterruptedException {
	    		setExecResult( reqBusinessFacade.setExpressionLanguage( p_requirement, p_languageId ) );
	    	}
	    }, 
	    false );
	}

	@Override
	public TextualContractualElement evaluateExpression( final TextualContractualElement p_requirement )
	throws ConstraintException, SystemException, InterruptedException {
	    return executeConstraintCommand( new AbstractContractualElementCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws ConstraintException, SystemException, InterruptedException {
	    		setExecResult( reqBusinessFacade.evaluateExpression( p_requirement ) );
	    	}
	    } );
	}

	@Override
	public TextualContractualElement evaluateExpression(	final TextualContractualElement p_requirement,
															final Collection<EObject> p_contextElements )
	throws ConstraintException, SystemException, InterruptedException {
	    return executeConstraintCommand( new AbstractContractualElementCommand( p_requirement ) {
	    	
	    	@Override
	    	protected void executeCommand() 
	    	throws ConstraintException, SystemException, InterruptedException {
	    		setExecResult( reqBusinessFacade.evaluateExpression( p_requirement, true, p_contextElements ) );
	    	}
	    } );
	}

	@Override
	public List<ICompletionProposal> computeCompletionProposals(	final TextualContractualElement p_requirement,
																	final String p_constraintText )
	throws ConstraintException, SystemException, InterruptedException {
		return reqBusinessFacade.computeCompletionProposals( p_requirement, p_constraintText );
	}

	@Override
	public ConstraintLanguage constraintLanguage(	final TextualContractualElement p_requirement,
													final String p_languageId ) {
		return reqBusinessFacade.constraintLanguage( p_requirement, p_languageId );
	}

	@Override
	public String evaluateExpressionAsString( final TextualContractualElement p_requirement )
	throws ConstraintException, SystemException, InterruptedException {
		return reqBusinessFacade.evaluateExpressionAsString( p_requirement );
	}
	
	@Override
	protected Map<?, ?> getSaveOptions() {
		final Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put( XMLResource.OPTION_ENCODING, "UTF-8" ); //$NON-NLS-1$
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		
		return saveOptions;
	}
}
