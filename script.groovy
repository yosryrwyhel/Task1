def buildJar() {
  echo 'building the application...'
  sh 'mvn package'
//   sh 'docker package'
}

def test() {
  echo 'testing the application...'
}

def sonarqube() {
  echo 'testing the application...'
  withSonarQubeEnv(installationName: 'sq1'){
    sh './mvnw clean sonar:sonar'
  }
}

def buildImage() {
  echo "building the docker image..."
  withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]){
     sh 'docker build -t yosryrwyhel/petclinic:jma-1.0 .'
     sh "echo $PASS | docker login -u $USER --password-stdin"
     sh 'docker push yosryrwyhel/petclinic:jma-1.0'
  }
}

def deployApp() {
  echo 'deploying the application...'
}

return this
