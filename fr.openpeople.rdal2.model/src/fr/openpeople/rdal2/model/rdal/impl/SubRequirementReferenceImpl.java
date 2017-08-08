/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.FeatureMap;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefineableElement;
import fr.openpeople.rdal2.model.rdal.Requirement;
import fr.openpeople.rdal2.model.rdal.SubRequirementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Requirement Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SubRequirementReferenceImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubRequirementReferenceImpl extends SubElementReferenceImpl implements SubRequirementReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubRequirementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.SUB_REQUIREMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRequirement() {
		Requirement requirement = basicGetRequirement();
		return requirement != null && requirement.eIsProxy() ? (Requirement)eResolveProxy((InternalEObject)requirement) : requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRequirement() {
		return (Requirement)getReferencedElementEntries().get(RdalPackage.Literals.SUB_REQUIREMENT_REFERENCE__REQUIREMENT, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(Requirement newRequirement) {
		((FeatureMap.Internal)getReferencedElementEntries()).set(RdalPackage.Literals.SUB_REQUIREMENT_REFERENCE__REQUIREMENT, newRequirement);
	}
	
	@Override
	public RefineableElement basicGetReferencedElement() {
		return basicGetRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.SUB_REQUIREMENT_REFERENCE__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdalPackage.SUB_REQUIREMENT_REFERENCE__REQUIREMENT:
				setRequirement((Requirement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdalPackage.SUB_REQUIREMENT_REFERENCE__REQUIREMENT:
				setRequirement((Requirement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdalPackage.SUB_REQUIREMENT_REFERENCE__REQUIREMENT:
				return basicGetRequirement() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubRequirementReferenceImpl
