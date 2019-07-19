# Extra materials for Code Generation

## Contents of this folder
 * `CodegenExample.mdzip` : a simple example project on which the code generator can produce valid python source code.
 * `QueryDefinitionForCodeGen` : a set of queries written in VQL that can be added to any MagicDraw project to be able to execute the python code generator.
 
## Example Model

`CodegenExample.mdzip` contains an example SysML model on which the code generator can produce valid python source code. The model contains an Opaque Behavior called `QueryDefinitionForCodeGen` where the patterns of the code generation are stored in a VIATRA Query language.

### Execute Code Generation

* Run menu "Examples" > "Generate Python code"
* Select "Example Company Asset" as the scope of the transformation in the pop-up wizard.
* Select the output folder of the code generation in the pop-up wizard.

## Prepare Custom Model for Code Generation

### Using IncQuery Desktop
* Load the "Custom Validation and Query Evaluation profile" to your model.
* Create a new `QueryDefinition` anywhere in your model and name it to `QueryDefinitionForCodeGen`.
* Copy the patterns from the file `QueryDefinitionForCodeGen` to the newly created `QueryDefinition`.

### Alternative Way
* Create a new `OpaqueBehavior` anywhere in your model and name it to `QueryDefinitionForCodeGen`.
* Copy the patterns from the file `QueryDefinitionForCodeGen` to the newly created `QueryDefinition`.
* Set the language property of the `OpaqueBehavior` to `VQL`.

## Notes
This python code generator is just a prototype implementation for demostration purposes of VIATRA transformation.
WARNING: It is NOT a certified python code generator. Modify the patterns with caution.

## Troubleshooting

- `java.lang.IllegalAccessException: [PatternName] is missing from the QueryDefinition.`
  - Create the [PatternName] to your QueryDefinition.
- `java.lang.IllegalStateException: The status of the specification can only be set for uninitialized queries.`
  - You have an error in the patterns. Try to fix your patterns.