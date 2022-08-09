#!/usr/bin/env groovy
def call( String registryUrl , String imageName , String serviceName , String version , String hostName , String infraProjectId ) {
  
    script {
        
        withCredentials([[$class: 'FileBinding', credentialsId: 'secret-service-key-infra' , variable: 'INFRA_SECRET']]) {
                
            sh " cat $INFRA_SECRET > xyz.json "
            
            sh " cat xyz.json | docker login -u _json_key --password-stdin ${registryUrl} "
            
            sh " docker tag ${imageName}/${serviceName}:${version}   ${hostName}/${infraProjectId}/${imageName}/${serviceName}:${version} "
        
            sh " docker push ${hostName}/${infraProjectId}/${imageName}/${serviceName}:${version} "

        }
    }   
            
}
