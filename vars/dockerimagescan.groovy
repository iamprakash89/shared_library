 def call(String project, String imgtag, String user){
     sh """
      
      trivy image ${user}/${project} ${user}/${project}:latest >scan.txt
      cat scan.txt
     """
}
