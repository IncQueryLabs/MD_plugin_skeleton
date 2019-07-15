// Tell Jenkins how to build projects from this repository
pipeline {
	
	agent {
		label 'magicdraw19'
	}
	
	// Keep only the last 5 builds
	options {
		buildDiscarder(logRotator(numToKeepStr: '5'))
	}
	
	tools { 
		jdk 'Oracle JDK 8' 
	}

	stages { 
		stage('Build Plug-in') { 
			steps {
				sh '''
				    cd com.incquerylabs.magicdraw.plugin.example
				    rm -rf build/dependency-cache
				    ./gradlew clean
				    ./gradlew build assemble
				'''
			}
		}

		stage('Run Plugin Tests') {
			steps {
				wrap([$class: 'Xvnc']) {
					sh "./com.incquerylabs.magicdraw.plugin.example/gradlew clean runTest -p com.incquerylabs.magicdraw.plugin.example"
				}
			}
		}
	}

	post {
		always {
			archiveArtifacts artifacts: 'com.incquerylabs.magicdraw.plugin.example/build/distributions/com.incquerylabs.magicdraw.plugin.example-*.zip', onlyIfSuccessful: true
			junit allowEmptyResults: true, testResults: 'com.incquerylabs.magicdraw.plugin.example/build/install/target/*.xml'
		}
	}
}
