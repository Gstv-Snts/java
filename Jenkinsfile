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
        sh 'ls -la'
        sh 'cd lib ; ls -la'
        sh 'javac -cp "lib/junit-platform-console-standalone-1.7.0-all.jar" CarTest.java Car.java App.java'
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