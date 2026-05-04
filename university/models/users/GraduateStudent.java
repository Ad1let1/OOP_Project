package university.models.users;

import university.models.research.ResearchPaper;
import university.models.research.ResearcherDecorator;

import java.util.HashSet;
import java.util.Set;

public class GraduateStudent extends Student {

    public ResearcherDecorator supervisor;
    public Set<ResearchPaper> researches = new HashSet<>();

    public GraduateStudent() {
    }
}