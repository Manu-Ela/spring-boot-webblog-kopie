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
                        mvn.deploy("settings.xml")
                    }
                }    
            }
        }
        // stage('deploy to Tomcat') {
        //     steps {
        //         withCredentials([usernamePassword(credentialsId: 'tomcat', usernameVariable: 'TOMCAT_USER', passwordVariable: 'TOMCAT_PASSWORD')]) {
        //             sh 'mvn -s settings.xml tomcat7:redeploy -Dmaven.test.skip=true'
        //         }
        //     }
        // }
    }
}
