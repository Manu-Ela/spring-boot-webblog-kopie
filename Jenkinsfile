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
        stage('Deploy to nexus') {
            steps {
                script{
                    configFileProvider([configFile(fileId: 'default', variable: 'MAVEN_GLOBAL_SETTINGS')]){
                        mvn.deploy()
                    }
                }
            }
        }

        stage('TomcatTest') {
            
            steps {
                echo 'deployed to Tomcat'
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
