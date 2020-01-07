FROM openjdk:8
ADD /var/lib/jenkins/workspace/docker-spring-boot-j/docker-spring-boot/target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]
