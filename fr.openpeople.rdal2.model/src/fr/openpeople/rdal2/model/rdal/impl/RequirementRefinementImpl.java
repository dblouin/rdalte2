/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.AbstractRequirement;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefineableElement;
import fr.openpeople.rdal2.model.rdal.Requirement;
import fr.openpeople.rdal2.model.rdal.RequirementRefinement;
import fr.openpeople.rdal2.model.rdal.SatisfiableElement;
import fr.openpeople.rdal2.model.rdal.SubRequirementReference;
import fr.openpeople.rdal2.model.rdal.VerifiableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl#getVerified <em>Verified</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl#getOwnedSubRequirementRefs <em>Owned Sub Requirement Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl#getSubRequirements <em>Sub Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl#getRefinedRequirement <em>Refined Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementRefinementImpl extends ElementRefinementImpl implements RequirementRefinement {
	/**
	 * The default value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Float SATISFACTION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected Float satisfactionLevel = SATISFACTION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerified()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VERIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerified()
	 * @generated
	 * @ordered
	 */
	protected Boolean verified = VERIFIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.REQUIREMENT_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getSatisfactionLevel() {
		return satisfactionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionLevel(Float newSatisfactionLevel) {
		Float oldSatisfactionLevel = satisfactionLevel;
		satisfactionLevel = newSatisfactionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.REQUIREMENT_REFINEMENT__SATISFACTION_LEVEL, oldSatisfactionLevel, satisfactionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVerified() {
		return verified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerified(Boolean newVerified) {
		Boolean oldVerified = verified;
		verified = newVerified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.REQUIREMENT_REFINEMENT__VERIFIED, oldVerified, verified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubRequirementReference> getOwnedSubRequirementRefs() {
		return getSubElementRefEntries().list(RdalPackage.Literals.REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<AbstractRequirement> getSubRequirements() {
		final List<AbstractRequirement> elements = new ArrayList<AbstractRequirement>();
		
		for ( final SubRequirementReference reference : getOwnedSubRequirementRefs() ) {
			elements.add( reference.getRequirement() );
		}
		
		return new EcoreEList.UnmodifiableEList<AbstractRequirement>( 	this, 
																		RdalPackage.eINSTANCE.getRequirementRefinement_SubRequirements(),
																		elements.size(),
																		elements.toArray() );
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public EList<RefineableElement> getSubElements() {
		return (EList) getSubRequirements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRefinedRequirement() {
		Requirement refinedRequirement = basicGetRefinedRequirement();
		return refinedRequirement != null && refinedRequirement.eIsProxy() ? (Requirement)eResolveProxy((InternalEObject)refinedRequirement) : refinedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRefinedRequirement() {
		return (Requirement)getRefinedElementEntries().get(RdalPackage.Literals.REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedRequirement(Requirement newRefinedRequirement) {
		((FeatureMap.Internal)getRefinedElementEntries()).set(RdalPackage.Literals.REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT, newRefinedRequirement);
	}

	@Override
	public RefineableElement basicGetRefinedElement() {
		return basicGetRefinedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS:
				return ((InternalEList<?>)getOwnedSubRequirementRefs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.REQUIREMENT_REFINEMENT__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case RdalPackage.REQUIREMENT_REFINEMENT__VERIFIED:
				return getVerified();
			case RdalPackage.REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS:
				return getOwnedSubRequirementRefs();
			case RdalPackage.REQUIREMENT_REFINEMENT__SUB_REQUIREMENTS:
				return getSubRequirements();
			case RdalPackage.REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT:
				if (resolve) return getRefinedRequirement();
				return basicGetRefinedRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdalPackage.REQUIREMENT_REFINEMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((Float)newValue);
				return;
			case RdalPackage.REQUIREMENT_REFINEMENT__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case RdalPackage.REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS:
				getOwnedSubRequirementRefs().clear();
				getOwnedSubRequirementRefs().addAll((Collection<? extends SubRequirementReference>)newValue);
				return;
			case RdalPackage.REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT:
				setRefinedRequirement((Requirement)newValue);
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
			case RdalPackage.REQUIREMENT_REFINEMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel(SATISFACTION_LEVEL_EDEFAULT);
				return;
			case RdalPackage.REQUIREMENT_REFINEMENT__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case RdalPackage.REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS:
				getOwnedSubRequirementRefs().clear();
				return;
			case RdalPackage.REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT:
				setRefinedRequirement((Requirement)null);
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
			case RdalPackage.REQUIREMENT_REFINEMENT__SATISFACTION_LEVEL:
				return SATISFACTION_LEVEL_EDEFAULT == null ? satisfactionLevel != null : !SATISFACTION_LEVEL_EDEFAULT.equals(satisfactionLevel);
			case RdalPackage.REQUIREMENT_REFINEMENT__VERIFIED:
				return VERIFIED_EDEFAULT == null ? verified != null : !VERIFIED_EDEFAULT.equals(verified);
			case RdalPackage.REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS:
				return !getOwnedSubRequirementRefs().isEmpty();
			case RdalPackage.REQUIREMENT_REFINEMENT__SUB_REQUIREMENTS:
				return !getSubRequirements().isEmpty();
			case RdalPackage.REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT:
				return basicGetRefinedRequirement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SatisfiableElement.class) {
			switch (derivedFeatureID) {
				case RdalPackage.REQUIREMENT_REFINEMENT__SATISFACTION_LEVEL: return RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (derivedFeatureID) {
				case RdalPackage.REQUIREMENT_REFINEMENT__VERIFIED: return RdalPackage.VERIFIABLE_ELEMENT__VERIFIED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SatisfiableElement.class) {
			switch (baseFeatureID) {
				case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL: return RdalPackage.REQUIREMENT_REFINEMENT__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (baseFeatureID) {
				case RdalPackage.VERIFIABLE_ELEMENT__VERIFIED: return RdalPackage.REQUIREMENT_REFINEMENT__VERIFIED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (satisfactionLevel: ");
		result.append(satisfactionLevel);
		result.append(", verified: ");
		result.append(verified);
		result.append(')');
		return result.toString();
	}

} //RequirementRefinementImpl
