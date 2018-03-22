How to use:


- Start with Eclipse Committer's Edition
- Install VIATRA SDK 2.0.0.M3 http://download.eclipse.org/viatra/updates/milestone
- install MagicDraw Eclipse integration plug-ins https://docs.nomagic.com/display/MD185/Integrating+with+Eclipse
- Clone this repo
- Synchronize Gradle project (loads tasks, and downloads dependencies from maven)
- run 'extractDependencies' task (downloads and sets up MagicDraw)
- Synchronize Gradle project again (loads MD dependencies)
- run 'runJava' task
