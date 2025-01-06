package learn.springframwork.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("SP")
// Specify Profile here when the service Custom Name is same.
// (Default property if not available)
class i18nControllerTest {

    @Autowired
    private i18nController i18nController;

    @Test
    void sayHello() {
        System.out.println(i18nController.sayHello());
    }
}