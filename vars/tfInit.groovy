#!/usr/bin/env groovy

def call(String bucket, String key, String region) {
  sh 
  """
  terraform init -no-color \
  -backend-config="bucket=${bucket}"\
  -backend-config="key=${key}"\
  -backend-config="region=${region}"
  echo "[DEBUG] terraform init complete" 
  """
}
