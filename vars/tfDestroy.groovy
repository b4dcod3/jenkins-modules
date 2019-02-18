#!/usr/bin/env groovy

def call() {
  /usr/bin/terraform destroy -no-color -auto-approve
}
