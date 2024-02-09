 def call(String project, String imgtag, String user){
     sh """

      docker image build -t ${user}/${project} .
      docker image tag  ${user}/${project} ${user}/${project}:${imgtag}
      docker image tag  ${user}/${project} ${user}/${project}:latest
     """
}
