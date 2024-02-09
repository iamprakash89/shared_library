//  def call(String project, String imgtag, String user){
//     // For Docker Hub push
//     //  sh """

//     //   docker image build -t ${user}/${project} .
//     //   docker image tag  ${user}/${project} ${user}/${project}:${imgtag}
//     //   docker image tag  ${user}/${project} ${user}/${project}:latest
//     //  """


// }

// ECR BUILD
def call(String project, String accountid, String region){
    sh """
    docker build -t ${project} .
    docker tag ${project}:latest ${accountid}.dkr.ecr.${region}.amazonaws.com/${project}:latest
    """

}