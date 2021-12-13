FROM openjdk:8-jdk-slim
MAINTAINER qianze<1007819230@qq.com>
COPY target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]