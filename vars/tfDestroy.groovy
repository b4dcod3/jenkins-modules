#!/usr/bin/env groovy

def call() {
  /usr/local/bin/terraform destroy -no-color -auto-approve
}
