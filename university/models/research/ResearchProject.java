package university.models.research;

import university.exceptions.LowHIndexSupervisorException;
import university.exceptions.NotAResearcherException;
import university.models.users.User;

import java.util.*;

public class ResearchProject {

    public ResearchProject() {
    }

    public String topic;

    public Set<ResearchPaper> publishedPapers = new HashSet<>();

    public Set<User> participants = new HashSet<>();

    public void addParticipant(User p) throws NotAResearcherException {
        // We strictly enforce only researcher types can join using runtime type checking
        if (!(p instanceof ResearcherDecorator)) {
            throw new NotAResearcherException("User " + p.username + " is not a Researcher.");
        }
        participants.add(p);
    }
    
    public void setSupervisor(ResearcherDecorator supervisor) throws LowHIndexSupervisorException {
        // Business rule requirement: A supervisor must have an h-index of at least 3.
        if (supervisor.calculateHIndex() < 3) {
            throw new LowHIndexSupervisorException("Supervisor must have an h-index >= 3");
        }
        participants.add(supervisor);
    }


}