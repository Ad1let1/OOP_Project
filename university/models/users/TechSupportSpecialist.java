package university.models.users;

import university.patterns.state.TechSupportRequest;

import java.util.*;

public class TechSupportSpecialist extends Employee {

    public TechSupportSpecialist() {
    }

    public List<TechSupportRequest> requests = new ArrayList<>();
    public void receiveRequest(TechSupportRequest request) {
        requests.add(request);
    }

    public void viewRequests() {
        requests.stream().forEach(r -> System.out.println(r.state.getClass().getSimpleName()));
    }

    public void updateRequestStatus(TechSupportRequest request) {
        request.process();
    }

}