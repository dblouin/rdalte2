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
package fr.openpeople.rdalte.service;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.constraints.core.ICompletionProposal;
import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.core.exception.ConstraintValidationException;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.service.IConstraintServicesFacade;
import fr.labsticc.framework.constraints.service.IConstraintValidationAS;
import fr.labsticc.framework.core.exception.SystemException;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;

public class ContractualElementServicesFacade extends TraceableToDesignServiceFacade {
	
	public ContractualElementServicesFacade( 	final IConstraintServicesFacade p_cstFacade,
										final IConstraintValidationAS p_validationService ) {
		super( p_cstFacade, new ContractualElementAS( p_cstFacade, p_validationService ) );
	}

	private ContractualElementAS getRequirementsAS() {
		return (ContractualElementAS) getTraceableToDesignAS();
	}

	public List<ICompletionProposal> computeCompletionProposals( 	final TextualContractualElement p_requirement,
																	final String p_constraintText )
	throws ConstraintException, SystemException, InterruptedException {
		getRequirementsAS().validate( p_requirement, false );
		
		final FormalLanguageExpression constraintExpr = (FormalLanguageExpression) p_requirement.getOwnedExpression();

		return cstFacade.computeCompletionProposals( 	constraintExpr.getLanguage().getId(),
														p_constraintText, // Partial text depending on cursor position
														getRequirementsAS().libraries( constraintExpr ),
														getRequirementsAS().designElements( p_requirement ).toArray() );
	}
	
	public String evaluateExpressionAsString( final TextualContractualElement p_requirement )
	throws ConstraintException, SystemException, InterruptedException {
		return getRequirementsAS().evaluateExpressionAsString( p_requirement );
	}
	
	public TextualContractualElement evaluateExpression( final TextualContractualElement p_requirement )
	throws ConstraintException,	SystemException, InterruptedException {
		return getRequirementsAS().evaluateExpression( p_requirement );
	}

	public TextualContractualElement evaluateExpression( 	final TextualContractualElement p_requirement,
															final boolean pb_handleEvalException,
															final Collection<EObject> p_context ) 
	throws ConstraintException, SystemException, InterruptedException {
		return getRequirementsAS().evaluateExpression( p_requirement, pb_handleEvalException, p_context );
	}
	
	public TextualContractualElement setExpressionLibraries( 	final TextualContractualElement p_requirement,
																final Collection<FormalLanguageLibrary> p_libraries ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		return getRequirementsAS().setExpressionLibraries( p_requirement, p_libraries );
	}

	public TextualContractualElement setExpressionText( 	final TextualContractualElement p_requirement,
															final String p_languageId,
															final String p_constraintText ) 
	throws SystemException, InterruptedException{
		return getRequirementsAS().setExpressionText( p_requirement, p_languageId, p_constraintText );
	}

	public TextualContractualElement setExpressionLanguage( final TextualContractualElement p_requirement,
															final String p_languageId ) 
	throws SystemException, InterruptedException{
		return getRequirementsAS().setExpressionLanguage( p_requirement, p_languageId );
	}

	public TextualContractualElement deleteLibraries(	final TextualContractualElement p_requirement,
														final Collection<String> p_libraryIds ) 
    throws SystemException, InterruptedException {
		return getRequirementsAS().deleteLibraries( p_requirement, p_libraryIds );
	}

	public TextualContractualElement refreshLibraries(	final TextualContractualElement p_requirement,
														final Collection<String> p_libraryIds ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		return getRequirementsAS().refreshLibraries( p_requirement, p_libraryIds );
	}
}
