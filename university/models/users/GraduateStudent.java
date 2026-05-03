package university.models.users;

import university.models.research.ResearchPaper;
import university.models.research.ResearcherDecorator;

import java.util.*;
public class GraduateStudent extends Student {
    public GraduateStudent() {
    }
    public ResearcherDecorator supervisor;
    public Set<ResearchPaper> researches = new HashSet<>();

}