/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.util;

import fr.openpeople.rdal2.model.rdal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage
 * @generated
 */
public class RdalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RdalPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdalSwitch<Adapter> modelSwitch =
		new RdalSwitch<Adapter>() {
			@Override
			public Adapter caseIdentifiedElement(IdentifiedElement object) {
				return createIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseElementRefinement(ElementRefinement object) {
				return createElementRefinementAdapter();
			}
			@Override
			public Adapter caseRequirementRefinement(RequirementRefinement object) {
				return createRequirementRefinementAdapter();
			}
			@Override
			public Adapter caseGoalRefinement(GoalRefinement object) {
				return createGoalRefinementAdapter();
			}
			@Override
			public Adapter caseTraceableToDesignElementsElement(TraceableToDesignElementsElement object) {
				return createTraceableToDesignElementsElementAdapter();
			}
			@Override
			public Adapter caseAbstractContractualElement(AbstractContractualElement object) {
				return createAbstractContractualElementAdapter();
			}
			@Override
			public Adapter caseContactInformation(ContactInformation object) {
				return createContactInformationAdapter();
			}
			@Override
			public Adapter caseStakeholder(Stakeholder object) {
				return createStakeholderAdapter();
			}
			@Override
			public Adapter caseRationale(Rationale object) {
				return createRationaleAdapter();
			}
			@Override
			public Adapter caseTextualContractualElement(TextualContractualElement object) {
				return createTextualContractualElementAdapter();
			}
			@Override
			public Adapter caseUncertainty(Uncertainty object) {
				return createUncertaintyAdapter();
			}
			@Override
			public Adapter caseSatisfiableElement(SatisfiableElement object) {
				return createSatisfiableElementAdapter();
			}
			@Override
			public Adapter caseVerifiableElement(VerifiableElement object) {
				return createVerifiableElementAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseRdalOrgPackage(RdalOrgPackage object) {
				return createRdalOrgPackageAdapter();
			}
			@Override
			public Adapter caseRequirementsPackage(RequirementsPackage object) {
				return createRequirementsPackageAdapter();
			}
			@Override
			public Adapter caseGoalsPackage(GoalsPackage object) {
				return createGoalsPackageAdapter();
			}
			@Override
			public Adapter caseSystemOverview(SystemOverview object) {
				return createSystemOverviewAdapter();
			}
			@Override
			public Adapter caseCapability(Capability object) {
				return createCapabilityAdapter();
			}
			@Override
			public Adapter caseSystemContext(SystemContext object) {
				return createSystemContextAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseInteractionVariable(InteractionVariable object) {
				return createInteractionVariableAdapter();
			}
			@Override
			public Adapter caseActorReference(ActorReference object) {
				return createActorReferenceAdapter();
			}
			@Override
			public Adapter caseRefineableElement(RefineableElement object) {
				return createRefineableElementAdapter();
			}
			@Override
			public Adapter caseAbstractRequirement(AbstractRequirement object) {
				return createAbstractRequirementAdapter();
			}
			@Override
			public Adapter caseVerificationActivity(VerificationActivity object) {
				return createVerificationActivityAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseAssumption(Assumption object) {
				return createAssumptionAdapter();
			}
			@Override
			public Adapter caseAbstractGoal(AbstractGoal object) {
				return createAbstractGoalAdapter();
			}
			@Override
			public Adapter caseSystemFunctionGoal(SystemFunctionGoal object) {
				return createSystemFunctionGoalAdapter();
			}
			@Override
			public Adapter caseNonFunctionalGoal(NonFunctionalGoal object) {
				return createNonFunctionalGoalAdapter();
			}
			@Override
			public Adapter caseQualityObjective(QualityObjective object) {
				return createQualityObjectiveAdapter();
			}
			@Override
			public Adapter caseConflict(Conflict object) {
				return createConflictAdapter();
			}
			@Override
			public Adapter caseReferencedDesignElements(ReferencedDesignElements object) {
				return createReferencedDesignElementsAdapter();
			}
			@Override
			public Adapter caseDesignElementReference(DesignElementReference object) {
				return createDesignElementReferenceAdapter();
			}
			@Override
			public Adapter caseVerifiableDesignElementRef(VerifiableDesignElementRef object) {
				return createVerifiableDesignElementRefAdapter();
			}
			@Override
			public Adapter caseSatisfiableDesignElementRef(SatisfiableDesignElementRef object) {
				return createSatisfiableDesignElementRefAdapter();
			}
			@Override
			public Adapter casePrioritizedSatDesignElementRef(PrioritizedSatDesignElementRef object) {
				return createPrioritizedSatDesignElementRefAdapter();
			}
			@Override
			public Adapter caseSystOverviewDesignElemRef(SystOverviewDesignElemRef object) {
				return createSystOverviewDesignElemRefAdapter();
			}
			@Override
			public Adapter caseSystContextDesignElemRef(SystContextDesignElemRef object) {
				return createSystContextDesignElemRefAdapter();
			}
			@Override
			public Adapter caseRefManuallySelectedDesignElements(RefManuallySelectedDesignElements object) {
				return createRefManuallySelectedDesignElementsAdapter();
			}
			@Override
			public Adapter caseRefQueryCollectedDesignElements(RefQueryCollectedDesignElements object) {
				return createRefQueryCollectedDesignElementsAdapter();
			}
			@Override
			public Adapter caseTraceDesignElementRef(TraceDesignElementRef object) {
				return createTraceDesignElementRefAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseRequirementsCoverageData(RequirementsCoverageData object) {
				return createRequirementsCoverageDataAdapter();
			}
			@Override
			public Adapter caseNonFunctionalProperty(NonFunctionalProperty object) {
				return createNonFunctionalPropertyAdapter();
			}
			@Override
			public Adapter caseSensitivity(Sensitivity object) {
				return createSensitivityAdapter();
			}
			@Override
			public Adapter caseSubElementReference(SubElementReference object) {
				return createSubElementReferenceAdapter();
			}
			@Override
			public Adapter caseSubRequirementReference(SubRequirementReference object) {
				return createSubRequirementReferenceAdapter();
			}
			@Override
			public Adapter caseSubGoalReference(SubGoalReference object) {
				return createSubGoalReferenceAdapter();
			}
			@Override
			public Adapter caseUserProperty(UserProperty object) {
				return createUserPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.ElementRefinement <em>Element Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.ElementRefinement
	 * @generated
	 */
	public Adapter createElementRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement <em>Requirement Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementRefinement
	 * @generated
	 */
	public Adapter createRequirementRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.GoalRefinement <em>Goal Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.GoalRefinement
	 * @generated
	 */
	public Adapter createGoalRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement <em>Traceable To Design Elements Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement
	 * @generated
	 */
	public Adapter createTraceableToDesignElementsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement <em>Abstract Contractual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement
	 * @generated
	 */
	public Adapter createAbstractContractualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.ContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.ContactInformation
	 * @generated
	 */
	public Adapter createContactInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement <em>Abstract Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractRequirement
	 * @generated
	 */
	public Adapter createAbstractRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SystemFunctionGoal <em>System Function Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SystemFunctionGoal
	 * @generated
	 */
	public Adapter createSystemFunctionGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.NonFunctionalGoal <em>Non Functional Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.NonFunctionalGoal
	 * @generated
	 */
	public Adapter createNonFunctionalGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.QualityObjective <em>Quality Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.QualityObjective
	 * @generated
	 */
	public Adapter createQualityObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Uncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty
	 * @generated
	 */
	public Adapter createUncertaintyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.VerifiableElement <em>Verifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.VerifiableElement
	 * @generated
	 */
	public Adapter createVerifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SatisfiableElement <em>Satisfiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SatisfiableElement
	 * @generated
	 */
	public Adapter createSatisfiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage <em>Org Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage
	 * @generated
	 */
	public Adapter createRdalOrgPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SystemOverview <em>System Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview
	 * @generated
	 */
	public Adapter createSystemOverviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Rationale
	 * @generated
	 */
	public Adapter createRationaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement <em>Textual Contractual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.TextualContractualElement
	 * @generated
	 */
	public Adapter createTextualContractualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.InteractionVariable <em>Interaction Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.InteractionVariable
	 * @generated
	 */
	public Adapter createInteractionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.ActorReference <em>Actor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.ActorReference
	 * @generated
	 */
	public Adapter createActorReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.RefineableElement <em>Refineable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.RefineableElement
	 * @generated
	 */
	public Adapter createRefineableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SystemContext
	 * @generated
	 */
	public Adapter createSystemContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Conflict
	 * @generated
	 */
	public Adapter createConflictAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Stakeholder
	 * @generated
	 */
	public Adapter createStakeholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage <em>Requirements Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsPackage
	 * @generated
	 */
	public Adapter createRequirementsPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.GoalsPackage <em>Goals Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.GoalsPackage
	 * @generated
	 */
	public Adapter createGoalsPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.AbstractGoal <em>Abstract Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractGoal
	 * @generated
	 */
	public Adapter createAbstractGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity <em>Verification Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.VerificationActivity
	 * @generated
	 */
	public Adapter createVerificationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.ReferencedDesignElements <em>Referenced Design Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.ReferencedDesignElements
	 * @generated
	 */
	public Adapter createReferencedDesignElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements <em>Ref Manually Selected Design Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements
	 * @generated
	 */
	public Adapter createRefManuallySelectedDesignElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements <em>Ref Query Collected Design Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements
	 * @generated
	 */
	public Adapter createRefQueryCollectedDesignElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.TraceDesignElementRef <em>Trace Design Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.TraceDesignElementRef
	 * @generated
	 */
	public Adapter createTraceDesignElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference <em>Design Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.DesignElementReference
	 * @generated
	 */
	public Adapter createDesignElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.VerifiableDesignElementRef <em>Verifiable Design Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.VerifiableDesignElementRef
	 * @generated
	 */
	public Adapter createVerifiableDesignElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SatisfiableDesignElementRef <em>Satisfiable Design Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SatisfiableDesignElementRef
	 * @generated
	 */
	public Adapter createSatisfiableDesignElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef <em>Prioritized Sat Design Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef
	 * @generated
	 */
	public Adapter createPrioritizedSatDesignElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SystOverviewDesignElemRef <em>Syst Overview Design Elem Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SystOverviewDesignElemRef
	 * @generated
	 */
	public Adapter createSystOverviewDesignElemRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SystContextDesignElemRef <em>Syst Context Design Elem Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SystContextDesignElemRef
	 * @generated
	 */
	public Adapter createSystContextDesignElemRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.RequirementsCoverageData <em>Requirements Coverage Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsCoverageData
	 * @generated
	 */
	public Adapter createRequirementsCoverageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.NonFunctionalProperty <em>Non Functional Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.NonFunctionalProperty
	 * @generated
	 */
	public Adapter createNonFunctionalPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.Sensitivity <em>Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.Sensitivity
	 * @generated
	 */
	public Adapter createSensitivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SubElementReference <em>Sub Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SubElementReference
	 * @generated
	 */
	public Adapter createSubElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SubRequirementReference <em>Sub Requirement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SubRequirementReference
	 * @generated
	 */
	public Adapter createSubRequirementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.SubGoalReference <em>Sub Goal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.SubGoalReference
	 * @generated
	 */
	public Adapter createSubGoalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.openpeople.rdal2.model.rdal.UserProperty <em>User Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.openpeople.rdal2.model.rdal.UserProperty
	 * @generated
	 */
	public Adapter createUserPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RdalAdapterFactory
