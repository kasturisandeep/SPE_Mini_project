FROM openjdk:17
COPY target/Mini-Project-1.0.jar ./
WORKDIR ./
CMD ["java", "-cp", "Mini-Project-1.0.jar","Calculator"]