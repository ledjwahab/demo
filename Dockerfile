FROM openjdk:24-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]