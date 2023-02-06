pipeline {
  agent any
  stages {
    stage('Checkout Code') {
      steps {
        cleanWs()
        git(url: 'https://github.com/Gstv-Snts/java.git', branch: 'main')
      }
    }
    stage('Build'){
      steps{
        sh 'cd lib/ ; wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.0/junit-platform-console-standalone-1.7.0-all.jar'
      }
    }
    stage('Test'){
      steps{
        ls -la
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