package qa;

import java.util.ArrayList;
import java.util.List;

public class TestExecutionManager {
    private final List<TestExecution> executions = new ArrayList<>();

    public void addExecution(TestExecution execution) {
        executions.add(execution);
    }

    public List<TestExecution> getExecutions() {
        return executions;
    }

    public List<TestExecution> getExecutionsForTestCase(int testCaseId) {
        List<TestExecution> results = new ArrayList<>();

        for (TestExecution execution : executions) {
            if (execution.getTestCaseId() == testCaseId) {
                results.add(execution);
            }
        }

        return results;
    }
}
