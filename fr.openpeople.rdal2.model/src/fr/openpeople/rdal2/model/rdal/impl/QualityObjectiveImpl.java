/**
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.Modality;
import fr.openpeople.rdal2.model.rdal.NonFunctionalProperty;
import fr.openpeople.rdal2.model.rdal.QualityObjective;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.Sensitivity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.QualityObjectiveImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.QualityObjectiveImpl#getOwnedSensitivity <em>Owned Sensitivity</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.QualityObjectiveImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.QualityObjectiveImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityObjectiveImpl extends NonFunctionalGoalImpl implements QualityObjective {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected NonFunctionalProperty property;

	/**
	 * The cached value of the '{@link #getOwnedSensitivity() <em>Owned Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSensitivity()
	 * @generated
	 * @ordered
	 */
	protected Sensitivity ownedSensitivity;

	/**
	 * The default value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected static final Modality MODALITY_EDEFAULT = Modality.MAXIMUM;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected Modality modality = MODALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected static final double BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected double bound = BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.QUALITY_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (NonFunctionalProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.QUALITY_OBJECTIVE__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(NonFunctionalProperty newProperty) {
		NonFunctionalProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.QUALITY_OBJECTIVE__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensitivity getOwnedSensitivity() {
		return ownedSensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSensitivity(Sensitivity newOwnedSensitivity, NotificationChain msgs) {
		Sensitivity oldOwnedSensitivity = ownedSensitivity;
		ownedSensitivity = newOwnedSensitivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY, oldOwnedSensitivity, newOwnedSensitivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSensitivity(Sensitivity newOwnedSensitivity) {
		if (newOwnedSensitivity != ownedSensitivity) {
			NotificationChain msgs = null;
			if (ownedSensitivity != null)
				msgs = ((InternalEObject)ownedSensitivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY, null, msgs);
			if (newOwnedSensitivity != null)
				msgs = ((InternalEObject)newOwnedSensitivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY, null, msgs);
			msgs = basicSetOwnedSensitivity(newOwnedSensitivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY, newOwnedSensitivity, newOwnedSensitivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(Modality newModality) {
		Modality oldModality = modality;
		modality = newModality == null ? MODALITY_EDEFAULT : newModality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.QUALITY_OBJECTIVE__MODALITY, oldModality, modality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(double newBound) {
		double oldBound = bound;
		bound = newBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.QUALITY_OBJECTIVE__BOUND, oldBound, bound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY:
				return basicSetOwnedSensitivity(null, msgs);
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
			case RdalPackage.QUALITY_OBJECTIVE__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY:
				return getOwnedSensitivity();
			case RdalPackage.QUALITY_OBJECTIVE__MODALITY:
				return getModality();
			case RdalPackage.QUALITY_OBJECTIVE__BOUND:
				return getBound();
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
			case RdalPackage.QUALITY_OBJECTIVE__PROPERTY:
				setProperty((NonFunctionalProperty)newValue);
				return;
			case RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY:
				setOwnedSensitivity((Sensitivity)newValue);
				return;
			case RdalPackage.QUALITY_OBJECTIVE__MODALITY:
				setModality((Modality)newValue);
				return;
			case RdalPackage.QUALITY_OBJECTIVE__BOUND:
				setBound((Double)newValue);
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
			case RdalPackage.QUALITY_OBJECTIVE__PROPERTY:
				setProperty((NonFunctionalProperty)null);
				return;
			case RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY:
				setOwnedSensitivity((Sensitivity)null);
				return;
			case RdalPackage.QUALITY_OBJECTIVE__MODALITY:
				setModality(MODALITY_EDEFAULT);
				return;
			case RdalPackage.QUALITY_OBJECTIVE__BOUND:
				setBound(BOUND_EDEFAULT);
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
			case RdalPackage.QUALITY_OBJECTIVE__PROPERTY:
				return property != null;
			case RdalPackage.QUALITY_OBJECTIVE__OWNED_SENSITIVITY:
				return ownedSensitivity != null;
			case RdalPackage.QUALITY_OBJECTIVE__MODALITY:
				return modality != MODALITY_EDEFAULT;
			case RdalPackage.QUALITY_OBJECTIVE__BOUND:
				return bound != BOUND_EDEFAULT;
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
		result.append(" (modality: ");
		result.append(modality);
		result.append(", bound: ");
		result.append(bound);
		result.append(')');
		return result.toString();
	}

} //QualityObjectiveImpl
