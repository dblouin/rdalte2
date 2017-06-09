/**
 */
package fr.openpeople.rdal2.model.rdal;

import fr.labsticc.framework.constraints.model.constraints.Expression;

import fr.labsticc.framework.settings.model.settings.Category;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Contractual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTextualContractualElement()
 * @model abstract="true"
 * @generated
 */
public interface TextualContractualElement extends AbstractContractualElement {
	/**
	 * Returns the value of the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Expression</em>' containment reference.
	 * @see #setOwnedExpression(Expression)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTextualContractualElement_OwnedExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOwnedExpression();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getOwnedExpression <em>Owned Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Expression</em>' containment reference.
	 * @see #getOwnedExpression()
	 * @generated
	 */
	void setOwnedExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Condition</em>' containment reference.
	 * @see #setOwnedCondition(Expression)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTextualContractualElement_OwnedCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOwnedCondition();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getOwnedCondition <em>Owned Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Condition</em>' containment reference.
	 * @see #getOwnedCondition()
	 * @generated
	 */
	void setOwnedCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.TextualContractualElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTextualContractualElement_DerivedFrom()
	 * @model
	 * @generated
	 */
	EList<TextualContractualElement> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTextualContractualElement_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTextualContractualElement_Priority()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio"
	 * @generated
	 */
	Float getPriority();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Float value);

} // TextualContractualElement
