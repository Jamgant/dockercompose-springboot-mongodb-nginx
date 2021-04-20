# Docker Compose with Spring Boot, MongoDB, NGINX

## What you'll build
- Spring Boot application using MongoDB, NGINX and Grafana running inside Docker containers 

## What you'll need
- Docker CE

## Stack
- Docker
- Java 1.8
- Spring Boot / MongoRepository / RestController
- MongoDB with init script and some test records
- Nginx server
- Nginx exporter
- Prometheus
- Grafana
- Maven

## Run
- Run command `docker-compose up`
- Access to application controller http://localhost/user
- Access to prometheus console http://localhost:9090/targets
- Access to ngnix exporter metrics http://localhost:9113/
- Access to grafana http://localhost:3000/


