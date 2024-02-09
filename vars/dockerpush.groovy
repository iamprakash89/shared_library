 def call(String project, String imgtag, String user){
        withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    sh "docker image push ${user}/${project}:${imgtag}"
    sh "docker image push ${user}/${project}:latest"   
}
