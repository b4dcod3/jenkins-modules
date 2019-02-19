#!/usr/bin/env groovy

def call(String key) {
  sh "terraform plan -no-color -out ${key}.tfplan"
}
