package university.models.research;

import university.models.users.User;
import java.util.*;
public class ResearcherDecorator extends User {

    public ResearcherDecorator() {
    }

    public ResearcherDecorator(User decoratedUser) {
        this.decoratedUser = decoratedUser;
    }

    protected User decoratedUser;

    public Set<ResearchPaper> researchPapers = new HashSet<>();

    public int calculateHIndex() {
        List<Integer> citations = new ArrayList<>();
        for (university.models.research.ResearchPaper p : researchPapers) {
            citations.add(p.citations);
        }
        citations.sort(Collections.reverseOrder());
        
        int h = 0;
        for (int i = 0; i < citations.size(); i++) {
            if (citations.get(i) >= i + 1) {
                h = i + 1;
            } else {
                break;
            }
        }
        return h;
    }

    public void printPapers(java.util.Comparator<ResearchPaper> c) {
        researchPapers.stream()
            .sorted(c)
            .forEach(p -> System.out.println(p.title + " - Citations: " + p.citations));
    }

}