FROM openjdk:8u212-jdk-alpine3.9
RUN apk --no-cache add curl fontconfig ttf-dejavu && fc-cache --force
COPY demo.jar /demo.jar
CMD java -jar /demo.jar