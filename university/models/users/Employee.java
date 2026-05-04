package university.models.users;

import university.patterns.state.TechSupportRequest;

import java.util.*;
public class Employee extends User {
    public Employee() {
    }

    public double salary;
    public Date hireDate;
    public void sendRequest(TechSupportRequest request, TechSupportSpecialist support) {
        support.receiveRequest(request);
    }
    public void sendMessage(User user, String msg) {
        System.out.println("Extending message to " + user.username + ": " + msg);
    }

}