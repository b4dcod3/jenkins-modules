#!/usr/bin/env groovy

def call(String aws_command, String region) {
    withCredentials([[
      $class: 'AmazonWebServicesCredentialsBinding',
      credentialsId: 'aws_credentials',
      accessKeyVariable: 'AWS_ACCESS_KEY_ID',
      secretKeyVariable: 'AWS_SECRET_ACCESS_KEY'
      ]]) {             
       sh "aws ${aws_command} --region ${region}"
      }
  
}
