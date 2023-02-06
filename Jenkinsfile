pipeline {
  agent any
  stages {
    stage('Checkout Code') {
      steps {
        git(url: 'https://github.com/Gstv-Snts/java.git', branch: 'main')
      }
    }

    stage('Test') {
      steps {
        sh 'java -jar /lib/junit-4.13.2.jar -cp "warmup1/tests/" --scan-classpath --reports-dir="reports"'
      }
    }

  }
}