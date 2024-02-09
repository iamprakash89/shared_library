def call(String project, String Imgname, String DuserUser){
    sh """

     docker image build -t ${DuserUser}:${project} -t ${DuserUser}:${project}:latest .
    """
}
 // docker image build -t ${DuserUser}:${projectname} .
 //docker image tag ${DuserUser}:${projectname} ${DuserUser}:${projectname}:latest 