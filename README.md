# Introduction

This project is to use SpringBoot, Spring Cloud Sleuth, Kafka and Zipkin to demonstrate how to 
visualize distributed tracing across multiple microservices with Kafka.

# How to build

Build project by `mvn clean package` 

# How to run
1. Run Kafka docker with command `docker run --rm --net=host lensesio/fast-data-dev`

2. Go to `zipkin-server` module under folder `docker`, then run `d` 