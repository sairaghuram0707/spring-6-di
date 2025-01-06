package learn.springframwork.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterInjectedImple")
public class GreetingServiceSetterInjected implements GreetingService  {
    @Override
    public String sayGreeting() {
        return "Greeting Service Setter Implementation!!!";
    }
}
