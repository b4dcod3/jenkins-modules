pipeline {  
    agent none
    stages {
        stage ('Configure AWS auth') {
            agent { node 'slave1' }
                steps {
                    awsAUTH
                }
        }
        stage ('Describe Instances') {
            agent { node 'slave2' }
                steps {
                    awsCLI 'ec2 describe-instances','us-east-2'
                }
        }
    }
}  