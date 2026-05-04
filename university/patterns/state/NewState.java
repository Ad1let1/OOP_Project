package university.patterns.state;


import java.io.*;
import java.util.*;

public class NewState implements State {

    public NewState() {
    }

    @Override
    public void handleRequest(TechSupportRequest request) {
        request.setState(new ViewedState());
    }

}