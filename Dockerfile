FROM openjdk:8-jdk-alpine
MAINTAINER mohammadadel
COPY target/jumia-0.0.1-SNAPSHOT.jar jumia-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jumia-0.0.1-SNAPSHOT.jar"]