# Estágio de build
FROM ubuntu:latest AS build

# Atualizar repositórios e instalar JDK e Maven
RUN apt-get update && \
    apt-get install -y openjdk-21-jdk maven

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o conteúdo do projeto para o contêiner
COPY . .

# Construir o projeto
RUN mvn clean install -Dmaven.test.skip=true

# Estágio de runtime
FROM openjdk:21-jdk-slim

# Expor a porta 8080
EXPOSE 8080

# Copiar o jar construído do estágio de build para o estágio de runtime
COPY --from=build /app/target/EncurtadorURL-0.0.1-SNAPSHOT.jar /app.jar

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]