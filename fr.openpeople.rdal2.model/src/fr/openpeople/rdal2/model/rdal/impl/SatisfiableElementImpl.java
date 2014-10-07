/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.SatisfiableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satisfiable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SatisfiableElementImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SatisfiableElementImpl extends EObjectImpl implements SatisfiableElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfiableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.SATISFIABLE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL, oldSatisfactionLevel, satisfactionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
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
			case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((Float)newValue);
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
			case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel(SATISFACTION_LEVEL_EDEFAULT);
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
			case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL:
				return SATISFACTION_LEVEL_EDEFAULT == null ? satisfactionLevel != null : !SATISFACTION_LEVEL_EDEFAULT.equals(satisfactionLevel);
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //SatisfiableElementImpl
