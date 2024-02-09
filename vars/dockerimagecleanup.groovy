//  def call(String project, String imgtag, String user){
//      sh """

     
//       docker rmi   ${user}/${project}:${imgtag}
//       docker rmi   ${user}/${project}:latest
//      """
// }

def call(String project, String accountid, String region){
    sh """
    docker rmi ${project}:latest ${accountid}.dkr.ecr.${region}.amazonaws.com/${project}:latest
    """
}