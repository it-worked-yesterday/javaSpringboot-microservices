FROM openjdk:8
ADD target/myProject.jar myProjectForDocker.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","myProjectForDocker.jar"] 