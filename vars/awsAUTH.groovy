#!/usr/bin/env groovy

def call() {
    withCredentials([[
      $class: 'AmazonWebServicesCredentialsBinding',
      credentialsId: 'aws_credentials',
      accessKeyVariable: 'AWS_ACCESS_KEY_ID',
      secretKeyVariable: 'AWS_SECRET_ACCESS_KEY'
      ]]) {             
       sh 
       """
       aws configure set aws_access_key_id `echo \${AWS_ACCESS_KEY_ID}`
       aws configure set aws_secret_access_key `echo \${AWS_SECRET_ACCESS_KEY}`
       ""
      }
  
}
