package qa;

public class TestExecution {
    private final int testCaseId;
    private String status;

    public TestExecution(int testCaseId) {
        this.testCaseId = testCaseId;
        this.status = "NOT RUN";
    }

    public int getTestCaseId() {
        return testCaseId;
    }

    public String getStatus() {
        return status;
    }

    public void pass() {
        status = "PASS";
    }

    public void fail() {
        status = "FAIL";
    }
}
