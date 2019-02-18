pipeline {  
    agent none
    stages {
        stage ('Stage 1') {
            agent { node 'slave1' }
                steps {
                    awsCLI 'us-east-1','ec2 describe-instances' 
                }
        }
        stage ('Stage 2') {
            agent { node 'slave2' }
                steps {
                    awsCLI 'us-east-2','ec2 describe-instances'
                }
        }
    }
}  