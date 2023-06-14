FROM eclipse-temurin:latest
VOLUME /tmp
COPY target/*.jar pico-api.jar
ENTRYPOINT ["java","-jar","/pico-api.jar"]