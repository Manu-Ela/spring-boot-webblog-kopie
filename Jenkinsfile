pipeline {
    agent any
    environment {
        NEXUS_HOST = 'nexus:8081'
    }
    stages {
        // stage('Compile') {
        //     steps{
        //         script{
        //             mvn.compile()
        //         }
        //     }    
        // }
        // stage('Test') {
        //     steps {
        //         script{
        //             mvn.test()
        //         }
        //     }
        //  }
        // stage('Verify') {
        //     steps {
        //         script{
        //             mvn.verify()
        //         }
        //     }
        // }
        // stage('ArtifactPackage') {
        //     steps {
        //         script{
        //             mvn.artifactpackage()
        //         }
        //     }
        // }
        stage('Deploy') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'nexus-credentials', usernameVariable: 'NEXUS_USER', passwordVariable: 'NEXUS_PASSWORD')]) {
                        mvn.deploy("NexusSettings.xml")
                    }
                }    
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
