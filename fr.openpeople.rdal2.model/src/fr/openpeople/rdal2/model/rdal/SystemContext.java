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
 * A representation of the model object '<em><b>System Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemContext#getGlobalSystemContext <em>Global System Context</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemContext#getSystemContextBoundary <em>System Context Boundary</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemContext#getActors <em>Actors</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemContext#getSystemOverview <em>System Overview</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemContext#getSystemToBe <em>System To Be</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemContext()
 * @model
 * @generated
 */
public interface SystemContext extends AbstractContractualElement {
	/**
	 * Returns the value of the '<em><b>Global System Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global System Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global System Context</em>' reference.
	 * @see #setGlobalSystemContext(EObject)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemContext_GlobalSystemContext()
	 * @model required="true"
	 * @generated
	 */
	EObject getGlobalSystemContext();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SystemContext#getGlobalSystemContext <em>Global System Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global System Context</em>' reference.
	 * @see #getGlobalSystemContext()
	 * @generated
	 */
	void setGlobalSystemContext(EObject value);

	/**
	 * Returns the value of the '<em><b>System Context Boundary</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.InteractionVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Context Boundary</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Context Boundary</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemContext_SystemContextBoundary()
	 * @model required="true"
	 * @generated
	 */
	EList<InteractionVariable> getSystemContextBoundary();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.ActorReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemContext_Actors()
	 * @model
	 * @generated
	 */
	EList<ActorReference> getActors();

	/**
	 * Returns the value of the '<em><b>System Overview</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedContexts <em>Owned Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Overview</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Overview</em>' container reference.
	 * @see #setSystemOverview(SystemOverview)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemContext_SystemOverview()
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedContexts
	 * @model opposite="ownedContexts" transient="false"
	 * @generated
	 */
	SystemOverview getSystemOverview();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SystemContext#getSystemOverview <em>System Overview</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Overview</em>' container reference.
	 * @see #getSystemOverview()
	 * @generated
	 */
	void setSystemOverview(SystemOverview value);

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
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemContext_SystemToBe()
	 * @model required="true"
	 * @generated
	 */
	EObject getSystemToBe();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SystemContext#getSystemToBe <em>System To Be</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System To Be</em>' reference.
	 * @see #getSystemToBe()
	 * @generated
	 */
	void setSystemToBe(EObject value);

} // SystemContext
