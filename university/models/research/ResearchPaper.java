package university.models.research;
import university.models.users.User;
import university.models.research.Journal
import java.util.*;

public class ResearchPaper {

    public ResearchPaper() {
    }

    public int pages, citations, doi;
    public String title;
    public Set<User> authors = new HashSet<>();
    public Journal journal;
    public Date publishedDate;

}