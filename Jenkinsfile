pipeline {
    agent any
    environment {
        NEXUS_HOST = 'nexus:8081'
    }
    stages {
        stage('Version') {
            steps{
                script{
                    mvn.version()
                }
            }    
        }
        stage('Compile') {
            steps{
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
        stage('Deploy') {
            steps {
                /*
                script{
                    mvn.deploy()
                }
                */
                echo 'deploy'
            }
        }
/*
        stage('Deploy2Tomcat') {
            steps {
              script{
                    mvn.deploy2tomcat()
                }
                echo 'deployed to Tomcat'
            }
        }
*/
        stage('container stops') {
            steps {
            	echo 'container stops'
            }
        }
    }
}
