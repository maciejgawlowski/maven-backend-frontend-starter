@echo off
set arg1=%1
set JAVA_HOME=C:\Software\OpenJDK 11\
set PATH=C:\java\bin;%PATH%

IF "%arg1%"=="build:backend" (
@echo Build is running
mvn -f backend/pom.xml clean package
)

IF "%arg1%"=="build:frontend" (
@echo Build is running
mvn -f frontend/pom.xml clean package
)

IF "%arg1%"=="build" (
@echo Build is running
mvn clean package
)

IF "%arg1%"=="run" (
@echo Starting server
mvn spring-boot:run -f backend/pom.xml -Dspring-boot.run.profiles=local
)

IF "%arg1%"=="run:frontend" (
@echo Build is running
npm start --prefix frontend
)
