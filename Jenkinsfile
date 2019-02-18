pipeline {  
    agent none
    stages {
        stage ('Configure AWS auth') {
            agent { node 'slave1' }
                steps {
                    awsAUTH 'us-east-1'
                }
        }
        stage ('Describe Instances') {
            agent { node 'slave1' }
                steps {
                    awsCLI 'ec2 describe-instances','us-east-2'
                }
        }
    }
}  