# Java Performance Training practical task

## Prerequisites
- JDK 11 (tested with OpenJDK)
- Maven 3
- Your favorite IDE

## Task
- Measure application performance using files with 100, 500, 5000 records
- Identify and describe application performance issues and points for performance optimization
- Optimize file uploading
- Try to implement paging for results page

## Requirements to the task results
- All performance measurement should be documented and described (any text format). Required information: hardware info (CPU, RAM), uploaded file name and size, upload time, time for displaying results
- Commit your optimizations one by one. Document each optimization - what was done and what was achieved (file name/size, times for upload and display)

## Test application

### Libraries, frameworks and db
- Spring Boot
- JPA
- HSQL in-memory
- Thymeleaf + Spring MVC

### How to build
Run `mvn clean install` from root project

### How to run
You can launch application in several ways:
- Execute `java -DLOG_DIR=<path to log directory> -jar po-survey-application.jar`
- Execute `mvn spring-boot:run` in po-survey-application project directory
- Start po-survey-application from your IDE

### How to use other database
Datasource settings are specified in application.properties file.
By default HSQL in memory mode is used for storing uploaded data.
You can change database mode or database in two ways:
- Specify your database settings in application.properties (Not very good)
- Add new properties file for spring boot profile (something like application-mydb.properties) with your settings and run application with this profile (Preffered)