def call(){
    withSonarQubeEnv(credentialsId: 'sonarqube') {
       sh 'mvn clean package sonar:sonar'
    }
}