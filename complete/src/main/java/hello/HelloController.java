package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "<html><head><meta charset='UTF-8'><title>Birthday </title><meta name='viewport' content='width=device-width, initial-scale=1'></head><body><h1 style='font-size:20vw;'>HAPPY BIRTHDAY HARDIK</h1></body></html>";
    }

    @RequestMapping("/home")
    public String index1(@RequestParam(value="name") String name) {
        System.out.println("Name : "+name);
        return "Hello "+name+" !";
    }

}
