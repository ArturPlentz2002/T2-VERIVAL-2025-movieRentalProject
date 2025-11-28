# Estágio 1: BUILD - AGORA NOMEADO CORRETAMENTE COMO 'builder'
FROM eclipse-temurin:11-jdk-focal AS builder 

ENV BUILD /build
RUN mkdir $BUILD

COPY src $BUILD/src
COPY build.gradle $BUILD
COPY settings.gradle $BUILD

WORKDIR $BUILD
# Incluindo o gradlew e permissão de execução
COPY gradlew $BUILD
COPY gradle /build/gradle
RUN chmod +x gradlew

# Executa o build
RUN ./gradlew build --no-daemon

# Estágio 2: RUNTIME
FROM eclipse-temurin:11-jre-focal

ENV APP /app
RUN mkdir $APP
WORKDIR $APP

# COPIA CORRETA AGORA REFERENCIA O ESTÁGIO NOMEADO 'builder'
COPY --from=builder /build/build/libs/rental-1.0.jar .

ENTRYPOINT ["java", "-jar", "rental-1.0.jar"]

EXPOSE 8080
