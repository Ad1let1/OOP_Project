package university.patterns.state;


import java.io.*;
import java.util.*;

public interface State {

    public void handleRequest(TechSupportRequest request);

}