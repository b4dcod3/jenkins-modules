#!/usr/bin/env groovy

def call() {
  sh "terraform plan -detailed-exitcode -no-color"
}
