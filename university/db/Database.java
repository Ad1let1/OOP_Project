package university.db;

import university.models.academic.Course;
import university.models.users.User;
import university.patterns.state.TechSupportRequest;

import java.util.HashSet;
import java.util.Set;

public class Database {

    private static Database instance;

    private Set<User> user = new HashSet<>();
    private Set<Course> course = new HashSet<>();
    private Set<TechSupportRequest> requests = new HashSet<>();

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}