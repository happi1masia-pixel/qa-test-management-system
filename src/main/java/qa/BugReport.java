package qa;

public class BugReport {
    private final int id;
    private final String title;
    private final String description;
    private String status;

    public BugReport(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = "OPEN";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void inProgress() {
        status = "IN PROGRESS";
    }

    public void close() {
        status = "CLOSED";
    }
}