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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.emf.core.object.EMFURIEqualsList;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;
import fr.labsticc.framework.settings.service.ISettingsServiceDelegate;
import fr.openpeople.rdal2.model.rdal.AbstractRequirement;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.IdentifiedElement;
import fr.openpeople.rdal2.model.rdal.RdalFactory;
import fr.openpeople.rdal2.model.rdal.RdalOrgPackage;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RequirementsPackage;
import fr.openpeople.rdal2.model.rdal.Specification;
import fr.openpeople.rdal2.model.rdal.Trace;
import fr.openpeople.rdal2.model.rdal.TraceDesignElementRef;
import fr.openpeople.rdal2.model.rdal.VerifiableDesignElementRef;

public class ContractualElementTracabilityAS {
	
	private final IContractualElementBusinessDelegate requirementDelegate;
	private final ISettingsServiceDelegate settingsDelegate;
//	private final Collection<? extends EClassifier> supportedSatisfyingTypes;
//	private final Collection<? extends EClassifier> supportedSatisfyingTypesInclContainers;
	
	public ContractualElementTracabilityAS( final IContractualElementBusinessDelegate p_requirementDelegate,
											final ISettingsServiceDelegate p_settingsDelegate ) {
//										final Collection<? extends EClassifier> p_supportedSatisfyingTypes,
//										final Collection<? extends EClassifier> p_supportedSatisfyingTypesInclContainers ) {
		requirementDelegate = p_requirementDelegate;
		settingsDelegate = p_settingsDelegate;
//		supportedSatisfyingTypes = p_supportedSatisfyingTypes;
//		supportedSatisfyingTypesInclContainers = p_supportedSatisfyingTypesInclContainers;
	}

	@SuppressWarnings("unchecked")
	<T extends IdentifiedElement> Collection<T> satisfiableNodes( 	final EObject p_designElement,
																	final Collection<Specification> p_availableSpecs,
																	final Class<? extends T> p_rootType,
																	boolean pb_recursive )
	throws ConstraintException, SystemException, InterruptedException {
		final Collection<EObject> designElements = designElements( p_designElement, pb_recursive );

		if ( p_rootType.isAssignableFrom( Specification.class ) ) {
			return (Collection<T>) satisfiableSpecs( designElements, p_availableSpecs );
		}

		if ( p_rootType.isAssignableFrom( RequirementsPackage.class ) ) {
			final Set<RequirementsPackage> elements = new HashSet<RequirementsPackage>();

			for ( final Specification spec : satisfiableNodes( p_designElement, p_availableSpecs, Specification.class, pb_recursive ) ) {
				elements.addAll( satisfiableRequirementPackages( designElements, spec ) );
			}
			
			return (Collection<T>) elements;
		}

		if ( p_rootType.isAssignableFrom( AbstractRequirement.class ) ) {
			// Find all requirements having a context including one or several of the design 
			// element candidates and evaluate their attached constraints.
			final Set<AbstractRequirement> elements = new HashSet<AbstractRequirement>();

			for ( final RequirementsPackage reqPackage : satisfiableNodes( p_designElement, p_availableSpecs, RequirementsPackage.class, pb_recursive ) ) {
				elements.addAll( satisfiableRequirements( designElements, reqPackage ) );
			}
			
			return (Collection<T>) elements;
		}
		
		throw new IllegalArgumentException();
	}

	Collection<Specification> satisfiableSpecs( final Collection<EObject> p_designElements,
												final Collection<Specification> p_specifications )
	throws ConstraintException, SystemException, InterruptedException {
		final Set<Specification> satSpecs = new HashSet<Specification>();
		
		for ( final Specification spec : p_specifications ) {
			if ( !satisfiableRequirementPackages( p_designElements, spec ).isEmpty() ) {
				satSpecs.add( spec );
			}
		}
		
		return satSpecs;
	}

	<T extends IdentifiedElement> Collection<? extends IdentifiedElement> satisfiableNodes(	final EObject p_designElement, 
																							final T p_parentNode, 
																							final boolean pb_recursive )
	throws ConstraintException, SystemException, InterruptedException {
		final Collection<EObject> designElements = designElements( p_designElement, pb_recursive );

		if ( p_parentNode instanceof Specification ) {
			return satisfiableRequirementPackages( designElements, (Specification) p_parentNode );
		}

		if ( p_parentNode instanceof RequirementsPackage ) {
			return satisfiableRequirements( designElements, (RequirementsPackage) p_parentNode );
		}

		if ( p_parentNode instanceof AbstractRequirement ) {
			final Collection<DesignElementReference> satElements = new EMFURIEqualsList<DesignElementReference>();
			final AbstractRequirement requirement = (AbstractRequirement) p_parentNode;
			Collection<DesignElementReference> actualElements = requirement.getOwnedReferencedDesignElements().getOwnedDesignElementRefs();

			// Return the evaluated results if computed
			if ( actualElements.isEmpty() ) {
				actualElements = requirementDelegate.designElementReferences( requirement );
			}
			
			for ( final DesignElementReference refElement : actualElements ) {
				if ( designElements.contains( refElement.getDesignElement() ) ) {
					satElements.add( refElement );
				}
			}
			
			return satElements;
		}

		// No more child elements
		return Collections.emptyList();
	}

	Collection<RequirementsPackage> satisfiableRequirementPackages( final Collection<EObject> p_designElements, 
																	final Specification p_specification ) 
	throws ConstraintException, SystemException, InterruptedException {
		final Set<RequirementsPackage> groups = new HashSet<RequirementsPackage>();
		
		for ( final RdalOrgPackage rdalPackage : p_specification.getOwnedPackages() ) {
			if ( rdalPackage instanceof RequirementsPackage ) {
				final RequirementsPackage reqPack = (RequirementsPackage) rdalPackage;

				if ( !satisfiableRequirements( p_designElements, reqPack ).isEmpty() ) {
					groups.add( reqPack );
				}
			}
		}
		
		return groups;
	}

	Collection<AbstractRequirement> satisfiableRequirements( 	final Collection<EObject> p_designElements, 
																final RequirementsPackage p_reqPackage )
	throws ConstraintException, SystemException, InterruptedException {
		final Collection<AbstractRequirement> requirements = new HashSet<AbstractRequirement>();

		for ( final AbstractRequirement req : p_reqPackage.getOwnedRequirements() ) {
			final Collection<EObject> reqContext = requirementDelegate.designElements( req );
			
			for ( final EObject element : p_designElements ) {
				requirements.addAll( satisfiableRequirements( element, req, reqContext ) );
			}
		}
		
		return requirements;
	}

	Collection<AbstractRequirement> satisfiableRequirements( 	final EObject p_designElement, 
																final AbstractRequirement p_requirement ) 
	throws ConstraintException, SystemException, InterruptedException {
		return satisfiableRequirements( p_designElement, 
										p_requirement, 
										requirementDelegate.designElements( p_requirement ) );
		
	}
	
