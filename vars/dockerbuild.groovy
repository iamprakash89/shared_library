def call(String projectname, String Imgname, String DuserUser){
    sh """
     docker image build -t ${DuserUser}:${projectname} .
     echo "img tag ${DuserUser}:${projectname} ${DuserUser}:${projectname}:${Imgname}"
     docker image tag ${DuserUser}:${projectname} ${DuserUser}:${projectname}:${Imgname}
     echo "tagging ${DuserUser}:${projectname} ${DuserUser}:${projectname}:latest"
    
    """
}
 //docker image tag ${DuserUser}:${projectname} ${DuserUser}:${projectname}:latest 