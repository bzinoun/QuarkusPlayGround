package ma.bzinoun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Value("${hello.ar}")
    private String prefix;

    public Hello morrocanHelloServiceName(String name) {

        return new Hello(prefix+ name);

    }

}