FROM maven

# ENV MONGO_DB_USERNAME=admin\
#     MONGO_DB_PWD=password

EXPOSE 8080

COPY ./target/task1-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java","-jar","task1-1.0-SNAPSHOT.jar"]
