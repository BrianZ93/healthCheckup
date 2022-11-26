FROM node:16-alpine as frontend

WORKDIR /react-health-dashobard

COPY ./react-health-dashboard/package.json ./

RUN npm install react@18.2.0 --legacy-peer-deps
RUN npm install -g npm@9.1.2
RUN npm install --legacy-peer-deps


COPY ./react-health-dashboard ./

ENV PORT=3000
EXPOSE 3000



