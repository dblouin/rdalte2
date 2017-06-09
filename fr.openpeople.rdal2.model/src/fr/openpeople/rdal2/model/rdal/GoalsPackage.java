/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goals Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.GoalsPackage#getOwnedGoals <em>Owned Goals</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.GoalsPackage#getOwnedGoalRefinements <em>Owned Goal Refinements</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getGoalsPackage()
 * @model
 * @generated
 */
public interface GoalsPackage extends RdalOrgPackage, SatisfiableElement {
	/**
	 * Returns the value of the '<em><b>Owned Goals</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.AbstractGoal}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.AbstractGoal#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Goals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Goals</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getGoalsPackage_OwnedGoals()
	 * @see fr.openpeople.rdal2.model.rdal.AbstractGoal#getPackage
	 * @model opposite="package" containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#contractualElementEntries'"
	 * @generated
	 */
	EList<AbstractGoal> getOwnedGoals();

	/**
	 * Returns the value of the '<em><b>Owned Goal Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.GoalRefinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Goal Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Goal Refinements</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getGoalsPackage_OwnedGoalRefinements()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#refinementEntries'"
	 * @generated
	 */
	EList<GoalRefinement> getOwnedGoalRefinements();

} // GoalsPackage
