#!/usr/bin/env groovy

def call(String key) {
  sh "terraform plan -detailed-exitcode -no-color -detailed-exitcode 0 -out ${key}.tfplan"
}
