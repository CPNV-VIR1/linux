# Spring - REST API

## Description

This repository is an example of an api rest spring application.

## Getting Started

### Prerequisites

List all dependencies and their version needed by the project as :

* IDE used PhpStorm 2023.3 or Webstorm 2023.3
* Containers Engine v23 or later
* OS supported linux

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

### Usage
Add a bottle 
```bash
curl -i -X POST localhost:8080/bottles -H "Content-type:application/json" -d "{\"name\": \"Evian\"}"
```

Show bottles
```bash
curl -i localhost:8080/bottles
```


## Directory structure
```shell
├── compose.yaml                                             //Docker compose 
├── Dockerfile                                               //Dockerfile
├── docs                                                     //Documentation
│   └── useCaseDiagram.wsd      
├── mvnw                                                     //Maven
├── mvnw.cmd                                                      
├── nginx.conf                                               //Nginx config
├── pom.xml                                                  //Pom with dependances
├── README.Docker.md
├── README.md                                                //Readme
├── src
│   ├── main
│   │   ├── java
│   │   │   └── ch
│   │   │       └── cpnves
│   │   │           └── payroll
│   │   │               ├── Controllers                     //Controllers
│   │   │               │   ├── BottleController.java
│   │   │               │   ├── BottleNotFoundAdvice.java
│   │   │               │   └── BottleNotFoundException.java
│   │   │               ├── Entities                        //Entities
│   │   │               │   └── Bottle.java
│   │   │               ├── PayrollApplication.java
│   │   │               └── Repositories                    //Repositories
│   │   │                   ├── BottleRepository.java
│   │   │                   └── LoadDatabase.java
│   │   └── resources                                         
│   │       └── application.properties                      //Propreties
│   └── test                                                //Test classes
│       └── java
│           └── ch
│               └── cpnves
│                   └── payroll
│                       └── PayrollApplicationTests.java             
```

## Collaborate

* Workflow
  * This project is tiny, we are all working on the main branch.
  * [How to commit](https://www.conventionalcommits.org/en/v1.0.0/)
  * Issues are added to the [github issues page](https://github.com/CPNV-VIR1/linux/issues)

## Contact

* If you need to, you can create an issue on GitHub we will try to respond as quickly as possible.
