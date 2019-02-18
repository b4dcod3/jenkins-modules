#!/usr/bin/env groovy

def call(String region) {
    withCredentials([[
      $class: 'AmazonWebServicesCredentialsBinding',
      credentialsId: 'aws_credentials',
      accessKeyVariable: 'AWS_ACCESS_KEY_ID',
      secretKeyVariable: 'AWS_SECRET_ACCESS_KEY'
      ]]) {             
      sh"""
      aws configure set aws_access_key_id ${AWS_ACCESS_KEY_ID}
      aws configure set aws_secret_access_key ${AWS_SECRET_ACCESS_KEY}
      """
      }
  
}
