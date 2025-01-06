package learn.springframwork.spring6di.controllers;

import learn.springframwork.spring6di.services.GreetingService;

public class ProperInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
