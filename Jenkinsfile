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
          sh 'maven package'
        }
      }
    }
    
    stage("build image"){
      
      steps{
        script{
          echo 'building the application...'
          withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: '88285416', usernameVariable: 'USER')]){
            sh 'docker build -t yosry/demo-app:jma-2.0 .'
            sh 'echo $PASS | docker login -u $USER --password-stdin'
            sh 'docker push yosry/demo-app:jma-2.0'
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
