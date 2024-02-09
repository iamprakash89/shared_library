 def call(String project, String imgtag, String user){
     sh """
      
      trivy image ${user}/${project}:latest >scan.txt
      cat scan.txt
     """
}
