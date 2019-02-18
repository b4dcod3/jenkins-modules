#!/usr/bin/env groovy

def call() {
  sh "terraform apply -no-color -auto-approve"
}
