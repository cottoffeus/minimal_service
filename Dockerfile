FROM bellsoft/liberica-openjdk-centos:11.0.6

ADD build/libs/minimal_service.jar /app/minimal_service.jar

ENTRYPOINT java $JAVA_OPTS -jar /app/minimal_service.jar

EXPOSE 8000
