/**
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.InteractionVariable;
import fr.openpeople.rdal2.model.rdal.InteractionVariableType;
import fr.openpeople.rdal2.model.rdal.RdalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.InteractionVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.InteractionVariableImpl#isNeglected <em>Neglected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionVariableImpl extends VariableImpl implements InteractionVariable {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionVariableType TYPE_EDEFAULT = InteractionVariableType.MONITORABLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InteractionVariableType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeglected() <em>Neglected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeglected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGLECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeglected() <em>Neglected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeglected()
	 * @generated
	 * @ordered
	 */
	protected boolean neglected = NEGLECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.INTERACTION_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionVariableType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InteractionVariableType newType) {
		InteractionVariableType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.INTERACTION_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeglected() {
		return neglected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeglected(boolean newNeglected) {
		boolean oldNeglected = neglected;
		neglected = newNeglected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.INTERACTION_VARIABLE__NEGLECTED, oldNeglected, neglected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.INTERACTION_VARIABLE__TYPE:
				return getType();
			case RdalPackage.INTERACTION_VARIABLE__NEGLECTED:
				return isNeglected();
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
			case RdalPackage.INTERACTION_VARIABLE__TYPE:
				setType((InteractionVariableType)newValue);
				return;
			case RdalPackage.INTERACTION_VARIABLE__NEGLECTED:
				setNeglected((Boolean)newValue);
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
			case RdalPackage.INTERACTION_VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RdalPackage.INTERACTION_VARIABLE__NEGLECTED:
				setNeglected(NEGLECTED_EDEFAULT);
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
			case RdalPackage.INTERACTION_VARIABLE__TYPE:
				return type != TYPE_EDEFAULT;
			case RdalPackage.INTERACTION_VARIABLE__NEGLECTED:
				return neglected != NEGLECTED_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", neglected: ");
		result.append(neglected);
		result.append(')');
		return result.toString();
	}

} //InteractionVariableImpl
