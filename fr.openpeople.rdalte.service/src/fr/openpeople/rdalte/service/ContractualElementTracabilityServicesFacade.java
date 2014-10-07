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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;
import fr.labsticc.framework.settings.service.ISettingsServiceDelegate;
import fr.openpeople.rdal2.model.rdal.AbstractContractualElement;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.IdentifiedElement;
import fr.openpeople.rdal2.model.rdal.Specification;
import fr.openpeople.rdal2.model.rdal.Trace;

public class ContractualElementTracabilityServicesFacade {
	
	private final ContractualElementTracabilityAS tracabilityAs;
	private final IContractualElementBusinessDelegate requirementDelegate;
	
	public ContractualElementTracabilityServicesFacade( 	final IContractualElementBusinessDelegate p_requirementDelegate,
													final ISettingsServiceDelegate p_settingsDelegate ) {
//													final Collection<? extends EClassifier> p_supportedSatisfyingTypes,
//													final Collection<? extends EClassifier> p_supportedSatisfyingTypesInclContainers ) {
		tracabilityAs = new ContractualElementTracabilityAS( p_requirementDelegate, p_settingsDelegate );
		requirementDelegate = p_requirementDelegate;
	}

	public <T extends IdentifiedElement> Collection<T> satisfiableNodes( 	final EObject p_designElement,
																			final Collection<Specification> p_availableSpecs,
																			final Class<T> p_nodeType,
																			boolean pb_recursive )
	throws ConstraintException, SystemException, InterruptedException {
		return tracabilityAs.satisfiableNodes( 	p_designElement,
												p_availableSpecs,
												p_nodeType, 
												pb_recursive );
	}

	public <T extends IdentifiedElement> Collection<? extends EObject> satisfiableNodes(	final EObject p_designElement, 
																							final T p_reqNode, 
																							final boolean pb_recursive )
	throws ConstraintException, SystemException, InterruptedException {
		return tracabilityAs.satisfiableNodes( p_designElement, p_reqNode, pb_recursive );
	}

	public Trace evaluateConstraints( 	final SettingsSpecification p_settingsSpec,
										final EObject p_designSpecification,
										final Collection<Specification> p_availableSpecs ) 
	throws ConstraintException, SystemException, InterruptedException {
		return tracabilityAs.evaluateConstraints( p_settingsSpec, p_designSpecification, p_availableSpecs );
	}

	public Collection<DesignElementReference> designElementReferences( 	final AbstractContractualElement p_contElement ) 
	throws SystemException, ConstraintException, InterruptedException {
		return requirementDelegate.designElementReferences( p_contElement );
	}
	
	public boolean isDesignElementSatisfiable( 	final SettingsSpecification p_settingsSpec,
												final Object p_context,
												final EObject p_designElement ) 
	throws ConstraintException, SystemException {
		return tracabilityAs.isDesignElementSatisfiable( p_settingsSpec, p_context, p_designElement );
	}

	public boolean isDesignElementSatisfiableInclContainers( 	final SettingsSpecification p_settingsSpec,
																final Object p_context,
																final EObject p_designElement ) 
	throws ConstraintException, SystemException {
		return tracabilityAs.isDesignElementSatisfiableInclContainers( p_settingsSpec, p_context, p_designElement );
	}

	public Collection<EClass> supportedDesignSpecificationTypes( 	final SettingsSpecification p_settingsSpec,
																	final Object p_context ) 
	throws ConstraintException, SystemException {
		return tracabilityAs.supportedDesignSpecificationTypes( p_settingsSpec, p_context );
	}

	public Collection<String> supportedDesignSpecificationFileTypes( final SettingsSpecification p_settingsSpec ) {
		return tracabilityAs.supportedDesignSpecificationFileTypes( p_settingsSpec );
	}
}
