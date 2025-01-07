package learn.springframwork.spring6di.services.Assignment;

import learn.springframwork.spring6di.services.AssignmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("AssignmentProfile")
public class DevServiceImpl implements AssignmentService {
    @Override
    public String getDataSourceName() {
        return "Dev Env Service Implemented";
    }
}
