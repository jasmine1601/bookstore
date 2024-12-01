FROM mcr.microsoft.com/windows/servercore:ltsc2019

# Set the working directory
WORKDIR /app

# Copy the JAR file to the container
COPY target/'order-service-0.0.1-SNAPSHOT.jar' 'order-service-0.0.1-SNAPSHOT.jar'

# Expose the application's port
EXPOSE 8081

# Define the entry point to run the application
ENTRYPOINT ["java", "-jar", "order-service-0.0.1-SNAPSHOT.jar"]
