FROM centos:6

MAINTAINER superhao

RUN yum install -y java-1.8.0-openjdk

COPY ./target/spring-boot-in-docker-*.war /root/spring-boot-in-docker-latest.war

ENV JAVA_OPTS "-server -Xss256k"

WORKDIR /root/

EXPOSE 8080

ENTRYPOINT ["java","-jar","spring-boot-in-docker-latest.war"]
