# Install JDK 17
FROM --platform=linux/amd64 eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Copy the jar file from project and paste it to inside of the container
COPY app/deployment-demo-0.0.1-SNAPSHOT.jar deployment-demo.jar
#  Jar will be executed when container start
ENTRYPOINT ["java", "-jar", "deployment-demo.jar"]