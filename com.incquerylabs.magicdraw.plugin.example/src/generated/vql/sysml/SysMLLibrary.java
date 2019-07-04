/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.plugin.example/src/main/java/sysml/SysMLLibrary.vql
 */
package sysml;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import sysml.AbstractRequirement;
import sysml.AbstractRequirement_Derived;
import sysml.AbstractRequirement_DerivedFrom;
import sysml.AbstractRequirement_Id;
import sysml.AbstractRequirement_Master;
import sysml.AbstractRequirement_RefinedBy;
import sysml.AbstractRequirement_SatisfiedBy;
import sysml.AbstractRequirement_Text;
import sysml.AbstractRequirement_TracedTo;
import sysml.AbstractRequirement_VerifiedBy;
import sysml.AcceptChangeStructuralFeatureEventAction;
import sysml.Actuator;
import sysml.AdjunctProperty;
import sysml.AdjunctProperty_principal;
import sysml.Allocate;
import sysml.AllocateActivityPartition;
import sysml.Allocate_sourceContext;
import sysml.Allocate_sourcePropertyPath;
import sysml.Allocate_targetContext;
import sysml.Allocate_targetPropertyPath;
import sysml.Allocated;
import sysml.Allocated_allocatedFrom;
import sysml.Allocated_allocatedTo;
import sysml.BasicInterval;
import sysml.BasicInterval_max;
import sysml.BasicInterval_min;
import sysml.BindingConnector;
import sysml.Block;
import sysml.BlockHierarchy;
import sysml.Block_isEncapsulated;
import sysml.BoundReference;
import sysml.BoundReference_bindingPath;
import sysml.BoundReference_boundEnd;
import sysml.BoundReference_lower;
import sysml.BoundReference_upper;
import sysml.Boundarysystem;
import sysml.BusinessRequirement;
import sysml.BusinessRequirement_Derived;
import sysml.BusinessRequirement_DerivedFrom;
import sysml.BusinessRequirement_Id;
import sysml.BusinessRequirement_Master;
import sysml.BusinessRequirement_RefinedBy;
import sysml.BusinessRequirement_SatisfiedBy;
import sysml.BusinessRequirement_Text;
import sysml.BusinessRequirement_TracedTo;
import sysml.BusinessRequirement_VerifiedBy;
import sysml.BusinessRequirement_risk;
import sysml.BusinessRequirement_source;
import sysml.BusinessRequirement_verifyMethod;
import sysml.ChangeStructuralFeatureEvent;
import sysml.ChangeStructuralFeatureEvent_structuralFeature;
import sysml.ClassifierBehaviorProperty;
import sysml.Conform;
import sysml.ConnectorProperty;
import sysml.ConnectorProperty_connector;
import sysml.ConstraintBlock;
import sysml.ConstraintBlock_isEncapsulated;
import sysml.ContextDiagram;
import sysml.Continuous;
import sysml.Continuous_rate;
import sysml.ControlOperator;
import sysml.Copy;
import sysml.Copy_sourceContext;
import sysml.Copy_sourcePropertyPath;
import sysml.Copy_targetContext;
import sysml.Copy_targetPropertyPath;
import sysml.DeriveReqt;
import sysml.DeriveReqt_sourceContext;
import sysml.DeriveReqt_sourcePropertyPath;
import sysml.DeriveReqt_targetContext;
import sysml.DeriveReqt_targetPropertyPath;
import sysml.DesignConstraint;
import sysml.DesignConstraint_Derived;
import sysml.DesignConstraint_DerivedFrom;
import sysml.DesignConstraint_Id;
import sysml.DesignConstraint_Master;
import sysml.DesignConstraint_RefinedBy;
import sysml.DesignConstraint_SatisfiedBy;
import sysml.DesignConstraint_Text;
import sysml.DesignConstraint_TracedTo;
import sysml.DesignConstraint_VerifiedBy;
import sysml.DesignConstraint_risk;
import sysml.DesignConstraint_source;
import sysml.DesignConstraint_verifyMethod;
import sysml.DiagramDescription;
import sysml.DiagramDescription_Completionstatus;
import sysml.DiagramDescription_Description;
import sysml.DiagramDescription_Reference;
import sysml.DiagramDescription_Version;
import sysml.DiagramUsage;
import sysml.DirectedFeature;
import sysml.DirectedFeature_featureDirection;
import sysml.DirectedRelationshipPropertyPath;
import sysml.DirectedRelationshipPropertyPath_sourceContext;
import sysml.DirectedRelationshipPropertyPath_sourcePropertyPath;
import sysml.DirectedRelationshipPropertyPath_targetContext;
import sysml.DirectedRelationshipPropertyPath_targetPropertyPath;
import sysml.Discrete;
import sysml.Discrete_rate;
import sysml.DistributedProperty;
import sysml.Domain;
import sysml.Domain_isEncapsulated;
import sysml.Effbd;
import sysml.ElementGroup;
import sysml.ElementGroup_criterion;
import sysml.ElementGroup_member;
import sysml.ElementGroup_name;
import sysml.ElementGroup_orderedMember;
import sysml.ElementGroup_size;
import sysml.ElementPropertyPath;
import sysml.EndPathMultiplicity;
import sysml.EndPathMultiplicity_lower;
import sysml.EndPathMultiplicity_upper;
import sysml.Environmentaleffect;
import sysml.Essential;
import sysml.Expose;
import sysml.ExtendedRequirement;
import sysml.ExtendedRequirement_Derived;
import sysml.ExtendedRequirement_DerivedFrom;
import sysml.ExtendedRequirement_Id;
import sysml.ExtendedRequirement_Master;
import sysml.ExtendedRequirement_RefinedBy;
import sysml.ExtendedRequirement_SatisfiedBy;
import sysml.ExtendedRequirement_Text;
import sysml.ExtendedRequirement_TracedTo;
import sysml.ExtendedRequirement_VerifiedBy;
import sysml.ExtendedRequirement_risk;
import sysml.ExtendedRequirement_source;
import sysml.ExtendedRequirement_verifyMethod;
import sysml.External;
import sysml.External_isEncapsulated;
import sysml.Externalsystem;
import sysml.FlowPort;
import sysml.FlowPort_direction;
import sysml.FlowPort_isAtomic;
import sysml.FlowProperty;
import sysml.FlowProperty_direction;
import sysml.FlowSpecification;
import sysml.FullPort;
import sysml.FunctionalRequirement;
import sysml.FunctionalRequirement_Derived;
import sysml.FunctionalRequirement_DerivedFrom;
import sysml.FunctionalRequirement_Id;
import sysml.FunctionalRequirement_Master;
import sysml.FunctionalRequirement_RefinedBy;
import sysml.FunctionalRequirement_SatisfiedBy;
import sysml.FunctionalRequirement_Text;
import sysml.FunctionalRequirement_TracedTo;
import sysml.FunctionalRequirement_VerifiedBy;
import sysml.FunctionalRequirement_risk;
import sysml.FunctionalRequirement_source;
import sysml.FunctionalRequirement_verifyMethod;
import sysml.InterfaceBlock;
import sysml.InterfaceBlock_isEncapsulated;
import sysml.InterfaceRequirement;
import sysml.InterfaceRequirement_Derived;
import sysml.InterfaceRequirement_DerivedFrom;
import sysml.InterfaceRequirement_Id;
import sysml.InterfaceRequirement_Master;
import sysml.InterfaceRequirement_RefinedBy;
import sysml.InterfaceRequirement_SatisfiedBy;
import sysml.InterfaceRequirement_Text;
import sysml.InterfaceRequirement_TracedTo;
import sysml.InterfaceRequirement_VerifiedBy;
import sysml.InterfaceRequirement_risk;
import sysml.InterfaceRequirement_source;
import sysml.InterfaceRequirement_verifyMethod;
import sysml.Interval;
import sysml.Interval_max;
import sysml.Interval_min;
import sysml.InvocationOnNestedPortAction;
import sysml.InvocationOnNestedPortAction_onNestedPort;
import sysml.ItemFlow;
import sysml.ItemFlow_itemProperty;
import sysml.Moe;
import sysml.NestedConnectorEnd;
import sysml.NoBuffer;
import sysml.NonStreaming;
import sysml.Normal;
import sysml.Normal_mean;
import sysml.Normal_standardDeviation;
import sysml.ObjectiveFunction;
import sysml.Optional;
import sysml.Overwrite;
import sysml.ParticipantProperty;
import sysml.ParticipantProperty_end;
import sysml.PerformanceRequirement;
import sysml.PerformanceRequirement_Derived;
import sysml.PerformanceRequirement_DerivedFrom;
import sysml.PerformanceRequirement_Id;
import sysml.PerformanceRequirement_Master;
import sysml.PerformanceRequirement_RefinedBy;
import sysml.PerformanceRequirement_SatisfiedBy;
import sysml.PerformanceRequirement_Text;
import sysml.PerformanceRequirement_TracedTo;
import sysml.PerformanceRequirement_VerifiedBy;
import sysml.PerformanceRequirement_risk;
import sysml.PerformanceRequirement_source;
import sysml.PerformanceRequirement_verifyMethod;
import sysml.PhysicalRequirement;
import sysml.PhysicalRequirement_Derived;
import sysml.PhysicalRequirement_DerivedFrom;
import sysml.PhysicalRequirement_Id;
import sysml.PhysicalRequirement_Master;
import sysml.PhysicalRequirement_RefinedBy;
import sysml.PhysicalRequirement_SatisfiedBy;
import sysml.PhysicalRequirement_Text;
import sysml.PhysicalRequirement_TracedTo;
import sysml.PhysicalRequirement_VerifiedBy;
import sysml.PhysicalRequirement_risk;
import sysml.PhysicalRequirement_source;
import sysml.PhysicalRequirement_verifyMethod;
import sysml.Probability;
import sysml.Probability_probability;
import sysml.Problem;
import sysml.PropertySpecificType;
import sysml.ProxyPort;
import sysml.Rate;
import sysml.Rate_rate;
import sysml.Rationale;
import sysml.Refine;
import sysml.Refine_sourceContext;
import sysml.Refine_sourcePropertyPath;
import sysml.Refine_targetContext;
import sysml.Refine_targetPropertyPath;
import sysml.Requirement;
import sysml.RequirementRelated;
import sysml.RequirementRelated_Refines;
import sysml.RequirementRelated_Satisfies;
import sysml.RequirementRelated_TracedFrom;
import sysml.RequirementRelated_Verifies;
import sysml.Requirement_Derived;
import sysml.Requirement_DerivedFrom;
import sysml.Requirement_Id;
import sysml.Requirement_Master;
import sysml.Requirement_RefinedBy;
import sysml.Requirement_SatisfiedBy;
import sysml.Requirement_Text;
import sysml.Requirement_TracedTo;
import sysml.Requirement_VerifiedBy;
import sysml.Satisfy;
import sysml.Satisfy_sourceContext;
import sysml.Satisfy_sourcePropertyPath;
import sysml.Satisfy_targetContext;
import sysml.Satisfy_targetPropertyPath;
import sysml.Sensor;
import sysml.Stakeholder;
import sysml.Stakeholder_concern;
import sysml.Stakeholder_concernList;
import sysml.Streaming;
import sysml.Subsystem;
import sysml.Subsystem_isEncapsulated;
import sysml.SwimLaneDiagram;
import sysml.System;
import sysml.System_isEncapsulated;
import sysml.Systemcontext;
import sysml.Systemcontext_isEncapsulated;
import sysml.Systemprocess;
import sysml.TestCase;
import sysml.Trace;
import sysml.Trace_sourceContext;
import sysml.Trace_sourcePropertyPath;
import sysml.Trace_targetContext;
import sysml.Trace_targetPropertyPath;
import sysml.TriggerOnNestedPort;
import sysml.TriggerOnNestedPort_onNestedPort;
import sysml.Uniform;
import sysml.Uniform_max;
import sysml.Uniform_min;
import sysml.UsabilityRequirement;
import sysml.UsabilityRequirement_Derived;
import sysml.UsabilityRequirement_DerivedFrom;
import sysml.UsabilityRequirement_Id;
import sysml.UsabilityRequirement_Master;
import sysml.UsabilityRequirement_RefinedBy;
import sysml.UsabilityRequirement_SatisfiedBy;
import sysml.UsabilityRequirement_Text;
import sysml.UsabilityRequirement_TracedTo;
import sysml.UsabilityRequirement_VerifiedBy;
import sysml.UsabilityRequirement_risk;
import sysml.UsabilityRequirement_source;
import sysml.UsabilityRequirement_verifyMethod;
import sysml.Usersystem;
import sysml.ValueType;
import sysml.ValueType_quantityKind;
import sysml.ValueType_unit;
import sysml.Verify;
import sysml.Verify_sourceContext;
import sysml.Verify_sourcePropertyPath;
import sysml.Verify_targetContext;
import sysml.Verify_targetPropertyPath;
import sysml.View;
import sysml.View_stakeholder;
import sysml.View_viewPoint;
import sysml.Viewpoint;
import sysml.Viewpoint_concern;
import sysml.Viewpoint_concernList;
import sysml.Viewpoint_language;
import sysml.Viewpoint_method;
import sysml.Viewpoint_presentation;
import sysml.Viewpoint_purpose;
import sysml.Viewpoint_stakeholder;

