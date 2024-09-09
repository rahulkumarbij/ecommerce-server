# FROM maven:3.8.5-openjdk-17 AS build
# COPY ..
# RUN mvn clean package -DskipTests

# FROM openjdk-17.0.1-jdk-slim
# COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","demo.jar"]

# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper files (optional but recommended for Maven builds)
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Download the Maven dependencies (needed for building the project)
RUN ./mvnw dependency:go-offline

# Copy the rest of the project source code
COPY src ./src

# Package the application (creates a JAR file)
RUN ./mvnw clean package -DskipTests

# Expose the port the app will run on
EXPOSE 8080

# Run the JAR file (use the generated jar in the target folder)
CMD ["java", "-jar", "target/ecommerce-youtube-0.0.1-SNAPSHOT.jar"]
