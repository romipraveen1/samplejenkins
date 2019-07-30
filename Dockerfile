FROM openjdk:8
ADD target/dockerspringapp.jar dockerspringapp.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","dockerspringapp.jar"]