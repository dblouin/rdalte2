/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMap;

import fr.openpeople.rdal2.model.rdal.AbstractGoal;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.SubGoalReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Goal Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SubGoalReferenceImpl#getGoal <em>Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubGoalReferenceImpl extends SubElementReferenceImpl implements SubGoalReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubGoalReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.SUB_GOAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGoal getGoal() {
		AbstractGoal goal = basicGetGoal();
		return goal != null && goal.eIsProxy() ? (AbstractGoal)eResolveProxy((InternalEObject)goal) : goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGoal basicGetGoal() {
		return (AbstractGoal)getReferencedElementEntries().get(RdalPackage.Literals.SUB_GOAL_REFERENCE__GOAL, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(AbstractGoal newGoal) {
		((FeatureMap.Internal)getReferencedElementEntries()).set(RdalPackage.Literals.SUB_GOAL_REFERENCE__GOAL, newGoal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.SUB_GOAL_REFERENCE__GOAL:
				if (resolve) return getGoal();
				return basicGetGoal();
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
			case RdalPackage.SUB_GOAL_REFERENCE__GOAL:
				setGoal((AbstractGoal)newValue);
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
			case RdalPackage.SUB_GOAL_REFERENCE__GOAL:
				setGoal((AbstractGoal)null);
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
			case RdalPackage.SUB_GOAL_REFERENCE__GOAL:
				return basicGetGoal() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubGoalReferenceImpl
