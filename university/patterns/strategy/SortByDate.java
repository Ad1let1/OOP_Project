package university.patterns.strategy;

import university.models.research.ResearchPaper;

public class SortByDate implements java.util.Comparator<ResearchPaper> {

    public SortByDate() {
    }

    @Override
    public int compare(ResearchPaper p1, ResearchPaper p2) {
        if (p1.publishedDate == null || p2.publishedDate == null) return 0;
        return p2.publishedDate.compareTo(p1.publishedDate);
    }

}