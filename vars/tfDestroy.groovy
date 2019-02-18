#!/usr/bin/env groovy

def call() {
 sh  "terraform destroy -no-color -auto-approve"
}
