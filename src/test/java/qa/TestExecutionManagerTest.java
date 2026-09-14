package qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestExecutionManagerTest {

    @Test
    void shouldAddExecution() {
        TestExecutionManager manager = new TestExecutionManager();

        TestExecution execution = new TestExecution(1);
        execution.pass();

        manager.addExecution(execution);

        assertEquals(1, manager.getExecutions().size());
    }

    @Test
    void shouldFindExecutionsForTestCase() {
        TestExecutionManager manager = new TestExecutionManager();

        TestExecution execution1 = new TestExecution(1);
        execution1.pass();

        TestExecution execution2 = new TestExecution(2);
        execution2.fail();

        manager.addExecution(execution1);
        manager.addExecution(execution2);

        assertEquals(
                1,
                manager.getExecutionsForTestCase(1).size()
        );
    }
}
