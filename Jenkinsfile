pipeline {  
    agent none
    stages {
        stage ('Stage 1') {
            agent { node 'node-one' }
                steps {
                    echo 'Perform Stage 1 on node-one'
                }
        }
        stage ('Stage 2') {
            agent { node 'node-two' }
                steps {
                    echo 'Perform Stage 2 on node-two'
                }
        }
    }
}  