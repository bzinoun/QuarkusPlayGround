# Quarkus playground

Hi ✋ ,
This repo is a playground for quarkus and Spring integration . 
the project is generated automatically with vscode througt vscode Quarkus plugin 

## Needs
- ☕️ Java 11  : since quarkus 1.3.0.Final  Java 11 is default JDK . 
- 🐳 docker for Containers
- 🌐 httpie : Http client curl like
- 📦 minikube
- 🎛 VisualStudio code with Java Extension Pack 👍 , Quarkus Extension


##Play with Quarkus (Spring syntax) 🍃
- [x]  Remove Rest Easy annotation and replace it with Spring annotation
    [x] @RestController - @RequestMapping
    [x] @GetMapping
- [x]  Add Spring @Service
- [x]  Add Bean validatin ☕️https://quarkus.io/guides/validation
- [x]  fetch data from Properties
- [x]  Fetch  Data
  - [x]  Add Spring Data 
  - [x]  Add Jdbc H2
  - [x]  Create user 
  - [x]  Create repo
  - [x]  get all users througt API 
- [X] Build native App 
- [ ] Push docker Container Native  🐳
- [ ] Push docker Container HotSpot 🐳
- [ ] Deploy to MiniKube 🚀 
- [ ] test HA with MiniKube 
  - [ ] Performance test 🔥
- [ ] Deploy to IBM OpenWisk Function
- [ ] Deploy tp Knative Function
- [ ] Automate deployment
- [ ] Adding Kafka 

##  Command
``` sh

 $ ./mvnw quakus:dev
 $ http :8080/api/user name==badr
 $ http :8080/api/user 
 docker-compose -f src/main/docker/quarkus-compose.yml up   

````


This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `quarkus-getting-started-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/quarkus-getting-started-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/quarkus-getting-started-1.0.0-SNAPSHOT-runner`

## Building Native Images 
quarkus provide out of the box two docker files . 
Dockerfile.native for building native image GraalVm based
Dockerfile.jvm for building hotspot(JVM) based images . 
for the native one copy past command bellow . 

``` sh
 docker build -f src/main/docker/Dockerfile.native -t quarkus-hello .
````
to run it : 
``` sh
````
