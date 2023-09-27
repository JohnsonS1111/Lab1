package ie.atu.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class greetByName {

    @GetMapping("/greet/{name}")
    public String getName(@PathVariable Long name){
        return "Hello " + name;
    }
}
