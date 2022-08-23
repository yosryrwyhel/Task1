FROM java:8-jdk-alpine
COPY ./target/spring-petclinic-2.2.0.BUILD-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-petclinic-2.2.0.BUILD-SNAPSHOT.jar"]