	Collection<AbstractRequirement> satisfiableRequirements( 	final EObject p_designElement, 
																final AbstractRequirement p_requirement,
																final Collection<EObject> p_context ) 
	throws ConstraintException, SystemException, InterruptedException {
		final Set<AbstractRequirement> requirements = new HashSet<AbstractRequirement>();
		
		if ( p_context.contains( p_designElement ) ) {
			requirements.add( p_requirement );
		}
		else {
//			for ( final RequirementRefinement refNode : p_requirement.getOwnedRequirementRefinements() ) {
//				for ( final AbstractRequirement subRequirement : refNode.getSubRequirements() ) {
//					requirements.addAll( satisfiableRequirements( p_designElement, subRequirement ) );
//				}
//			}
		}

		return requirements;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	Collection<EObject> designElements( final EObject p_designElement,
										final boolean pb_recursive ) {
		final Collection<EObject> elements = new EMFURIEqualsList<EObject>();
		elements.add( p_designElement );
//		final Set<EClass> supportedTypesInclContainers = settingsDelegate.supportedTypesInclContainers( SettingsPlugin, p_reference, p_element);
//		
//		if ( pb_recursive ) {
//			EMFUtil.fillContentOfTypes( p_designElement, false, supportedTypesInclContainers, elements, true );
//		}
		
		return (Collection) elements;
	}

	Trace evaluateConstraints( 	final SettingsSpecification p_settingsSpec,
								final EObject p_designSpecification,
								final Collection<Specification> p_specs ) 
	throws ConstraintException, SystemException, InterruptedException {
		
		// Find all requirements satisfying candidates of the design.
//		final Collection<EObject> satisfyingDesignElements = new EMFURIEqualsList<EObject>();
		
//		EMFUtil.fillContentOfTypes( p_designSpecification, false, supportedSatisfyingTypes, satisfyingDesignElements, true );

		// Find all requirements having a context including one or several of the design 
		// element candidates and evaluate their attached constraints.
		final RequirementsProcessingSwitch<AbstractRequirement> requirementsSwitch = new RequirementsProcessingSwitch<AbstractRequirement>() {
			
			@Override
			protected Object caseRequirementEx( final AbstractRequirement p_requirement ) 
			throws Throwable {
				final AbstractRequirement updRequirement = (AbstractRequirement) requirementDelegate.setDesignElements( p_requirement );  
				Collection<EObject> context = requirementDelegate.designElements( updRequirement );
				Collection<DesignElementReference> designElemeRefs = requirementDelegate.designElementReferences( updRequirement );
					
				for ( final DesignElementReference elementRef : designElemeRefs ) {
					final EObject contextElement = elementRef.getDesignElement();
					// Requirement evaluation is needed because an element of the requirement's context is contained in
					// the concerned design.
					if ( isDesignElementSatisfiable( p_settingsSpec, designElemeRefs, contextElement ) ) {
						addProcessedObject( (AbstractRequirement) requirementDelegate.evaluateExpression( updRequirement, context ) );
						
						return DONE;
					}
				}
				
				return DONE;
			}
		};
		
		requirementsSwitch.processAllProperContent( p_specs );
		
		if ( requirementsSwitch.getException() != null ) {
			handleException( requirementsSwitch.getException() );
		}

		final Set<Specification> processedSpecifications = new HashSet<Specification>();
		final Trace trace = RdalFactory.eINSTANCE.createTrace();
		
		for ( final AbstractRequirement req : requirementsSwitch.getProcessedObjects() ) {
			for ( final DesignElementReference modelRef : req.getOwnedReferencedDesignElements().getOwnedDesignElementRefs() ) {
				final EObject modelElement = modelRef.getDesignElement();
				TraceDesignElementRef existingRef = trace.modelElementReference( modelElement );
				final VerifiableDesignElementRef verifRef = (VerifiableDesignElementRef) modelRef;
				
				if ( existingRef == null ) {
					existingRef = RdalFactory.eINSTANCE.createTraceDesignElementRef();
					existingRef.setDescription( "Traceability reference : " + modelRef.getDescription() );
					existingRef.setEvaluationResult( modelRef.getEvaluationResult() );
					existingRef.setName( modelRef.getName() );
					existingRef.setDesignElement( modelElement );
					
					// For natural language expressed requirements, the verifies of each reference may not have
					// been set by the designer. We assume it is not verified.
					if ( verifRef.getVerified() != null && verifRef.getVerified() ) {
						existingRef.setVerificationLevel( (float) 1.0 );
					}
					else {
						existingRef.setVerificationLevel( (float) 0.0 );
					}

					existingRef.setNbRequirements( 1 );
					trace.getOwnedDesignElementRefs().add( existingRef );
				}
				else {
					final TraceDesignElementRef traceElem = RdalFactory.eINSTANCE.createTraceDesignElementRef();
					traceElem.setNbRequirements( 1 );
					
					// For natural language expressed requirements, the verifies of each reference may not have
					// been set by the designer. We assume it is not verified.
					if ( verifRef.getVerified() != null && verifRef.getVerified() ) {
						traceElem.setVerificationLevel( (float) 1.0 );
					}
					else {
						traceElem.setVerificationLevel( (float) 0.0 );
					}

					traceElem.setDescription( modelRef.getDescription() );
					traceElem.setId( modelRef.getId() );
					traceElem.setName( modelRef.getName() );
					existingRef.merge( traceElem );
				}
			}
				
			processedSpecifications.add( req.getPackage().getSpecification() );
		}

		trace.getSpecifications().addAll( processedSpecifications );
		
		processContainnerDesignElements( p_designSpecification, trace );
		
		return trace;
	}
	
	/**
	 * Calculates the verification level of design containing elements to be displayed in the traceability views.
	 * @param p_designElement
	 * @param p_trace
	 * @return
	 */
	private TraceDesignElementRef processContainnerDesignElements( 	final EObject p_designElement,
																			final Trace p_trace ) {
		int nbRequirements = 0;
		int nbVerifiedRequirements = 0;
			
		for ( final EObject childObject : p_designElement.eContents() ) {
			final TraceDesignElementRef reference = processContainnerDesignElements( childObject, p_trace );
			
			if ( reference != null ) {
				nbRequirements += reference.getNbRequirements();
				nbVerifiedRequirements += reference.getNbRequirements() * reference.getVerificationLevel();
			}
		}
		
		TraceDesignElementRef parentReference = p_trace.modelElementReference( p_designElement );
		
		if ( parentReference != null ) {
			final int nbParentReq = parentReference.getNbRequirements(); 
			nbRequirements += nbParentReq;
			nbVerifiedRequirements += parentReference.getVerificationLevel() * nbParentReq;
		}

		if ( nbRequirements !=  0 ) {
			if ( parentReference == null ) {
				parentReference = RdalFactory.eINSTANCE.createTraceDesignElementRef();
				
				// Used to distinguish so that container elements are not marked as problems when requirements of contained
				// elements are not all verified.
				parentReference.setContainer( true );
			}
			
			parentReference.setDescription( "Traceability reference container" );
			parentReference.setName( p_designElement.toString() );
			parentReference.setDesignElement( p_designElement );
			parentReference.setVerificationLevel( (float) nbVerifiedRequirements  / nbRequirements );
			parentReference.setNbRequirements( nbRequirements );
			
			p_trace.getOwnedDesignElementRefs().add( parentReference );
		}
		
		return parentReference;
	}
	
	private void handleException( final Throwable p_th )
	throws ConstraintException, SystemException, InterruptedException {
		if ( p_th instanceof ConstraintException ) {
			throw (ConstraintException) p_th;
		}

		if ( p_th instanceof SystemException ) {
			throw (SystemException) p_th;
		}
		if ( p_th instanceof InterruptedException ) {
			throw (InterruptedException) p_th;
		}
		
		throw new SystemException( p_th );
	}
	
	boolean isDesignElementSatisfiable( final SettingsSpecification p_settingsSpec,
										final Object p_context,
										final EObject p_designElement ) 
	throws ConstraintException, SystemException {
		final Set<EClass> supportedTypes = supportedDesignSpecificationTypes( p_settingsSpec, p_context );
		for ( final EClass satClass : supportedTypes ) {
			if ( satClass.isInstance( p_designElement ) ) {
				return true;
			}
		}

		return false;
	}
	
	boolean isDesignElementSatisfiableInclContainers( 	final SettingsSpecification p_settingsSpec,
														final Object p_context,
														final EObject p_designElement ) 
	throws ConstraintException, SystemException {
		final Set<EClass> supportedTypes = settingsDelegate.supportedTypesInclContainers( 	p_settingsSpec, 
																							RdalPackage.eINSTANCE.getDesignElementReference_DesignElement(), 
																							p_context ); 

		for ( final EClass satClass : supportedTypes ) {
			if ( satClass.isInstance( p_designElement ) ) {
				return true;
			}
		}
		
		return false;
	}

	public Set<EClass> supportedDesignSpecificationTypes( 	final SettingsSpecification p_settingsSpec,
															final Object p_context ) 
	throws ConstraintException, SystemException {
		return settingsDelegate.supportedTypes( p_settingsSpec, 
												RdalPackage.eINSTANCE.getDesignElementReference_DesignElement(), 
												p_context );
	}

	Collection<String> supportedDesignSpecificationFileTypes( final SettingsSpecification p_settingsSpec ) {
		return settingsDelegate.supportedLanguagesFileTypes( p_settingsSpec );
	}
}
