package learn.springframwork.spring6di.controllers;

import learn.springframwork.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProperInjectedControllerTest {

     ProperInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {

        propertyInjectedController = new ProperInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();

    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}