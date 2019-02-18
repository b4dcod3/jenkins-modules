#!/usr/bin/env groovy

def call(String region = 'us-east-1') {
  sh "aws ec2 describe-instances --region ${region}"
}
