/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Query Collected Design Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements#getQueryExpression <em>Query Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRefQueryCollectedDesignElements()
 * @model
 * @generated
 */
public interface RefQueryCollectedDesignElements extends ReferencedDesignElements {
	/**
	 * Returns the value of the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression</em>' containment reference.
	 * @see #setQueryExpression(FormalLanguageExpression)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRefQueryCollectedDesignElements_QueryExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormalLanguageExpression getQueryExpression();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements#getQueryExpression <em>Query Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Expression</em>' containment reference.
	 * @see #getQueryExpression()
	 * @generated
	 */
	void setQueryExpression(FormalLanguageExpression value);

} // RefQueryCollectedDesignElements
