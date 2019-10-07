package com.incquerylabs.magicdraw.plugin.example.trafos

import com.incquerylabs.magicdraw.plugin.example.queries.DeduciblePortType
import java.util.Map
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.Lifecycles
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.transformation.eventdriven.EventDrivenTransformation

class FullModelEventDrivenTransformation {

    /* Transformation-related extensions */
    extension EventDrivenTransformation transformation
    
    /* Transformation rule-related extensions */
    extension EventDrivenTransformationRuleFactory = new EventDrivenTransformationRuleFactory

    protected ViatraQueryEngine engine
    protected EventDrivenTransformationRule<?,?> portTypeCorrectorRule = createRule(DeduciblePortType.instance)
    		.name("Port_Type_Corrector")
            .action(CRUDActivationStateEnum.CREATED) [ it.port.type = it.type ]
            .build

    private new(ViatraQueryEngine engine) {
        // Create EMF scope and EMF IncQuery engine based on the resource
        this.engine = engine
        
        createTransformation

    }
    
    static val Map<ViatraQueryEngine, FullModelEventDrivenTransformation> projectTrafoMap = newHashMap
    
    static def void start(ViatraQueryEngine engine) {
        if(!projectTrafoMap.containsKey(engine)) {
            val trafo = new FullModelEventDrivenTransformation(engine)
            projectTrafoMap.put(engine, trafo)
            trafo.execute
        }
    }
    
    static def boolean isRunning(ViatraQueryEngine engine) {
        return projectTrafoMap.containsKey(engine)
    }
    
    static def void stop(ViatraQueryEngine engine) {
        if(projectTrafoMap.containsKey(engine)) {
            val trafo = projectTrafoMap.remove(engine)
            trafo.dispose
        }
    }

    def execute() {
        transformation.executionSchema.startUnscheduledExecution
    }

    private def createTransformation() {
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
