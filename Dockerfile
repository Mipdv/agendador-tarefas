FROM eclipse-temurin:21-jdk-alpine as build

WORKDIR /app

COPY . .

RUN ./gradlew build -x test --no-daemon

FROM eclipse-temurin:21-jdk-alpine

COPY --from=build /app/build/libs/agendador-tarefas-0.0.1-SNAPSHOT.jar /app/agendador-tarefas.jar

EXPOSE 8081

CMD ["java","-jar", "/app/agendador-tarefas.jar"]
