FROM openjdk:8
EXPOSE 8080
ADD target/aws-codepipeline.jar aws-codepipeline.jar
ENTRYPOINT ["java", "-jar", "/aws-codepipeline.jar"]
#okokokokok
