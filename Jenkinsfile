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
        
        stage('Deploy to nexus') {
            steps {
                script{
                    mvn.deploy()
                }
            }
        }

        stage('TomcatTest') {
            
            steps {
                echo 'deployed to Tomcat'
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
