package qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestExecutionTest {

    @Test
    void newExecutionShouldHaveNotRunStatus() {
        TestExecution execution = new TestExecution(1);

        assertEquals(1, execution.getTestCaseId());
        assertEquals("NOT RUN", execution.getStatus());
    }

    @Test
    void shouldMarkTestAsPassed() {
        TestExecution execution = new TestExecution(1);

        execution.pass();

        assertEquals("PASS", execution.getStatus());
    }

    @Test
    void shouldMarkTestAsFailed() {
        TestExecution execution = new TestExecution(1);

        execution.fail();

        assertEquals("FAIL", execution.getStatus());
    }
}
