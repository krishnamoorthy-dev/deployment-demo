# Install JDK 17
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY app/deployment-demo-0.0.1-SNAPSHOT.jar deployment-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "deployment-demo.jar"]
