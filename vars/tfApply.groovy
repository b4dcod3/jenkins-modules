#!/usr/bin/env groovy

def call() {
  /usr/bin/terraform apply -no-color -auto-approve
}
