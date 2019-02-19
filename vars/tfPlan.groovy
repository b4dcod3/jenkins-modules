#!/usr/bin/env groovy

def call(String key) {
  sh "terraform plan -detailed-exitcode -no-color -out ${key}.tfplan"
}
