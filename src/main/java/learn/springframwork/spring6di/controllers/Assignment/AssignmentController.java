package learn.springframwork.spring6di.controllers.Assignment;

import learn.springframwork.spring6di.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class AssignmentController {
    private final AssignmentService assignmentService;

    @Autowired
    public AssignmentController(@Qualifier("AssignmentProfile") AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    public String dataSourceName(){
        return assignmentService.getDataSourceName();
    }
}
