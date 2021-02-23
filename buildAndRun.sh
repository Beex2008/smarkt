#!/bin/sh
mvn clean package && docker build -t de.hsb.app/smarkt .
docker rm -f smarkt || true && docker run -d -p 8080:8080 -p 4848:4848 --name smarkt de.hsb.app/smarkt 
