// // CODE_CHANGES = getGitChanges()
// pipeline{
//   agent any
//   tools{
//     maven 'Maven'
//   }
//   stages{
    
//     stage("init"){
      
//       steps{
//         script{
//           gv = load"script.groovy"
//         }
//       }
//     }
    
//     stage("build jar"){
      
//       steps{
//         script{
//           gv.buildJar()
//         }
//       }
//     }
    
//     stage("test"){
      
//       steps{
//         script{
//           gv.test()
//         }
//       }
//     }
    
    
//     stage("build image"){
      
//       steps{
//         script{
//           gv.buildImage()
//         }
//       }
//     }
    
// //     stage("sonarqube"){
      
// //       steps{
// //         script{
// //           gv.sonarqube()
// //         }
// //       }
// //     }
    
//     stage("deploy"){
      
//       steps{
//         script{
//           gv.deployApp()
//         }
//       }
//     }
    
//   }
// }
pipeline {
    agent { docker { image 'maven:3.8.4-openjdk-11-slim' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
