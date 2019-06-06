How to use:


- Install product: Eclipse IDE for Eclipse Committers, version: latest (tested with up to 2019-06)
- Install VIATRA SDK latest (tested with up to 2.1.2) http://download.eclipse.org/viatra/updates/release/latest
- Install UML 2.5.1 metamodel: http://albert.internal.incquerylabs.com:10080/magicdraw.metamodel/
- Clone this repo
- Import the projects in it
- Right click project com.incquerylabs.magicdraw.plugin.example > "Configure" > "Add Gradle Nature"
  - (If nature is automatically recognized and added, right click project > "Gradle" > "Refresh" instead)
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
- Run menu "Examples" > "Correct all port types", it should run a transformation to add types to Ports that have no type specified, but are connected to a typed port.

## Troubleshooting

- MagicDraw does not start, saying `Unable to create the actorSystem`
  - Try to start it again
