# Frontend Container Setup
FROM node:16.14-alpine as frontend

WORKDIR /react-health-dashboard

COPY ./react-health-dashboard/package.json ./
COPY ./react-health-dashboard/package-lock.json ./

RUN npm install -g npm@9.1.2
RUN npm install --legacy-peer-deps
RUN npm install react@18.2.0 --legacy-peer-deps

COPY ./react-health-dashboard ./

ENV PORT=3000
EXPOSE 3000

# Backend Container Setup
# TODO - Get active reload to work with spring boot in a docker container and get it to host on 3001 instead of 8080

FROM openjdk:19-jdk-alpine as backend
ARG JAR_FILE=backendapi/target/*.jar
COPY ${JAR_FILE} target/backendapi-0.0.1-SNAPSHOT.jar
EXPOSE 3001