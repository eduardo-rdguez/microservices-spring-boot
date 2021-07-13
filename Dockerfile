FROM adoptopenjdk:11-jre-hotspot
ARG PATH_FOLDER
ARG JAR_FILE=$PATH_FOLDER/*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]