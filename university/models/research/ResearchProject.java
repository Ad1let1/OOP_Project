package university.models.research;

import university.exceptions.LowHIndexSupervisorException;
import university.exceptions.NotAResearcherException;
import university.models.users.User;

import java.util.HashSet;
import java.util.Set;

public class ResearchProject {

    public String topic;
    public Set<ResearchPaper> publishedPapers = new HashSet<>();
    public Set<User> participants = new HashSet<>();

    public ResearchProject() {
    }

    public void addParticipant(User p) throws NotAResearcherException {
        if (!(p instanceof ResearcherDecorator)) {
            throw new NotAResearcherException("User " + p.username + " is not a Researcher.");
        }
        participants.add(p);
    }

    public void setSupervisor(ResearcherDecorator supervisor) throws LowHIndexSupervisorException {
        if (supervisor.calculateHIndex() < 3) {
            throw new LowHIndexSupervisorException("Supervisor must have an h-index >= 3");
        }
        participants.add(supervisor);
    }
}