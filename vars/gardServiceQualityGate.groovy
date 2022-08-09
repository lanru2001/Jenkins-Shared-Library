#!/usr/bin/env groovy
def call(String time = "1", String unit = "MINUTES" ) {
            
           
        timeout(time: "${time}" , unit: "${MINUTES}" ) {
            // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
            // true = set pipeline to UNSTABLE, false = don't
            waitForQualityGate abortPipeline: true
        }
    

}
