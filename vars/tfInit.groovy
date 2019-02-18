#!/usr/bin/env groovy

def call(String key = 's3_key_here') {
  /usr/bin/terraform init -no-color -backend-config="${key}"
}
