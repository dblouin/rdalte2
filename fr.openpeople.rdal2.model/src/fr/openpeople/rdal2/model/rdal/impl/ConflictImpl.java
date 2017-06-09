/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.openpeople.rdal2.model.rdal.AbstractContractualElement;
import fr.openpeople.rdal2.model.rdal.AbstractGoal;
import fr.openpeople.rdal2.model.rdal.Conflict;
import fr.openpeople.rdal2.model.rdal.RdalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ConflictImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ConflictImpl#getContractualElement <em>Contractual Element</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ConflictImpl#getDegree <em>Degree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConflictImpl extends IdentifiedElementImpl implements Conflict {
	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected AbstractGoal goal;

	/**
	 * The cached value of the '{@link #getContractualElement() <em>Contractual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractualElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractContractualElement contractualElement;

	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final Float DEGREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected Float degree = DEGREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.CONFLICT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGoal getGoal() {
		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject)goal;
			goal = (AbstractGoal)eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.CONFLICT__GOAL, oldGoal, goal));
			}
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGoal basicGetGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(AbstractGoal newGoal, NotificationChain msgs) {
		AbstractGoal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.CONFLICT__GOAL, oldGoal, newGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(AbstractGoal newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, RdalPackage.ABSTRACT_GOAL__CONFLICTS, AbstractGoal.class, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, RdalPackage.ABSTRACT_GOAL__CONFLICTS, AbstractGoal.class, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.CONFLICT__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractContractualElement getContractualElement() {
		if (contractualElement != null && contractualElement.eIsProxy()) {
			InternalEObject oldContractualElement = (InternalEObject)contractualElement;
			contractualElement = (AbstractContractualElement)eResolveProxy(oldContractualElement);
			if (contractualElement != oldContractualElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.CONFLICT__CONTRACTUAL_ELEMENT, oldContractualElement, contractualElement));
			}
		}
		return contractualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractContractualElement basicGetContractualElement() {
		return contractualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContractualElement(AbstractContractualElement newContractualElement) {
		AbstractContractualElement oldContractualElement = contractualElement;
		contractualElement = newContractualElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.CONFLICT__CONTRACTUAL_ELEMENT, oldContractualElement, contractualElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegree(Float newDegree) {
		Float oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.CONFLICT__DEGREE, oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.CONFLICT__GOAL:
				if (goal != null)
					msgs = ((InternalEObject)goal).eInverseRemove(this, RdalPackage.ABSTRACT_GOAL__CONFLICTS, AbstractGoal.class, msgs);
				return basicSetGoal((AbstractGoal)otherEnd, msgs);
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
			case RdalPackage.CONFLICT__GOAL:
				return basicSetGoal(null, msgs);
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
			case RdalPackage.CONFLICT__GOAL:
				if (resolve) return getGoal();
				return basicGetGoal();
			case RdalPackage.CONFLICT__CONTRACTUAL_ELEMENT:
				if (resolve) return getContractualElement();
				return basicGetContractualElement();
			case RdalPackage.CONFLICT__DEGREE:
				return getDegree();
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
			case RdalPackage.CONFLICT__GOAL:
				setGoal((AbstractGoal)newValue);
				return;
			case RdalPackage.CONFLICT__CONTRACTUAL_ELEMENT:
				setContractualElement((AbstractContractualElement)newValue);
				return;
			case RdalPackage.CONFLICT__DEGREE:
				setDegree((Float)newValue);
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
			case RdalPackage.CONFLICT__GOAL:
				setGoal((AbstractGoal)null);
				return;
			case RdalPackage.CONFLICT__CONTRACTUAL_ELEMENT:
				setContractualElement((AbstractContractualElement)null);
				return;
			case RdalPackage.CONFLICT__DEGREE:
				setDegree(DEGREE_EDEFAULT);
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
			case RdalPackage.CONFLICT__GOAL:
				return goal != null;
			case RdalPackage.CONFLICT__CONTRACTUAL_ELEMENT:
				return contractualElement != null;
			case RdalPackage.CONFLICT__DEGREE:
				return DEGREE_EDEFAULT == null ? degree != null : !DEGREE_EDEFAULT.equals(degree);
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
		result.append(" (degree: ");
		result.append(degree);
		result.append(')');
		return result.toString();
	}

} //ConflictImpl
