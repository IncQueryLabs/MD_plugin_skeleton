[![Build Status](https://build.incquerylabs.com/jenkins/buildStatus/icon?job=MagicDraw-OSS%2Fplugin-skeleton%2Fmaster)](https://build.incquerylabs.com/jenkins/job/MagicDraw-OSS/job/plugin-skeleton/job/master/)

## How to use:

- Install product: Eclipse IDE for Eclipse Committers, version: Photon
- Install VIATRA SDK 2.0.1 or newer http://download.eclipse.org/viatra/updates/release/latest
- Install UML 2.5.1 metamodel or newer: 
    * Check section **Install UML Metamodel to Eclipse** describing the workflow of this process 
    * Users on the internal IncQueryLabs network can use http://albert.internal.incquerylabs.com:10080/magicdraw.metamodel/
- Clone this repo
- Import the projects in it
- Right click project com.incquerylabs.magicdraw.plugin.example > Configure > Add Gradle Nature
  - This will synchronize it (loads tasks, and downloads dependencies from maven)
- run 'extractDependencies' task (downloads and sets up MagicDraw)
  - Show View: Gradle Tasks
  - In the view toolbar, click Refresh Tasks for All Projects
  - In the view menu, check Show All Tasks
  - Run com.incquerylabs.magicdraw.plugin.example > other > extractDependencies
- Right click project com.incquerylabs.magicdraw.plugin.example > Gradle > Refresh Gradle Project
  - This will synchronize it again (loads MD dependencies)
- run 'runJava' task (this will start MagicDraw)
- Create or open a project
- Run menu Example > Example Action, it should display a list of classes

## Install UML Metamodel to Eclipse 

To define and compile queries in the VQL language, VIATRA requires the UML Metamodel to be installed. Here is a generic workflow to install UML Metamodel as a _p2 repository_.

### 1 Import MagicDraw's example project to Eclipse and change the target platform
 1. Start Eclipse
 1. File > Import > Existing project into workspace > Select archive file > `$Your MagicDraw installation$/openapi/ide/eclipse.zip` > check only `MagicDraw (MagicDraw/)` > click on "Finish".
 1. In the "Package Explorer", right click on `MAGIC_DRAW_INSTALL_DIRECTORY` under the newly imported project > Select "Properties" > Click on "Edit" > Set the value to `$Your MagicDraw installation$` > Click on "Ok".
 1. Open "MagicDraw bundles.target" > Click on "Set as Active Target Platform".

### 2 Create a feature package to host a p2 repository of UML Metamodel
 1. File > New > Feature Project
	* Project Name: `com.magicdraw.uml.metamodel`
	* Feature ID: `com.magicdraw.uml.metamodel`
	* Feature Name: `UML Metamodel`
	* Feature Version: 1.0.0.*
 1. Click on "Next" to select the referenced plugins
 1. Select "com.nomagic.magicdraw.uml2" and its dependencies (check this [wiki page](https://github.com/IncQueryLabs/MD_plugin_skeleton/wiki/Dependencies-of-UML2-Plugin) for the current list)
 1. Right click on the project and select "Export" > "Deployable Feature" > "Finish"
	* Destination: Directory - Select the destination where p2 repository will be hosted `$UML p2 repository$`
	* Options: "Package as individual JAR archives" and "Generate p2 repository"

### 3 Switch back to the original target platform
 1. Window > Preferences > Plug-in Development > Target Platform > Select "Running Platform"

### 4 Install UML metamodel to Eclipse
 1. Help > Install New Software... > Add... > Local... > Select `$UML p2 repository$`
 1. Uncheck "Group items by category" to see the installable feature
 1. Check "UML Metamodel" and click on "Next" then click on "Finish"


## Troubleshooting

- MagicDraw does not start, saying `Unable to create the actorSystem`
  - Try to start it again
- Installation of the UML Metamodel fails: `Cannot complete the install because one or more required items could not be found` 
  - There are missing dependencies of "com.nomagic.magicdraw.uml2" in the feature: check this [wiki page](https://github.com/IncQueryLabs/MD_plugin_skeleton/wiki/Dependencies-of-UML2-Plugin) for the current list.
  
