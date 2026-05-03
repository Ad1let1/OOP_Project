package university.patterns.strategy;

import university.models.research.ResearchPaper;

public class SortByLength implements java.util.Comparator<ResearchPaper> {

    public SortByLength() {
    }

    @Override
    public int compare(ResearchPaper p1, ResearchPaper p2) {
        return Integer.compare(p1.pages, p2.pages);
    }

}