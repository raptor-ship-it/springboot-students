FROM maven:3.6.3-jdk-14 AS build
MAINTAINER Kuldip Bajwa
WORKDIR springboot
COPY src /springboot/src
COPY pom.xml /springboot/pom.xml
RUN ["mvn", "clean", "package"]

FROM adoptopenjdk/openjdk13
MAINTAINER Kuldip Bajwa
COPY --from=build /springboot/target/springboot-students-0.0.1-SNAPSHOT.jar students.jar
EXPOSE 8090
CMD ["java", "-jar" , "students.jar"]