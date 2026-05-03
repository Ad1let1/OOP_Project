package university.models.research;

import university.models.users.User;

import java.util.*;

public class ResearchPaper {

    public ResearchPaper() {
    }

    public String title;

    public Set<User> authors = new HashSet<>();

    public university.models.research.Journal journal;

    public int pages;

    public Date publishedDate;

    public int citations;

    public int doi;


}