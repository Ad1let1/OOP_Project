package university.models.research;

import university.models.users.User;

import java.util.HashSet;
import java.util.Set;

public class Journal {

    public Set<User> subscribers = new HashSet<>();

    public Journal() {
    }

    public void subscribe(User u) {
        subscribers.add(u);
    }

    public void unsubscribe(User u) {
        subscribers.remove(u);
    }

    public void notifySubscribers(ResearchPaper newPaper) {
        subscribers.forEach(u ->
            System.out.println("Notification for " + u.username + ": New paper published - " + newPaper.title)
        );
    }
}