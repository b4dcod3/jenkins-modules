pipeline {  
    agent none
    stages {
        stage ('Stage 1') {
            agent { node 'slave1' }
                steps {
                    awsCLI 'ec2 describe-instances','us-east-1'
                }
        }
        stage ('Stage 2') {
            agent { node 'slave2' }
                steps {
                    awsCLI 'ec2 describe-instances','us-east-2'
                }
        }
    }
}  