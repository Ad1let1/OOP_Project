package university.patterns.state;


import java.io.*;
import java.util.*;

public class RejectedState implements State {

    public RejectedState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        // Rejected indicates terminal state, cannot process further
        throw new IllegalStateException("Request was rejected and cannot be processed.");
    }

}