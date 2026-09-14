package qa;

import java.util.ArrayList;
import java.util.List;

public class BugReportManager {
    private final List<BugReport> bugs = new ArrayList<>();

    public void addBug(BugReport bug) {
        bugs.add(bug);
    }

    public List<BugReport> getBugs() {
        return bugs;
    }

    public BugReport findBugById(int id) {
        for (BugReport bug : bugs) {
            if (bug.getId() == id) {
                return bug;
            }
        }
        return null;
    }
}
