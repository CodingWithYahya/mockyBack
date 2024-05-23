# stage 1 - Build With Maven

FROM adoptopenjdk/openjdk11:alpine as builder
# FROM openjdk:11-jdk-slim as builder

# Install Maven
RUN apk add --no-cache curl tar bash
RUN mkdir -p /usr/share/maven /usr/share/maven/ref \
  && curl -fsSL -o /tmp/apache-maven.tar.gz https://archive.apache.org/dist/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz \
  && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
  && rm -f /tmp/apache-maven.tar.gz \
  && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn


WORKDIR /app
COPY ./pom.xml .
COPY ./src ./src
RUN mvn clean package
# RUN ./mvnw clean package -DskipTests

# stage 2 - Create The Final Image

# FROM openjdk11:alpine

# FROM openjdk:11-jre-slim
FROM adoptopenjdk/openjdk11:alpine
WORKDIR /app
# ARG JAR_FILE = target/*.jar
# COPY ${JAR_FILE} app.jar
COPY --from=builder /app/target/*.jar app.jar
# ENTRYPOINT ["java", "-jar", "/app.jar"]
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
