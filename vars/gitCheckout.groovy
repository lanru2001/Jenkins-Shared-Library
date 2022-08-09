#!/usr/bin/env groovy
def call ( String branch , String repoUrl , String repoCredentialsId ) {

   
                    
    git credentialsId: "${repoCredentialsId}" , 
    url: "${repoUrl}", 
    branch: "${branch}" 
                    
    
}  
