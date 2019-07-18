package com.incquerylabs.magicdraw.plugin.example.trafos

import com.incquerylabs.magicdraw.plugin.example.queries.DeduciblePortType
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements

class FullModelBatchTransformation {

    /* Transformation-related extensions */
    extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    
    /* Transformation rule-related extensions */
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory

    protected ViatraQueryEngine engine
    
    /** VIATRA Query Pattern Group */
    val extension DeduciblePortType deduciblePortType = DeduciblePortType.instance
    
    /** Rules */
    val portTypeCorrectorRule = createRule(deduciblePortType).action[ it.port.type = it.type ].build

    new(ViatraQueryEngine engine) {
        this.engine = engine
        createTransformation
    }

    def execute() {
    	// Fire the defined rules here
    	portTypeCorrectorRule.fireAllCurrent
    }

    private def createTransformation() {
        //Create VIATRA Batch transformation
        transformation = BatchTransformation.forEngine(engine).build
        //Initialize batch transformation statements
        statements = transformation.transformationStatements
    }
    

    def dispose() {
        transformation = null
        return
    }
}
