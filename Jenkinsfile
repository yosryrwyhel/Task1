pipeline{
  agent any
  tools{
    maven 'Maven'
  }
  stages{
    
    stage("build jar"){
      
      steps{
        script{
          echo 'building the application...'
          sh 'mvn package'
        }
      }
    }
    
    stage("build image"){
      
      steps{
        script{
          echo "building the docker image..."
          withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]){
            sh 'docker build -t yosryrwyhel/petclinic:1.0 .'
            sh "echo $PASS | docker login -u $USER --password-stdin"
            sh 'docker push yosryrwyhel/petclinic:1.0'
          }
        }
      }
    }
    
    stage("deploy"){
      
      steps{
        script{
          echo 'deploying the application...'
        }
      }
    }
    
  }
}
