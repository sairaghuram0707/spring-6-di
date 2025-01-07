package learn.springframwork.spring6di.controllers.Assignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"QA","EN"})
class DevTest {

    @Autowired
    AssignmentController assignmentController;

    @Test
    void getDataSourceName() {
        System.out.println(assignmentController.dataSourceName());
    }
}