FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD build/libs/spring-kotlin-session.jar spring-kotlin-session.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-kotlin-session.jar"]