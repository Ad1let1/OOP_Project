package university.patterns.state;

public class ViewedState implements State {

    public ViewedState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        request.setState(new AcceptedState());
    }
}