FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-kubernetes.jar spring-boot-kubernetes.jar
ENTRYPOINT  ["java", "-jar", "/spring-boot-kubernetes.jar"]
