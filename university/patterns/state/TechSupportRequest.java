package university.patterns.state;

import university.enums.UrgencyLevel;

public class TechSupportRequest {

    public State state;
    public UrgencyLevel urgency;

    public TechSupportRequest() {
        this.state = new NewState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void process() {
        state.handleRequest(this);
    }
}