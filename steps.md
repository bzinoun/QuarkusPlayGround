
## Installing miltiple JDK and manage it 

https://medium.com/w-logs/installing-java-11-on-macos-with-homebrew-7f73c1e9fadf

##Command : 
1-"./mvnw quakus:dev"
2-http :8080/hello name==hiba

##Step
0- Configure Java 8 (Pom.xml replace 11 by 8)
1- Remove Rest Easy annotation and replace it with Spring annotation
    1.1 @RestController - @RequestMapping
    1.2 @GetMapping