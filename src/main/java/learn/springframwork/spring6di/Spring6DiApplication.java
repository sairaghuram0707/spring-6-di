package learn.springframwork.spring6di;

import learn.springframwork.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {

        // SpringApplication.run(Spring6DiApplication.class, args);

        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }

}
