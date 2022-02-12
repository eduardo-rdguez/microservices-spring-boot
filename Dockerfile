FROM gradle:7.1-jdk8-hotspot AS build

ARG PATH_FOLDER
COPY --chown=gradle:gradle $PATH_FOLDER /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle build --no-daemon

FROM openjdk:8-jdk-alpine AS app

WORKDIR /app

USER nobody:nobody

COPY --from=build --chown=nobody:nobody /home/gradle/src/build/libs/*jar /app/spring-boot-application.jar

ENTRYPOINT ["java", "-jar", "/app/spring-boot-application.jar"]