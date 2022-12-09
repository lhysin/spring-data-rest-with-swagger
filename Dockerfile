FROM amazoncorretto:11-alpine-jdk

COPY spring-data-rest-with-swagger-*.jar spring-data-rest-with-swagger.jar

ENTRYPOINT ["java","-jar","/spring-data-rest-with-swagger.jar"]
