/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Contractual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOwnedRationales <em>Owned Rationales</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOriginDate <em>Origin Date</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getScheduleDate <em>Schedule Date</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getSources <em>Sources</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getEvolvedTo <em>Evolved To</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#isDropped <em>Dropped</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOwnedDroppingReasons <em>Owned Dropping Reasons</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getChangeUncertainty <em>Change Uncertainty</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractContractualElement extends TraceableToDesignElementsElement {
	/**
	 * Returns the value of the '<em><b>Stakeholders</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stakeholders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholders</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_Stakeholders()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<Stakeholder> getStakeholders();

	/**
	 * Returns the value of the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Rationale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Rationales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Rationales</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_OwnedRationales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rationale> getOwnedRationales();

	/**
	 * Returns the value of the '<em><b>Contact Information</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.ContactInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Information</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_ContactInformation()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,0,0'"
	 * @generated
	 */
	EList<ContactInformation> getContactInformation();

	/**
	 * Returns the value of the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Date</em>' attribute.
	 * @see #setOriginDate(Date)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_OriginDate()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.Date"
	 * @generated
	 */
	Date getOriginDate();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOriginDate <em>Origin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Date</em>' attribute.
	 * @see #getOriginDate()
	 * @generated
	 */
	void setOriginDate(Date value);

	/**
	 * Returns the value of the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Date</em>' attribute.
	 * @see #setScheduleDate(Date)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_ScheduleDate()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.Date"
	 * @generated
	 */
	Date getScheduleDate();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getScheduleDate <em>Schedule Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Date</em>' attribute.
	 * @see #getScheduleDate()
	 * @generated
	 */
	void setScheduleDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' attribute list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_Sources()
	 * @model
	 * @generated
	 */
	EList<String> getSources();

	/**
	 * Returns the value of the '<em><b>Evolved To</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolved To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolved To</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_EvolvedTo()
	 * @model
	 * @generated
	 */
	EList<AbstractContractualElement> getEvolvedTo();

	/**
	 * Returns the value of the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dropped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropped</em>' attribute.
	 * @see #setDropped(boolean)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_Dropped()
	 * @model required="true"
	 * @generated
	 */
	boolean isDropped();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#isDropped <em>Dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropped</em>' attribute.
	 * @see #isDropped()
	 * @generated
	 */
	void setDropped(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Rationale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Dropping Reasons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Dropping Reasons</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_OwnedDroppingReasons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rationale> getOwnedDroppingReasons();

	/**
	 * Returns the value of the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Uncertainty</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Uncertainty</em>' containment reference.
	 * @see #setChangeUncertainty(Uncertainty)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractContractualElement_ChangeUncertainty()
	 * @model containment="true"
	 * @generated
	 */
	Uncertainty getChangeUncertainty();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getChangeUncertainty <em>Change Uncertainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Uncertainty</em>' containment reference.
	 * @see #getChangeUncertainty()
	 * @generated
	 */
	void setChangeUncertainty(Uncertainty value);

} // AbstractContractualElement
