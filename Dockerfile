FROM openjdk:8-alpine AS build
WORKDIR /app
COPY . . 

FROM openjdk:8-alpine
WORKDIR /app
COPY --from=build /app/target/com.conygre.spring.boot-1.0-SNAPSHOT.jar .
CMD ["java", "-jar", "/app/com.conygre.spring.boot-1.0-SNAPSHOT.jar"]