/**
 * A pattern group formed of all public patterns defined in SysMLLibrary.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SysMLLibrary.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package sysml, the group contains the definition of the following patterns: <ul>
 * <li>Allocate</li>
 * <li>Allocate_sourceContext</li>
 * <li>Allocate_sourcePropertyPath</li>
 * <li>Allocate_targetContext</li>
 * <li>Allocate_targetPropertyPath</li>
 * <li>AllocateActivityPartition</li>
 * <li>Continuous</li>
 * <li>Continuous_rate</li>
 * <li>ControlOperator</li>
 * <li>Discrete</li>
 * <li>Discrete_rate</li>
 * <li>NoBuffer</li>
 * <li>Optional</li>
 * <li>Overwrite</li>
 * <li>Probability</li>
 * <li>Probability_probability</li>
 * <li>Rate</li>
 * <li>Rate_rate</li>
 * <li>ConstraintBlock</li>
 * <li>ConstraintBlock_isEncapsulated</li>
 * <li>AdjunctProperty</li>
 * <li>AdjunctProperty_principal</li>
 * <li>BindingConnector</li>
 * <li>Block</li>
 * <li>Block_isEncapsulated</li>
 * <li>BoundReference</li>
 * <li>BoundReference_bindingPath</li>
 * <li>BoundReference_boundEnd</li>
 * <li>BoundReference_lower</li>
 * <li>BoundReference_upper</li>
 * <li>ClassifierBehaviorProperty</li>
 * <li>ConnectorProperty</li>
 * <li>ConnectorProperty_connector</li>
 * <li>DirectedRelationshipPropertyPath</li>
 * <li>DirectedRelationshipPropertyPath_sourceContext</li>
 * <li>DirectedRelationshipPropertyPath_sourcePropertyPath</li>
 * <li>DirectedRelationshipPropertyPath_targetContext</li>
 * <li>DirectedRelationshipPropertyPath_targetPropertyPath</li>
 * <li>DistributedProperty</li>
 * <li>ElementPropertyPath</li>
 * <li>EndPathMultiplicity</li>
 * <li>EndPathMultiplicity_lower</li>
 * <li>EndPathMultiplicity_upper</li>
 * <li>NestedConnectorEnd</li>
 * <li>ParticipantProperty</li>
 * <li>ParticipantProperty_end</li>
 * <li>PropertySpecificType</li>
 * <li>ValueType</li>
 * <li>ValueType_quantityKind</li>
 * <li>ValueType_unit</li>
 * <li>Conform</li>
 * <li>ElementGroup</li>
 * <li>ElementGroup_criterion</li>
 * <li>ElementGroup_member</li>
 * <li>ElementGroup_name</li>
 * <li>ElementGroup_orderedMember</li>
 * <li>ElementGroup_size</li>
 * <li>Expose</li>
 * <li>Problem</li>
 * <li>Rationale</li>
 * <li>Stakeholder</li>
 * <li>Stakeholder_concern</li>
 * <li>Stakeholder_concernList</li>
 * <li>View</li>
 * <li>View_stakeholder</li>
 * <li>View_viewPoint</li>
 * <li>Viewpoint</li>
 * <li>Viewpoint_concern</li>
 * <li>Viewpoint_concernList</li>
 * <li>Viewpoint_language</li>
 * <li>Viewpoint_method</li>
 * <li>Viewpoint_presentation</li>
 * <li>Viewpoint_purpose</li>
 * <li>Viewpoint_stakeholder</li>
 * <li>Essential</li>
 * <li>Systemprocess</li>
 * <li>effbd</li>
 * <li>nonStreaming</li>
 * <li>streaming</li>
 * <li>Actuator</li>
 * <li>Boundarysystem</li>
 * <li>Environmentaleffect</li>
 * <li>Externalsystem</li>
 * <li>Sensor</li>
 * <li>Usersystem</li>
 * <li>Domain</li>
 * <li>Domain_isEncapsulated</li>
 * <li>External</li>
 * <li>External_isEncapsulated</li>
 * <li>Subsystem</li>
 * <li>Subsystem_isEncapsulated</li>
 * <li>System</li>
 * <li>System_isEncapsulated</li>
 * <li>Systemcontext</li>
 * <li>Systemcontext_isEncapsulated</li>
 * <li>BlockHierarchy</li>
 * <li>ContextDiagram</li>
 * <li>DiagramDescription</li>
 * <li>DiagramDescription_Completionstatus</li>
 * <li>DiagramDescription_Description</li>
 * <li>DiagramDescription_Reference</li>
 * <li>DiagramDescription_Version</li>
 * <li>SwimLaneDiagram</li>
 * <li>diagramUsage</li>
 * <li>BasicInterval</li>
 * <li>BasicInterval_max</li>
 * <li>BasicInterval_min</li>
 * <li>Interval</li>
 * <li>Interval_max</li>
 * <li>Interval_min</li>
 * <li>Normal</li>
 * <li>Normal_mean</li>
 * <li>Normal_standardDeviation</li>
 * <li>Uniform</li>
 * <li>Uniform_max</li>
 * <li>Uniform_min</li>
 * <li>moe</li>
 * <li>objectiveFunction</li>
 * <li>businessRequirement</li>
 * <li>businessRequirement_Derived</li>
 * <li>businessRequirement_DerivedFrom</li>
 * <li>businessRequirement_Id</li>
 * <li>businessRequirement_Master</li>
 * <li>businessRequirement_RefinedBy</li>
 * <li>businessRequirement_SatisfiedBy</li>
 * <li>businessRequirement_Text</li>
 * <li>businessRequirement_TracedTo</li>
 * <li>businessRequirement_VerifiedBy</li>
 * <li>businessRequirement_risk</li>
 * <li>businessRequirement_source</li>
 * <li>businessRequirement_verifyMethod</li>
 * <li>designConstraint</li>
 * <li>designConstraint_Derived</li>
 * <li>designConstraint_DerivedFrom</li>
 * <li>designConstraint_Id</li>
 * <li>designConstraint_Master</li>
 * <li>designConstraint_RefinedBy</li>
 * <li>designConstraint_SatisfiedBy</li>
 * <li>designConstraint_Text</li>
 * <li>designConstraint_TracedTo</li>
 * <li>designConstraint_VerifiedBy</li>
 * <li>designConstraint_risk</li>
 * <li>designConstraint_source</li>
 * <li>designConstraint_verifyMethod</li>
 * <li>extendedRequirement</li>
 * <li>extendedRequirement_Derived</li>
 * <li>extendedRequirement_DerivedFrom</li>
 * <li>extendedRequirement_Id</li>
 * <li>extendedRequirement_Master</li>
 * <li>extendedRequirement_RefinedBy</li>
 * <li>extendedRequirement_SatisfiedBy</li>
 * <li>extendedRequirement_Text</li>
 * <li>extendedRequirement_TracedTo</li>
 * <li>extendedRequirement_VerifiedBy</li>
 * <li>extendedRequirement_risk</li>
 * <li>extendedRequirement_source</li>
 * <li>extendedRequirement_verifyMethod</li>
 * <li>functionalRequirement</li>
 * <li>functionalRequirement_Derived</li>
 * <li>functionalRequirement_DerivedFrom</li>
 * <li>functionalRequirement_Id</li>
 * <li>functionalRequirement_Master</li>
 * <li>functionalRequirement_RefinedBy</li>
 * <li>functionalRequirement_SatisfiedBy</li>
 * <li>functionalRequirement_Text</li>
 * <li>functionalRequirement_TracedTo</li>
 * <li>functionalRequirement_VerifiedBy</li>
 * <li>functionalRequirement_risk</li>
 * <li>functionalRequirement_source</li>
 * <li>functionalRequirement_verifyMethod</li>
 * <li>interfaceRequirement</li>
 * <li>interfaceRequirement_Derived</li>
 * <li>interfaceRequirement_DerivedFrom</li>
 * <li>interfaceRequirement_Id</li>
 * <li>interfaceRequirement_Master</li>
 * <li>interfaceRequirement_RefinedBy</li>
 * <li>interfaceRequirement_SatisfiedBy</li>
 * <li>interfaceRequirement_Text</li>
 * <li>interfaceRequirement_TracedTo</li>
 * <li>interfaceRequirement_VerifiedBy</li>
 * <li>interfaceRequirement_risk</li>
 * <li>interfaceRequirement_source</li>
 * <li>interfaceRequirement_verifyMethod</li>
 * <li>performanceRequirement</li>
 * <li>performanceRequirement_Derived</li>
 * <li>performanceRequirement_DerivedFrom</li>
 * <li>performanceRequirement_Id</li>
 * <li>performanceRequirement_Master</li>
 * <li>performanceRequirement_RefinedBy</li>
 * <li>performanceRequirement_SatisfiedBy</li>
 * <li>performanceRequirement_Text</li>
 * <li>performanceRequirement_TracedTo</li>
 * <li>performanceRequirement_VerifiedBy</li>
 * <li>performanceRequirement_risk</li>
 * <li>performanceRequirement_source</li>
 * <li>performanceRequirement_verifyMethod</li>
 * <li>physicalRequirement</li>
 * <li>physicalRequirement_Derived</li>
 * <li>physicalRequirement_DerivedFrom</li>
 * <li>physicalRequirement_Id</li>
 * <li>physicalRequirement_Master</li>
 * <li>physicalRequirement_RefinedBy</li>
 * <li>physicalRequirement_SatisfiedBy</li>
 * <li>physicalRequirement_Text</li>
 * <li>physicalRequirement_TracedTo</li>
 * <li>physicalRequirement_VerifiedBy</li>
 * <li>physicalRequirement_risk</li>
 * <li>physicalRequirement_source</li>
 * <li>physicalRequirement_verifyMethod</li>
 * <li>usabilityRequirement</li>
 * <li>usabilityRequirement_Derived</li>
 * <li>usabilityRequirement_DerivedFrom</li>
 * <li>usabilityRequirement_Id</li>
 * <li>usabilityRequirement_Master</li>
 * <li>usabilityRequirement_RefinedBy</li>
 * <li>usabilityRequirement_SatisfiedBy</li>
 * <li>usabilityRequirement_Text</li>
 * <li>usabilityRequirement_TracedTo</li>
 * <li>usabilityRequirement_VerifiedBy</li>
 * <li>usabilityRequirement_risk</li>
 * <li>usabilityRequirement_source</li>
 * <li>usabilityRequirement_verifyMethod</li>
 * <li>AcceptChangeStructuralFeatureEventAction</li>
 * <li>ChangeStructuralFeatureEvent</li>
 * <li>ChangeStructuralFeatureEvent_structuralFeature</li>
 * <li>DirectedFeature</li>
 * <li>DirectedFeature_featureDirection</li>
 * <li>FlowProperty</li>
 * <li>FlowProperty_direction</li>
 * <li>FullPort</li>
 * <li>InterfaceBlock</li>
 * <li>InterfaceBlock_isEncapsulated</li>
 * <li>InvocationOnNestedPortAction</li>
 * <li>InvocationOnNestedPortAction_onNestedPort</li>
 * <li>ItemFlow</li>
 * <li>ItemFlow_itemProperty</li>
 * <li>ProxyPort</li>
 * <li>TriggerOnNestedPort</li>
 * <li>TriggerOnNestedPort_onNestedPort</li>
 * <li>AbstractRequirement</li>
 * <li>AbstractRequirement_Derived</li>
 * <li>AbstractRequirement_DerivedFrom</li>
 * <li>AbstractRequirement_Id</li>
 * <li>AbstractRequirement_Master</li>
 * <li>AbstractRequirement_RefinedBy</li>
 * <li>AbstractRequirement_SatisfiedBy</li>
 * <li>AbstractRequirement_Text</li>
 * <li>AbstractRequirement_TracedTo</li>
 * <li>AbstractRequirement_VerifiedBy</li>
 * <li>Copy</li>
 * <li>Copy_sourceContext</li>
 * <li>Copy_sourcePropertyPath</li>
 * <li>Copy_targetContext</li>
 * <li>Copy_targetPropertyPath</li>
 * <li>DeriveReqt</li>
 * <li>DeriveReqt_sourceContext</li>
 * <li>DeriveReqt_sourcePropertyPath</li>
 * <li>DeriveReqt_targetContext</li>
 * <li>DeriveReqt_targetPropertyPath</li>
 * <li>Refine</li>
 * <li>Refine_sourceContext</li>
 * <li>Refine_sourcePropertyPath</li>
 * <li>Refine_targetContext</li>
 * <li>Refine_targetPropertyPath</li>
 * <li>Requirement</li>
 * <li>Requirement_Derived</li>
 * <li>Requirement_DerivedFrom</li>
 * <li>Requirement_Id</li>
 * <li>Requirement_Master</li>
 * <li>Requirement_RefinedBy</li>
 * <li>Requirement_SatisfiedBy</li>
 * <li>Requirement_Text</li>
 * <li>Requirement_TracedTo</li>
 * <li>Requirement_VerifiedBy</li>
 * <li>Satisfy</li>
 * <li>Satisfy_sourceContext</li>
 * <li>Satisfy_sourcePropertyPath</li>
 * <li>Satisfy_targetContext</li>
 * <li>Satisfy_targetPropertyPath</li>
 * <li>TestCase</li>
 * <li>Trace</li>
 * <li>Trace_sourceContext</li>
 * <li>Trace_sourcePropertyPath</li>
 * <li>Trace_targetContext</li>
 * <li>Trace_targetPropertyPath</li>
 * <li>Verify</li>
 * <li>Verify_sourceContext</li>
 * <li>Verify_sourcePropertyPath</li>
 * <li>Verify_targetContext</li>
 * <li>Verify_targetPropertyPath</li>
 * <li>Allocated</li>
 * <li>Allocated_allocatedFrom</li>
 * <li>Allocated_allocatedTo</li>
 * <li>FlowPort</li>
 * <li>FlowPort_direction</li>
 * <li>FlowPort_isAtomic</li>
 * <li>FlowSpecification</li>
 * <li>RequirementRelated</li>
 * <li>RequirementRelated_Refines</li>
 * <li>RequirementRelated_Satisfies</li>
 * <li>RequirementRelated_TracedFrom</li>
 * <li>RequirementRelated_Verifies</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SysMLLibrary extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SysMLLibrary instance() {
    if (INSTANCE == null) {
        INSTANCE = new SysMLLibrary();
    }
    return INSTANCE;
  }
  
  private static SysMLLibrary INSTANCE;
  
  private SysMLLibrary() {
    querySpecifications.add(Allocate.instance());
    querySpecifications.add(Allocate_sourceContext.instance());
    querySpecifications.add(Allocate_sourcePropertyPath.instance());
    querySpecifications.add(Allocate_targetContext.instance());
    querySpecifications.add(Allocate_targetPropertyPath.instance());
    querySpecifications.add(AllocateActivityPartition.instance());
    querySpecifications.add(Continuous.instance());
    querySpecifications.add(Continuous_rate.instance());
    querySpecifications.add(ControlOperator.instance());
    querySpecifications.add(Discrete.instance());
    querySpecifications.add(Discrete_rate.instance());
    querySpecifications.add(NoBuffer.instance());
    querySpecifications.add(Optional.instance());
    querySpecifications.add(Overwrite.instance());
    querySpecifications.add(Probability.instance());
    querySpecifications.add(Probability_probability.instance());
    querySpecifications.add(Rate.instance());
    querySpecifications.add(Rate_rate.instance());
    querySpecifications.add(ConstraintBlock.instance());
    querySpecifications.add(ConstraintBlock_isEncapsulated.instance());
    querySpecifications.add(AdjunctProperty.instance());
    querySpecifications.add(AdjunctProperty_principal.instance());
    querySpecifications.add(BindingConnector.instance());
    querySpecifications.add(Block.instance());
    querySpecifications.add(Block_isEncapsulated.instance());
    querySpecifications.add(BoundReference.instance());
    querySpecifications.add(BoundReference_bindingPath.instance());
    querySpecifications.add(BoundReference_boundEnd.instance());
    querySpecifications.add(BoundReference_lower.instance());
    querySpecifications.add(BoundReference_upper.instance());
    querySpecifications.add(ClassifierBehaviorProperty.instance());
    querySpecifications.add(ConnectorProperty.instance());
    querySpecifications.add(ConnectorProperty_connector.instance());
    querySpecifications.add(DirectedRelationshipPropertyPath.instance());
    querySpecifications.add(DirectedRelationshipPropertyPath_sourceContext.instance());
    querySpecifications.add(DirectedRelationshipPropertyPath_sourcePropertyPath.instance());
    querySpecifications.add(DirectedRelationshipPropertyPath_targetContext.instance());
    querySpecifications.add(DirectedRelationshipPropertyPath_targetPropertyPath.instance());
    querySpecifications.add(DistributedProperty.instance());
    querySpecifications.add(ElementPropertyPath.instance());
    querySpecifications.add(EndPathMultiplicity.instance());
    querySpecifications.add(EndPathMultiplicity_lower.instance());
    querySpecifications.add(EndPathMultiplicity_upper.instance());
    querySpecifications.add(NestedConnectorEnd.instance());
    querySpecifications.add(ParticipantProperty.instance());
    querySpecifications.add(ParticipantProperty_end.instance());
    querySpecifications.add(PropertySpecificType.instance());
    querySpecifications.add(ValueType.instance());
    querySpecifications.add(ValueType_quantityKind.instance());
    querySpecifications.add(ValueType_unit.instance());
    querySpecifications.add(Conform.instance());
    querySpecifications.add(ElementGroup.instance());
    querySpecifications.add(ElementGroup_criterion.instance());
    querySpecifications.add(ElementGroup_member.instance());
    querySpecifications.add(ElementGroup_name.instance());
    querySpecifications.add(ElementGroup_orderedMember.instance());
    querySpecifications.add(ElementGroup_size.instance());
    querySpecifications.add(Expose.instance());
    querySpecifications.add(Problem.instance());
    querySpecifications.add(Rationale.instance());
    querySpecifications.add(Stakeholder.instance());
    querySpecifications.add(Stakeholder_concern.instance());
    querySpecifications.add(Stakeholder_concernList.instance());
    querySpecifications.add(View.instance());
    querySpecifications.add(View_stakeholder.instance());
    querySpecifications.add(View_viewPoint.instance());
    querySpecifications.add(Viewpoint.instance());
    querySpecifications.add(Viewpoint_concern.instance());
    querySpecifications.add(Viewpoint_concernList.instance());
    querySpecifications.add(Viewpoint_language.instance());
    querySpecifications.add(Viewpoint_method.instance());
    querySpecifications.add(Viewpoint_presentation.instance());
    querySpecifications.add(Viewpoint_purpose.instance());
    querySpecifications.add(Viewpoint_stakeholder.instance());
    querySpecifications.add(Essential.instance());
    querySpecifications.add(Systemprocess.instance());
    querySpecifications.add(Effbd.instance());
    querySpecifications.add(NonStreaming.instance());
    querySpecifications.add(Streaming.instance());
    querySpecifications.add(Actuator.instance());
    querySpecifications.add(Boundarysystem.instance());
    querySpecifications.add(Environmentaleffect.instance());
    querySpecifications.add(Externalsystem.instance());
    querySpecifications.add(Sensor.instance());
    querySpecifications.add(Usersystem.instance());
    querySpecifications.add(Domain.instance());
    querySpecifications.add(Domain_isEncapsulated.instance());
    querySpecifications.add(External.instance());
    querySpecifications.add(External_isEncapsulated.instance());
    querySpecifications.add(Subsystem.instance());
    querySpecifications.add(Subsystem_isEncapsulated.instance());
    querySpecifications.add(sysml.System.instance());
    querySpecifications.add(System_isEncapsulated.instance());
    querySpecifications.add(Systemcontext.instance());
    querySpecifications.add(Systemcontext_isEncapsulated.instance());
    querySpecifications.add(BlockHierarchy.instance());
    querySpecifications.add(ContextDiagram.instance());
    querySpecifications.add(DiagramDescription.instance());
    querySpecifications.add(DiagramDescription_Completionstatus.instance());
    querySpecifications.add(DiagramDescription_Description.instance());
    querySpecifications.add(DiagramDescription_Reference.instance());
    querySpecifications.add(DiagramDescription_Version.instance());
    querySpecifications.add(SwimLaneDiagram.instance());
    querySpecifications.add(DiagramUsage.instance());
    querySpecifications.add(BasicInterval.instance());
    querySpecifications.add(BasicInterval_max.instance());
    querySpecifications.add(BasicInterval_min.instance());
    querySpecifications.add(Interval.instance());
    querySpecifications.add(Interval_max.instance());
    querySpecifications.add(Interval_min.instance());
    querySpecifications.add(Normal.instance());
    querySpecifications.add(Normal_mean.instance());
    querySpecifications.add(Normal_standardDeviation.instance());
    querySpecifications.add(Uniform.instance());
    querySpecifications.add(Uniform_max.instance());
    querySpecifications.add(Uniform_min.instance());
    querySpecifications.add(Moe.instance());
    querySpecifications.add(ObjectiveFunction.instance());
    querySpecifications.add(BusinessRequirement.instance());
    querySpecifications.add(BusinessRequirement_Derived.instance());
    querySpecifications.add(BusinessRequirement_DerivedFrom.instance());
    querySpecifications.add(BusinessRequirement_Id.instance());
    querySpecifications.add(BusinessRequirement_Master.instance());
    querySpecifications.add(BusinessRequirement_RefinedBy.instance());
    querySpecifications.add(BusinessRequirement_SatisfiedBy.instance());
    querySpecifications.add(BusinessRequirement_Text.instance());
    querySpecifications.add(BusinessRequirement_TracedTo.instance());
    querySpecifications.add(BusinessRequirement_VerifiedBy.instance());
    querySpecifications.add(BusinessRequirement_risk.instance());
    querySpecifications.add(BusinessRequirement_source.instance());
    querySpecifications.add(BusinessRequirement_verifyMethod.instance());
    querySpecifications.add(DesignConstraint.instance());
    querySpecifications.add(DesignConstraint_Derived.instance());
    querySpecifications.add(DesignConstraint_DerivedFrom.instance());
    querySpecifications.add(DesignConstraint_Id.instance());
    querySpecifications.add(DesignConstraint_Master.instance());
    querySpecifications.add(DesignConstraint_RefinedBy.instance());
    querySpecifications.add(DesignConstraint_SatisfiedBy.instance());
    querySpecifications.add(DesignConstraint_Text.instance());
    querySpecifications.add(DesignConstraint_TracedTo.instance());
    querySpecifications.add(DesignConstraint_VerifiedBy.instance());
    querySpecifications.add(DesignConstraint_risk.instance());
    querySpecifications.add(DesignConstraint_source.instance());
    querySpecifications.add(DesignConstraint_verifyMethod.instance());
    querySpecifications.add(ExtendedRequirement.instance());
    querySpecifications.add(ExtendedRequirement_Derived.instance());
    querySpecifications.add(ExtendedRequirement_DerivedFrom.instance());
    querySpecifications.add(ExtendedRequirement_Id.instance());
    querySpecifications.add(ExtendedRequirement_Master.instance());
    querySpecifications.add(ExtendedRequirement_RefinedBy.instance());
    querySpecifications.add(ExtendedRequirement_SatisfiedBy.instance());
    querySpecifications.add(ExtendedRequirement_Text.instance());
    querySpecifications.add(ExtendedRequirement_TracedTo.instance());
    querySpecifications.add(ExtendedRequirement_VerifiedBy.instance());
    querySpecifications.add(ExtendedRequirement_risk.instance());
    querySpecifications.add(ExtendedRequirement_source.instance());
    querySpecifications.add(ExtendedRequirement_verifyMethod.instance());
    querySpecifications.add(FunctionalRequirement.instance());
    querySpecifications.add(FunctionalRequirement_Derived.instance());
    querySpecifications.add(FunctionalRequirement_DerivedFrom.instance());
    querySpecifications.add(FunctionalRequirement_Id.instance());
    querySpecifications.add(FunctionalRequirement_Master.instance());
    querySpecifications.add(FunctionalRequirement_RefinedBy.instance());
    querySpecifications.add(FunctionalRequirement_SatisfiedBy.instance());
    querySpecifications.add(FunctionalRequirement_Text.instance());
    querySpecifications.add(FunctionalRequirement_TracedTo.instance());
    querySpecifications.add(FunctionalRequirement_VerifiedBy.instance());
    querySpecifications.add(FunctionalRequirement_risk.instance());
    querySpecifications.add(FunctionalRequirement_source.instance());
    querySpecifications.add(FunctionalRequirement_verifyMethod.instance());
    querySpecifications.add(InterfaceRequirement.instance());
    querySpecifications.add(InterfaceRequirement_Derived.instance());
    querySpecifications.add(InterfaceRequirement_DerivedFrom.instance());
    querySpecifications.add(InterfaceRequirement_Id.instance());
    querySpecifications.add(InterfaceRequirement_Master.instance());
    querySpecifications.add(InterfaceRequirement_RefinedBy.instance());
    querySpecifications.add(InterfaceRequirement_SatisfiedBy.instance());
    querySpecifications.add(InterfaceRequirement_Text.instance());
    querySpecifications.add(InterfaceRequirement_TracedTo.instance());
    querySpecifications.add(InterfaceRequirement_VerifiedBy.instance());
    querySpecifications.add(InterfaceRequirement_risk.instance());
    querySpecifications.add(InterfaceRequirement_source.instance());
    querySpecifications.add(InterfaceRequirement_verifyMethod.instance());
    querySpecifications.add(PerformanceRequirement.instance());
    querySpecifications.add(PerformanceRequirement_Derived.instance());
    querySpecifications.add(PerformanceRequirement_DerivedFrom.instance());
    querySpecifications.add(PerformanceRequirement_Id.instance());
    querySpecifications.add(PerformanceRequirement_Master.instance());
    querySpecifications.add(PerformanceRequirement_RefinedBy.instance());
    querySpecifications.add(PerformanceRequirement_SatisfiedBy.instance());
    querySpecifications.add(PerformanceRequirement_Text.instance());
    querySpecifications.add(PerformanceRequirement_TracedTo.instance());
    querySpecifications.add(PerformanceRequirement_VerifiedBy.instance());
    querySpecifications.add(PerformanceRequirement_risk.instance());
    querySpecifications.add(PerformanceRequirement_source.instance());
    querySpecifications.add(PerformanceRequirement_verifyMethod.instance());
    querySpecifications.add(PhysicalRequirement.instance());
    querySpecifications.add(PhysicalRequirement_Derived.instance());
    querySpecifications.add(PhysicalRequirement_DerivedFrom.instance());
    querySpecifications.add(PhysicalRequirement_Id.instance());
    querySpecifications.add(PhysicalRequirement_Master.instance());
    querySpecifications.add(PhysicalRequirement_RefinedBy.instance());
    querySpecifications.add(PhysicalRequirement_SatisfiedBy.instance());
    querySpecifications.add(PhysicalRequirement_Text.instance());
    querySpecifications.add(PhysicalRequirement_TracedTo.instance());
    querySpecifications.add(PhysicalRequirement_VerifiedBy.instance());
    querySpecifications.add(PhysicalRequirement_risk.instance());
    querySpecifications.add(PhysicalRequirement_source.instance());
    querySpecifications.add(PhysicalRequirement_verifyMethod.instance());
    querySpecifications.add(UsabilityRequirement.instance());
    querySpecifications.add(UsabilityRequirement_Derived.instance());
    querySpecifications.add(UsabilityRequirement_DerivedFrom.instance());
    querySpecifications.add(UsabilityRequirement_Id.instance());
    querySpecifications.add(UsabilityRequirement_Master.instance());
    querySpecifications.add(UsabilityRequirement_RefinedBy.instance());
    querySpecifications.add(UsabilityRequirement_SatisfiedBy.instance());
    querySpecifications.add(UsabilityRequirement_Text.instance());
    querySpecifications.add(UsabilityRequirement_TracedTo.instance());
    querySpecifications.add(UsabilityRequirement_VerifiedBy.instance());
    querySpecifications.add(UsabilityRequirement_risk.instance());
    querySpecifications.add(UsabilityRequirement_source.instance());
    querySpecifications.add(UsabilityRequirement_verifyMethod.instance());
    querySpecifications.add(AcceptChangeStructuralFeatureEventAction.instance());
    querySpecifications.add(ChangeStructuralFeatureEvent.instance());
    querySpecifications.add(ChangeStructuralFeatureEvent_structuralFeature.instance());
    querySpecifications.add(DirectedFeature.instance());
    querySpecifications.add(DirectedFeature_featureDirection.instance());
    querySpecifications.add(FlowProperty.instance());
    querySpecifications.add(FlowProperty_direction.instance());
    querySpecifications.add(FullPort.instance());
    querySpecifications.add(InterfaceBlock.instance());
    querySpecifications.add(InterfaceBlock_isEncapsulated.instance());
    querySpecifications.add(InvocationOnNestedPortAction.instance());
    querySpecifications.add(InvocationOnNestedPortAction_onNestedPort.instance());
    querySpecifications.add(ItemFlow.instance());
    querySpecifications.add(ItemFlow_itemProperty.instance());
    querySpecifications.add(ProxyPort.instance());
    querySpecifications.add(TriggerOnNestedPort.instance());
    querySpecifications.add(TriggerOnNestedPort_onNestedPort.instance());
    querySpecifications.add(AbstractRequirement.instance());
    querySpecifications.add(AbstractRequirement_Derived.instance());
    querySpecifications.add(AbstractRequirement_DerivedFrom.instance());
    querySpecifications.add(AbstractRequirement_Id.instance());
    querySpecifications.add(AbstractRequirement_Master.instance());
    querySpecifications.add(AbstractRequirement_RefinedBy.instance());
    querySpecifications.add(AbstractRequirement_SatisfiedBy.instance());
    querySpecifications.add(AbstractRequirement_Text.instance());
    querySpecifications.add(AbstractRequirement_TracedTo.instance());
    querySpecifications.add(AbstractRequirement_VerifiedBy.instance());
    querySpecifications.add(Copy.instance());
    querySpecifications.add(Copy_sourceContext.instance());
    querySpecifications.add(Copy_sourcePropertyPath.instance());
    querySpecifications.add(Copy_targetContext.instance());
    querySpecifications.add(Copy_targetPropertyPath.instance());
    querySpecifications.add(DeriveReqt.instance());
    querySpecifications.add(DeriveReqt_sourceContext.instance());
    querySpecifications.add(DeriveReqt_sourcePropertyPath.instance());
    querySpecifications.add(DeriveReqt_targetContext.instance());
    querySpecifications.add(DeriveReqt_targetPropertyPath.instance());
    querySpecifications.add(Refine.instance());
    querySpecifications.add(Refine_sourceContext.instance());
    querySpecifications.add(Refine_sourcePropertyPath.instance());
    querySpecifications.add(Refine_targetContext.instance());
    querySpecifications.add(Refine_targetPropertyPath.instance());
    querySpecifications.add(Requirement.instance());
    querySpecifications.add(Requirement_Derived.instance());
    querySpecifications.add(Requirement_DerivedFrom.instance());
    querySpecifications.add(Requirement_Id.instance());
    querySpecifications.add(Requirement_Master.instance());
    querySpecifications.add(Requirement_RefinedBy.instance());
    querySpecifications.add(Requirement_SatisfiedBy.instance());
    querySpecifications.add(Requirement_Text.instance());
    querySpecifications.add(Requirement_TracedTo.instance());
    querySpecifications.add(Requirement_VerifiedBy.instance());
    querySpecifications.add(Satisfy.instance());
    querySpecifications.add(Satisfy_sourceContext.instance());
    querySpecifications.add(Satisfy_sourcePropertyPath.instance());
    querySpecifications.add(Satisfy_targetContext.instance());
    querySpecifications.add(Satisfy_targetPropertyPath.instance());
    querySpecifications.add(TestCase.instance());
    querySpecifications.add(Trace.instance());
    querySpecifications.add(Trace_sourceContext.instance());
    querySpecifications.add(Trace_sourcePropertyPath.instance());
    querySpecifications.add(Trace_targetContext.instance());
    querySpecifications.add(Trace_targetPropertyPath.instance());
    querySpecifications.add(Verify.instance());
    querySpecifications.add(Verify_sourceContext.instance());
    querySpecifications.add(Verify_sourcePropertyPath.instance());
    querySpecifications.add(Verify_targetContext.instance());
    querySpecifications.add(Verify_targetPropertyPath.instance());
    querySpecifications.add(Allocated.instance());
    querySpecifications.add(Allocated_allocatedFrom.instance());
    querySpecifications.add(Allocated_allocatedTo.instance());
    querySpecifications.add(FlowPort.instance());
    querySpecifications.add(FlowPort_direction.instance());
    querySpecifications.add(FlowPort_isAtomic.instance());
    querySpecifications.add(FlowSpecification.instance());
    querySpecifications.add(RequirementRelated.instance());
    querySpecifications.add(RequirementRelated_Refines.instance());
    querySpecifications.add(RequirementRelated_Satisfies.instance());
    querySpecifications.add(RequirementRelated_TracedFrom.instance());
    querySpecifications.add(RequirementRelated_Verifies.instance());
  }
  
  public Allocate getAllocate() {
    return Allocate.instance();
  }
  
  public Allocate.Matcher getAllocate(final ViatraQueryEngine engine) {
    return Allocate.Matcher.on(engine);
  }
  
  public Allocate_sourceContext getAllocate_sourceContext() {
    return Allocate_sourceContext.instance();
  }
  
  public Allocate_sourceContext.Matcher getAllocate_sourceContext(final ViatraQueryEngine engine) {
    return Allocate_sourceContext.Matcher.on(engine);
  }
  
  public Allocate_sourcePropertyPath getAllocate_sourcePropertyPath() {
    return Allocate_sourcePropertyPath.instance();
  }
  
  public Allocate_sourcePropertyPath.Matcher getAllocate_sourcePropertyPath(final ViatraQueryEngine engine) {
    return Allocate_sourcePropertyPath.Matcher.on(engine);
  }
  
  public Allocate_targetContext getAllocate_targetContext() {
    return Allocate_targetContext.instance();
  }
  
  public Allocate_targetContext.Matcher getAllocate_targetContext(final ViatraQueryEngine engine) {
    return Allocate_targetContext.Matcher.on(engine);
  }
  
  public Allocate_targetPropertyPath getAllocate_targetPropertyPath() {
    return Allocate_targetPropertyPath.instance();
  }
  
  public Allocate_targetPropertyPath.Matcher getAllocate_targetPropertyPath(final ViatraQueryEngine engine) {
    return Allocate_targetPropertyPath.Matcher.on(engine);
  }
  
  public AllocateActivityPartition getAllocateActivityPartition() {
    return AllocateActivityPartition.instance();
  }
  
  public AllocateActivityPartition.Matcher getAllocateActivityPartition(final ViatraQueryEngine engine) {
    return AllocateActivityPartition.Matcher.on(engine);
  }
  
  public Continuous getContinuous() {
    return Continuous.instance();
  }
  
  public Continuous.Matcher getContinuous(final ViatraQueryEngine engine) {
    return Continuous.Matcher.on(engine);
  }
  
  public Continuous_rate getContinuous_rate() {
    return Continuous_rate.instance();
  }
  
  public Continuous_rate.Matcher getContinuous_rate(final ViatraQueryEngine engine) {
    return Continuous_rate.Matcher.on(engine);
  }
  
  public ControlOperator getControlOperator() {
    return ControlOperator.instance();
  }
  
  public ControlOperator.Matcher getControlOperator(final ViatraQueryEngine engine) {
    return ControlOperator.Matcher.on(engine);
  }
  
  public Discrete getDiscrete() {
    return Discrete.instance();
  }
  
  public Discrete.Matcher getDiscrete(final ViatraQueryEngine engine) {
    return Discrete.Matcher.on(engine);
  }
  
  public Discrete_rate getDiscrete_rate() {
    return Discrete_rate.instance();
  }
  
  public Discrete_rate.Matcher getDiscrete_rate(final ViatraQueryEngine engine) {
    return Discrete_rate.Matcher.on(engine);
  }
  
  public NoBuffer getNoBuffer() {
    return NoBuffer.instance();
  }
  
  public NoBuffer.Matcher getNoBuffer(final ViatraQueryEngine engine) {
    return NoBuffer.Matcher.on(engine);
  }
  
  public Optional getOptional() {
    return Optional.instance();
  }
  
  public Optional.Matcher getOptional(final ViatraQueryEngine engine) {
    return Optional.Matcher.on(engine);
  }
  
  public Overwrite getOverwrite() {
    return Overwrite.instance();
  }
  
  public Overwrite.Matcher getOverwrite(final ViatraQueryEngine engine) {
    return Overwrite.Matcher.on(engine);
  }
  
  public Probability getProbability() {
    return Probability.instance();
  }
  
  public Probability.Matcher getProbability(final ViatraQueryEngine engine) {
    return Probability.Matcher.on(engine);
  }
  
  public Probability_probability getProbability_probability() {
    return Probability_probability.instance();
  }
  
  public Probability_probability.Matcher getProbability_probability(final ViatraQueryEngine engine) {
    return Probability_probability.Matcher.on(engine);
  }
  
  public Rate getRate() {
    return Rate.instance();
  }
  
  public Rate.Matcher getRate(final ViatraQueryEngine engine) {
    return Rate.Matcher.on(engine);
  }
  
  public Rate_rate getRate_rate() {
    return Rate_rate.instance();
  }
  
  public Rate_rate.Matcher getRate_rate(final ViatraQueryEngine engine) {
    return Rate_rate.Matcher.on(engine);
  }
  
  public ConstraintBlock getConstraintBlock() {
    return ConstraintBlock.instance();
  }
  
  public ConstraintBlock.Matcher getConstraintBlock(final ViatraQueryEngine engine) {
    return ConstraintBlock.Matcher.on(engine);
  }
  
  public ConstraintBlock_isEncapsulated getConstraintBlock_isEncapsulated() {
    return ConstraintBlock_isEncapsulated.instance();
  }
  
  public ConstraintBlock_isEncapsulated.Matcher getConstraintBlock_isEncapsulated(final ViatraQueryEngine engine) {
    return ConstraintBlock_isEncapsulated.Matcher.on(engine);
  }
  
  public AdjunctProperty getAdjunctProperty() {
    return AdjunctProperty.instance();
  }
  
  public AdjunctProperty.Matcher getAdjunctProperty(final ViatraQueryEngine engine) {
    return AdjunctProperty.Matcher.on(engine);
  }
  
  public AdjunctProperty_principal getAdjunctProperty_principal() {
    return AdjunctProperty_principal.instance();
  }
  
  public AdjunctProperty_principal.Matcher getAdjunctProperty_principal(final ViatraQueryEngine engine) {
    return AdjunctProperty_principal.Matcher.on(engine);
  }
  
  public BindingConnector getBindingConnector() {
    return BindingConnector.instance();
  }
  
  public BindingConnector.Matcher getBindingConnector(final ViatraQueryEngine engine) {
    return BindingConnector.Matcher.on(engine);
  }
  
  public Block getBlock() {
    return Block.instance();
  }
  
  public Block.Matcher getBlock(final ViatraQueryEngine engine) {
    return Block.Matcher.on(engine);
  }
  
  public Block_isEncapsulated getBlock_isEncapsulated() {
    return Block_isEncapsulated.instance();
  }
  
  public Block_isEncapsulated.Matcher getBlock_isEncapsulated(final ViatraQueryEngine engine) {
    return Block_isEncapsulated.Matcher.on(engine);
  }
  
  public BoundReference getBoundReference() {
    return BoundReference.instance();
  }
  
  public BoundReference.Matcher getBoundReference(final ViatraQueryEngine engine) {
    return BoundReference.Matcher.on(engine);
  }
  
  public BoundReference_bindingPath getBoundReference_bindingPath() {
    return BoundReference_bindingPath.instance();
  }
  
  public BoundReference_bindingPath.Matcher getBoundReference_bindingPath(final ViatraQueryEngine engine) {
    return BoundReference_bindingPath.Matcher.on(engine);
  }
  
  public BoundReference_boundEnd getBoundReference_boundEnd() {
    return BoundReference_boundEnd.instance();
  }
  
  public BoundReference_boundEnd.Matcher getBoundReference_boundEnd(final ViatraQueryEngine engine) {
    return BoundReference_boundEnd.Matcher.on(engine);
  }
  
  public BoundReference_lower getBoundReference_lower() {
    return BoundReference_lower.instance();
  }
  
  public BoundReference_lower.Matcher getBoundReference_lower(final ViatraQueryEngine engine) {
    return BoundReference_lower.Matcher.on(engine);
  }
  
  public BoundReference_upper getBoundReference_upper() {
    return BoundReference_upper.instance();
  }
  
  public BoundReference_upper.Matcher getBoundReference_upper(final ViatraQueryEngine engine) {
    return BoundReference_upper.Matcher.on(engine);
  }
  
  public ClassifierBehaviorProperty getClassifierBehaviorProperty() {
    return ClassifierBehaviorProperty.instance();
  }
  
  public ClassifierBehaviorProperty.Matcher getClassifierBehaviorProperty(final ViatraQueryEngine engine) {
    return ClassifierBehaviorProperty.Matcher.on(engine);
  }
  
  public ConnectorProperty getConnectorProperty() {
    return ConnectorProperty.instance();
  }
  
  public ConnectorProperty.Matcher getConnectorProperty(final ViatraQueryEngine engine) {
    return ConnectorProperty.Matcher.on(engine);
  }
  
  public ConnectorProperty_connector getConnectorProperty_connector() {
    return ConnectorProperty_connector.instance();
  }
  
  public ConnectorProperty_connector.Matcher getConnectorProperty_connector(final ViatraQueryEngine engine) {
    return ConnectorProperty_connector.Matcher.on(engine);
  }
  
  public DirectedRelationshipPropertyPath getDirectedRelationshipPropertyPath() {
    return DirectedRelationshipPropertyPath.instance();
  }
  
  public DirectedRelationshipPropertyPath.Matcher getDirectedRelationshipPropertyPath(final ViatraQueryEngine engine) {
    return DirectedRelationshipPropertyPath.Matcher.on(engine);
  }
  
  public DirectedRelationshipPropertyPath_sourceContext getDirectedRelationshipPropertyPath_sourceContext() {
    return DirectedRelationshipPropertyPath_sourceContext.instance();
  }
  
  public DirectedRelationshipPropertyPath_sourceContext.Matcher getDirectedRelationshipPropertyPath_sourceContext(final ViatraQueryEngine engine) {
    return DirectedRelationshipPropertyPath_sourceContext.Matcher.on(engine);
  }
  
  public DirectedRelationshipPropertyPath_sourcePropertyPath getDirectedRelationshipPropertyPath_sourcePropertyPath() {
    return DirectedRelationshipPropertyPath_sourcePropertyPath.instance();
  }
  
  public DirectedRelationshipPropertyPath_sourcePropertyPath.Matcher getDirectedRelationshipPropertyPath_sourcePropertyPath(final ViatraQueryEngine engine) {
    return DirectedRelationshipPropertyPath_sourcePropertyPath.Matcher.on(engine);
  }
  
  public DirectedRelationshipPropertyPath_targetContext getDirectedRelationshipPropertyPath_targetContext() {
    return DirectedRelationshipPropertyPath_targetContext.instance();
  }
  
  public DirectedRelationshipPropertyPath_targetContext.Matcher getDirectedRelationshipPropertyPath_targetContext(final ViatraQueryEngine engine) {
    return DirectedRelationshipPropertyPath_targetContext.Matcher.on(engine);
  }
  
  public DirectedRelationshipPropertyPath_targetPropertyPath getDirectedRelationshipPropertyPath_targetPropertyPath() {
    return DirectedRelationshipPropertyPath_targetPropertyPath.instance();
  }
  
  public DirectedRelationshipPropertyPath_targetPropertyPath.Matcher getDirectedRelationshipPropertyPath_targetPropertyPath(final ViatraQueryEngine engine) {
    return DirectedRelationshipPropertyPath_targetPropertyPath.Matcher.on(engine);
  }
  
  public DistributedProperty getDistributedProperty() {
    return DistributedProperty.instance();
  }
  
  public DistributedProperty.Matcher getDistributedProperty(final ViatraQueryEngine engine) {
    return DistributedProperty.Matcher.on(engine);
  }
  
  public ElementPropertyPath getElementPropertyPath() {
    return ElementPropertyPath.instance();
  }
  
  public ElementPropertyPath.Matcher getElementPropertyPath(final ViatraQueryEngine engine) {
    return ElementPropertyPath.Matcher.on(engine);
  }
  
  public EndPathMultiplicity getEndPathMultiplicity() {
    return EndPathMultiplicity.instance();
  }
  
  public EndPathMultiplicity.Matcher getEndPathMultiplicity(final ViatraQueryEngine engine) {
    return EndPathMultiplicity.Matcher.on(engine);
  }
  
  public EndPathMultiplicity_lower getEndPathMultiplicity_lower() {
    return EndPathMultiplicity_lower.instance();
  }
  
  public EndPathMultiplicity_lower.Matcher getEndPathMultiplicity_lower(final ViatraQueryEngine engine) {
    return EndPathMultiplicity_lower.Matcher.on(engine);
  }
  
  public EndPathMultiplicity_upper getEndPathMultiplicity_upper() {
    return EndPathMultiplicity_upper.instance();
  }
  
  public EndPathMultiplicity_upper.Matcher getEndPathMultiplicity_upper(final ViatraQueryEngine engine) {
    return EndPathMultiplicity_upper.Matcher.on(engine);
  }
  
  public NestedConnectorEnd getNestedConnectorEnd() {
    return NestedConnectorEnd.instance();
  }
  
  public NestedConnectorEnd.Matcher getNestedConnectorEnd(final ViatraQueryEngine engine) {
    return NestedConnectorEnd.Matcher.on(engine);
  }
  
  public ParticipantProperty getParticipantProperty() {
    return ParticipantProperty.instance();
  }
  
  public ParticipantProperty.Matcher getParticipantProperty(final ViatraQueryEngine engine) {
    return ParticipantProperty.Matcher.on(engine);
  }
  
  public ParticipantProperty_end getParticipantProperty_end() {
    return ParticipantProperty_end.instance();
  }
  
  public ParticipantProperty_end.Matcher getParticipantProperty_end(final ViatraQueryEngine engine) {
    return ParticipantProperty_end.Matcher.on(engine);
  }
  
  public PropertySpecificType getPropertySpecificType() {
    return PropertySpecificType.instance();
  }
  
  public PropertySpecificType.Matcher getPropertySpecificType(final ViatraQueryEngine engine) {
    return PropertySpecificType.Matcher.on(engine);
  }
  
  public ValueType getValueType() {
    return ValueType.instance();
  }
  
  public ValueType.Matcher getValueType(final ViatraQueryEngine engine) {
    return ValueType.Matcher.on(engine);
  }
  
  public ValueType_quantityKind getValueType_quantityKind() {
    return ValueType_quantityKind.instance();
  }
  
  public ValueType_quantityKind.Matcher getValueType_quantityKind(final ViatraQueryEngine engine) {
    return ValueType_quantityKind.Matcher.on(engine);
  }
  
  public ValueType_unit getValueType_unit() {
    return ValueType_unit.instance();
  }
  
  public ValueType_unit.Matcher getValueType_unit(final ViatraQueryEngine engine) {
    return ValueType_unit.Matcher.on(engine);
  }
  
  public Conform getConform() {
    return Conform.instance();
  }
  
  public Conform.Matcher getConform(final ViatraQueryEngine engine) {
    return Conform.Matcher.on(engine);
  }
  
  public ElementGroup getElementGroup() {
    return ElementGroup.instance();
  }
  
  public ElementGroup.Matcher getElementGroup(final ViatraQueryEngine engine) {
    return ElementGroup.Matcher.on(engine);
  }
  
  public ElementGroup_criterion getElementGroup_criterion() {
    return ElementGroup_criterion.instance();
  }
  
  public ElementGroup_criterion.Matcher getElementGroup_criterion(final ViatraQueryEngine engine) {
    return ElementGroup_criterion.Matcher.on(engine);
  }
  
  public ElementGroup_member getElementGroup_member() {
    return ElementGroup_member.instance();
  }
  
  public ElementGroup_member.Matcher getElementGroup_member(final ViatraQueryEngine engine) {
    return ElementGroup_member.Matcher.on(engine);
  }
  
  public ElementGroup_name getElementGroup_name() {
    return ElementGroup_name.instance();
  }
  
  public ElementGroup_name.Matcher getElementGroup_name(final ViatraQueryEngine engine) {
    return ElementGroup_name.Matcher.on(engine);
  }
  
  public ElementGroup_orderedMember getElementGroup_orderedMember() {
    return ElementGroup_orderedMember.instance();
  }
  
  public ElementGroup_orderedMember.Matcher getElementGroup_orderedMember(final ViatraQueryEngine engine) {
    return ElementGroup_orderedMember.Matcher.on(engine);
  }
  
  public ElementGroup_size getElementGroup_size() {
    return ElementGroup_size.instance();
  }
  
  public ElementGroup_size.Matcher getElementGroup_size(final ViatraQueryEngine engine) {
    return ElementGroup_size.Matcher.on(engine);
  }
  
  public Expose getExpose() {
    return Expose.instance();
  }
  
  public Expose.Matcher getExpose(final ViatraQueryEngine engine) {
    return Expose.Matcher.on(engine);
  }
  
  public Problem getProblem() {
    return Problem.instance();
  }
  
  public Problem.Matcher getProblem(final ViatraQueryEngine engine) {
    return Problem.Matcher.on(engine);
  }
  
  public Rationale getRationale() {
    return Rationale.instance();
  }
  
  public Rationale.Matcher getRationale(final ViatraQueryEngine engine) {
    return Rationale.Matcher.on(engine);
  }
  
  public Stakeholder getStakeholder() {
    return Stakeholder.instance();
  }
  
  public Stakeholder.Matcher getStakeholder(final ViatraQueryEngine engine) {
    return Stakeholder.Matcher.on(engine);
  }
  
  public Stakeholder_concern getStakeholder_concern() {
    return Stakeholder_concern.instance();
  }
  
  public Stakeholder_concern.Matcher getStakeholder_concern(final ViatraQueryEngine engine) {
    return Stakeholder_concern.Matcher.on(engine);
  }
  
  public Stakeholder_concernList getStakeholder_concernList() {
    return Stakeholder_concernList.instance();
  }
  
  public Stakeholder_concernList.Matcher getStakeholder_concernList(final ViatraQueryEngine engine) {
    return Stakeholder_concernList.Matcher.on(engine);
  }
  
  public View getView() {
    return View.instance();
  }
  
  public View.Matcher getView(final ViatraQueryEngine engine) {
    return View.Matcher.on(engine);
  }
  
  public View_stakeholder getView_stakeholder() {
    return View_stakeholder.instance();
  }
  
  public View_stakeholder.Matcher getView_stakeholder(final ViatraQueryEngine engine) {
    return View_stakeholder.Matcher.on(engine);
  }
  
  public View_viewPoint getView_viewPoint() {
    return View_viewPoint.instance();
  }
  
  public View_viewPoint.Matcher getView_viewPoint(final ViatraQueryEngine engine) {
    return View_viewPoint.Matcher.on(engine);
  }
  
  public Viewpoint getViewpoint() {
    return Viewpoint.instance();
  }
  
  public Viewpoint.Matcher getViewpoint(final ViatraQueryEngine engine) {
    return Viewpoint.Matcher.on(engine);
  }
  
  public Viewpoint_concern getViewpoint_concern() {
    return Viewpoint_concern.instance();
  }
  
  public Viewpoint_concern.Matcher getViewpoint_concern(final ViatraQueryEngine engine) {
    return Viewpoint_concern.Matcher.on(engine);
  }
  
  public Viewpoint_concernList getViewpoint_concernList() {
    return Viewpoint_concernList.instance();
  }
  
  public Viewpoint_concernList.Matcher getViewpoint_concernList(final ViatraQueryEngine engine) {
    return Viewpoint_concernList.Matcher.on(engine);
  }
  
  public Viewpoint_language getViewpoint_language() {
    return Viewpoint_language.instance();
  }
  
  public Viewpoint_language.Matcher getViewpoint_language(final ViatraQueryEngine engine) {
    return Viewpoint_language.Matcher.on(engine);
  }
  
  public Viewpoint_method getViewpoint_method() {
    return Viewpoint_method.instance();
  }
  
  public Viewpoint_method.Matcher getViewpoint_method(final ViatraQueryEngine engine) {
    return Viewpoint_method.Matcher.on(engine);
  }
  
  public Viewpoint_presentation getViewpoint_presentation() {
    return Viewpoint_presentation.instance();
  }
  
  public Viewpoint_presentation.Matcher getViewpoint_presentation(final ViatraQueryEngine engine) {
    return Viewpoint_presentation.Matcher.on(engine);
  }
  
  public Viewpoint_purpose getViewpoint_purpose() {
    return Viewpoint_purpose.instance();
  }
  
  public Viewpoint_purpose.Matcher getViewpoint_purpose(final ViatraQueryEngine engine) {
    return Viewpoint_purpose.Matcher.on(engine);
  }
  
  public Viewpoint_stakeholder getViewpoint_stakeholder() {
    return Viewpoint_stakeholder.instance();
  }
  
  public Viewpoint_stakeholder.Matcher getViewpoint_stakeholder(final ViatraQueryEngine engine) {
    return Viewpoint_stakeholder.Matcher.on(engine);
  }
  
  public Essential getEssential() {
    return Essential.instance();
  }
  
  public Essential.Matcher getEssential(final ViatraQueryEngine engine) {
    return Essential.Matcher.on(engine);
  }
  
  public Systemprocess getSystemprocess() {
    return Systemprocess.instance();
  }
  
  public Systemprocess.Matcher getSystemprocess(final ViatraQueryEngine engine) {
    return Systemprocess.Matcher.on(engine);
  }
  
  public Effbd getEffbd() {
    return Effbd.instance();
  }
  
  public Effbd.Matcher getEffbd(final ViatraQueryEngine engine) {
    return Effbd.Matcher.on(engine);
  }
  
  public NonStreaming getNonStreaming() {
    return NonStreaming.instance();
  }
  
  public NonStreaming.Matcher getNonStreaming(final ViatraQueryEngine engine) {
    return NonStreaming.Matcher.on(engine);
  }
  
  public Streaming getStreaming() {
    return Streaming.instance();
  }
  
  public Streaming.Matcher getStreaming(final ViatraQueryEngine engine) {
    return Streaming.Matcher.on(engine);
  }
  
  public Actuator getActuator() {
    return Actuator.instance();
  }
  
  public Actuator.Matcher getActuator(final ViatraQueryEngine engine) {
    return Actuator.Matcher.on(engine);
  }
  
  public Boundarysystem getBoundarysystem() {
    return Boundarysystem.instance();
  }
  
  public Boundarysystem.Matcher getBoundarysystem(final ViatraQueryEngine engine) {
    return Boundarysystem.Matcher.on(engine);
  }
  
  public Environmentaleffect getEnvironmentaleffect() {
    return Environmentaleffect.instance();
  }
  
  public Environmentaleffect.Matcher getEnvironmentaleffect(final ViatraQueryEngine engine) {
    return Environmentaleffect.Matcher.on(engine);
  }
  
  public Externalsystem getExternalsystem() {
    return Externalsystem.instance();
  }
  
  public Externalsystem.Matcher getExternalsystem(final ViatraQueryEngine engine) {
    return Externalsystem.Matcher.on(engine);
  }
  
  public Sensor getSensor() {
    return Sensor.instance();
  }
  
  public Sensor.Matcher getSensor(final ViatraQueryEngine engine) {
    return Sensor.Matcher.on(engine);
  }
  
  public Usersystem getUsersystem() {
    return Usersystem.instance();
  }
  
  public Usersystem.Matcher getUsersystem(final ViatraQueryEngine engine) {
    return Usersystem.Matcher.on(engine);
  }
  
  public Domain getDomain() {
    return Domain.instance();
  }
  
  public Domain.Matcher getDomain(final ViatraQueryEngine engine) {
    return Domain.Matcher.on(engine);
  }
  
  public Domain_isEncapsulated getDomain_isEncapsulated() {
    return Domain_isEncapsulated.instance();
  }
  
  public Domain_isEncapsulated.Matcher getDomain_isEncapsulated(final ViatraQueryEngine engine) {
    return Domain_isEncapsulated.Matcher.on(engine);
  }
  
  public External getExternal() {
    return External.instance();
  }
  
  public External.Matcher getExternal(final ViatraQueryEngine engine) {
    return External.Matcher.on(engine);
  }
  
  public External_isEncapsulated getExternal_isEncapsulated() {
    return External_isEncapsulated.instance();
  }
  
  public External_isEncapsulated.Matcher getExternal_isEncapsulated(final ViatraQueryEngine engine) {
    return External_isEncapsulated.Matcher.on(engine);
  }
  
  public Subsystem getSubsystem() {
    return Subsystem.instance();
  }
  
  public Subsystem.Matcher getSubsystem(final ViatraQueryEngine engine) {
    return Subsystem.Matcher.on(engine);
  }
  
  public Subsystem_isEncapsulated getSubsystem_isEncapsulated() {
    return Subsystem_isEncapsulated.instance();
  }
  
  public Subsystem_isEncapsulated.Matcher getSubsystem_isEncapsulated(final ViatraQueryEngine engine) {
    return Subsystem_isEncapsulated.Matcher.on(engine);
  }
  
  public sysml.System getSystem() {
    return sysml.System.instance();
  }
  
  public System.Matcher getSystem(final ViatraQueryEngine engine) {
    return System.Matcher.on(engine);
  }
  
  public System_isEncapsulated getSystem_isEncapsulated() {
    return System_isEncapsulated.instance();
  }
  
  public System_isEncapsulated.Matcher getSystem_isEncapsulated(final ViatraQueryEngine engine) {
    return System_isEncapsulated.Matcher.on(engine);
  }
  
  public Systemcontext getSystemcontext() {
    return Systemcontext.instance();
  }
  
  public Systemcontext.Matcher getSystemcontext(final ViatraQueryEngine engine) {
    return Systemcontext.Matcher.on(engine);
  }
  
  public Systemcontext_isEncapsulated getSystemcontext_isEncapsulated() {
    return Systemcontext_isEncapsulated.instance();
  }
  
  public Systemcontext_isEncapsulated.Matcher getSystemcontext_isEncapsulated(final ViatraQueryEngine engine) {
    return Systemcontext_isEncapsulated.Matcher.on(engine);
  }
  
  public BlockHierarchy getBlockHierarchy() {
    return BlockHierarchy.instance();
  }
  
  public BlockHierarchy.Matcher getBlockHierarchy(final ViatraQueryEngine engine) {
    return BlockHierarchy.Matcher.on(engine);
  }
  
  public ContextDiagram getContextDiagram() {
    return ContextDiagram.instance();
  }
  
  public ContextDiagram.Matcher getContextDiagram(final ViatraQueryEngine engine) {
    return ContextDiagram.Matcher.on(engine);
  }
  
  public DiagramDescription getDiagramDescription() {
    return DiagramDescription.instance();
  }
  
  public DiagramDescription.Matcher getDiagramDescription(final ViatraQueryEngine engine) {
    return DiagramDescription.Matcher.on(engine);
  }
  
  public DiagramDescription_Completionstatus getDiagramDescription_Completionstatus() {
    return DiagramDescription_Completionstatus.instance();
  }
  
  public DiagramDescription_Completionstatus.Matcher getDiagramDescription_Completionstatus(final ViatraQueryEngine engine) {
    return DiagramDescription_Completionstatus.Matcher.on(engine);
  }
  
  public DiagramDescription_Description getDiagramDescription_Description() {
    return DiagramDescription_Description.instance();
  }
  
  public DiagramDescription_Description.Matcher getDiagramDescription_Description(final ViatraQueryEngine engine) {
    return DiagramDescription_Description.Matcher.on(engine);
  }
  
  public DiagramDescription_Reference getDiagramDescription_Reference() {
    return DiagramDescription_Reference.instance();
  }
  
  public DiagramDescription_Reference.Matcher getDiagramDescription_Reference(final ViatraQueryEngine engine) {
    return DiagramDescription_Reference.Matcher.on(engine);
  }
  
  public DiagramDescription_Version getDiagramDescription_Version() {
    return DiagramDescription_Version.instance();
  }
  
  public DiagramDescription_Version.Matcher getDiagramDescription_Version(final ViatraQueryEngine engine) {
    return DiagramDescription_Version.Matcher.on(engine);
  }
  
  public SwimLaneDiagram getSwimLaneDiagram() {
    return SwimLaneDiagram.instance();
  }
  
  public SwimLaneDiagram.Matcher getSwimLaneDiagram(final ViatraQueryEngine engine) {
    return SwimLaneDiagram.Matcher.on(engine);
  }
  
  public DiagramUsage getDiagramUsage() {
    return DiagramUsage.instance();
  }
  
  public DiagramUsage.Matcher getDiagramUsage(final ViatraQueryEngine engine) {
    return DiagramUsage.Matcher.on(engine);
  }
  
  public BasicInterval getBasicInterval() {
    return BasicInterval.instance();
  }
  
  public BasicInterval.Matcher getBasicInterval(final ViatraQueryEngine engine) {
    return BasicInterval.Matcher.on(engine);
  }
  
  public BasicInterval_max getBasicInterval_max() {
    return BasicInterval_max.instance();
  }
  
  public BasicInterval_max.Matcher getBasicInterval_max(final ViatraQueryEngine engine) {
    return BasicInterval_max.Matcher.on(engine);
  }
  
  public BasicInterval_min getBasicInterval_min() {
    return BasicInterval_min.instance();
  }
  
  public BasicInterval_min.Matcher getBasicInterval_min(final ViatraQueryEngine engine) {
    return BasicInterval_min.Matcher.on(engine);
  }
  
  public Interval getInterval() {
    return Interval.instance();
  }
  
  public Interval.Matcher getInterval(final ViatraQueryEngine engine) {
    return Interval.Matcher.on(engine);
  }
  
  public Interval_max getInterval_max() {
    return Interval_max.instance();
  }
  
  public Interval_max.Matcher getInterval_max(final ViatraQueryEngine engine) {
    return Interval_max.Matcher.on(engine);
  }
  
  public Interval_min getInterval_min() {
    return Interval_min.instance();
  }
  
  public Interval_min.Matcher getInterval_min(final ViatraQueryEngine engine) {
    return Interval_min.Matcher.on(engine);
  }
  
  public Normal getNormal() {
    return Normal.instance();
  }
  
  public Normal.Matcher getNormal(final ViatraQueryEngine engine) {
    return Normal.Matcher.on(engine);
  }
  
  public Normal_mean getNormal_mean() {
    return Normal_mean.instance();
  }
  
  public Normal_mean.Matcher getNormal_mean(final ViatraQueryEngine engine) {
    return Normal_mean.Matcher.on(engine);
  }
  
  public Normal_standardDeviation getNormal_standardDeviation() {
    return Normal_standardDeviation.instance();
  }
  
  public Normal_standardDeviation.Matcher getNormal_standardDeviation(final ViatraQueryEngine engine) {
    return Normal_standardDeviation.Matcher.on(engine);
  }
  
  public Uniform getUniform() {
    return Uniform.instance();
  }
  
  public Uniform.Matcher getUniform(final ViatraQueryEngine engine) {
    return Uniform.Matcher.on(engine);
  }
  
  public Uniform_max getUniform_max() {
    return Uniform_max.instance();
  }
  
  public Uniform_max.Matcher getUniform_max(final ViatraQueryEngine engine) {
    return Uniform_max.Matcher.on(engine);
  }
  
  public Uniform_min getUniform_min() {
    return Uniform_min.instance();
  }
  
  public Uniform_min.Matcher getUniform_min(final ViatraQueryEngine engine) {
    return Uniform_min.Matcher.on(engine);
  }
  
  public Moe getMoe() {
    return Moe.instance();
  }
  
  public Moe.Matcher getMoe(final ViatraQueryEngine engine) {
    return Moe.Matcher.on(engine);
  }
  
  public ObjectiveFunction getObjectiveFunction() {
    return ObjectiveFunction.instance();
  }
  
  public ObjectiveFunction.Matcher getObjectiveFunction(final ViatraQueryEngine engine) {
    return ObjectiveFunction.Matcher.on(engine);
  }
  
  public BusinessRequirement getBusinessRequirement() {
    return BusinessRequirement.instance();
  }
  
  public BusinessRequirement.Matcher getBusinessRequirement(final ViatraQueryEngine engine) {
    return BusinessRequirement.Matcher.on(engine);
  }
  
  public BusinessRequirement_Derived getBusinessRequirement_Derived() {
    return BusinessRequirement_Derived.instance();
  }
  
  public BusinessRequirement_Derived.Matcher getBusinessRequirement_Derived(final ViatraQueryEngine engine) {
    return BusinessRequirement_Derived.Matcher.on(engine);
  }
  
  public BusinessRequirement_DerivedFrom getBusinessRequirement_DerivedFrom() {
    return BusinessRequirement_DerivedFrom.instance();
  }
  
  public BusinessRequirement_DerivedFrom.Matcher getBusinessRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return BusinessRequirement_DerivedFrom.Matcher.on(engine);
  }
  
  public BusinessRequirement_Id getBusinessRequirement_Id() {
    return BusinessRequirement_Id.instance();
  }
  
  public BusinessRequirement_Id.Matcher getBusinessRequirement_Id(final ViatraQueryEngine engine) {
    return BusinessRequirement_Id.Matcher.on(engine);
  }
  
  public BusinessRequirement_Master getBusinessRequirement_Master() {
    return BusinessRequirement_Master.instance();
  }
  
  public BusinessRequirement_Master.Matcher getBusinessRequirement_Master(final ViatraQueryEngine engine) {
    return BusinessRequirement_Master.Matcher.on(engine);
  }
  
  public BusinessRequirement_RefinedBy getBusinessRequirement_RefinedBy() {
    return BusinessRequirement_RefinedBy.instance();
  }
  
  public BusinessRequirement_RefinedBy.Matcher getBusinessRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return BusinessRequirement_RefinedBy.Matcher.on(engine);
  }
  
  public BusinessRequirement_SatisfiedBy getBusinessRequirement_SatisfiedBy() {
    return BusinessRequirement_SatisfiedBy.instance();
  }
  
  public BusinessRequirement_SatisfiedBy.Matcher getBusinessRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return BusinessRequirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public BusinessRequirement_Text getBusinessRequirement_Text() {
    return BusinessRequirement_Text.instance();
  }
  
  public BusinessRequirement_Text.Matcher getBusinessRequirement_Text(final ViatraQueryEngine engine) {
    return BusinessRequirement_Text.Matcher.on(engine);
  }
  
  public BusinessRequirement_TracedTo getBusinessRequirement_TracedTo() {
    return BusinessRequirement_TracedTo.instance();
  }
  
  public BusinessRequirement_TracedTo.Matcher getBusinessRequirement_TracedTo(final ViatraQueryEngine engine) {
    return BusinessRequirement_TracedTo.Matcher.on(engine);
  }
  
  public BusinessRequirement_VerifiedBy getBusinessRequirement_VerifiedBy() {
    return BusinessRequirement_VerifiedBy.instance();
  }
  
  public BusinessRequirement_VerifiedBy.Matcher getBusinessRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return BusinessRequirement_VerifiedBy.Matcher.on(engine);
  }
  
  public BusinessRequirement_risk getBusinessRequirement_risk() {
    return BusinessRequirement_risk.instance();
  }
  
  public BusinessRequirement_risk.Matcher getBusinessRequirement_risk(final ViatraQueryEngine engine) {
    return BusinessRequirement_risk.Matcher.on(engine);
  }
  
  public BusinessRequirement_source getBusinessRequirement_source() {
    return BusinessRequirement_source.instance();
  }
  
  public BusinessRequirement_source.Matcher getBusinessRequirement_source(final ViatraQueryEngine engine) {
    return BusinessRequirement_source.Matcher.on(engine);
  }
  
  public BusinessRequirement_verifyMethod getBusinessRequirement_verifyMethod() {
    return BusinessRequirement_verifyMethod.instance();
  }
  
  public BusinessRequirement_verifyMethod.Matcher getBusinessRequirement_verifyMethod(final ViatraQueryEngine engine) {
    return BusinessRequirement_verifyMethod.Matcher.on(engine);
  }
  
  public DesignConstraint getDesignConstraint() {
    return DesignConstraint.instance();
  }
  
  public DesignConstraint.Matcher getDesignConstraint(final ViatraQueryEngine engine) {
    return DesignConstraint.Matcher.on(engine);
  }
  
  public DesignConstraint_Derived getDesignConstraint_Derived() {
    return DesignConstraint_Derived.instance();
  }
  
  public DesignConstraint_Derived.Matcher getDesignConstraint_Derived(final ViatraQueryEngine engine) {
    return DesignConstraint_Derived.Matcher.on(engine);
  }
  
  public DesignConstraint_DerivedFrom getDesignConstraint_DerivedFrom() {
    return DesignConstraint_DerivedFrom.instance();
  }
  
  public DesignConstraint_DerivedFrom.Matcher getDesignConstraint_DerivedFrom(final ViatraQueryEngine engine) {
    return DesignConstraint_DerivedFrom.Matcher.on(engine);
  }
  
  public DesignConstraint_Id getDesignConstraint_Id() {
    return DesignConstraint_Id.instance();
  }
  
  public DesignConstraint_Id.Matcher getDesignConstraint_Id(final ViatraQueryEngine engine) {
    return DesignConstraint_Id.Matcher.on(engine);
  }
  
  public DesignConstraint_Master getDesignConstraint_Master() {
    return DesignConstraint_Master.instance();
  }
  
  public DesignConstraint_Master.Matcher getDesignConstraint_Master(final ViatraQueryEngine engine) {
    return DesignConstraint_Master.Matcher.on(engine);
  }
  
  public DesignConstraint_RefinedBy getDesignConstraint_RefinedBy() {
    return DesignConstraint_RefinedBy.instance();
  }
  
  public DesignConstraint_RefinedBy.Matcher getDesignConstraint_RefinedBy(final ViatraQueryEngine engine) {
    return DesignConstraint_RefinedBy.Matcher.on(engine);
  }
  
  public DesignConstraint_SatisfiedBy getDesignConstraint_SatisfiedBy() {
    return DesignConstraint_SatisfiedBy.instance();
  }
  
  public DesignConstraint_SatisfiedBy.Matcher getDesignConstraint_SatisfiedBy(final ViatraQueryEngine engine) {
    return DesignConstraint_SatisfiedBy.Matcher.on(engine);
  }
  
  public DesignConstraint_Text getDesignConstraint_Text() {
    return DesignConstraint_Text.instance();
  }
  
  public DesignConstraint_Text.Matcher getDesignConstraint_Text(final ViatraQueryEngine engine) {
    return DesignConstraint_Text.Matcher.on(engine);
  }
  
  public DesignConstraint_TracedTo getDesignConstraint_TracedTo() {
    return DesignConstraint_TracedTo.instance();
  }
  
  public DesignConstraint_TracedTo.Matcher getDesignConstraint_TracedTo(final ViatraQueryEngine engine) {
    return DesignConstraint_TracedTo.Matcher.on(engine);
  }
  
  public DesignConstraint_VerifiedBy getDesignConstraint_VerifiedBy() {
    return DesignConstraint_VerifiedBy.instance();
  }
  
  public DesignConstraint_VerifiedBy.Matcher getDesignConstraint_VerifiedBy(final ViatraQueryEngine engine) {
    return DesignConstraint_VerifiedBy.Matcher.on(engine);
  }
  
  public DesignConstraint_risk getDesignConstraint_risk() {
    return DesignConstraint_risk.instance();
  }
  
  public DesignConstraint_risk.Matcher getDesignConstraint_risk(final ViatraQueryEngine engine) {
    return DesignConstraint_risk.Matcher.on(engine);
  }
  
  public DesignConstraint_source getDesignConstraint_source() {
    return DesignConstraint_source.instance();
  }
  
  public DesignConstraint_source.Matcher getDesignConstraint_source(final ViatraQueryEngine engine) {
    return DesignConstraint_source.Matcher.on(engine);
  }
  
  public DesignConstraint_verifyMethod getDesignConstraint_verifyMethod() {
    return DesignConstraint_verifyMethod.instance();
  }
  
  public DesignConstraint_verifyMethod.Matcher getDesignConstraint_verifyMethod(final ViatraQueryEngine engine) {
    return DesignConstraint_verifyMethod.Matcher.on(engine);
  }
  
  public ExtendedRequirement getExtendedRequirement() {
    return ExtendedRequirement.instance();
  }
  
  public ExtendedRequirement.Matcher getExtendedRequirement(final ViatraQueryEngine engine) {
    return ExtendedRequirement.Matcher.on(engine);
  }
  
  public ExtendedRequirement_Derived getExtendedRequirement_Derived() {
    return ExtendedRequirement_Derived.instance();
  }
  
  public ExtendedRequirement_Derived.Matcher getExtendedRequirement_Derived(final ViatraQueryEngine engine) {
    return ExtendedRequirement_Derived.Matcher.on(engine);
  }
  
  public ExtendedRequirement_DerivedFrom getExtendedRequirement_DerivedFrom() {
    return ExtendedRequirement_DerivedFrom.instance();
  }
  
  public ExtendedRequirement_DerivedFrom.Matcher getExtendedRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return ExtendedRequirement_DerivedFrom.Matcher.on(engine);
  }
  
  public ExtendedRequirement_Id getExtendedRequirement_Id() {
    return ExtendedRequirement_Id.instance();
  }
  
  public ExtendedRequirement_Id.Matcher getExtendedRequirement_Id(final ViatraQueryEngine engine) {
    return ExtendedRequirement_Id.Matcher.on(engine);
  }
  
  public ExtendedRequirement_Master getExtendedRequirement_Master() {
    return ExtendedRequirement_Master.instance();
  }
  
  public ExtendedRequirement_Master.Matcher getExtendedRequirement_Master(final ViatraQueryEngine engine) {
    return ExtendedRequirement_Master.Matcher.on(engine);
  }
  
  public ExtendedRequirement_RefinedBy getExtendedRequirement_RefinedBy() {
    return ExtendedRequirement_RefinedBy.instance();
  }
  
  public ExtendedRequirement_RefinedBy.Matcher getExtendedRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return ExtendedRequirement_RefinedBy.Matcher.on(engine);
  }
  
  public ExtendedRequirement_SatisfiedBy getExtendedRequirement_SatisfiedBy() {
    return ExtendedRequirement_SatisfiedBy.instance();
  }
  
  public ExtendedRequirement_SatisfiedBy.Matcher getExtendedRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return ExtendedRequirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public ExtendedRequirement_Text getExtendedRequirement_Text() {
    return ExtendedRequirement_Text.instance();
  }
  
  public ExtendedRequirement_Text.Matcher getExtendedRequirement_Text(final ViatraQueryEngine engine) {
    return ExtendedRequirement_Text.Matcher.on(engine);
  }
  
  public ExtendedRequirement_TracedTo getExtendedRequirement_TracedTo() {
    return ExtendedRequirement_TracedTo.instance();
  }
  
  public ExtendedRequirement_TracedTo.Matcher getExtendedRequirement_TracedTo(final ViatraQueryEngine engine) {
    return ExtendedRequirement_TracedTo.Matcher.on(engine);
  }
  
  public ExtendedRequirement_VerifiedBy getExtendedRequirement_VerifiedBy() {
    return ExtendedRequirement_VerifiedBy.instance();
  }
  
  public ExtendedRequirement_VerifiedBy.Matcher getExtendedRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return ExtendedRequirement_VerifiedBy.Matcher.on(engine);
  }
  
  public ExtendedRequirement_risk getExtendedRequirement_risk() {
    return ExtendedRequirement_risk.instance();
  }
  
  public ExtendedRequirement_risk.Matcher getExtendedRequirement_risk(final ViatraQueryEngine engine) {
    return ExtendedRequirement_risk.Matcher.on(engine);
  }
  
  public ExtendedRequirement_source getExtendedRequirement_source() {
    return ExtendedRequirement_source.instance();
  }
  
  public ExtendedRequirement_source.Matcher getExtendedRequirement_source(final ViatraQueryEngine engine) {
    return ExtendedRequirement_source.Matcher.on(engine);
  }
  
  public ExtendedRequirement_verifyMethod getExtendedRequirement_verifyMethod() {
    return ExtendedRequirement_verifyMethod.instance();
  }
  
  public ExtendedRequirement_verifyMethod.Matcher getExtendedRequirement_verifyMethod(final ViatraQueryEngine engine) {
    return ExtendedRequirement_verifyMethod.Matcher.on(engine);
  }
  
  public FunctionalRequirement getFunctionalRequirement() {
    return FunctionalRequirement.instance();
  }
  
  public FunctionalRequirement.Matcher getFunctionalRequirement(final ViatraQueryEngine engine) {
    return FunctionalRequirement.Matcher.on(engine);
  }
  
  public FunctionalRequirement_Derived getFunctionalRequirement_Derived() {
    return FunctionalRequirement_Derived.instance();
  }
  
  public FunctionalRequirement_Derived.Matcher getFunctionalRequirement_Derived(final ViatraQueryEngine engine) {
    return FunctionalRequirement_Derived.Matcher.on(engine);
  }
  
  public FunctionalRequirement_DerivedFrom getFunctionalRequirement_DerivedFrom() {
    return FunctionalRequirement_DerivedFrom.instance();
  }
  
  public FunctionalRequirement_DerivedFrom.Matcher getFunctionalRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return FunctionalRequirement_DerivedFrom.Matcher.on(engine);
  }
  
  public FunctionalRequirement_Id getFunctionalRequirement_Id() {
    return FunctionalRequirement_Id.instance();
  }
  
  public FunctionalRequirement_Id.Matcher getFunctionalRequirement_Id(final ViatraQueryEngine engine) {
    return FunctionalRequirement_Id.Matcher.on(engine);
  }
  
  public FunctionalRequirement_Master getFunctionalRequirement_Master() {
    return FunctionalRequirement_Master.instance();
  }
  
  public FunctionalRequirement_Master.Matcher getFunctionalRequirement_Master(final ViatraQueryEngine engine) {
    return FunctionalRequirement_Master.Matcher.on(engine);
  }
  
  public FunctionalRequirement_RefinedBy getFunctionalRequirement_RefinedBy() {
    return FunctionalRequirement_RefinedBy.instance();
  }
  
  public FunctionalRequirement_RefinedBy.Matcher getFunctionalRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return FunctionalRequirement_RefinedBy.Matcher.on(engine);
  }
  
  public FunctionalRequirement_SatisfiedBy getFunctionalRequirement_SatisfiedBy() {
    return FunctionalRequirement_SatisfiedBy.instance();
  }
  
  public FunctionalRequirement_SatisfiedBy.Matcher getFunctionalRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return FunctionalRequirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public FunctionalRequirement_Text getFunctionalRequirement_Text() {
    return FunctionalRequirement_Text.instance();
  }
  
  public FunctionalRequirement_Text.Matcher getFunctionalRequirement_Text(final ViatraQueryEngine engine) {
    return FunctionalRequirement_Text.Matcher.on(engine);
  }
  
  public FunctionalRequirement_TracedTo getFunctionalRequirement_TracedTo() {
    return FunctionalRequirement_TracedTo.instance();
  }
  
  public FunctionalRequirement_TracedTo.Matcher getFunctionalRequirement_TracedTo(final ViatraQueryEngine engine) {
    return FunctionalRequirement_TracedTo.Matcher.on(engine);
  }
  
  public FunctionalRequirement_VerifiedBy getFunctionalRequirement_VerifiedBy() {
    return FunctionalRequirement_VerifiedBy.instance();
  }
  
  public FunctionalRequirement_VerifiedBy.Matcher getFunctionalRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return FunctionalRequirement_VerifiedBy.Matcher.on(engine);
  }
  
  public FunctionalRequirement_risk getFunctionalRequirement_risk() {
    return FunctionalRequirement_risk.instance();
  }
  
  public FunctionalRequirement_risk.Matcher getFunctionalRequirement_risk(final ViatraQueryEngine engine) {
    return FunctionalRequirement_risk.Matcher.on(engine);
  }
  
  public FunctionalRequirement_source getFunctionalRequirement_source() {
    return FunctionalRequirement_source.instance();
  }
  
  public FunctionalRequirement_source.Matcher getFunctionalRequirement_source(final ViatraQueryEngine engine) {
    return FunctionalRequirement_source.Matcher.on(engine);
  }
  
  public FunctionalRequirement_verifyMethod getFunctionalRequirement_verifyMethod() {
    return FunctionalRequirement_verifyMethod.instance();
  }
  
  public FunctionalRequirement_verifyMethod.Matcher getFunctionalRequirement_verifyMethod(final ViatraQueryEngine engine) {
    return FunctionalRequirement_verifyMethod.Matcher.on(engine);
  }
  
  public InterfaceRequirement getInterfaceRequirement() {
    return InterfaceRequirement.instance();
  }
  
  public InterfaceRequirement.Matcher getInterfaceRequirement(final ViatraQueryEngine engine) {
    return InterfaceRequirement.Matcher.on(engine);
  }
  
  public InterfaceRequirement_Derived getInterfaceRequirement_Derived() {
    return InterfaceRequirement_Derived.instance();
  }
  
  public InterfaceRequirement_Derived.Matcher getInterfaceRequirement_Derived(final ViatraQueryEngine engine) {
    return InterfaceRequirement_Derived.Matcher.on(engine);
  }
  
  public InterfaceRequirement_DerivedFrom getInterfaceRequirement_DerivedFrom() {
    return InterfaceRequirement_DerivedFrom.instance();
  }
  
  public InterfaceRequirement_DerivedFrom.Matcher getInterfaceRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return InterfaceRequirement_DerivedFrom.Matcher.on(engine);
  }
  
  public InterfaceRequirement_Id getInterfaceRequirement_Id() {
    return InterfaceRequirement_Id.instance();
  }
  
  public InterfaceRequirement_Id.Matcher getInterfaceRequirement_Id(final ViatraQueryEngine engine) {
    return InterfaceRequirement_Id.Matcher.on(engine);
  }
  
  public InterfaceRequirement_Master getInterfaceRequirement_Master() {
    return InterfaceRequirement_Master.instance();
  }
  
  public InterfaceRequirement_Master.Matcher getInterfaceRequirement_Master(final ViatraQueryEngine engine) {
    return InterfaceRequirement_Master.Matcher.on(engine);
  }
  
  public InterfaceRequirement_RefinedBy getInterfaceRequirement_RefinedBy() {
    return InterfaceRequirement_RefinedBy.instance();
  }
  
  public InterfaceRequirement_RefinedBy.Matcher getInterfaceRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return InterfaceRequirement_RefinedBy.Matcher.on(engine);
  }
  
  public InterfaceRequirement_SatisfiedBy getInterfaceRequirement_SatisfiedBy() {
    return InterfaceRequirement_SatisfiedBy.instance();
  }
  
  public InterfaceRequirement_SatisfiedBy.Matcher getInterfaceRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return InterfaceRequirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public InterfaceRequirement_Text getInterfaceRequirement_Text() {
    return InterfaceRequirement_Text.instance();
  }
  
  public InterfaceRequirement_Text.Matcher getInterfaceRequirement_Text(final ViatraQueryEngine engine) {
    return InterfaceRequirement_Text.Matcher.on(engine);
  }
  
  public InterfaceRequirement_TracedTo getInterfaceRequirement_TracedTo() {
    return InterfaceRequirement_TracedTo.instance();
  }
  
  public InterfaceRequirement_TracedTo.Matcher getInterfaceRequirement_TracedTo(final ViatraQueryEngine engine) {
    return InterfaceRequirement_TracedTo.Matcher.on(engine);
  }
  
  public InterfaceRequirement_VerifiedBy getInterfaceRequirement_VerifiedBy() {
    return InterfaceRequirement_VerifiedBy.instance();
  }
  
  public InterfaceRequirement_VerifiedBy.Matcher getInterfaceRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return InterfaceRequirement_VerifiedBy.Matcher.on(engine);
  }
  
  public InterfaceRequirement_risk getInterfaceRequirement_risk() {
    return InterfaceRequirement_risk.instance();
  }
  
  public InterfaceRequirement_risk.Matcher getInterfaceRequirement_risk(final ViatraQueryEngine engine) {
    return InterfaceRequirement_risk.Matcher.on(engine);
  }
  
  public InterfaceRequirement_source getInterfaceRequirement_source() {
    return InterfaceRequirement_source.instance();
  }
  
  public InterfaceRequirement_source.Matcher getInterfaceRequirement_source(final ViatraQueryEngine engine) {
    return InterfaceRequirement_source.Matcher.on(engine);
  }
  
  public InterfaceRequirement_verifyMethod getInterfaceRequirement_verifyMethod() {
    return InterfaceRequirement_verifyMethod.instance();
  }
  
  public InterfaceRequirement_verifyMethod.Matcher getInterfaceRequirement_verifyMethod(final ViatraQueryEngine engine) {
    return InterfaceRequirement_verifyMethod.Matcher.on(engine);
  }
  
  public PerformanceRequirement getPerformanceRequirement() {
    return PerformanceRequirement.instance();
  }
  
  public PerformanceRequirement.Matcher getPerformanceRequirement(final ViatraQueryEngine engine) {
    return PerformanceRequirement.Matcher.on(engine);
  }
  
  public PerformanceRequirement_Derived getPerformanceRequirement_Derived() {
    return PerformanceRequirement_Derived.instance();
  }
  
  public PerformanceRequirement_Derived.Matcher getPerformanceRequirement_Derived(final ViatraQueryEngine engine) {
    return PerformanceRequirement_Derived.Matcher.on(engine);
  }
  
  public PerformanceRequirement_DerivedFrom getPerformanceRequirement_DerivedFrom() {
    return PerformanceRequirement_DerivedFrom.instance();
  }
  
  public PerformanceRequirement_DerivedFrom.Matcher getPerformanceRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return PerformanceRequirement_DerivedFrom.Matcher.on(engine);
  }
  
  public PerformanceRequirement_Id getPerformanceRequirement_Id() {
    return PerformanceRequirement_Id.instance();
  }
  
  public PerformanceRequirement_Id.Matcher getPerformanceRequirement_Id(final ViatraQueryEngine engine) {
    return PerformanceRequirement_Id.Matcher.on(engine);
  }
  
  public PerformanceRequirement_Master getPerformanceRequirement_Master() {
    return PerformanceRequirement_Master.instance();
  }
  
  public PerformanceRequirement_Master.Matcher getPerformanceRequirement_Master(final ViatraQueryEngine engine) {
    return PerformanceRequirement_Master.Matcher.on(engine);
  }
  
  public PerformanceRequirement_RefinedBy getPerformanceRequirement_RefinedBy() {
    return PerformanceRequirement_RefinedBy.instance();
  }
  
  public PerformanceRequirement_RefinedBy.Matcher getPerformanceRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return PerformanceRequirement_RefinedBy.Matcher.on(engine);
  }
  
  public PerformanceRequirement_SatisfiedBy getPerformanceRequirement_SatisfiedBy() {
    return PerformanceRequirement_SatisfiedBy.instance();
  }
  
  public PerformanceRequirement_SatisfiedBy.Matcher getPerformanceRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return PerformanceRequirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public PerformanceRequirement_Text getPerformanceRequirement_Text() {
    return PerformanceRequirement_Text.instance();
  }
  
  public PerformanceRequirement_Text.Matcher getPerformanceRequirement_Text(final ViatraQueryEngine engine) {
    return PerformanceRequirement_Text.Matcher.on(engine);
  }
  
  public PerformanceRequirement_TracedTo getPerformanceRequirement_TracedTo() {
    return PerformanceRequirement_TracedTo.instance();
  }
  
  public PerformanceRequirement_TracedTo.Matcher getPerformanceRequirement_TracedTo(final ViatraQueryEngine engine) {
    return PerformanceRequirement_TracedTo.Matcher.on(engine);
  }
  
  public PerformanceRequirement_VerifiedBy getPerformanceRequirement_VerifiedBy() {
    return PerformanceRequirement_VerifiedBy.instance();
  }
  
  public PerformanceRequirement_VerifiedBy.Matcher getPerformanceRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return PerformanceRequirement_VerifiedBy.Matcher.on(engine);
  }
  
  public PerformanceRequirement_risk getPerformanceRequirement_risk() {
    return PerformanceRequirement_risk.instance();
  }
  
  public PerformanceRequirement_risk.Matcher getPerformanceRequirement_risk(final ViatraQueryEngine engine) {
    return PerformanceRequirement_risk.Matcher.on(engine);
  }
  
  public PerformanceRequirement_source getPerformanceRequirement_source() {
    return PerformanceRequirement_source.instance();
  }
  
  public PerformanceRequirement_source.Matcher getPerformanceRequirement_source(final ViatraQueryEngine engine) {
    return PerformanceRequirement_source.Matcher.on(engine);
  }
  
  public PerformanceRequirement_verifyMethod getPerformanceRequirement_verifyMethod() {
    return PerformanceRequirement_verifyMethod.instance();
  }
  
  public PerformanceRequirement_verifyMethod.Matcher getPerformanceRequirement_verifyMethod(final ViatraQueryEngine engine) {
    return PerformanceRequirement_verifyMethod.Matcher.on(engine);
  }
  
  public PhysicalRequirement getPhysicalRequirement() {
    return PhysicalRequirement.instance();
  }
  
  public PhysicalRequirement.Matcher getPhysicalRequirement(final ViatraQueryEngine engine) {
    return PhysicalRequirement.Matcher.on(engine);
  }
  
  public PhysicalRequirement_Derived getPhysicalRequirement_Derived() {
    return PhysicalRequirement_Derived.instance();
  }
  
  public PhysicalRequirement_Derived.Matcher getPhysicalRequirement_Derived(final ViatraQueryEngine engine) {
    return PhysicalRequirement_Derived.Matcher.on(engine);
  }
  
  public PhysicalRequirement_DerivedFrom getPhysicalRequirement_DerivedFrom() {
    return PhysicalRequirement_DerivedFrom.instance();
  }
  
  public PhysicalRequirement_DerivedFrom.Matcher getPhysicalRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return PhysicalRequirement_DerivedFrom.Matcher.on(engine);
  }
  
  public PhysicalRequirement_Id getPhysicalRequirement_Id() {
    return PhysicalRequirement_Id.instance();
  }
  
  public PhysicalRequirement_Id.Matcher getPhysicalRequirement_Id(final ViatraQueryEngine engine) {
    return PhysicalRequirement_Id.Matcher.on(engine);
  }
  
  public PhysicalRequirement_Master getPhysicalRequirement_Master() {
    return PhysicalRequirement_Master.instance();
  }
  
  public PhysicalRequirement_Master.Matcher getPhysicalRequirement_Master(final ViatraQueryEngine engine) {
    return PhysicalRequirement_Master.Matcher.on(engine);
  }
  
  public PhysicalRequirement_RefinedBy getPhysicalRequirement_RefinedBy() {
    return PhysicalRequirement_RefinedBy.instance();
  }
  
  public PhysicalRequirement_RefinedBy.Matcher getPhysicalRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return PhysicalRequirement_RefinedBy.Matcher.on(engine);
  }
  
  public PhysicalRequirement_SatisfiedBy getPhysicalRequirement_SatisfiedBy() {
    return PhysicalRequirement_SatisfiedBy.instance();
  }
  
  public PhysicalRequirement_SatisfiedBy.Matcher getPhysicalRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return PhysicalRequirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public PhysicalRequirement_Text getPhysicalRequirement_Text() {
    return PhysicalRequirement_Text.instance();
  }
  
  public PhysicalRequirement_Text.Matcher getPhysicalRequirement_Text(final ViatraQueryEngine engine) {
    return PhysicalRequirement_Text.Matcher.on(engine);
  }
  
  public PhysicalRequirement_TracedTo getPhysicalRequirement_TracedTo() {
    return PhysicalRequirement_TracedTo.instance();
  }
  
  public PhysicalRequirement_TracedTo.Matcher getPhysicalRequirement_TracedTo(final ViatraQueryEngine engine) {
    return PhysicalRequirement_TracedTo.Matcher.on(engine);
  }
  
  public PhysicalRequirement_VerifiedBy getPhysicalRequirement_VerifiedBy() {
    return PhysicalRequirement_VerifiedBy.instance();
  }
  
  public PhysicalRequirement_VerifiedBy.Matcher getPhysicalRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return PhysicalRequirement_VerifiedBy.Matcher.on(engine);
  }
  
  public PhysicalRequirement_risk getPhysicalRequirement_risk() {
    return PhysicalRequirement_risk.instance();
  }
  
  public PhysicalRequirement_risk.Matcher getPhysicalRequirement_risk(final ViatraQueryEngine engine) {
    return PhysicalRequirement_risk.Matcher.on(engine);
  }
  
  public PhysicalRequirement_source getPhysicalRequirement_source() {
    return PhysicalRequirement_source.instance();
  }
  
  public PhysicalRequirement_source.Matcher getPhysicalRequirement_source(final ViatraQueryEngine engine) {
    return PhysicalRequirement_source.Matcher.on(engine);
  }
  
  public PhysicalRequirement_verifyMethod getPhysicalRequirement_verifyMethod() {
    return PhysicalRequirement_verifyMethod.instance();
  }
  
  public PhysicalRequirement_verifyMethod.Matcher getPhysicalRequirement_verifyMethod(final ViatraQueryEngine engine) {
    return PhysicalRequirement_verifyMethod.Matcher.on(engine);
  }
  
  public UsabilityRequirement getUsabilityRequirement() {
    return UsabilityRequirement.instance();
  }
  
  public UsabilityRequirement.Matcher getUsabilityRequirement(final ViatraQueryEngine engine) {
    return UsabilityRequirement.Matcher.on(engine);
  }
  
  public UsabilityRequirement_Derived getUsabilityRequirement_Derived() {
    return UsabilityRequirement_Derived.instance();
  }
  
  public UsabilityRequirement_Derived.Matcher getUsabilityRequirement_Derived(final ViatraQueryEngine engine) {
    return UsabilityRequirement_Derived.Matcher.on(engine);
  }
  
  public UsabilityRequirement_DerivedFrom getUsabilityRequirement_DerivedFrom() {
    return UsabilityRequirement_DerivedFrom.instance();
  }
  
  public UsabilityRequirement_DerivedFrom.Matcher getUsabilityRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return UsabilityRequirement_DerivedFrom.Matcher.on(engine);
  }
  
  public UsabilityRequirement_Id getUsabilityRequirement_Id() {
    return UsabilityRequirement_Id.instance();
  }
  
  public UsabilityRequirement_Id.Matcher getUsabilityRequirement_Id(final ViatraQueryEngine engine) {
    return UsabilityRequirement_Id.Matcher.on(engine);
  }
  
  public UsabilityRequirement_Master getUsabilityRequirement_Master() {
    return UsabilityRequirement_Master.instance();
  }
  
  public UsabilityRequirement_Master.Matcher getUsabilityRequirement_Master(final ViatraQueryEngine engine) {
    return UsabilityRequirement_Master.Matcher.on(engine);
  }
  
  public UsabilityRequirement_RefinedBy getUsabilityRequirement_RefinedBy() {
    return UsabilityRequirement_RefinedBy.instance();
  }
  
  public UsabilityRequirement_RefinedBy.Matcher getUsabilityRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return UsabilityRequirement_RefinedBy.Matcher.on(engine);
  }
  
  public UsabilityRequirement_SatisfiedBy getUsabilityRequirement_SatisfiedBy() {
    return UsabilityRequirement_SatisfiedBy.instance();
  }
  
  public UsabilityRequirement_SatisfiedBy.Matcher getUsabilityRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return UsabilityRequirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public UsabilityRequirement_Text getUsabilityRequirement_Text() {
    return UsabilityRequirement_Text.instance();
  }
  
  public UsabilityRequirement_Text.Matcher getUsabilityRequirement_Text(final ViatraQueryEngine engine) {
    return UsabilityRequirement_Text.Matcher.on(engine);
  }
  
  public UsabilityRequirement_TracedTo getUsabilityRequirement_TracedTo() {
    return UsabilityRequirement_TracedTo.instance();
  }
  
  public UsabilityRequirement_TracedTo.Matcher getUsabilityRequirement_TracedTo(final ViatraQueryEngine engine) {
    return UsabilityRequirement_TracedTo.Matcher.on(engine);
  }
  
  public UsabilityRequirement_VerifiedBy getUsabilityRequirement_VerifiedBy() {
    return UsabilityRequirement_VerifiedBy.instance();
  }
  
  public UsabilityRequirement_VerifiedBy.Matcher getUsabilityRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return UsabilityRequirement_VerifiedBy.Matcher.on(engine);
  }
  
  public UsabilityRequirement_risk getUsabilityRequirement_risk() {
    return UsabilityRequirement_risk.instance();
  }
  
  public UsabilityRequirement_risk.Matcher getUsabilityRequirement_risk(final ViatraQueryEngine engine) {
    return UsabilityRequirement_risk.Matcher.on(engine);
  }
  
  public UsabilityRequirement_source getUsabilityRequirement_source() {
    return UsabilityRequirement_source.instance();
  }
  
  public UsabilityRequirement_source.Matcher getUsabilityRequirement_source(final ViatraQueryEngine engine) {
    return UsabilityRequirement_source.Matcher.on(engine);
  }
  
  public UsabilityRequirement_verifyMethod getUsabilityRequirement_verifyMethod() {
    return UsabilityRequirement_verifyMethod.instance();
  }
  
  public UsabilityRequirement_verifyMethod.Matcher getUsabilityRequirement_verifyMethod(final ViatraQueryEngine engine) {
    return UsabilityRequirement_verifyMethod.Matcher.on(engine);
  }
  
  public AcceptChangeStructuralFeatureEventAction getAcceptChangeStructuralFeatureEventAction() {
    return AcceptChangeStructuralFeatureEventAction.instance();
  }
  
  public AcceptChangeStructuralFeatureEventAction.Matcher getAcceptChangeStructuralFeatureEventAction(final ViatraQueryEngine engine) {
    return AcceptChangeStructuralFeatureEventAction.Matcher.on(engine);
  }
  
  public ChangeStructuralFeatureEvent getChangeStructuralFeatureEvent() {
    return ChangeStructuralFeatureEvent.instance();
  }
  
  public ChangeStructuralFeatureEvent.Matcher getChangeStructuralFeatureEvent(final ViatraQueryEngine engine) {
    return ChangeStructuralFeatureEvent.Matcher.on(engine);
  }
  
  public ChangeStructuralFeatureEvent_structuralFeature getChangeStructuralFeatureEvent_structuralFeature() {
    return ChangeStructuralFeatureEvent_structuralFeature.instance();
  }
  
  public ChangeStructuralFeatureEvent_structuralFeature.Matcher getChangeStructuralFeatureEvent_structuralFeature(final ViatraQueryEngine engine) {
    return ChangeStructuralFeatureEvent_structuralFeature.Matcher.on(engine);
  }
  
  public DirectedFeature getDirectedFeature() {
    return DirectedFeature.instance();
  }
  
  public DirectedFeature.Matcher getDirectedFeature(final ViatraQueryEngine engine) {
    return DirectedFeature.Matcher.on(engine);
  }
  
  public DirectedFeature_featureDirection getDirectedFeature_featureDirection() {
    return DirectedFeature_featureDirection.instance();
  }
  
  public DirectedFeature_featureDirection.Matcher getDirectedFeature_featureDirection(final ViatraQueryEngine engine) {
    return DirectedFeature_featureDirection.Matcher.on(engine);
  }
  
  public FlowProperty getFlowProperty() {
    return FlowProperty.instance();
  }
  
  public FlowProperty.Matcher getFlowProperty(final ViatraQueryEngine engine) {
    return FlowProperty.Matcher.on(engine);
  }
  
  public FlowProperty_direction getFlowProperty_direction() {
    return FlowProperty_direction.instance();
  }
  
  public FlowProperty_direction.Matcher getFlowProperty_direction(final ViatraQueryEngine engine) {
    return FlowProperty_direction.Matcher.on(engine);
  }
  
  public FullPort getFullPort() {
    return FullPort.instance();
  }
  
  public FullPort.Matcher getFullPort(final ViatraQueryEngine engine) {
    return FullPort.Matcher.on(engine);
  }
  
  public InterfaceBlock getInterfaceBlock() {
    return InterfaceBlock.instance();
  }
  
  public InterfaceBlock.Matcher getInterfaceBlock(final ViatraQueryEngine engine) {
    return InterfaceBlock.Matcher.on(engine);
  }
  
  public InterfaceBlock_isEncapsulated getInterfaceBlock_isEncapsulated() {
    return InterfaceBlock_isEncapsulated.instance();
  }
  
  public InterfaceBlock_isEncapsulated.Matcher getInterfaceBlock_isEncapsulated(final ViatraQueryEngine engine) {
    return InterfaceBlock_isEncapsulated.Matcher.on(engine);
  }
  
  public InvocationOnNestedPortAction getInvocationOnNestedPortAction() {
    return InvocationOnNestedPortAction.instance();
  }
  
  public InvocationOnNestedPortAction.Matcher getInvocationOnNestedPortAction(final ViatraQueryEngine engine) {
    return InvocationOnNestedPortAction.Matcher.on(engine);
  }
  
  public InvocationOnNestedPortAction_onNestedPort getInvocationOnNestedPortAction_onNestedPort() {
    return InvocationOnNestedPortAction_onNestedPort.instance();
  }
  
  public InvocationOnNestedPortAction_onNestedPort.Matcher getInvocationOnNestedPortAction_onNestedPort(final ViatraQueryEngine engine) {
    return InvocationOnNestedPortAction_onNestedPort.Matcher.on(engine);
  }
  
  public ItemFlow getItemFlow() {
    return ItemFlow.instance();
  }
  
  public ItemFlow.Matcher getItemFlow(final ViatraQueryEngine engine) {
    return ItemFlow.Matcher.on(engine);
  }
  
  public ItemFlow_itemProperty getItemFlow_itemProperty() {
    return ItemFlow_itemProperty.instance();
  }
  
  public ItemFlow_itemProperty.Matcher getItemFlow_itemProperty(final ViatraQueryEngine engine) {
    return ItemFlow_itemProperty.Matcher.on(engine);
  }
  
  public ProxyPort getProxyPort() {
    return ProxyPort.instance();
  }
  
  public ProxyPort.Matcher getProxyPort(final ViatraQueryEngine engine) {
    return ProxyPort.Matcher.on(engine);
  }
  
  public TriggerOnNestedPort getTriggerOnNestedPort() {
    return TriggerOnNestedPort.instance();
  }
  
  public TriggerOnNestedPort.Matcher getTriggerOnNestedPort(final ViatraQueryEngine engine) {
    return TriggerOnNestedPort.Matcher.on(engine);
  }
  
  public TriggerOnNestedPort_onNestedPort getTriggerOnNestedPort_onNestedPort() {
    return TriggerOnNestedPort_onNestedPort.instance();
  }
  
  public TriggerOnNestedPort_onNestedPort.Matcher getTriggerOnNestedPort_onNestedPort(final ViatraQueryEngine engine) {
    return TriggerOnNestedPort_onNestedPort.Matcher.on(engine);
  }
  
  public AbstractRequirement getAbstractRequirement() {
    return AbstractRequirement.instance();
  }
  
  public AbstractRequirement.Matcher getAbstractRequirement(final ViatraQueryEngine engine) {
    return AbstractRequirement.Matcher.on(engine);
  }
  
  public AbstractRequirement_Derived getAbstractRequirement_Derived() {
    return AbstractRequirement_Derived.instance();
  }
  
  public AbstractRequirement_Derived.Matcher getAbstractRequirement_Derived(final ViatraQueryEngine engine) {
    return AbstractRequirement_Derived.Matcher.on(engine);
  }
  
  public AbstractRequirement_DerivedFrom getAbstractRequirement_DerivedFrom() {
    return AbstractRequirement_DerivedFrom.instance();
  }
  
  public AbstractRequirement_DerivedFrom.Matcher getAbstractRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return AbstractRequirement_DerivedFrom.Matcher.on(engine);
  }
  
  public AbstractRequirement_Id getAbstractRequirement_Id() {
    return AbstractRequirement_Id.instance();
  }
  
  public AbstractRequirement_Id.Matcher getAbstractRequirement_Id(final ViatraQueryEngine engine) {
    return AbstractRequirement_Id.Matcher.on(engine);
  }
  
  public AbstractRequirement_Master getAbstractRequirement_Master() {
    return AbstractRequirement_Master.instance();
  }
  
  public AbstractRequirement_Master.Matcher getAbstractRequirement_Master(final ViatraQueryEngine engine) {
    return AbstractRequirement_Master.Matcher.on(engine);
  }
  
  public AbstractRequirement_RefinedBy getAbstractRequirement_RefinedBy() {
    return AbstractRequirement_RefinedBy.instance();
  }
  
  public AbstractRequirement_RefinedBy.Matcher getAbstractRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return AbstractRequirement_RefinedBy.Matcher.on(engine);
  }
  
  public AbstractRequirement_SatisfiedBy getAbstractRequirement_SatisfiedBy() {
    return AbstractRequirement_SatisfiedBy.instance();
  }
  
  public AbstractRequirement_SatisfiedBy.Matcher getAbstractRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return AbstractRequirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public AbstractRequirement_Text getAbstractRequirement_Text() {
    return AbstractRequirement_Text.instance();
  }
  
  public AbstractRequirement_Text.Matcher getAbstractRequirement_Text(final ViatraQueryEngine engine) {
    return AbstractRequirement_Text.Matcher.on(engine);
  }
  
  public AbstractRequirement_TracedTo getAbstractRequirement_TracedTo() {
    return AbstractRequirement_TracedTo.instance();
  }
  
  public AbstractRequirement_TracedTo.Matcher getAbstractRequirement_TracedTo(final ViatraQueryEngine engine) {
    return AbstractRequirement_TracedTo.Matcher.on(engine);
  }
  
  public AbstractRequirement_VerifiedBy getAbstractRequirement_VerifiedBy() {
    return AbstractRequirement_VerifiedBy.instance();
  }
  
  public AbstractRequirement_VerifiedBy.Matcher getAbstractRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return AbstractRequirement_VerifiedBy.Matcher.on(engine);
  }
  
  public Copy getCopy() {
    return Copy.instance();
  }
  
  public Copy.Matcher getCopy(final ViatraQueryEngine engine) {
    return Copy.Matcher.on(engine);
  }
  
  public Copy_sourceContext getCopy_sourceContext() {
    return Copy_sourceContext.instance();
  }
  
  public Copy_sourceContext.Matcher getCopy_sourceContext(final ViatraQueryEngine engine) {
    return Copy_sourceContext.Matcher.on(engine);
  }
  
  public Copy_sourcePropertyPath getCopy_sourcePropertyPath() {
    return Copy_sourcePropertyPath.instance();
  }
  
  public Copy_sourcePropertyPath.Matcher getCopy_sourcePropertyPath(final ViatraQueryEngine engine) {
    return Copy_sourcePropertyPath.Matcher.on(engine);
  }
  
  public Copy_targetContext getCopy_targetContext() {
    return Copy_targetContext.instance();
  }
  
  public Copy_targetContext.Matcher getCopy_targetContext(final ViatraQueryEngine engine) {
    return Copy_targetContext.Matcher.on(engine);
  }
  
  public Copy_targetPropertyPath getCopy_targetPropertyPath() {
    return Copy_targetPropertyPath.instance();
  }
  
  public Copy_targetPropertyPath.Matcher getCopy_targetPropertyPath(final ViatraQueryEngine engine) {
    return Copy_targetPropertyPath.Matcher.on(engine);
  }
  
  public DeriveReqt getDeriveReqt() {
    return DeriveReqt.instance();
  }
  
  public DeriveReqt.Matcher getDeriveReqt(final ViatraQueryEngine engine) {
    return DeriveReqt.Matcher.on(engine);
  }
  
  public DeriveReqt_sourceContext getDeriveReqt_sourceContext() {
    return DeriveReqt_sourceContext.instance();
  }
  
  public DeriveReqt_sourceContext.Matcher getDeriveReqt_sourceContext(final ViatraQueryEngine engine) {
    return DeriveReqt_sourceContext.Matcher.on(engine);
  }
  
  public DeriveReqt_sourcePropertyPath getDeriveReqt_sourcePropertyPath() {
    return DeriveReqt_sourcePropertyPath.instance();
  }
  
  public DeriveReqt_sourcePropertyPath.Matcher getDeriveReqt_sourcePropertyPath(final ViatraQueryEngine engine) {
    return DeriveReqt_sourcePropertyPath.Matcher.on(engine);
  }
  
  public DeriveReqt_targetContext getDeriveReqt_targetContext() {
    return DeriveReqt_targetContext.instance();
  }
  
  public DeriveReqt_targetContext.Matcher getDeriveReqt_targetContext(final ViatraQueryEngine engine) {
    return DeriveReqt_targetContext.Matcher.on(engine);
  }
  
  public DeriveReqt_targetPropertyPath getDeriveReqt_targetPropertyPath() {
    return DeriveReqt_targetPropertyPath.instance();
  }
  
  public DeriveReqt_targetPropertyPath.Matcher getDeriveReqt_targetPropertyPath(final ViatraQueryEngine engine) {
    return DeriveReqt_targetPropertyPath.Matcher.on(engine);
  }
  
  public Refine getRefine() {
    return Refine.instance();
  }
  
  public Refine.Matcher getRefine(final ViatraQueryEngine engine) {
    return Refine.Matcher.on(engine);
  }
  
  public Refine_sourceContext getRefine_sourceContext() {
    return Refine_sourceContext.instance();
  }
  
  public Refine_sourceContext.Matcher getRefine_sourceContext(final ViatraQueryEngine engine) {
    return Refine_sourceContext.Matcher.on(engine);
  }
  
  public Refine_sourcePropertyPath getRefine_sourcePropertyPath() {
    return Refine_sourcePropertyPath.instance();
  }
  
  public Refine_sourcePropertyPath.Matcher getRefine_sourcePropertyPath(final ViatraQueryEngine engine) {
    return Refine_sourcePropertyPath.Matcher.on(engine);
  }
  
  public Refine_targetContext getRefine_targetContext() {
    return Refine_targetContext.instance();
  }
  
  public Refine_targetContext.Matcher getRefine_targetContext(final ViatraQueryEngine engine) {
    return Refine_targetContext.Matcher.on(engine);
  }
  
  public Refine_targetPropertyPath getRefine_targetPropertyPath() {
    return Refine_targetPropertyPath.instance();
  }
  
  public Refine_targetPropertyPath.Matcher getRefine_targetPropertyPath(final ViatraQueryEngine engine) {
    return Refine_targetPropertyPath.Matcher.on(engine);
  }
  
  public Requirement getRequirement() {
    return Requirement.instance();
  }
  
  public Requirement.Matcher getRequirement(final ViatraQueryEngine engine) {
    return Requirement.Matcher.on(engine);
  }
  
  public Requirement_Derived getRequirement_Derived() {
    return Requirement_Derived.instance();
  }
  
  public Requirement_Derived.Matcher getRequirement_Derived(final ViatraQueryEngine engine) {
    return Requirement_Derived.Matcher.on(engine);
  }
  
  public Requirement_DerivedFrom getRequirement_DerivedFrom() {
    return Requirement_DerivedFrom.instance();
  }
  
  public Requirement_DerivedFrom.Matcher getRequirement_DerivedFrom(final ViatraQueryEngine engine) {
    return Requirement_DerivedFrom.Matcher.on(engine);
  }
  
  public Requirement_Id getRequirement_Id() {
    return Requirement_Id.instance();
  }
  
  public Requirement_Id.Matcher getRequirement_Id(final ViatraQueryEngine engine) {
    return Requirement_Id.Matcher.on(engine);
  }
  
  public Requirement_Master getRequirement_Master() {
    return Requirement_Master.instance();
  }
  
  public Requirement_Master.Matcher getRequirement_Master(final ViatraQueryEngine engine) {
    return Requirement_Master.Matcher.on(engine);
  }
  
  public Requirement_RefinedBy getRequirement_RefinedBy() {
    return Requirement_RefinedBy.instance();
  }
  
  public Requirement_RefinedBy.Matcher getRequirement_RefinedBy(final ViatraQueryEngine engine) {
    return Requirement_RefinedBy.Matcher.on(engine);
  }
  
  public Requirement_SatisfiedBy getRequirement_SatisfiedBy() {
    return Requirement_SatisfiedBy.instance();
  }
  
  public Requirement_SatisfiedBy.Matcher getRequirement_SatisfiedBy(final ViatraQueryEngine engine) {
    return Requirement_SatisfiedBy.Matcher.on(engine);
  }
  
  public Requirement_Text getRequirement_Text() {
    return Requirement_Text.instance();
  }
  
  public Requirement_Text.Matcher getRequirement_Text(final ViatraQueryEngine engine) {
    return Requirement_Text.Matcher.on(engine);
  }
  
  public Requirement_TracedTo getRequirement_TracedTo() {
    return Requirement_TracedTo.instance();
  }
  
  public Requirement_TracedTo.Matcher getRequirement_TracedTo(final ViatraQueryEngine engine) {
    return Requirement_TracedTo.Matcher.on(engine);
  }
  
  public Requirement_VerifiedBy getRequirement_VerifiedBy() {
    return Requirement_VerifiedBy.instance();
  }
  
  public Requirement_VerifiedBy.Matcher getRequirement_VerifiedBy(final ViatraQueryEngine engine) {
    return Requirement_VerifiedBy.Matcher.on(engine);
  }
  
  public Satisfy getSatisfy() {
    return Satisfy.instance();
  }
  
  public Satisfy.Matcher getSatisfy(final ViatraQueryEngine engine) {
    return Satisfy.Matcher.on(engine);
  }
  
  public Satisfy_sourceContext getSatisfy_sourceContext() {
    return Satisfy_sourceContext.instance();
  }
  
  public Satisfy_sourceContext.Matcher getSatisfy_sourceContext(final ViatraQueryEngine engine) {
    return Satisfy_sourceContext.Matcher.on(engine);
  }
  
  public Satisfy_sourcePropertyPath getSatisfy_sourcePropertyPath() {
    return Satisfy_sourcePropertyPath.instance();
  }
  
  public Satisfy_sourcePropertyPath.Matcher getSatisfy_sourcePropertyPath(final ViatraQueryEngine engine) {
    return Satisfy_sourcePropertyPath.Matcher.on(engine);
  }
  
  public Satisfy_targetContext getSatisfy_targetContext() {
    return Satisfy_targetContext.instance();
  }
  
  public Satisfy_targetContext.Matcher getSatisfy_targetContext(final ViatraQueryEngine engine) {
    return Satisfy_targetContext.Matcher.on(engine);
  }
  
  public Satisfy_targetPropertyPath getSatisfy_targetPropertyPath() {
    return Satisfy_targetPropertyPath.instance();
  }
  
  public Satisfy_targetPropertyPath.Matcher getSatisfy_targetPropertyPath(final ViatraQueryEngine engine) {
    return Satisfy_targetPropertyPath.Matcher.on(engine);
  }
  
  public TestCase getTestCase() {
    return TestCase.instance();
  }
  
  public TestCase.Matcher getTestCase(final ViatraQueryEngine engine) {
    return TestCase.Matcher.on(engine);
  }
  
  public Trace getTrace() {
    return Trace.instance();
  }
  
  public Trace.Matcher getTrace(final ViatraQueryEngine engine) {
    return Trace.Matcher.on(engine);
  }
  
  public Trace_sourceContext getTrace_sourceContext() {
    return Trace_sourceContext.instance();
  }
  
  public Trace_sourceContext.Matcher getTrace_sourceContext(final ViatraQueryEngine engine) {
    return Trace_sourceContext.Matcher.on(engine);
  }
  
  public Trace_sourcePropertyPath getTrace_sourcePropertyPath() {
    return Trace_sourcePropertyPath.instance();
  }
  
  public Trace_sourcePropertyPath.Matcher getTrace_sourcePropertyPath(final ViatraQueryEngine engine) {
    return Trace_sourcePropertyPath.Matcher.on(engine);
  }
  
  public Trace_targetContext getTrace_targetContext() {
    return Trace_targetContext.instance();
  }
  
  public Trace_targetContext.Matcher getTrace_targetContext(final ViatraQueryEngine engine) {
    return Trace_targetContext.Matcher.on(engine);
  }
  
  public Trace_targetPropertyPath getTrace_targetPropertyPath() {
    return Trace_targetPropertyPath.instance();
  }
  
  public Trace_targetPropertyPath.Matcher getTrace_targetPropertyPath(final ViatraQueryEngine engine) {
    return Trace_targetPropertyPath.Matcher.on(engine);
  }
  
  public Verify getVerify() {
    return Verify.instance();
  }
  
  public Verify.Matcher getVerify(final ViatraQueryEngine engine) {
    return Verify.Matcher.on(engine);
  }
  
  public Verify_sourceContext getVerify_sourceContext() {
    return Verify_sourceContext.instance();
  }
  
  public Verify_sourceContext.Matcher getVerify_sourceContext(final ViatraQueryEngine engine) {
    return Verify_sourceContext.Matcher.on(engine);
  }
  
  public Verify_sourcePropertyPath getVerify_sourcePropertyPath() {
    return Verify_sourcePropertyPath.instance();
  }
  
  public Verify_sourcePropertyPath.Matcher getVerify_sourcePropertyPath(final ViatraQueryEngine engine) {
    return Verify_sourcePropertyPath.Matcher.on(engine);
  }
  
  public Verify_targetContext getVerify_targetContext() {
    return Verify_targetContext.instance();
  }
  
  public Verify_targetContext.Matcher getVerify_targetContext(final ViatraQueryEngine engine) {
    return Verify_targetContext.Matcher.on(engine);
  }
  
  public Verify_targetPropertyPath getVerify_targetPropertyPath() {
    return Verify_targetPropertyPath.instance();
  }
  
  public Verify_targetPropertyPath.Matcher getVerify_targetPropertyPath(final ViatraQueryEngine engine) {
    return Verify_targetPropertyPath.Matcher.on(engine);
  }
  
  public Allocated getAllocated() {
    return Allocated.instance();
  }
  
  public Allocated.Matcher getAllocated(final ViatraQueryEngine engine) {
    return Allocated.Matcher.on(engine);
  }
  
  public Allocated_allocatedFrom getAllocated_allocatedFrom() {
    return Allocated_allocatedFrom.instance();
  }
  
  public Allocated_allocatedFrom.Matcher getAllocated_allocatedFrom(final ViatraQueryEngine engine) {
    return Allocated_allocatedFrom.Matcher.on(engine);
  }
  
  public Allocated_allocatedTo getAllocated_allocatedTo() {
    return Allocated_allocatedTo.instance();
  }
  
  public Allocated_allocatedTo.Matcher getAllocated_allocatedTo(final ViatraQueryEngine engine) {
    return Allocated_allocatedTo.Matcher.on(engine);
  }
  
  public FlowPort getFlowPort() {
    return FlowPort.instance();
  }
  
  public FlowPort.Matcher getFlowPort(final ViatraQueryEngine engine) {
    return FlowPort.Matcher.on(engine);
  }
  
  public FlowPort_direction getFlowPort_direction() {
    return FlowPort_direction.instance();
  }
  
  public FlowPort_direction.Matcher getFlowPort_direction(final ViatraQueryEngine engine) {
    return FlowPort_direction.Matcher.on(engine);
  }
  
  public FlowPort_isAtomic getFlowPort_isAtomic() {
    return FlowPort_isAtomic.instance();
  }
  
  public FlowPort_isAtomic.Matcher getFlowPort_isAtomic(final ViatraQueryEngine engine) {
    return FlowPort_isAtomic.Matcher.on(engine);
  }
  
  public FlowSpecification getFlowSpecification() {
    return FlowSpecification.instance();
  }
  
  public FlowSpecification.Matcher getFlowSpecification(final ViatraQueryEngine engine) {
    return FlowSpecification.Matcher.on(engine);
  }
  
  public RequirementRelated getRequirementRelated() {
    return RequirementRelated.instance();
  }
  
  public RequirementRelated.Matcher getRequirementRelated(final ViatraQueryEngine engine) {
    return RequirementRelated.Matcher.on(engine);
  }
  
  public RequirementRelated_Refines getRequirementRelated_Refines() {
    return RequirementRelated_Refines.instance();
  }
  
  public RequirementRelated_Refines.Matcher getRequirementRelated_Refines(final ViatraQueryEngine engine) {
    return RequirementRelated_Refines.Matcher.on(engine);
  }
  
  public RequirementRelated_Satisfies getRequirementRelated_Satisfies() {
    return RequirementRelated_Satisfies.instance();
  }
  
  public RequirementRelated_Satisfies.Matcher getRequirementRelated_Satisfies(final ViatraQueryEngine engine) {
    return RequirementRelated_Satisfies.Matcher.on(engine);
  }
  
  public RequirementRelated_TracedFrom getRequirementRelated_TracedFrom() {
    return RequirementRelated_TracedFrom.instance();
  }
  
  public RequirementRelated_TracedFrom.Matcher getRequirementRelated_TracedFrom(final ViatraQueryEngine engine) {
    return RequirementRelated_TracedFrom.Matcher.on(engine);
  }
  
  public RequirementRelated_Verifies getRequirementRelated_Verifies() {
    return RequirementRelated_Verifies.instance();
  }
  
  public RequirementRelated_Verifies.Matcher getRequirementRelated_Verifies(final ViatraQueryEngine engine) {
    return RequirementRelated_Verifies.Matcher.on(engine);
  }
}
