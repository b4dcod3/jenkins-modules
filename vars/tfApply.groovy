#!/usr/bin/env groovy

def call() {
  /usr/local/bin/terraform apply -no-color -auto-approve
}
