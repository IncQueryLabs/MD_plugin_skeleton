How to use:


- Install product: Eclipse IDE for Eclipse Committers, version: Photon
- Install VIATRA SDK 2.0.0.RC2 http://download.eclipse.org/viatra/updates/milestone/latest
- install MagicDraw Eclipse integration plug-ins https://docs.nomagic.com/display/MD185/Integrating+with+Eclipse
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

## Troubleshooting

- MagicDraw does not start, saying `Unable to create the actorSystem`
  - Try to start it again