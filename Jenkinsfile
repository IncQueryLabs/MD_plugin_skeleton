// Tell Jenkins how to build projects from this repository
pipeline {
	
	agent {
		label 'magicdraw19'
	}

	parameters {
		booleanParam( 
			defaultValue: false,
			description: 'Flag to opt-in code generation.',
			name: 'CODE_GEN' 
		)

		string(	
			defaultValue: '../../resources/Python_Codegen_Example.mdzip',
			description: 'Relative or absolute path of the MD Project, wich will be the input of the code generation.',
			name: 'INPUT_PROJECT'
		)

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
					sh "./com.incquerylabs.magicdraw.plugin.example/gradlew runTest -p com.incquerylabs.magicdraw.plugin.example"
				}
			}
		}

		stage('Run Python Code Generation'){
			when {
				expression {
					params.CODE_GEN
				}
			}
			steps {
				wrap([$class: 'Xvnc']) {
					sh "./com.incquerylabs.magicdraw.plugin.example/gradlew -PcodeGenInput='${params.INPUT_PROJECT}' runCodeGen -p com.incquerylabs.magicdraw.plugin.example"
				}
				archiveArtifacts allowEmptyArchive: true, artifacts: 'com.incquerylabs.magicdraw.plugin.example/build/install/target/*.zip', onlyIfSuccessful: true
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
