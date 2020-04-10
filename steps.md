


## Needs
- Java 11
- docker
- httpie
- minikube

## Step

### Play with Quarkus Spring 🍃
- [x]  Remove Rest Easy annotation and replace it with Spring annotation
    1.1 @RestController - @RequestMapping
    1.2 @GetMapping
- [x]  Add Spring @Service
- [x]  Add Bean validatin ☕️https://quarkus.io/guides/validation
- [ ]  fetch data from Properties
- [ ]  Add Spring Data
- [ ] Push docker Container Native  🐳
- [ ] Push docker Container HotSpot 🐳
- [ ] Deploy to MiniKube 🚀 
- [ ] test HA with MiniKube 
    Performance test 🔥
- [] Automate deployment

## usfull command
‘‘‘ sh

 $ ./mvnw quakus:dev
 $ http :8080/hello name==badr
‘‘‘

## Tips Installing miltiple JDK and manage it 

https://medium.com/w-logs/installing-java-11-on-macos-with-homebrew-7f73c1e9fadf
