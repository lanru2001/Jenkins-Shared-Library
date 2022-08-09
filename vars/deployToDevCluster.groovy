#!/usr/bin/env groovy
def call( String devCluster, String devClusterZone , String nameSpace , String helmPath , String helmChart , String helmRelease ,  String imageName , String serviceName , String version , String hostName , String infraProjectId , String devProjectId ) {

            
      
            
        script {
        
            withCredentials([[$class: 'FileBinding', credentialsId: 'dev-secret-file-id', variable: 'DEV_SECRET']]) {
                
                sh " gcloud projects list "
                sh " gcloud  config set project ${devProjectId} "
                sh " gcloud container clusters get-credentials ${devCluster} --zone ${devClusterZone} --project ${devProjectId} "
                sh " kubectl get all -n ${nameSpace} "
                sh " helm version "
                //sh " cd  ${helmPath}   && helm install --namespace ${nameSpace}   ${helmChart}    ${helmRelease}  "
                sh " cd ${helmPath}   &&  helm upgrade --namespace ${nameSpace}   -f  utm-service-app/values.yaml  --set image.repository=${hostName}/${infraProjectId}/${imageName}/${serviceName}  --set image.tag=${version}   --install ${helmChart}  ${helmRelease} "
                                

            }
        
        }
   

}
