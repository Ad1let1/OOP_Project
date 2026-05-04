package university.patterns.state;

public class DoneState implements State {

    public DoneState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        throw new IllegalStateException("Request is already in Done state.");
    }
}