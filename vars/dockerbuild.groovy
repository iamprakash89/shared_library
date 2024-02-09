 def call(String project, String imgtag, String user){
     sh """

      docker image build -t ${user}:${project} .
      docker iamge tag  ${user}:${project} ${user}:${project}:${imgtag}
      docker image tag  ${user}:${project} ${user}:${project}:latest
     """
}
//  // docker image build -t ${DuserUser}:${projectname} .
//  //docker image tag ${DuserUser}:${projectname} ${DuserUser}:${projectname}:latest 

// def call(String project, String ImageTag, String hubUser){
    
//      sh """
//       docker image build -t ${hubUser}/${project} . 
//       docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
//       docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
//      """
//  }
