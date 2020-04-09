package ma.bzinoun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingResource {
    final private HelloService helloServiceName ; 

    public GreetingResource(HelloService helloServiceName) {
        this.helloServiceName = helloServiceName;
    }


    @GetMapping("/hello")
    public Hello hello(@RequestParam(defaultValue = "badr") String name) {
        return helloServiceName.morrocanHelloServiceName(name);
    }

}
