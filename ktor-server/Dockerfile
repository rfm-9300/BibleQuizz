FROM gradle:7-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle buildFatJar --no-daemon

FROM openjdk:11
EXPOSE 8080:8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/rfm.ktor-server.jar
COPY .env /app/.env
# Run the Ktor application
ENTRYPOINT ["java", "-jar", "/app/rfm.ktor-server.jar"]