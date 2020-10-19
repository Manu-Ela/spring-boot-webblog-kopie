pipeline {
    agent any
    environment {
        NEXUS_HOST = 'nexus:8081'
    }

    stages {
        stage('Compile') {
            steps{
                echo "${WORKSPACE}"
                script{
                    mvn.compile()
                }
            }    
        }
        stage('Test') {
            steps {
                script{
                    mvn.test()
                }
            }
         }
        stage('Verify') {
            steps {
                script{
                    mvn.verify()
                }
            }
        }
        stage('ArtifactPackage') {
            steps {
                script{
                    mvn.artifactpackage()
                }
            }
        }


        stage('container stops') {
            steps {
            	echo 'container stops'
            }
        }
    }
}
