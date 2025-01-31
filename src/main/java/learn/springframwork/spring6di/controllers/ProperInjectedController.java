package learn.springframwork.spring6di.controllers;

import learn.springframwork.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProperInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
