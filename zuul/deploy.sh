#!/usr/bin/env bash
kubectl delete -n default deployment gateway
kubectl delete -n default service gateway
kubectl apply -f deploy.yml
