package learn.springframwork.spring6di.services;

import org.springframework.stereotype.Service;

//Custom name for Implementation
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Greeting Property Service Implemented ***";
    }
}
