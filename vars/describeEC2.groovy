#!/usr/bin/env groovy

def call(String region = 'us-east-1') {
    withCredentials([[
      $class: 'AmazonWebServicesCredentialsBinding',
      credentialsId: 'aws_credentials',
      accessKeyVariable: 'AWS_ACCESS_KEY_ID',
      secretKeyVariable: 'AWS_SECRET_ACCESS_KEY'
      ]]) {             
       sh "aws ec2 describe-instances --region ${region}"
      }
  } // withCredentials
  
}
