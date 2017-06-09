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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.openpeople.rdal2.model.rdal.Assumption;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AssumptionImpl#getImageRequirement <em>Image Requirement</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AssumptionImpl#getImageAssumptions <em>Image Assumptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssumptionImpl extends AbstractRequirementImpl implements Assumption {
	/**
	 * The cached value of the '{@link #getImageRequirement() <em>Image Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement imageRequirement;

	/**
	 * The cached value of the '{@link #getImageAssumptions() <em>Image Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> imageAssumptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.ASSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getImageRequirement() {
		if (imageRequirement != null && imageRequirement.eIsProxy()) {
			InternalEObject oldImageRequirement = (InternalEObject)imageRequirement;
			imageRequirement = (Requirement)eResolveProxy(oldImageRequirement);
			if (imageRequirement != oldImageRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT, oldImageRequirement, imageRequirement));
			}
		}
		return imageRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetImageRequirement() {
		return imageRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageRequirement(Requirement newImageRequirement, NotificationChain msgs) {
		Requirement oldImageRequirement = imageRequirement;
		imageRequirement = newImageRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT, oldImageRequirement, newImageRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageRequirement(Requirement newImageRequirement) {
		if (newImageRequirement != imageRequirement) {
			NotificationChain msgs = null;
			if (imageRequirement != null)
				msgs = ((InternalEObject)imageRequirement).eInverseRemove(this, RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS, Requirement.class, msgs);
			if (newImageRequirement != null)
				msgs = ((InternalEObject)newImageRequirement).eInverseAdd(this, RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS, Requirement.class, msgs);
			msgs = basicSetImageRequirement(newImageRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT, newImageRequirement, newImageRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getImageAssumptions() {
		if (imageAssumptions == null) {
			imageAssumptions = new EObjectResolvingEList<Assumption>(Assumption.class, this, RdalPackage.ASSUMPTION__IMAGE_ASSUMPTIONS);
		}
		return imageAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT:
				if (imageRequirement != null)
					msgs = ((InternalEObject)imageRequirement).eInverseRemove(this, RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS, Requirement.class, msgs);
				return basicSetImageRequirement((Requirement)otherEnd, msgs);
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
			case RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT:
				return basicSetImageRequirement(null, msgs);
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
			case RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT:
				if (resolve) return getImageRequirement();
				return basicGetImageRequirement();
			case RdalPackage.ASSUMPTION__IMAGE_ASSUMPTIONS:
				return getImageAssumptions();
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
			case RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT:
				setImageRequirement((Requirement)newValue);
				return;
			case RdalPackage.ASSUMPTION__IMAGE_ASSUMPTIONS:
				getImageAssumptions().clear();
				getImageAssumptions().addAll((Collection<? extends Assumption>)newValue);
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
			case RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT:
				setImageRequirement((Requirement)null);
				return;
			case RdalPackage.ASSUMPTION__IMAGE_ASSUMPTIONS:
				getImageAssumptions().clear();
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
			case RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT:
				return imageRequirement != null;
			case RdalPackage.ASSUMPTION__IMAGE_ASSUMPTIONS:
				return imageAssumptions != null && !imageAssumptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssumptionImpl
