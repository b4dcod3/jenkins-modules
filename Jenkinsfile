pipeline {  
    agent none
    stages {
        stage ('Stage 1') {
            agent { node 'slave1' }
                steps {
                    describeEC2
                }
        }
        stage ('Stage 2') {
            agent { node 'slave2' }
                steps {
                   sayHello "Bobarino2"
                }
        }
    }
}  