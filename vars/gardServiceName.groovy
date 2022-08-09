#!/usr/bin/env groovy
def call() {

    script {
           
          serviceName = sh (
                script: "./gradlew properties -q | grep \"archivesBaseName:\" | awk '{print \$2}'",
                returnStdout: true
          ).trim()
          sh "echo Building project in NAME: $serviceName"
          
    }  
}            
