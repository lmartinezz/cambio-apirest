FROM openjdk:13
VOLUME /tmp
ADD ./target/springboot-servicio-apirest-0.0.1-SNAPSHOT.jar servicio-apirest.jar
ENTRYPOINT ["java","-jar","/servicio-apirest.jar"]