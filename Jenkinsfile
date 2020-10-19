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
        stage('deploy to Tomcat') {
            steps {
                configFileProvider([configFile(fileId: 'default', variable: 'MAVEN_GLOBAL_SETTINGS')]) {
                    sh 'mvn -gs $MAVEN_GLOBAL_SETTINGS tomcat7:deploy'
                }
            }
        }

        stage('TomcatTest') {
            steps {
                configFileProvider([configFile(fileId: 'default', variable: 'MAVEN_GLOBAL_SETTINGS')]){
                    script{
                        mvn.tomcat()
                        echo 'deployed to Tomcat'
                    }
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
