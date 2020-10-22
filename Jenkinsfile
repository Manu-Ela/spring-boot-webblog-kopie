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
        // stage('Deploy') {
        //     steps {
        //         script {
        //             withCredentials([usernamePassword(credentialsId: 'nexus-credentials', usernameVariable: 'NEXUS_USER', passwordVariable: 'NEXUS_PASSWORD')]) {
        //                 mvn.deploy("")
        //             }
        //         }    
        //     }
        // }
        stage('deploy to Tomcat') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'tomcat', usernameVariable: 'TOMCAT_USER', passwordVariable: 'TOMCAT_PASSWORD')]) {
                    configFileProvider([configFile(fileId: 'default', variable: 'MAVEN_GLOBAL_SETTINGS')]) {
                        sh 'mvn -gs $MAVEN_GLOBAL_SETTINGS tomcat7:redeploy -DskipTests'
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
