package learn.springframwork.spring6di.services.i18n;

import learn.springframwork.spring6di.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("i18nService")
public class SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HOLAAAAAA Greeting Service Implemented!!!";
    }
}
