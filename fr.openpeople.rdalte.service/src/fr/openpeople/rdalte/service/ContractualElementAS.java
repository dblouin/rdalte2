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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.constraints.core.exception.ConstraintEvaluationException;
import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.core.exception.ConstraintValidationException;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.Expression;
import fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.model.constraints.NaturalLanguageExpression;
import fr.labsticc.framework.constraints.service.IConstraintServicesFacade;
import fr.labsticc.framework.constraints.service.IConstraintValidationAS;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.core.exception.SystemException;
import fr.openpeople.rdal2.model.rdal.AbstractRequirement;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;
import fr.openpeople.rdal2.model.rdal.VerifiableElement;

public class ContractualElementAS extends TraceableToDesignAS {

	private static final String LINE_SEPARATOR = System.getProperty( "line.separator" );

	public ContractualElementAS( 	final IConstraintServicesFacade p_cstFacade,
									final IConstraintValidationAS p_validator ) {
		super( p_validator, p_cstFacade );
	}

	TextualContractualElement setExpressionLanguage( 	final TextualContractualElement p_requirement,
														final String p_languageId )
	throws SystemException, InterruptedException {
		final Expression cstExpr = p_requirement.getOwnedExpression();
		final String currentText;
		
		if ( cstExpr == null ) {
			currentText = null;
		}
		else {
			currentText = cstExpr.getText();
		}
		
		return setExpressionText( p_requirement, p_languageId, currentText );
	}

	TextualContractualElement setExpressionText( 	final TextualContractualElement p_requirement,
													final String p_languageId,
													final String p_constraintText ) 
	throws SystemException, InterruptedException {
		setConstraintExpression( 	p_requirement, 
									constraintLanguage( p_requirement, p_languageId ), 
									p_constraintText );
		
		return p_requirement;
	}

	private void setConstraintExpression( 	final TextualContractualElement p_requirement,
											final ConstraintLanguage p_language,
											final String p_constraintText ) {
		Expression cstExpr = p_requirement.getOwnedExpression();
		
		if ( cstExpr == null ) {
			cstExpr = createExpression( p_language );
			p_requirement.setOwnedExpression( cstExpr );
		}
		else {
			if ( p_language instanceof FormalConstraintLanguage ) {
				if ( cstExpr instanceof FormalLanguageExpression ) {
					final FormalLanguageExpression currentExpr = (FormalLanguageExpression) p_requirement.getOwnedExpression();
					
					if ( !p_language.equals( currentExpr.getLanguage() ) ) {
						
						// Recreate the expression so that the current libraries are reset with the default ones for the new language.
						cstExpr = createExpression( p_language );
						p_requirement.setOwnedExpression( cstExpr );
					}
				}
				else {
					cstExpr = createExpression( p_language );
					p_requirement.setOwnedExpression( cstExpr );
				}
			}
			else {
				if ( !( cstExpr instanceof NaturalLanguageExpression ) ) {
					cstExpr = createExpression( p_language );
					p_requirement.setOwnedExpression( cstExpr );
				}
			}
		}
		
		cstExpr.setLanguage( p_language );
		cstExpr.setText( p_constraintText );
	}

	TextualContractualElement refreshLibraries(	final TextualContractualElement p_requirement,
												final Collection<String> p_libraryIds ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		final FormalLanguageExpression expression = (FormalLanguageExpression) p_requirement.getOwnedExpression();

		for ( final String libraryId : p_libraryIds ) {
			try {
				setLibraryText( expression, libraryId, libraryContent( libraryId ) );
			}
			catch ( final IOException p_ex ) {
				throw new ResourceAccessException( p_ex );
			}
		}
		
		return p_requirement;
	}
	
	TextualContractualElement deleteLibraries(	final TextualContractualElement p_requirement,
												final Collection<String> p_libraryIds ) 
    throws SystemException, InterruptedException {
		deleteLibraries( (FormalLanguageExpression) p_requirement.getOwnedExpression(), p_libraryIds );

		return p_requirement;
	}
	
