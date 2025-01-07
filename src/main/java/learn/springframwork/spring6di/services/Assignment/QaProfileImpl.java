package learn.springframwork.spring6di.services.Assignment;

import learn.springframwork.spring6di.services.AssignmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("AssignmentProfile")
@Profile("QA")
public class QaProfileImpl implements AssignmentService {
    @Override
    public String getDataSourceName() {
        return "QA Service Implemented";
    }
}
