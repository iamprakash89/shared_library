// def call(String project, String Imgname, String DuserUser){
//     sh """

//      docker image build -t ${DuserUser}:${project} .
//     """
// }
//  // docker image build -t ${DuserUser}:${projectname} .
//  //docker image tag ${DuserUser}:${projectname} ${DuserUser}:${projectname}:latest 

def call(String project, String ImageTag, String hubUser){
    
     sh """
      docker image build -t ${hubUser}/${project} . 
      docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
      docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
     """
 }
