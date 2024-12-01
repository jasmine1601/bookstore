FROM mcr.microsoft.com/windows/servercore:ltsc2019

# Set the working directory
WORKDIR /app

# Copy the JAR file to the container
COPY target/'book-service-0.0.1-SNAPSHOT.jar' 'book-service-0.0.1-SNAPSHOT.jar'

# Expose the application's port
EXPOSE 8080

# Define the entry point to run the application
ENTRYPOINT ["java", "-jar", "book-service-0.0.1-SNAPSHOT.jar"]
