package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Happy Birthday Hardik";
    }

    @RequestMapping("/home")
    public String index1(@RequestParam(value="name") String name) {
        System.out.println("Name : "+name);
        return "Hello "+name+" !";
    }

}
