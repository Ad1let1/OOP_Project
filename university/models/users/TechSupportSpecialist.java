package university.models.users;

import university.patterns.state.TechSupportRequest;

import java.util.ArrayList;
import java.util.List;

public class TechSupportSpecialist extends Employee {

    public List<TechSupportRequest> requests = new ArrayList<>();

    public TechSupportSpecialist() {
    }

    public void receiveRequest(TechSupportRequest request) {
        requests.add(request);
    }

    public void viewRequests() {
        requests.forEach(r -> System.out.println(r.state.getClass().getSimpleName()));
    }

    public void updateRequestStatus(TechSupportRequest request) {
        request.process();
    }
}