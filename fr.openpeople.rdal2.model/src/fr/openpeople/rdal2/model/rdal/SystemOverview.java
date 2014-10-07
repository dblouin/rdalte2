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
 * A representation of the model object '<em><b>System Overview</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedCapabilities <em>Owned Capabilities</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getGlobalSystem <em>Global System</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getSystemToBe <em>System To Be</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedContexts <em>Owned Contexts</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedSystemBoundary <em>Owned System Boundary</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getPurpose <em>Purpose</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemOverview()
 * @model
 * @generated
 */
public interface SystemOverview extends AbstractContractualElement {
	/**
	 * Returns the value of the '<em><b>Owned Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Capabilities</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemOverview_OwnedCapabilities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Capability> getOwnedCapabilities();

	/**
	 * Returns the value of the '<em><b>System To Be</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System To Be</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System To Be</em>' reference.
	 * @see #setSystemToBe(EObject)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemOverview_SystemToBe()
	 * @model required="true"
	 * @generated
	 */
	EObject getSystemToBe();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getSystemToBe <em>System To Be</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System To Be</em>' reference.
	 * @see #getSystemToBe()
	 * @generated
	 */
	void setSystemToBe(EObject value);

	/**
	 * Returns the value of the '<em><b>Owned Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.SystemContext}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.SystemContext#getSystemOverview <em>System Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Contexts</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemOverview_OwnedContexts()
	 * @see fr.openpeople.rdal2.model.rdal.SystemContext#getSystemOverview
	 * @model opposite="systemOverview" containment="true" required="true"
	 * @generated
	 */
	EList<SystemContext> getOwnedContexts();

	/**
	 * Returns the value of the '<em><b>Owned System Boundary</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.InteractionVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System Boundary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System Boundary</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemOverview_OwnedSystemBoundary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InteractionVariable> getOwnedSystemBoundary();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemOverview_Purpose()
	 * @model required="true"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Global System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global System</em>' reference.
	 * @see #setGlobalSystem(EObject)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemOverview_GlobalSystem()
	 * @model required="true"
	 * @generated
	 */
	EObject getGlobalSystem();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getGlobalSystem <em>Global System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global System</em>' reference.
	 * @see #getGlobalSystem()
	 * @generated
	 */
	void setGlobalSystem(EObject value);

} // SystemOverview