	TextualContractualElement setExpressionLibraries( 	final TextualContractualElement p_requirement,
														final Collection<FormalLanguageLibrary> p_libraries ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		setExpressionLibraries( (FormalLanguageExpression) p_requirement.getOwnedExpression(), p_libraries );
		
		return p_requirement;
	}
	
	void validate( 	final EObject p_object,
					final boolean pb_validateDependencies ) 
	throws ConstraintValidationException, SystemException, InterruptedException {
		super.validate( p_object );
		
//		if ( pb_validateDependencies && p_object instanceof RefineableElement ) {
//			final RefineableElement contrElem = (RefineableElement) p_object;
			
			// Default validation does not validate all dependencies
			// TODO: 
//			for ( final ElementRefinement refinement : contrElem.getOwnedRefinements() ) {
//				for ( final RefineableElement requirement : dependencies( refinement ) ) {
//					validate( requirement, pb_validateDependencies );
//				}
//			}
//		}
	}
	
	String evaluateExpressionAsString( final TextualContractualElement p_requirement )
	throws ConstraintException, SystemException, InterruptedException {
		final Collection<String> results = evaluateExpressionAsStringCollection( p_requirement, false );
		final StringBuffer resultsBuffer = new StringBuffer();
		
		for ( final Iterator<String> resIt = results.iterator(); resIt.hasNext(); ) {
			resultsBuffer.append( resIt.next() );
			
			if ( resIt.hasNext() ) {
				resultsBuffer.append( LINE_SEPARATOR );
			}
		}
		
		return resultsBuffer.toString();
	}
	
	protected Collection<String> evaluateExpressionAsStringCollection( 	final TextualContractualElement p_requirement,
																		final boolean pb_update )
	throws ConstraintException, SystemException, InterruptedException {
		final TextualContractualElement updRequirement;
		final Collection<EObject> designElements;

		if ( pb_update ) {
			updRequirement = (TextualContractualElement) setDesignElements( p_requirement );
			designElements = designElements( updRequirement.getOwnedReferencedDesignElements().getOwnedDesignElementRefs() );
		}
		else {
			updRequirement = p_requirement;
			designElements = designElements( p_requirement );
		}
		
		return evaluateExpressionAsStringCollection( updRequirement, designElements );
	}

	@SuppressWarnings("unchecked")
	protected Collection<String> evaluateExpressionAsStringCollection( 	final TextualContractualElement p_requirement,
																		final Collection<EObject> p_context )
	throws ConstraintException, SystemException, InterruptedException {
		validate( p_requirement, false );

		final FormalLanguageExpression constraintExpr = (FormalLanguageExpression) p_requirement.getOwnedExpression();
		
		return (Collection<String>) getConstraintsFacade().evaluateConstraint( 	constraintExpr.getLanguage().getId(),
																				constraintExpr.getText(),
																				libraries( constraintExpr ),
																				true,
																				p_context.toArray() );
	}
	
	protected Collection<Boolean> evaluateInvariant( 	final AbstractRequirement p_requirement,
														final boolean pb_update )
	throws ConstraintException, SystemException, InterruptedException {
		final AbstractRequirement updRequirement;
		final Collection<EObject> designElements;

		if ( pb_update ) {
			updRequirement = (AbstractRequirement) setDesignElements( p_requirement );
			designElements = designElements( updRequirement.getOwnedReferencedDesignElements().getOwnedDesignElementRefs() );
		}
		else {
			updRequirement = p_requirement;
			designElements = designElements( p_requirement );
		}
		
		return evaluateInvariant( updRequirement, designElements );
	}
	
	protected Collection<?> evaluateExpression( final TextualContractualElement p_requirement,
												final boolean pb_update )
	throws ConstraintException, SystemException, InterruptedException {
		final TextualContractualElement updRequirement;
		final Collection<EObject> designElements;

		if ( pb_update ) {
			updRequirement = (TextualContractualElement) setDesignElements( p_requirement );
			designElements = designElements( updRequirement.getOwnedReferencedDesignElements().getOwnedDesignElementRefs() );
		}
		else {
			updRequirement = p_requirement;
			designElements = designElements( p_requirement );
		}
		
		return evaluateExpression( updRequirement, designElements );
	}
	
