 def call(String project, String imgtag, String user){
     sh """

     
      docker rmi   ${user}/${project}:${imgtag}
      docker rmi   ${user}/${project}:latest
     """
}
