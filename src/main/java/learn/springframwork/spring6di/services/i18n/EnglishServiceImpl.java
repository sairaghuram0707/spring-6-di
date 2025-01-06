package learn.springframwork.spring6di.services.i18n;

import learn.springframwork.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "English Greeting Service Implemented";
    }
}
