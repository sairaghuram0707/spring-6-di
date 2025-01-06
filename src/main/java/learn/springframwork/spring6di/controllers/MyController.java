package learn.springframwork.spring6di.controllers;

import learn.springframwork.spring6di.services.GreetingService;
import learn.springframwork.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){

        System.out.println("In Controller");

        return greetingService.sayGreeting();
    }
}
