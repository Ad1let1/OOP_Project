package university.patterns.state;

public class NewState implements State {

    public NewState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        request.setState(new ViewedState());
    }
}