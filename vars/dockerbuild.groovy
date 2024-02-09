def call(String projectname, String Imgname, String DuserUser){
    sh """
     docker image build -t ${DuserUser}:${projectname} .
    """
}
 //docker image tag ${DuserUser}:${projectname} ${DuserUser}:${projectname}:latest 