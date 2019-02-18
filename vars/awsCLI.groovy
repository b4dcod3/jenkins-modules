#!/usr/bin/env groovy

def call(String region = 'us-east-1', String aws_command = 'ec2 describe-instances') {
    withCredentials([[
      $class: 'AmazonWebServicesCredentialsBinding',
      credentialsId: 'aws_credentials',
      accessKeyVariable: 'AWS_ACCESS_KEY_ID',
      secretKeyVariable: 'AWS_SECRET_ACCESS_KEY'
      ]]) {             
       sh "aws ${aws_command} --region ${region}"
      }
  
}
