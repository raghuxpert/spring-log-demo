FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} logapp.jar
ENTRYPOINT ["java","-jar","/logapp.jar"]