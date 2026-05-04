package university.patterns.state;

public class RejectedState implements State {

    public RejectedState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        throw new IllegalStateException("Request was rejected and cannot be processed.");
    }
}