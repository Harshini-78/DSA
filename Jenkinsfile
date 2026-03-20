pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                echo 'Cloning repository...'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java code...'
                bat 'javac Main.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running Java program...'
                bat 'java Main'
            }
        }
    }
}
