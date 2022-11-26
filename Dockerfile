FROM node:16-alpine as frontend

WORKDIR /frontend
COPY ./react-health-dashboard/package.json ./
RUN npm install --legacy-peer-deps
COPY ./react-health-dashboard ./

EXPOSE 3000



