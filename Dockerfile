FROM openjdk:8
EXPOSE 8080
ADD target/aws-docker.jar aws-docker.jar
ENTRYPOINT ["java","-jar","aws-docker.jar"]