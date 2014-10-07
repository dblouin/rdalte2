/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.ReferencedDesignElements;

import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.DesignElementReferenceImpl#getDesignElement <em>Design Element</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.DesignElementReferenceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.DesignElementReferenceImpl#getEvaluationResult <em>Evaluation Result</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.DesignElementReferenceImpl#getParentTraceableElement <em>Parent Traceable Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignElementReferenceImpl extends IdentifiedElementImpl implements DesignElementReference {
	/**
	 * The cached value of the '{@link #getDesignElement() <em>Design Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignElement()
	 * @generated
	 * @ordered
	 */
	protected EObject designElement;

	/**
	 * The default value of the '{@link #getEvaluationResult() <em>Evaluation Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationResult()
	 * @generated
	 * @ordered
	 */
	protected static final String EVALUATION_RESULT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEvaluationResult() <em>Evaluation Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationResult()
	 * @generated
	 * @ordered
	 */
	protected String evaluationResult = EVALUATION_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.DESIGN_ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDesignElement() {
		if (designElement != null && designElement.eIsProxy()) {
			InternalEObject oldDesignElement = (InternalEObject)designElement;
			designElement = eResolveProxy(oldDesignElement);
			if (designElement != oldDesignElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT, oldDesignElement, designElement));
			}
		}
		return designElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDesignElement() {
		return designElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignElement(EObject newDesignElement) {
		EObject oldDesignElement = designElement;
		designElement = newDesignElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT, oldDesignElement, designElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedDesignElements getParent() {
		if (eContainerFeatureID() != RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT) return null;
		return (ReferencedDesignElements)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ReferencedDesignElements newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ReferencedDesignElements newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS, ReferencedDesignElements.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvaluationResult() {
		return evaluationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationResult(String newEvaluationResult) {
		String oldEvaluationResult = evaluationResult;
		evaluationResult = newEvaluationResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT, oldEvaluationResult, evaluationResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableToDesignElementsElement getParentTraceableElement() {
		TraceableToDesignElementsElement parentTraceableElement = basicGetParentTraceableElement();
		return parentTraceableElement != null && parentTraceableElement.eIsProxy() ? (TraceableToDesignElementsElement)eResolveProxy((InternalEObject)parentTraceableElement) : parentTraceableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TraceableToDesignElementsElement basicGetParentTraceableElement() {
		final ReferencedDesignElements parent = getParent();
		
		if ( parent == null ) {
			return null;
		}
		
		return (TraceableToDesignElementsElement) parent.eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ReferencedDesignElements)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT:
				return eInternalContainer().eInverseRemove(this, RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS, ReferencedDesignElements.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT:
				if (resolve) return getDesignElement();
				return basicGetDesignElement();
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT:
				return getParent();
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT:
				return getEvaluationResult();
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT:
				if (resolve) return getParentTraceableElement();
				return basicGetParentTraceableElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT:
				setDesignElement((EObject)newValue);
				return;
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT:
				setParent((ReferencedDesignElements)newValue);
				return;
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT:
				setEvaluationResult((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT:
				setDesignElement((EObject)null);
				return;
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT:
				setParent((ReferencedDesignElements)null);
				return;
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT:
				setEvaluationResult(EVALUATION_RESULT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT:
				return designElement != null;
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT:
				return getParent() != null;
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT:
				return EVALUATION_RESULT_EDEFAULT == null ? evaluationResult != null : !EVALUATION_RESULT_EDEFAULT.equals(evaluationResult);
			case RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT:
				return basicGetParentTraceableElement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (evaluationResult: ");
		result.append(evaluationResult);
		result.append(')');
		return result.toString();
	}

} //DesignElementReferenceImpl
