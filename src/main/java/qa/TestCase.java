package qa;

public class TestCase {
    private int id;
    private String title;
    private String description;
    private String expectedResult;

    public TestCase(int id, String title, String description, String expectedResult) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.expectedResult = expectedResult;
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

    public String getExpectedResult() {
        return expectedResult;
    }
}
