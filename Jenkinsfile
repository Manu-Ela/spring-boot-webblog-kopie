pipeline {
    agent any
    environment {
        NEXUS_HOST = 'nexus:8081'
    }
    stages {
        stage('Compile') {
            steps{
                script{
                    infincompile.compile()
                }
                sh 'cat maven.output'    
            }    
        }
        stage('unit tests') {
            steps {
                echo 'unit tests'
            }
         }
        stage('nexus upload') {
            steps {
            	echo 'nexus upload'
            }
        }
        stage('artifact package') {
            steps {
                echo 'artifact package'
            }
        }
        stage('container runs') {
            steps {
            	echo 'container runs'
            }
        }
        stage('integration tests') {
            steps {
            	echo 'integration tests'
            }
        }
        stage('container stops') {
            steps {
            	echo 'container stops'
            }
        }
    }
}