FROM openjdk:17
COPY target/Sci_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar  ./
WORKDIR ./
CMD ["java", "-jar", "Sci_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]