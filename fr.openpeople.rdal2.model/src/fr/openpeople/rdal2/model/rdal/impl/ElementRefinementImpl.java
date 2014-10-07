/**
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.ElementRefinement;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefineableElement;
import fr.openpeople.rdal2.model.rdal.SubElementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl#getSubElementRefEntries <em>Sub Element Ref Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl#getRefinedElementEntries <em>Refined Element Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl#getOwnedSubElementRefs <em>Owned Sub Element Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl#getRefinedElement <em>Refined Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementRefinementImpl extends IdentifiedElementImpl implements ElementRefinement {
	/**
	 * The cached value of the '{@link #getSubElementRefEntries() <em>Sub Element Ref Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElementRefEntries()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap subElementRefEntries;

	/**
	 * The cached value of the '{@link #getRefinedElementEntries() <em>Refined Element Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedElementEntries()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap refinedElementEntries;

	/**
	 * The cached value of the '{@link #getOwnedSubElementRefs() <em>Owned Sub Element Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubElementRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<SubElementReference> ownedSubElementRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.ELEMENT_REFINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSubElementRefEntries() {
		if (subElementRefEntries == null) {
			subElementRefEntries = new BasicFeatureMap(this, RdalPackage.ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES);
		}
		return subElementRefEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubElementReference> getOwnedSubElementRefs() {
		if (ownedSubElementRefs == null) {
			ownedSubElementRefs = new EObjectContainmentEList<SubElementReference>(SubElementReference.class, this, RdalPackage.ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS);
		}
		return ownedSubElementRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RefineableElement> getSubElements() {
		final Collection<RefineableElement> elements = new ArrayList<RefineableElement>();
		
		for ( final SubElementReference reference : getOwnedSubElementRefs() ) {
			final RefineableElement refineableElement = reference.getReferencedElement();
			
			if ( refineableElement != null ) {
				elements.add( refineableElement );
			}
		}
		
		return new EcoreEList.UnmodifiableEList<RefineableElement>( this, 
																	RdalPackage.eINSTANCE.getElementRefinement_SubElements(),
																	elements.size(),
																	elements.toArray() );	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRefinedElementEntries() {
		if (refinedElementEntries == null) {
			refinedElementEntries = new BasicFeatureMap(this, RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES);
		}
		return refinedElementEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefineableElement getRefinedElement() {
		RefineableElement refinedElement = basicGetRefinedElement();
		return refinedElement != null && refinedElement.eIsProxy() ? (RefineableElement)eResolveProxy((InternalEObject)refinedElement) : refinedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefineableElement basicGetRefinedElement() {
		return (RefineableElement)getRefinedElementEntries().get(RdalPackage.Literals.ELEMENT_REFINEMENT__REFINED_ELEMENT, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedElement(RefineableElement newRefinedElement) {
		((FeatureMap.Internal)getRefinedElementEntries()).set(RdalPackage.Literals.ELEMENT_REFINEMENT__REFINED_ELEMENT, newRefinedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES:
				return ((InternalEList<?>)getSubElementRefEntries()).basicRemove(otherEnd, msgs);
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES:
				return ((InternalEList<?>)getRefinedElementEntries()).basicRemove(otherEnd, msgs);
			case RdalPackage.ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS:
				return ((InternalEList<?>)getOwnedSubElementRefs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES:
				if (coreType) return getSubElementRefEntries();
				return ((FeatureMap.Internal)getSubElementRefEntries()).getWrapper();
			case RdalPackage.ELEMENT_REFINEMENT__SUB_ELEMENTS:
				return getSubElements();
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES:
				if (coreType) return getRefinedElementEntries();
				return ((FeatureMap.Internal)getRefinedElementEntries()).getWrapper();
			case RdalPackage.ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS:
				return getOwnedSubElementRefs();
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT:
				if (resolve) return getRefinedElement();
				return basicGetRefinedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdalPackage.ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES:
				((FeatureMap.Internal)getSubElementRefEntries()).set(newValue);
				return;
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES:
				((FeatureMap.Internal)getRefinedElementEntries()).set(newValue);
				return;
			case RdalPackage.ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS:
				getOwnedSubElementRefs().clear();
				getOwnedSubElementRefs().addAll((Collection<? extends SubElementReference>)newValue);
				return;
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT:
				setRefinedElement((RefineableElement)newValue);
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
			case RdalPackage.ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES:
				getSubElementRefEntries().clear();
				return;
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES:
				getRefinedElementEntries().clear();
				return;
			case RdalPackage.ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS:
				getOwnedSubElementRefs().clear();
				return;
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT:
				setRefinedElement((RefineableElement)null);
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
			case RdalPackage.ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES:
				return subElementRefEntries != null && !subElementRefEntries.isEmpty();
			case RdalPackage.ELEMENT_REFINEMENT__SUB_ELEMENTS:
				return !getSubElements().isEmpty();
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES:
				return refinedElementEntries != null && !refinedElementEntries.isEmpty();
			case RdalPackage.ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS:
				return ownedSubElementRefs != null && !ownedSubElementRefs.isEmpty();
			case RdalPackage.ELEMENT_REFINEMENT__REFINED_ELEMENT:
				return basicGetRefinedElement() != null;
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
		result.append(" (subElementRefEntries: ");
		result.append(subElementRefEntries);
		result.append(", refinedElementEntries: ");
		result.append(refinedElementEntries);
		result.append(')');
		return result.toString();
	}
} //ElementRefinementImpl
