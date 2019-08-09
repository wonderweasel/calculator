pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gralew complileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}