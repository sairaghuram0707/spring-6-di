package learn.springframwork.spring6di.controllers;

import learn.springframwork.spring6di.services.GreetingService;
import org.springframework.stereotype.Controller;

// Spring managed Controller
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
