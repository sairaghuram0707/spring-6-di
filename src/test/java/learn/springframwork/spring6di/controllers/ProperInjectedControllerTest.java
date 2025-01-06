package learn.springframwork.spring6di.controllers;

import learn.springframwork.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProperInjectedControllerTest {

    @Autowired
    ProperInjectedController propertyInjectedController;

    // Everything being autowired by spring as we Annotated them.

//    @BeforeEach
//    void setUp() {
//
//        propertyInjectedController = new ProperInjectedController();
//        propertyInjectedController.greetingService = new GreetingServiceImpl();
//
//    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}