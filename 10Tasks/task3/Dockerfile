FROM openjdk:8-jdk-alpine

VOLUME /tmp

MAINTAINER bingo

ADD gs-spring-boot-docker-0.1.0.jar demo.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","demo.jar"]