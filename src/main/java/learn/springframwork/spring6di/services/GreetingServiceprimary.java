package learn.springframwork.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Spring picks up this Implementation for the Service( Otherwise Error )
@Primary
@Service
public class GreetingServiceprimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from the Greeting Service Primary";
    }
}
