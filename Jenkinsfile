pipeline {
    agent any

    stages {
        stage('Create File') {
            steps {
                sh '''
                echo "Hello from Jenkins" > myfile.txt
                '''
            }
        }
    }
}
