/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.AbstractRequirement;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RequirementRefinement;
import fr.openpeople.rdal2.model.rdal.RequirementsPackage;
import fr.openpeople.rdal2.model.rdal.SatisfiableElement;
import fr.openpeople.rdal2.model.rdal.VerifiableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl#getVerified <em>Verified</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl#getOwnedRequirements <em>Owned Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl#getFunctionUsedIn <em>Function Used In</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl#getOwnedRequirementsRefinements <em>Owned Requirements Refinements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsPackageImpl extends RdalOrgPackageImpl implements RequirementsPackage {
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
	 * The cached value of the '{@link #getFunctionUsedIn() <em>Function Used In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionUsedIn()
	 * @generated
	 * @ordered
	 */
	protected EObject functionUsedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.REQUIREMENTS_PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.REQUIREMENTS_PACKAGE__SATISFACTION_LEVEL, oldSatisfactionLevel, satisfactionLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.REQUIREMENTS_PACKAGE__VERIFIED, oldVerified, verified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractRequirement> getOwnedRequirements() {
		return getContractualElementEntries().list(RdalPackage.Literals.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getFunctionUsedIn() {
		if (functionUsedIn != null && functionUsedIn.eIsProxy()) {
			InternalEObject oldFunctionUsedIn = (InternalEObject)functionUsedIn;
			functionUsedIn = eResolveProxy(oldFunctionUsedIn);
			if (functionUsedIn != oldFunctionUsedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.REQUIREMENTS_PACKAGE__FUNCTION_USED_IN, oldFunctionUsedIn, functionUsedIn));
			}
		}
		return functionUsedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetFunctionUsedIn() {
		return functionUsedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionUsedIn(EObject newFunctionUsedIn) {
		EObject oldFunctionUsedIn = functionUsedIn;
		functionUsedIn = newFunctionUsedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.REQUIREMENTS_PACKAGE__FUNCTION_USED_IN, oldFunctionUsedIn, functionUsedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementRefinement> getOwnedRequirementsRefinements() {
		return getRefinementEntries().list(RdalPackage.Literals.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRequirements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS:
				return ((InternalEList<?>)getOwnedRequirements()).basicRemove(otherEnd, msgs);
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS:
				return ((InternalEList<?>)getOwnedRequirementsRefinements()).basicRemove(otherEnd, msgs);
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
			case RdalPackage.REQUIREMENTS_PACKAGE__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case RdalPackage.REQUIREMENTS_PACKAGE__VERIFIED:
				return getVerified();
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS:
				return getOwnedRequirements();
			case RdalPackage.REQUIREMENTS_PACKAGE__FUNCTION_USED_IN:
				if (resolve) return getFunctionUsedIn();
				return basicGetFunctionUsedIn();
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS:
				return getOwnedRequirementsRefinements();
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
			case RdalPackage.REQUIREMENTS_PACKAGE__SATISFACTION_LEVEL:
				setSatisfactionLevel((Float)newValue);
				return;
			case RdalPackage.REQUIREMENTS_PACKAGE__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS:
				getOwnedRequirements().clear();
				getOwnedRequirements().addAll((Collection<? extends AbstractRequirement>)newValue);
				return;
			case RdalPackage.REQUIREMENTS_PACKAGE__FUNCTION_USED_IN:
				setFunctionUsedIn((EObject)newValue);
				return;
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS:
				getOwnedRequirementsRefinements().clear();
				getOwnedRequirementsRefinements().addAll((Collection<? extends RequirementRefinement>)newValue);
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
			case RdalPackage.REQUIREMENTS_PACKAGE__SATISFACTION_LEVEL:
				setSatisfactionLevel(SATISFACTION_LEVEL_EDEFAULT);
				return;
			case RdalPackage.REQUIREMENTS_PACKAGE__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS:
				getOwnedRequirements().clear();
				return;
			case RdalPackage.REQUIREMENTS_PACKAGE__FUNCTION_USED_IN:
				setFunctionUsedIn((EObject)null);
				return;
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS:
				getOwnedRequirementsRefinements().clear();
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
			case RdalPackage.REQUIREMENTS_PACKAGE__SATISFACTION_LEVEL:
				return SATISFACTION_LEVEL_EDEFAULT == null ? satisfactionLevel != null : !SATISFACTION_LEVEL_EDEFAULT.equals(satisfactionLevel);
			case RdalPackage.REQUIREMENTS_PACKAGE__VERIFIED:
				return VERIFIED_EDEFAULT == null ? verified != null : !VERIFIED_EDEFAULT.equals(verified);
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS:
				return !getOwnedRequirements().isEmpty();
			case RdalPackage.REQUIREMENTS_PACKAGE__FUNCTION_USED_IN:
				return functionUsedIn != null;
			case RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS:
				return !getOwnedRequirementsRefinements().isEmpty();
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
				case RdalPackage.REQUIREMENTS_PACKAGE__SATISFACTION_LEVEL: return RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (derivedFeatureID) {
				case RdalPackage.REQUIREMENTS_PACKAGE__VERIFIED: return RdalPackage.VERIFIABLE_ELEMENT__VERIFIED;
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
				case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL: return RdalPackage.REQUIREMENTS_PACKAGE__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (baseFeatureID) {
				case RdalPackage.VERIFIABLE_ELEMENT__VERIFIED: return RdalPackage.REQUIREMENTS_PACKAGE__VERIFIED;
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

} //RequirementsPackageImpl
