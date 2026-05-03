package university.patterns.strategy;

import university.models.research.ResearchPaper;

public class SortByCitations implements java.util.Comparator<ResearchPaper> {

    public SortByCitations() {
    }

    @Override
    public int compare(ResearchPaper p1, ResearchPaper p2) {
        return Integer.compare(p2.citations, p1.citations);
    }

}