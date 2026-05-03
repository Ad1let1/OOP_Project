package university.patterns.state;


import java.io.*;
import java.util.*;

public class DoneState implements State {

    public DoneState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        // Terminal state, further processing is disallowed to preserve strict flow
        throw new IllegalStateException("Request is already in Done state.");
    }

}