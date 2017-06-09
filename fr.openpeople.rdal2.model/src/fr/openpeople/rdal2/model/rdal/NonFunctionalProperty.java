/**
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Functional Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.NonFunctionalProperty#getDesignProperty <em>Design Property</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getNonFunctionalProperty()
 * @model
 * @generated
 */
public interface NonFunctionalProperty extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Design Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Property</em>' reference.
	 * @see #setDesignProperty(EObject)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getNonFunctionalProperty_DesignProperty()
	 * @model
	 * @generated
	 */
	EObject getDesignProperty();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.NonFunctionalProperty#getDesignProperty <em>Design Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Property</em>' reference.
	 * @see #getDesignProperty()
	 * @generated
	 */
	void setDesignProperty(EObject value);

} // NonFunctionalProperty
