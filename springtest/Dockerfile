# Use an OpenJDK image as the base
FROM adoptopenjdk/openjdk11:alpine-jre

# Define JAR_FILE as an argument
ARG JAR_FILE=target/springtest-0.0.1-SNAPSHOT.jar

# Set the working directory
WORKDIR /opt/app

# Copy the local package files to the container's workspace
COPY ${JAR_FILE} app.jar

# Run the compiled Java application
ENTRYPOINT ["java", "-jar", "app.jar"]