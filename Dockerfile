FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/${JAR_FILE} task.jar
ENTRYPOINT ["java", "-jar","/task.jar"]
