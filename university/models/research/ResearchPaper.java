package university.models.research;

import university.models.users.User;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ResearchPaper {

    public int pages;
    public int citations;
    public int doi;
    public String title;
    public Set<User> authors = new HashSet<>();
    public Journal journal;
    public Date publishedDate;

    public ResearchPaper() {
    }
}