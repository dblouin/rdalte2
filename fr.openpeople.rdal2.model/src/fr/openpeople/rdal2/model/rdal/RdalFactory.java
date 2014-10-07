/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage
 * @generated
 */
public interface RdalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdalFactory eINSTANCE = fr.openpeople.rdal2.model.rdal.impl.RdalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirement Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Refinement</em>'.
	 * @generated
	 */
	RequirementRefinement createRequirementRefinement();

	/**
	 * Returns a new object of class '<em>Goal Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal Refinement</em>'.
	 * @generated
	 */
	GoalRefinement createGoalRefinement();

	/**
	 * Returns a new object of class '<em>Contact Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Information</em>'.
	 * @generated
	 */
	ContactInformation createContactInformation();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Uncertainty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uncertainty</em>'.
	 * @generated
	 */
	Uncertainty createUncertainty();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>System Overview</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Overview</em>'.
	 * @generated
	 */
	SystemOverview createSystemOverview();

	/**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
	Capability createCapability();

	/**
	 * Returns a new object of class '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rationale</em>'.
	 * @generated
	 */
	Rationale createRationale();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Interaction Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Variable</em>'.
	 * @generated
	 */
	InteractionVariable createInteractionVariable();

	/**
	 * Returns a new object of class '<em>Actor Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Reference</em>'.
	 * @generated
	 */
	ActorReference createActorReference();

	/**
	 * Returns a new object of class '<em>System Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Context</em>'.
	 * @generated
	 */
	SystemContext createSystemContext();

	/**
	 * Returns a new object of class '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflict</em>'.
	 * @generated
	 */
	Conflict createConflict();

	/**
	 * Returns a new object of class '<em>Design Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Element Reference</em>'.
	 * @generated
	 */
	DesignElementReference createDesignElementReference();

	/**
	 * Returns a new object of class '<em>Verifiable Design Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verifiable Design Element Ref</em>'.
	 * @generated
	 */
	VerifiableDesignElementRef createVerifiableDesignElementRef();

	/**
	 * Returns a new object of class '<em>Satisfiable Design Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfiable Design Element Ref</em>'.
	 * @generated
	 */
	SatisfiableDesignElementRef createSatisfiableDesignElementRef();

	/**
	 * Returns a new object of class '<em>Prioritized Sat Design Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prioritized Sat Design Element Ref</em>'.
	 * @generated
	 */
	PrioritizedSatDesignElementRef createPrioritizedSatDesignElementRef();

	/**
	 * Returns a new object of class '<em>Syst Overview Design Elem Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syst Overview Design Elem Ref</em>'.
	 * @generated
	 */
	SystOverviewDesignElemRef createSystOverviewDesignElemRef();

	/**
	 * Returns a new object of class '<em>Syst Context Design Elem Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Syst Context Design Elem Ref</em>'.
	 * @generated
	 */
	SystContextDesignElemRef createSystContextDesignElemRef();

	/**
	 * Returns a new object of class '<em>Ref Manually Selected Design Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Manually Selected Design Elements</em>'.
	 * @generated
	 */
	RefManuallySelectedDesignElements createRefManuallySelectedDesignElements();

	/**
	 * Returns a new object of class '<em>Ref Query Collected Design Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Query Collected Design Elements</em>'.
	 * @generated
	 */
	RefQueryCollectedDesignElements createRefQueryCollectedDesignElements();

	/**
	 * Returns a new object of class '<em>Trace Design Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Design Element Ref</em>'.
	 * @generated
	 */
	TraceDesignElementRef createTraceDesignElementRef();

	/**
	 * Returns a new object of class '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder</em>'.
	 * @generated
	 */
	Stakeholder createStakeholder();

	/**
	 * Returns a new object of class '<em>Requirements Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Package</em>'.
	 * @generated
	 */
	RequirementsPackage createRequirementsPackage();

	/**
	 * Returns a new object of class '<em>Goals Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goals Package</em>'.
	 * @generated
	 */
	GoalsPackage createGoalsPackage();

	/**
	 * Returns a new object of class '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assumption</em>'.
	 * @generated
	 */
	Assumption createAssumption();

	/**
	 * Returns a new object of class '<em>System Function Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Function Goal</em>'.
	 * @generated
	 */
	SystemFunctionGoal createSystemFunctionGoal();

	/**
	 * Returns a new object of class '<em>Non Functional Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Functional Goal</em>'.
	 * @generated
	 */
	NonFunctionalGoal createNonFunctionalGoal();

	/**
	 * Returns a new object of class '<em>Quality Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Objective</em>'.
	 * @generated
	 */
	QualityObjective createQualityObjective();

	/**
	 * Returns a new object of class '<em>Verification Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Activity</em>'.
	 * @generated
	 */
	VerificationActivity createVerificationActivity();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Requirements Coverage Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Coverage Data</em>'.
	 * @generated
	 */
	RequirementsCoverageData createRequirementsCoverageData();

	/**
	 * Returns a new object of class '<em>Non Functional Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Functional Property</em>'.
	 * @generated
	 */
	NonFunctionalProperty createNonFunctionalProperty();

	/**
	 * Returns a new object of class '<em>Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensitivity</em>'.
	 * @generated
	 */
	Sensitivity createSensitivity();

	/**
	 * Returns a new object of class '<em>Sub Requirement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Requirement Reference</em>'.
	 * @generated
	 */
	SubRequirementReference createSubRequirementReference();

	/**
	 * Returns a new object of class '<em>Sub Goal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Goal Reference</em>'.
	 * @generated
	 */
	SubGoalReference createSubGoalReference();

	/**
	 * Returns a new object of class '<em>User Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Property</em>'.
	 * @generated
	 */
	UserProperty createUserProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RdalPackage getRdalPackage();

} //RdalFactory
