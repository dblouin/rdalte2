/**
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.NonFunctionalProperty;
import fr.openpeople.rdal2.model.rdal.RdalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Functional Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.NonFunctionalPropertyImpl#getDesignProperty <em>Design Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonFunctionalPropertyImpl extends IdentifiedElementImpl implements NonFunctionalProperty {
	/**
	 * The cached value of the '{@link #getDesignProperty() <em>Design Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignProperty()
	 * @generated
	 * @ordered
	 */
	protected EObject designProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonFunctionalPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.NON_FUNCTIONAL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDesignProperty() {
		if (designProperty != null && designProperty.eIsProxy()) {
			InternalEObject oldDesignProperty = (InternalEObject)designProperty;
			designProperty = eResolveProxy(oldDesignProperty);
			if (designProperty != oldDesignProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY, oldDesignProperty, designProperty));
			}
		}
		return designProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDesignProperty() {
		return designProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignProperty(EObject newDesignProperty) {
		EObject oldDesignProperty = designProperty;
		designProperty = newDesignProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY, oldDesignProperty, designProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY:
				if (resolve) return getDesignProperty();
				return basicGetDesignProperty();
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
			case RdalPackage.NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY:
				setDesignProperty((EObject)newValue);
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
			case RdalPackage.NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY:
				setDesignProperty((EObject)null);
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
			case RdalPackage.NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY:
				return designProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //NonFunctionalPropertyImpl
