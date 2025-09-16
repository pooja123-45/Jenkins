pipeline {
    agent { label 'webserver' } 
    stages {
        stage('pull') {
            steps {
                echo "we are pulling from github"
                git branch: '', url: 'https://github.com/pooja123-45/Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                echo "we are building webserver in this stage"
                sh '''mkdir build
                mkdir webdirec
                '''
            }
        }
        stage('Test') {
            steps {
                //
                echo "we are testing in this stage from sonarqube server"
            }
        }
        stage('Deploy') {
            steps {
                //
                echo "we are deploying in this stage" 
            }
        }
    }
}
