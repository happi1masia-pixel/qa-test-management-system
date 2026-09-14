package qa;

import java.util.ArrayList;
import java.util.List;

public class TestCaseManager {
    private final List<TestCase> testCases = new ArrayList<>();

    public void addTestCase(TestCase testCase) {
        testCases.add(testCase);
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }

    public TestCase findTestCaseById(int id) {
        for (TestCase testCase : testCases) {
            if (testCase.getId() == id) {
                return testCase;
            }
        }
        return null;
    }
}
