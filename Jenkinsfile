node{
	stage('Scm Checkout'){
         git 'https://github.com/AaftabZubair/jenkins-dockerPractice'

    }
stage('Mvn Package'){

 def mvnHome = tool name: 'maven-3', type: 'maven'
 def mvnCMD = "${mvnHome}/bin/mvn"
 sh "${mvnCMD} clean package"
    }
stage('Build Docker Image'){
 sh 'docker build -t alamdockerhub/my-app:2.0.0 .'

    }
}

