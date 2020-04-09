package ma.bzinoun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResource {

    @GetMapping("/hello")
    public Hello hello(@RequestParam(defaultValue = "badr") String name) {
        return new Hello("hello " + name + " !");
    }

}
