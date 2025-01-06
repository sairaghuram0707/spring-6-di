package learn.springframwork.spring6di.controllers;

import learn.springframwork.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedServiceTest {

    SetterInjectedController setterInjectedService;

    @BeforeEach
    void setUp() {
        setterInjectedService = new SetterInjectedController();
        setterInjectedService.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedService.sayHello());
    }
}