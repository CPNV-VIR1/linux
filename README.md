# Spring - REST API

## Description

This repository is an example of a spring api rest application whose theme is bottles, using docker microservices.
The main features are adding, retrieving and deleting bottles.

## Getting Started

### Prerequisites

List all dependencies and their version needed by the project as :

* IDE used [IntelliJ IDEA Ultimate 2023 or later](https://www.jetbrains.com/idea/download/?section=windows)
* [Docker Containers Engine v23 or later](https://www.docker.com/products/docker-desktop/)
* IDE Plugin for [Docker](https://plugins.jetbrains.com/plugin/7724-docker/versions#tabs)
* OS supported Linux

## Deployment

### On dev environment
Run docker build
```bash
docker compose up --build
```

One it was build once you can run it with (-d is for background)
```bash
docker compose up -d
```
To stop it 
```bash
docker compose stop
```

Then go on http://localhost:8080/ or use curl 
```bash
curl -i localhost:8080/bottles
```
#### Usage
Add a bottle 
```bash
curl -i -X POST localhost:8080/bottles -H "Content-type:application/json" -d "{\"name\": \"Evian\"}"
```

Show bottles
```bash
curl -i localhost:8080/bottles
```
Show specific bottle
```bash
curl -i localhost:8080/bottles/1
```
Modify specific bottle
```bash
curl -i -X PUT localhost:8080/bottles/2  -H "Content-type:application/json" -d "{\"name\": \"Samwise2\"}"
```
Delete specific bottle
```bash
curl -i -X DELETE localhost:8080/bottles/2
```

### On integration environment

Same as the dev environment in [vir1-linux.cld.education](https://vir1-linux.cld.education/bottles).

#### Usage
Add a bottle 
```bash
curl -i -X POST https://vir1-linux.cld.education/bottles -H "Content-type:application/json" -d "{\"name\": \"Sampe\"}"
```
Show bottles
```bash
curl -i https://vir1-linux.cld.education/bottles
```
Show specific bottle
```bash
curl -i https://vir1-linux.cld.education/bottles/1
```
Modify specific bottle
```bash
curl -i -X PUT https://vir1-linux.cld.education/bottles/2  -H "Content-type:application/json" -d "{\"name\": \"Samwise2\"}"
```
Delete specific bottle
```bash
curl -i -X DELETE https://vir1-linux.cld.education/bottles/2
```

## Directory structure
```shell
├── assets
│   └── wiki_images                                          //Images used in wiki
│       └── diagram.png
├── compose.yaml                                             //Docker compose
├── docs                                                     //Documentations
│   └── useCaseDiagram.wsd
├── ms-api-gateway
│   ├── Dockerfile                                           //Dockerfile
│   └── nginx.conf                                           //Nginx config
├── ms-db
│   └── Dockerfile                                           //Dockerfile
├── ms-delete
│   ├── Dockerfile                                           //Dockerfile
│   ├── mvnw                                                 //Maven
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── ch
│       │   │       └── cpnves
│       │   │           └── payroll
│       │   │               ├── Controllers                  //Controllers
│       │   │               ├── Entities                     //Entities
│       │   │               ├── PayrollApplication.java
│       │   │               └── Repositories                 //Repositories
│       │   └── resources
│       │       └── application.properties                   //Properties
│       └── test                                             //Test classes
├── ms-get
│   ├──Dockerfile                                           //Dockerfile
│   ├── mvnw                                                 //Maven
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── ch
│       │   │       └── cpnves
│       │   │           └── payroll
│       │   │               ├── Controllers                  //Controllers
│       │   │               ├── Entities                     //Entities
│       │   │               ├── PayrollApplication.java
│       │   │               └── Repositories                 //Repositories
│       │   └── resources
│       │       └── application.properties                   //Properties
│       └── test                                             //Test classes
├── ms-post
│   ├── Dockerfile                                           //Dockerfile
│   ├── mvnw                                                 //Maven
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── ch
│       │   │       └── cpnves
│       │   │           └── payroll
│       │   │               ├── Controllers                  //Controllers
│       │   │               ├── Entities                     //Entities
│       │   │               ├── PayrollApplication.java
│       │   │               └── Repositories                 //Repositories
│       │   └── resources
│       │       └── application.properties                   //Properties
│       └── test                                             //Test classes
├── ms-put
│   ├── Dockerfile                                           //Dockerfile
│   ├── mvnw                                                 //Maven
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── ch
│       │   │       └── cpnves
│       │   │           └── payroll
│       │   │               ├── Controllers                  //Controllers
│       │   │               ├── Entities                     //Entities
│       │   │               ├── PayrollApplication.java
│       │   │               └── Repositories                 //Repositories
│       │   └── resources
│       │       └── application.properties                   //Properties
│       └── test                                             //Test classes
├── README.Docker.md
└── README.md    
```
## Collaborate

* Workflow
  * This project is tiny, we are all working on the main branch.
  * [How to commit](https://www.conventionalcommits.org/en/v1.0.0/)
  * Issues are added to the [github issues page](https://github.com/CPNV-VIR1/linux/issues)

## License
[![License: CC BY 4.0](https://licensebuttons.net/l/by/4.0/80x15.png)](https://creativecommons.org/licenses/by/4.0/)

You are free to copy and redistribute the material in any medium or format for any purpose, even commercially. You can also adapt it, transform it or remit it.
You just need to give the appropriate credit.
```markdown
Example in markdown
[linux](https://github.com/CPNV-VIR1/linux)
```

## Contact

* If you need to, you can create an issue on GitHub we will try to respond as quickly as possible.
