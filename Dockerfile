FROM public.ecr.aws/docker/library/eclipse-temurin:21-jre-ubi9-minimal
COPY target/*.jar /opt/app/japp.jar
CMD ["java", "-jar", "/opt/app/japp.jar"]
