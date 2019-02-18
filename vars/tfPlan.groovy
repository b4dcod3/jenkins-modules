#!/usr/bin/env groovy

def call() {
  sh "terraform plan -no-color"
}
