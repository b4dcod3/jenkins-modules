pipeline {  
    agent none
    stages {
        stage ('Stage 1') {
            agent { node 'slave1' }
                steps {
                    echo 'Perform Stage 1 on node-one'
                }
        }
        stage ('Stage 2') {
            agent { node 'slave2' }
                steps {
                    echo 'Perform Stage 2 on node-two'
                }
        }
    }
}  