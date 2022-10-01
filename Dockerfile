FROM bitofcode/open-jdk-11 
COPY target/anticci-0.0.1-SNAPSHOT.jar alticci-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/alticci-server-1.0.0.jar"]
