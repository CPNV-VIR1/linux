# Spring - REST API

This repository is an example of an api rest spring application.

## First build

Note : To find out which version of jdk to install in your project, check the pom.xlm file!

* After cloning this repository, to retrieve the dependencies, compile and run the program for the first time, Run this command:

[INPUT]
```
   mvn clean spring-boot:run
```

[OUTPUT]
```
  [...]
    2024-05-30T08:42:27.632+02:00  INFO 1088 --- [payroll] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
    2024-05-30T08:42:27.640+02:00  INFO 1088 --- [payroll] [           main] ch.cpnves.payroll.PayrollApplication     : Started PayrollApplication in 2.839 seconds (process running for 3.086)
    2024-05-30T08:42:27.684+02:00  INFO 1088 --- [payroll] [           main] c.c.payroll.Repositories.LoadDatabase    : Preloading Bottle{id=1, name='Bilbo Baggins', role='burglar'}
    2024-05-30T08:42:27.685+02:00  INFO 1088 --- [payroll] [           main] c.c.payroll.Repositories.LoadDatabase    : Preloading Bottle{id=2, name='Frodo Baggins', role='thief'}
  [...]
```

## Test using http requests

Got the file [project]\src\main\java\ch\cpnves\payroll\Controllers\BottleController.java

Before all routes methods, you will find a curl sample.

[INPUT]
```
curl -i localhost:8080/bottles     
````

[OUTPUT]
```
HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Thu, 30 May 2024 06:45:57 GMT

[{"id":1,"name":"Bilbo Baggins","role":"burglar"},{"id":2,"name":"Frodo Baggins","role":"thief"}]
```