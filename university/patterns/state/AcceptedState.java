package university.patterns.state;


import java.io.*;
import java.util.*;

public class AcceptedState implements State {

    public AcceptedState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        request.setState(new DoneState());
    }

}