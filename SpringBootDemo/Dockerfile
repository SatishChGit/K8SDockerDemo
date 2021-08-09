FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} SpringK8SDemo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/SpringK8SDemo.jar"]