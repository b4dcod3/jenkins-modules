#!/usr/bin/env groovy

def call(String aws_command, String region) {            
     sh "aws ${aws_command} --region ${region}"
}
