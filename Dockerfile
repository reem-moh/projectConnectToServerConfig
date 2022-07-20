FROM amazoncorretto:17-alpine-jdk
#COPY build/libs/project1.jar app.jar
COPY build/libs/project1-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
#ENTRYPOINT ["java","-j:ar","/app.jar"]