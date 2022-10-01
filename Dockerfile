FROM openjdk:8-jdk-alpine 
COPY target/anticci-0.0.1-SNAPSHOT.jar 
message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","target/anticci-0.0.1-SNAPSHOT.jar"]
