#!/usr/bin/env groovy
def call() {

    
    script {
            version = sh (
                script: "./gradlew properties -q | grep \"calculated_version:\" | awk '{print \$2}'",
                returnStdout: true
            ).trim()
            sh "echo Building project in version: ${version}"

    }
}
