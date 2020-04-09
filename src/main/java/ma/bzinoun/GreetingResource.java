package ma.bzinoun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("api")
public class GreetingResource {

@GetMapping("hello")
    public String hello() {
        return "hello";
    }
}