package learn.springframwork.spring6di.services;

import org.springframework.stereotype.Service;

// Spring component when Annotated here
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From Greeting Service!!!";
    }
}
