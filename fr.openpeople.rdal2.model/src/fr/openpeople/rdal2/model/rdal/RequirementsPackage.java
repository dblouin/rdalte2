/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage#getOwnedRequirements <em>Owned Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage#getFunctionUsedIn <em>Function Used In</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage#getOwnedRequirementsRefinements <em>Owned Requirements Refinements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementsPackage()
 * @model
 * @generated
 */
public interface RequirementsPackage extends RdalOrgPackage, SatisfiableElement, VerifiableElement {
	/**
	 * Returns the value of the '<em><b>Owned Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.AbstractRequirement}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirements</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementsPackage_OwnedRequirements()
	 * @see fr.openpeople.rdal2.model.rdal.AbstractRequirement#getPackage
	 * @model opposite="package" containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#contractualElementEntries'"
	 * @generated
	 */
	EList<AbstractRequirement> getOwnedRequirements();

	/**
	 * Returns the value of the '<em><b>Function Used In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Used In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Used In</em>' reference.
	 * @see #setFunctionUsedIn(EObject)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementsPackage_FunctionUsedIn()
	 * @model
	 * @generated
	 */
	EObject getFunctionUsedIn();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage#getFunctionUsedIn <em>Function Used In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Used In</em>' reference.
	 * @see #getFunctionUsedIn()
	 * @generated
	 */
	void setFunctionUsedIn(EObject value);

	/**
	 * Returns the value of the '<em><b>Owned Requirements Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.RequirementRefinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirements Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirements Refinements</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementsPackage_OwnedRequirementsRefinements()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#refinementEntries'"
	 * @generated
	 */
	EList<RequirementRefinement> getOwnedRequirementsRefinements();

} // RequirementsPackage
