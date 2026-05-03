package university.patterns.state;


import java.io.*;
import java.util.*;

public class AcceptedState implements State {

    public AcceptedState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        // Enforces transition from Accepted to Done once work is completed
        request.setState(new DoneState());
    }

}