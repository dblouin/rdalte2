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
 * A representation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Assumption#getImageRequirement <em>Image Requirement</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Assumption#getImageAssumptions <em>Image Assumptions</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAssumption()
 * @model
 * @generated
 */
public interface Assumption extends AbstractRequirement {
	/**
	 * Returns the value of the '<em><b>Image Requirement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.Requirement#getImageAssumptions <em>Image Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Requirement</em>' reference.
	 * @see #setImageRequirement(Requirement)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAssumption_ImageRequirement()
	 * @see fr.openpeople.rdal2.model.rdal.Requirement#getImageAssumptions
	 * @model opposite="imageAssumptions"
	 * @generated
	 */
	Requirement getImageRequirement();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Assumption#getImageRequirement <em>Image Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Requirement</em>' reference.
	 * @see #getImageRequirement()
	 * @generated
	 */
	void setImageRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Image Assumptions</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Assumptions</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAssumption_ImageAssumptions()
	 * @model
	 * @generated
	 */
	EList<Assumption> getImageAssumptions();

} // Assumption
