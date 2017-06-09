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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.AbstractRequirement;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefineableElement;
import fr.openpeople.rdal2.model.rdal.RequirementsPackage;
import fr.openpeople.rdal2.model.rdal.SatisfiableElement;
import fr.openpeople.rdal2.model.rdal.VerifiableElement;
import fr.openpeople.rdal2.model.rdal.VerificationActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl#getVerified <em>Verified</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl#getOwnedVerifiedBy <em>Owned Verified By</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRequirementImpl extends TextualContractualElementImpl implements AbstractRequirement {
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
	 * The cached value of the '{@link #getOwnedVerifiedBy() <em>Owned Verified By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationActivity> ownedVerifiedBy;

	/**
	 * The default value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected static final Float RISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected Float risk = RISK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.ABSTRACT_REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL, oldSatisfactionLevel, satisfactionLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_REQUIREMENT__VERIFIED, oldVerified, verified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerificationActivity> getOwnedVerifiedBy() {
		if (ownedVerifiedBy == null) {
			ownedVerifiedBy = new EObjectContainmentWithInverseEList<VerificationActivity>(VerificationActivity.class, this, RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY, RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS);
		}
		return ownedVerifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisk(Float newRisk) {
		Float oldRisk = risk;
		risk = newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_REQUIREMENT__RISK, oldRisk, risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsPackage getPackage() {
		if (eContainerFeatureID() != RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE) return null;
		return (RequirementsPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(RequirementsPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(RequirementsPackage newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS, RequirementsPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE, newPackage, newPackage));
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
			case RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedVerifiedBy()).basicAdd(otherEnd, msgs);
			case RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((RequirementsPackage)otherEnd, msgs);
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
			case RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY:
				return ((InternalEList<?>)getOwnedVerifiedBy()).basicRemove(otherEnd, msgs);
			case RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE:
				return basicSetPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE:
				return eInternalContainer().eInverseRemove(this, RdalPackage.REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS, RequirementsPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case RdalPackage.ABSTRACT_REQUIREMENT__VERIFIED:
				return getVerified();
			case RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY:
				return getOwnedVerifiedBy();
			case RdalPackage.ABSTRACT_REQUIREMENT__RISK:
				return getRisk();
			case RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE:
				return getPackage();
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
			case RdalPackage.ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((Float)newValue);
				return;
			case RdalPackage.ABSTRACT_REQUIREMENT__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY:
				getOwnedVerifiedBy().clear();
				getOwnedVerifiedBy().addAll((Collection<? extends VerificationActivity>)newValue);
				return;
			case RdalPackage.ABSTRACT_REQUIREMENT__RISK:
				setRisk((Float)newValue);
				return;
			case RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE:
				setPackage((RequirementsPackage)newValue);
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
			case RdalPackage.ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel(SATISFACTION_LEVEL_EDEFAULT);
				return;
			case RdalPackage.ABSTRACT_REQUIREMENT__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY:
				getOwnedVerifiedBy().clear();
				return;
			case RdalPackage.ABSTRACT_REQUIREMENT__RISK:
				setRisk(RISK_EDEFAULT);
				return;
			case RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE:
				setPackage((RequirementsPackage)null);
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
			case RdalPackage.ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL:
				return SATISFACTION_LEVEL_EDEFAULT == null ? satisfactionLevel != null : !SATISFACTION_LEVEL_EDEFAULT.equals(satisfactionLevel);
			case RdalPackage.ABSTRACT_REQUIREMENT__VERIFIED:
				return VERIFIED_EDEFAULT == null ? verified != null : !VERIFIED_EDEFAULT.equals(verified);
			case RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY:
				return ownedVerifiedBy != null && !ownedVerifiedBy.isEmpty();
			case RdalPackage.ABSTRACT_REQUIREMENT__RISK:
				return RISK_EDEFAULT == null ? risk != null : !RISK_EDEFAULT.equals(risk);
			case RdalPackage.ABSTRACT_REQUIREMENT__PACKAGE:
				return getPackage() != null;
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
				case RdalPackage.ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL: return RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (derivedFeatureID) {
				case RdalPackage.ABSTRACT_REQUIREMENT__VERIFIED: return RdalPackage.VERIFIABLE_ELEMENT__VERIFIED;
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
				case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL: return RdalPackage.ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (baseFeatureID) {
				case RdalPackage.VERIFIABLE_ELEMENT__VERIFIED: return RdalPackage.ABSTRACT_REQUIREMENT__VERIFIED;
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
		result.append(", risk: ");
		result.append(risk);
		result.append(')');
		return result.toString();
	}

} //AbstractRequirementImpl
