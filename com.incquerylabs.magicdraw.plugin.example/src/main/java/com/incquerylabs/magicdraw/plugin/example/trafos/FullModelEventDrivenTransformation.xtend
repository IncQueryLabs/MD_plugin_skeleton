package com.incquerylabs.magicdraw.plugin.example.trafos

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import com.incquerylabs.magicdraw.plugin.example.queries.DeduciblePortType
import java.util.Map

class FullModelEventDrivenTransformation {

    /* Transformation-related extensions */
    extension EventDrivenTransformation transformation
    
    /* Transformation rule-related extensions */
    extension EventDrivenTransformationRuleFactory = new EventDrivenTransformationRuleFactory
    extension IModelManipulations manipulation

    protected ViatraQueryEngine engine
    protected EventDrivenTransformationRule<?,?> portTypeCorrectorRule = createRule.name("Port_Type_Corrector")
            .precondition(DeduciblePortType.instance)
            .action(CRUDActivationStateEnum.CREATED) [ it.port.type = it.type ]
            .addLifeCycle(Lifecycles.getDefault(true, true)).build

    private new(ViatraQueryEngine engine) {
        // Create EMF scope and EMF IncQuery engine based on the resource
        this.engine = engine
        
        createTransformation

    }
    
    private static val Map<ViatraQueryEngine, FullModelEventDrivenTransformation> projectTrafoMap = newHashMap
    
    public static def void start(ViatraQueryEngine engine) {
        if(!projectTrafoMap.containsKey(engine)) {
            val trafo = new FullModelEventDrivenTransformation(engine)
            projectTrafoMap.put(engine, trafo)
            trafo.execute
        }
    }
    
    public static def boolean isRunning(ViatraQueryEngine engine) {
        return projectTrafoMap.containsKey(engine)
    }
    
    public static def void stop(ViatraQueryEngine engine) {
        if(projectTrafoMap.containsKey(engine)) {
            val trafo = projectTrafoMap.remove(engine)
            trafo.dispose
        }
    }

    public def execute() {
        transformation.executionSchema.startUnscheduledExecution
    }

    private def createTransformation() {
        //Initialize model manipulation API
        this.manipulation = new SimpleModelManipulations(engine)
        //Initialize event-driven transformation
        transformation = EventDrivenTransformation.forEngine(engine)
            .addRule(portTypeCorrectorRule)
            .build
    }

    // Dispose model transformation
    def dispose() {
        transformation = null
        return
    }
}