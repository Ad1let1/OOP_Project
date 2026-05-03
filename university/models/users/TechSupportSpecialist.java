package university.models.users;

import university.patterns.state.TechSupportRequest;

import java.util.*;

public class TechSupportSpecialist extends Employee {

    public TechSupportSpecialist() {
    }

    // Using ArrayList for requests as order of arrival is important
    public List<TechSupportRequest> requests = new ArrayList<>();

    public void receiveRequest(TechSupportRequest request) {
        requests.add(request);
    }

    public void viewRequests() {
        // Using streams to cleanly print out all existing request states
        requests.stream().forEach(r -> System.out.println(r.state.getClass().getSimpleName()));
    }

    public void updateRequestStatus(TechSupportRequest request) {
        // Advances the state by delegating to the state pattern's process method
        request.process();
    }

}