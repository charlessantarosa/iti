# API REST PASS (ITI)

Spring Boot
=========================

![Spring Boot 2.4](https://img.shields.io/badge/Spring%20Boot-2.4-brightgreen.svg)
![JDK 11](https://img.shields.io/badge/JDK-11-brightgreen.svg)
![Apache Maven](https://img.shields.io/badge/Maven-3.6.3-yellowgreen.svg)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/charlessantarosa/iti/master/LICENSE.md)

Spring Boot Application - Desenvolvimento de uma API para validação de senha fornecida pelo 
usuário. Está será submetida a politica de senha do domínio.
----

## Definições de senha

Será considerada uma senha sendo válida quando a mesma possuir as seguintes definições:

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
    - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto

----

## Instalando Maven

**Linux**
```
sudo apt-update

sudo apt install maven
```
**Windows**
 - Dowload do binário [aqui](http://mirror.downloadvn.com/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip)
```
Unzip, for example: C:\tools\

Press Windows+R, type systempropertiesadvanced, press Enter

Set environment: MAVEN_HOME = C:\tools

Add to PATH environment variable: ;%MAVEN_HOME%\bin

Close all

Call cmd, run command:

# Check version
mvn -v
```
## Clone do Projeto
```
git clone https://github.com/charlessantarosa/iti.git
```
## Inicializando a Aplicação
```
cd iti
mvn clean spring-boot:run
```
## Acessando endpoint.

[Clique aqui para acessar](http://127.0.0.1:8080/swagger-ui.html)


