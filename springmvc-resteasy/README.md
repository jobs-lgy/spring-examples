# Spring MVC and Resteasy
---

Example of using RestEasy with Spring MVC.

This project contains three module：

- springmvc-resteasy-client：web for the client user
- springmvc-resteasy-core: core classes 
- springmvc-resteasy-service: web for restful api

# System Requirements:

- Maven 3
- Tomcat

# Building the project:

```
mvn clean install
```

# Running the project and manually testing it:

Download tomcat and then copy `springmvc-resteasy-client/target/springmvc-resteasy-client.war` and `springmvc-resteasy-service/target/springmvc-resteasy-service.war` to tomcat webapp dictionary，start tomcat。

Test webservice ：http://localhost:8080/springmvc-resteasy-service/api/getUser

Test client：http://localhost:8080/springmvc-resteasy-client/index.html