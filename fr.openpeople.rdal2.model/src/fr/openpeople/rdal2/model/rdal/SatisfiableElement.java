/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfiable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SatisfiableElement#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSatisfiableElement()
 * @model abstract="true"
 * @generated
 */
public interface SatisfiableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfaction Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfaction Level</em>' attribute.
	 * @see #setSatisfactionLevel(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSatisfiableElement_SatisfactionLevel()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio"
	 * @generated
	 */
	Float getSatisfactionLevel();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SatisfiableElement#getSatisfactionLevel <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfaction Level</em>' attribute.
	 * @see #getSatisfactionLevel()
	 * @generated
	 */
	void setSatisfactionLevel(Float value);

} // SatisfiableElement
