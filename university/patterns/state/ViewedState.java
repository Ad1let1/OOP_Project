package university.patterns.state;


import java.io.*;
import java.util.*;

public class ViewedState implements State {

    public ViewedState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        // Logic will vary, but for default we proceed to Accepted. Could also reject.
        request.setState(new AcceptedState());
    }

}