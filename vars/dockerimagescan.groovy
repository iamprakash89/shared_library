 def call(String project, String accountid, String region){
     sh """
      echo "${project}:latest ${accountid}.dkr.ecr.${region}.amazonaws.com/${project}:latest"
    
      
     """
}

//  trivy image ${project}:latest ${accountid}.dkr.ecr.${region}.amazonaws.com/${project}:latest >scan.txt
// cat scan.txt