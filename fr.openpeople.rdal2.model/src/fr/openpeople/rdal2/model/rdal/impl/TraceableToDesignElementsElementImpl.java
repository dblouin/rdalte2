/**
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.ReferencedDesignElements;
import fr.openpeople.rdal2.model.rdal.Specification;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceable To Design Elements Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TraceableToDesignElementsElementImpl#getOwnedReferencedDesignElements <em>Owned Referenced Design Elements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TraceableToDesignElementsElementImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TraceableToDesignElementsElementImpl extends IdentifiedElementImpl implements TraceableToDesignElementsElement {
	/**
	 * The cached value of the '{@link #getOwnedReferencedDesignElements() <em>Owned Referenced Design Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReferencedDesignElements()
	 * @generated
	 * @ordered
	 */
	protected ReferencedDesignElements ownedReferencedDesignElements;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceableToDesignElementsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedDesignElements getOwnedReferencedDesignElements() {
		return ownedReferencedDesignElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedReferencedDesignElements(ReferencedDesignElements newOwnedReferencedDesignElements, NotificationChain msgs) {
		ReferencedDesignElements oldOwnedReferencedDesignElements = ownedReferencedDesignElements;
		ownedReferencedDesignElements = newOwnedReferencedDesignElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS, oldOwnedReferencedDesignElements, newOwnedReferencedDesignElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedReferencedDesignElements(ReferencedDesignElements newOwnedReferencedDesignElements) {
		if (newOwnedReferencedDesignElements != ownedReferencedDesignElements) {
			NotificationChain msgs = null;
			if (ownedReferencedDesignElements != null)
				msgs = ((InternalEObject)ownedReferencedDesignElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS, null, msgs);
			if (newOwnedReferencedDesignElements != null)
				msgs = ((InternalEObject)newOwnedReferencedDesignElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS, null, msgs);
			msgs = basicSetOwnedReferencedDesignElements(newOwnedReferencedDesignElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS, newOwnedReferencedDesignElements, newOwnedReferencedDesignElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSpecification() {
		Specification specification = basicGetSpecification();
		return specification != null && specification.eIsProxy() ? (Specification)eResolveProxy((InternalEObject)specification) : specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Specification basicGetSpecification() {
		return (Specification) EcoreUtil.getRootContainer( this );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS:
				return basicSetOwnedReferencedDesignElements(null, msgs);
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
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS:
				return getOwnedReferencedDesignElements();
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
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
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS:
				setOwnedReferencedDesignElements((ReferencedDesignElements)newValue);
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
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS:
				setOwnedReferencedDesignElements((ReferencedDesignElements)null);
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
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS:
				return ownedReferencedDesignElements != null;
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__SPECIFICATION:
				return basicGetSpecification() != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceableToDesignElementsElementImpl
