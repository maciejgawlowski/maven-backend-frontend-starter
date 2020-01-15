# Maven backend - frontend starter #

## Description

Example project for quick setup and run. Spring boot backend and Angular frontend.

## Requirements

- Maven
- Java 11

## Start instructions

Build project:  
```
mvn clean package
```

Run server:  
```
mvn spring-boot:run -f backend/pom.xml -Dspring-boot.run.profiles=local
```

Open browser: 
```
http://localhost:8080
http://localhost:8080/api/aircrafts
```
