// CODE_CHANGES = getGitChanges()
pipeline{
  agent any
  tools{
    maven 'Maven'
  }
  stages{
    
    stage("init"){
      
      steps{
        
        script{
          gv = load"script.groovy"
        }
      }
    }
    
    stage("build jar"){
      
      steps{
        script{
          gv.buildJar()
        }
      }
    }
    
    stage("test"){
      
      steps{
        script{
          gv.test()
        }
      }
    }
    
    
    stage("build image"){
      
      steps{
        script{
          gv.buildImage()
        }
      }
    }
    
//     stage("sonarqube"){
      
//       steps{
//         script{
//           gv.sonarqube()
//         }
//       }
//     }
    
    stage("deploy"){
      
      steps{
        script{
          gv.deployApp()
        }
      }
    }
    
  }
}
