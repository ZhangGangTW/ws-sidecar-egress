FROM openjdk:11

USER root
WORKDIR /app/

COPY build/libs/*.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]

#./gradlew bootBuildImage
#docker push hataketed/ws-sidecar-egress:1.0.0
