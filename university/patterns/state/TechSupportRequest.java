package university.patterns.state;

import university.enums.UrgencyLevel;

public class TechSupportRequest {

    public TechSupportRequest() {
        this.state = new NewState(); // Initial state
    }

    public State state;

    public UrgencyLevel urgency;

    // Changes the current state to a new valid state
    public void setState(State state) {
        this.state = state;
    }

    // Delegates the request handling to the current state implementation
    public void process() {
        state.handleRequest(this);
    }

}