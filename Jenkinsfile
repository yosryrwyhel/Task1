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
          withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: '88285416', usernameVariable: 'USER')]){
            sh 'docker build -t yosry/petclinic:lts .'
            sh "echo $PASS | docker login -u $USER --password-stdin"
            sh 'docker push yosry/petclinic:lts'
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
