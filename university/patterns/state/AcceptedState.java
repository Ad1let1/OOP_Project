package university.patterns.state;

public class AcceptedState implements State {

    public AcceptedState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        request.setState(new DoneState());
    }
}