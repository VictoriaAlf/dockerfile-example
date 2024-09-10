# Use an official OpenJDK image as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project files into the container
COPY ./pom.xml ./pom.xml

# Copy the source code into the container
COPY ./src ./src

# Package the application using Maven
RUN apt-get update && \
    apt-get install -y maven && \
    mvn clean package

# Set the entry point to the Java jar
CMD ["java", "-jar", "target/my-app.jar"]

# Expose the port the application runs on
EXPOSE 8080
