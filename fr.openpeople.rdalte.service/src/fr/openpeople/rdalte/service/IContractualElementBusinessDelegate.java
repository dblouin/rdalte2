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
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.core.exception.SystemException;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;

public interface IContractualElementBusinessDelegate extends ITraceableToDesignElementBusinessDelegate {

	String evaluateExpressionAsString( TextualContractualElement p_requirement ) 
	throws ConstraintException, SystemException, InterruptedException;

	TextualContractualElement evaluateExpression( final TextualContractualElement p_requirement )
	throws ConstraintException,	SystemException, InterruptedException;
	
	TextualContractualElement evaluateExpression( 	TextualContractualElement p_requirement,
													Collection<EObject> p_context ) 
	throws ConstraintException, SystemException, InterruptedException;

	List<ICompletionProposal> computeCompletionProposals( 	TextualContractualElement p_requirement,
															String p_constraintText )
	throws ConstraintException, SystemException, InterruptedException;
	
	TextualContractualElement setExpressionLibraries( 	TextualContractualElement p_requirement,
														Collection<FormalLanguageLibrary> p_libraries )
	throws ConstraintValidationException, SystemException, InterruptedException;
	
	TextualContractualElement refreshLibraries( 	TextualContractualElement p_requirement, 
													Collection<String> p_libraryIds )
	throws ConstraintValidationException, SystemException, InterruptedException;

	TextualContractualElement deleteLibraries( 	TextualContractualElement p_requirement, 
												Collection<String> p_libraryIds )
    throws SystemException, InterruptedException;

	TextualContractualElement setExpressionText( 	TextualContractualElement p_requirement,
													String p_languageId,
													String p_constraintText )
	throws SystemException, InterruptedException;

	TextualContractualElement setExpressionLanguage( 	TextualContractualElement p_requirement,
														String p_languageId )
	throws SystemException, InterruptedException;

	ConstraintLanguage constraintLanguage( 	TextualContractualElement p_requirement,
											String p_languageId );
}
