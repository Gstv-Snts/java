pipeline {
  agent any
  stages {
    stage('Checkout Code') {
      steps {
        cleanWs()
        git(url: 'https://github.com/Gstv-Snts/java.git', branch: 'main')
      }
    }

    stage('ls') {
      steps {
        sh 'ls -la'
      }
    }
    stage('Build'){
      steps{
        sh 'javac -cp "/lib/junit-4.13.2.jar" ./warmup1/tests/Diff21Test.java'
      }
    }
    stage('Test'){
      steps{
        sh 'java -jar /lib/junit-4.13.2.jar -cp "warmup1/tests/" --scan-classpath --reports-dir="reports"'
      }
    }
    stage('Deploy'){
      steps{
        sh 'ls -la'
      }
    }
  }
}