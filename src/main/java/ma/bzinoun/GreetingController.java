package ma.bzinoun;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class GreetingController {
    final private HelloService helloServiceName;

    public GreetingController(HelloService helloServiceName) {
        this.helloServiceName = helloServiceName;
    }

    @GetMapping()
    public Hello hello(@RequestParam(defaultValue = "badr") String name) {
        return helloServiceName.morrocanHelloServiceName(name);
    }

    @PostMapping()
    public Hello helloPostForm(@Valid Input input) {

        return helloServiceName.morrocanHelloServiceName(input.getName());
    }

}