	protected Collection<?> evaluateExpression( 	final TextualContractualElement p_requirement,
													final Collection<EObject> p_context )
	throws ConstraintException, SystemException, InterruptedException {
		validate( p_requirement, false );

		final FormalLanguageExpression formalCstExpr = (FormalLanguageExpression) p_requirement.getOwnedExpression(); 

		return getConstraintsFacade().evaluateConstraint( 	formalCstExpr.getLanguage().getId(),
															formalCstExpr.getText(),
															libraries( formalCstExpr ),
															false,
															p_context.toArray() );
}

	protected Collection<Boolean> evaluateInvariant( 	final AbstractRequirement p_requirement,
														final Collection<EObject> p_context )
	throws ConstraintException, SystemException, InterruptedException {
		validate( p_requirement, false );

		final FormalLanguageExpression formalCstExpr = (FormalLanguageExpression) p_requirement.getOwnedExpression(); 

		return getConstraintsFacade().evaluateInvariant( 	formalCstExpr.getLanguage().getId(),
															formalCstExpr.getText(),
															libraries( formalCstExpr ),
															p_context.toArray() );
	}

	@SuppressWarnings("unchecked")
	TextualContractualElement evaluateExpression( 	final TextualContractualElement p_requirement,
													final boolean pb_handleEvalException,
													final Collection<EObject> p_context )
	throws ConstraintException,	SystemException, InterruptedException {
		validate( p_requirement, false );
		
		@SuppressWarnings("rawtypes")
		final Collection results;

		// Constraints can still be evaluated for natural language expression requirements because 
		// possible requirements dependencies.
		if ( p_requirement.getOwnedExpression() instanceof FormalLanguageExpression ) {
			if ( pb_handleEvalException ) {
				results = new ArrayList<Object>();
			
				for ( final EObject contextElem : p_context ) {
					try {
						results.add( evaluateExpression( p_requirement, Arrays.asList( contextElem ) ).iterator().next() );
					}
					catch ( final ConstraintEvaluationException p_ex ) {
						results.add( p_ex.getLocalizedMessage() );
					}
				}
			}
			else {
				results = evaluateExpression( p_requirement, p_context );
			}
		}
		else {
			results = new ArrayList<Object>();
		}
		
		return buildExpressionEvalResults( p_requirement, results );
	}
	
	TextualContractualElement evaluateExpression( final TextualContractualElement p_contractualElem )
	throws ConstraintException,	SystemException, InterruptedException {
//		return buildConstraintEvalResults( 	(AbstractRequirement) p_contractualElem,
//												evaluateInvariant( (AbstractRequirement) p_contractualElem, true ) );
//		}
		
		return buildExpressionEvalResults( 	p_contractualElem, 
											evaluateExpression( p_contractualElem, true ) );
	}
	
//	
//	private RefineableContractualElement buildExpressionEvalResults( 	final RefineableContractualElement p_requirement,
//																		final Collection<?> p_results ) 
//	throws ConstraintEvaluationException, SystemException { 
//		if ( p_contractElem instan)
//	}
//		final Collection<DesignElementReference> designElements = p_contractElem.getDesignElements().getOwnedDesignElementRefs();
//		int nbDesignElementsTotal = 0;
//		
//		if ( p_requirement.getOwnedExpression() instanceof FormalLanguageExpression ) {
//			assert p_results.size() == designElements.size() : "Expression did not return the same number of results as there are context elements.";
//
//			nbDesignElementsTotal += designElements.size();
//		}
//		
//		final Iterator<DesignElementReference> modelElemRefIt = designElements.iterator();
//		
////		for ( final Object result : p_results ) {
////			final DesignElementReference modelRef = modelElemRefIt.next();
////			//final VerifiableDesignElementReference verifRef = (VerifiableDesignElementReference) modelRef;
////			
////			if ( result != null ) {
////				modelRef.setReason( result.toString() );
////			}
////		}
//		
//		final float satLevel = (float) 0.0;
//		
//		// Assume requirements are already evaluated (traversed in appropriate order)
//		for ( final ContractualElementRefinement refinement : p_requirement.getOwnedRefinements() ) {
//			for ( final RefineableContractualElement depRequirement : dependencies( refinement ) ) {
//				final int nbDesignElements = depRequirement.getDesignElements().getOwnedDesignElementRefs().size();
//				nbDesignElementsTotal += nbDesignElements;
//
//				if ( depRequirement instanceof SatisfiableElement ) {
//					final SatisfiableElement satElement = (SatisfiableElement) depRequirement;
//					
//					if ( satElement.getSatisfactionLevel() != null ) {
//						final Float satifactionLevel = satElement.getSatisfactionLevel();
//						
//						if ( satifactionLevel != null ) {
//							satLevel += satifactionLevel * nbDesignElements; 
//						}
//				}
//			}
//		}
//		
//		if ( )
//		p_requirement.setSatisfactionLevel( (float) satLevel / nbDesignElementsTotal );
//		
//		return p_requirement;
//	}

