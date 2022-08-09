#!/usr/bin/env groovy
def call( String sonarInstance) {
            

    withSonarQubeEnv('$sonarInstance') { // Will pick the global server connection you have configured
        sh './gradlew sonarqube'
    }


}
