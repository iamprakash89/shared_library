//  def call(String project, String imgtag, String user){
//         withCredentials([usernamePassword(
//             credentialsId: "docker",
//             usernameVariable: "USER",
//             passwordVariable: "PASS"
//     )]) {
//         sh "docker login -u '$USER' -p '$PASS'"
//     }
//     sh "docker image push ${user}/${project}:${imgtag}"
//     sh "docker image push ${user}/${project}:latest"   
// }

def call(String project, String accountid, String region){
    sh """
       aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${accountid}.dkr.ecr.${region}.amazonaws.com
       docker push ${accountid}.dkr.ecr.${region}.amazonaws.com/${project}:latest
    """
}