	private TextualContractualElement buildExpressionEvalResults( 	final TextualContractualElement p_requirement,
																	final Collection<?> p_results ) 
	throws ConstraintEvaluationException, SystemException { 
		final Collection<DesignElementReference> designElements = p_requirement.getOwnedReferencedDesignElements().getOwnedDesignElementRefs();
		int nbVerifiedDesignElements = 0;
		int nbDesignElementsTotal = 0;
		
		if ( p_requirement.getOwnedExpression() instanceof FormalLanguageExpression ) {
			assert p_results.size() == designElements.size() : "Constraint did not return the same number of results as there are context elements.";

			nbDesignElementsTotal += designElements.size();
		}
		
		final Iterator<DesignElementReference> modelElemRefIt = designElements.iterator();
		
		for ( final Object result : p_results ) {
			final DesignElementReference modelRef = modelElemRefIt.next();
//			final VerifiableDesignElementReference verifRef = (VerifiableDesignElementReference) modelRef;

			if ( modelRef instanceof VerifiableElement ) {
				final VerifiableElement verifRef =  (VerifiableElement) modelRef;
				
				if ( result instanceof Boolean ) {
					verifRef.setVerified( (Boolean) result );
					modelRef.setEvaluationResult( null );
					
					if ( verifRef.getVerified() ) {
						nbVerifiedDesignElements++;
					}
				}
				else {
					verifRef.setVerified( Boolean.FALSE );
					
					if ( result != null ) {
						modelRef.setEvaluationResult( result.toString() );
					}
				}
			}
		}
		// TODO: complete analysis
		// Assume requirements are already evaluated (traversed in appropriate order)
//		for ( final ContractualElementRefinement refinement : p_requirement.getOwnedRefinements() ) {
//			int nbVerifiedDependencies = 0;
//			
//			for ( final RefineableContractualElement depRequirement : dependencies( refinement ) ) {
//				final int nbDesignElements = depRequirement.getDesignElements().getOwnedDesignElementRefs().size();
//				nbDesignElementsTotal += nbDesignElements;
//				satLevelTot
//
//				if ( depRequirement instanceof VerifiableElement ) {
//					final VerifiableElement verElem = (VerifiableElement) depRequirement;
//
//					if ( satElem.getSatisfactionLevel() != null ) {
//						final Float satifactionLevel = satElem.getSatisfactionLevel();
//						
//						if ( satifactionLevel != null ) {
//							nbVerified += satifactionLevel * nbDesignElements; 
//						}
//					}
//				}
//				
//				refinement.set
//			}
//		}
//		
//		if ( p_requirement instanceof SatisfiableElement ) {
//			( (SatisfiableElement)p_requirement ).setSatisfactionLevel( (float) nbVerified / nbDesignElementsTotal );
//		}
		
		return p_requirement;
	}
	
	private Collection<TextualContractualElement> dependencies( final TextualContractualElement p_refinement ) {
		final Collection<TextualContractualElement> dependencies = new HashSet<TextualContractualElement>();
		
		//dependencies.addAll( (Collection<? extends TextualContractualElement>) p_refinement.getSubContractualElements() );
		
		return dependencies;
	}
}
