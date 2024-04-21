# Spring Boot app in Container

This demo shows how to build Spring Boot application with Maven and Docker.

## Quick Start

```shell
# Build executable JAR with Maven
mvn package -B -ntp -DskipTests

# Build Container image with Docker
docker built -t springboot-demo:v1 .

# Run Container
docker run --rm -d --name demoapp -p 8080:8080 springboot-demo:v1
```
