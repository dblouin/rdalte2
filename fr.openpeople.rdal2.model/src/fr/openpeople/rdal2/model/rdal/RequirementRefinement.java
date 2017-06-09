/**
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement#getOwnedSubRequirementRefs <em>Owned Sub Requirement Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement#getSubRequirements <em>Sub Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement#getRefinedRequirement <em>Refined Requirement</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementRefinement()
 * @model
 * @generated
 */
public interface RequirementRefinement extends ElementRefinement, SatisfiableElement, VerifiableElement {
	/**
	 * Returns the value of the '<em><b>Owned Sub Requirement Refs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.SubRequirementReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sub Requirement Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sub Requirement Refs</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementRefinement_OwnedSubRequirementRefs()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#subElementRefEntries'"
	 * @generated
	 */
	EList<SubRequirementReference> getOwnedSubRequirementRefs();

	/**
	 * Returns the value of the '<em><b>Sub Requirements</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.AbstractRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Requirements</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementRefinement_SubRequirements()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AbstractRequirement> getSubRequirements();

	/**
	 * Returns the value of the '<em><b>Refined Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Requirement</em>' reference.
	 * @see #setRefinedRequirement(AbstractRequirement)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementRefinement_RefinedRequirement()
	 * @model required="true"
	 *        extendedMetaData="group='#refinedElementEntries'"
	 * @generated
	 */
	AbstractRequirement getRefinedRequirement();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement#getRefinedRequirement <em>Refined Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Requirement</em>' reference.
	 * @see #getRefinedRequirement()
	 * @generated
	 */
	void setRefinedRequirement(AbstractRequirement value);

} // RequirementRefinement
