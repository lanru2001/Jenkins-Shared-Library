#!/usr/bin/env groovy
def call() {
    
    script {
                    
        sh './gradlew build'
        sh './gradlew docker'
        sh './gradlew version'

    }    
     
}            
