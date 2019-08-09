pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew complileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
    }
}