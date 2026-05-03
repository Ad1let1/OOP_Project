package university.models.research;
import university.models.users.User;

import java.util.*;

public class Journal {

    public Journal() {
    }

    public Set<User> subscribers = new HashSet<>();

    public void subscribe(User u) {
        subscribers.add(u);
    }

    public void unsubscribe(User u) {
        subscribers.remove(u);
    }

    public void notifySubscribers(ResearchPaper newPaper) {
        subscribers.stream().forEach(u -> 
            System.out.println("Notification for " + u.username + ": New paper published - " + newPaper.title)
        );
    }

}