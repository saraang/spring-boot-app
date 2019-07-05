package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot Application!";
    }

    @RequestMapping("/home")
    public String index1() {
        return "Home Controller!";
    }

}
