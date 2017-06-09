/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Coverage Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RequirementsCoverageData#getNbRequirements <em>Nb Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RequirementsCoverageData#getVerificationLevel <em>Verification Level</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementsCoverageData()
 * @model
 * @generated
 */
public interface RequirementsCoverageData extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Nb Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Requirements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Requirements</em>' attribute.
	 * @see #setNbRequirements(int)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementsCoverageData_NbRequirements()
	 * @model
	 * @generated
	 */
	int getNbRequirements();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.RequirementsCoverageData#getNbRequirements <em>Nb Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Requirements</em>' attribute.
	 * @see #getNbRequirements()
	 * @generated
	 */
	void setNbRequirements(int value);

	/**
	 * Returns the value of the '<em><b>Verification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Level</em>' attribute.
	 * @see #setVerificationLevel(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirementsCoverageData_VerificationLevel()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio"
	 * @generated
	 */
	Float getVerificationLevel();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.RequirementsCoverageData#getVerificationLevel <em>Verification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Level</em>' attribute.
	 * @see #getVerificationLevel()
	 * @generated
	 */
	void setVerificationLevel(Float value);

} // RequirementsCoverageData
