#!/usr/bin/env bash
mvn clean
mvn install -Dmaven.test.skip=true
docker build -t ruanxingke/gateway .
docker push ruanxingke/gateway
