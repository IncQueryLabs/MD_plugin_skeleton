How to use:

There are two example projects
- com.incquerylabs.magicdraw.plugin.example
  - Viatra Based Graphical MagicDraw plugin example
- com.incquerylabs.magicdraw.plugin.example.headless
  - MagicDraw example commad line plugin

The common build logic is extracted to the com.incquerylabs.magicdraw.plugin.example.root project.

- Install product: Eclipse IDE for Eclipse Committers, version: Photon
- Install VIATRA SDK 2.0.1 http://download.eclipse.org/viatra/updates/release/latest
- Install UML 2.5.1 metamodel: http://albert.internal.incquerylabs.com:10080/magicdraw.metamodel/
- Clone this repo
- Import the projects in it
- Open Gradle Tasks View (Window > Show View > Other... > Gradle)
- Right click project com.incquerylabs.magicdraw.plugin.example.root > Gradle > Refresh Gradle Project
  - This will synchronize it (loads tasks, and downloads dependencies from maven)
- run Gradle 'extractDependencies' task on the root project (downloads and sets up MagicDraw for both example)
  - Show View: Gradle Tasks
  - In the view toolbar, click Refresh Tasks for All Projects
  - In the view menu, check Show All Tasks
  - Run com.incquerylabs.magicdraw.plugin.example.root > other > extractDependencies
- Right click project com.incquerylabs.magicdraw.plugin.example.root > Gradle > Refresh Gradle Project
  - This will synchronize it again (loads MD dependencies)
- run 'runJava' task (this will start MagicDraw)
- Create or open a project
- Run menu Example > Example Action, it should display a list of classes

## Troubleshooting

- MagicDraw does not start, saying `Unable to create the actorSystem`
  - Try to start it again

- Greadle Clean task probably won't work, because Eclipse loads the MagicDraw lib(s), and locks them.
 - Close the IDE and run Gradle Clean outside of the IDE, or clean the build folder manually