How to use:


- Install product: Eclipse IDE for Eclipse Committers, version: Photon
- Install VIATRA SDK 2.0.0.RC2 http://download.eclipse.org/viatra/updates/milestone/latest
- install MagicDraw Eclipse integration plug-ins https://docs.nomagic.com/display/MD185/Integrating+with+Eclipse
- Clone this repo
- Synchronize Gradle project (loads tasks, and downloads dependencies from maven)
- run 'extractDependencies' task (downloads and sets up MagicDraw)
- Synchronize Gradle project again (loads MD dependencies)
- run 'runJava' task
