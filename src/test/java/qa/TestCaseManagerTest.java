package qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCaseManagerTest {

    @Test
    void shouldAddTestCase() {
        TestCaseManager manager = new TestCaseManager();

        TestCase testCase = new TestCase(
                1,
                "Login Test",
                "Check user login",
                "User logs in successfully"
        );

        manager.addTestCase(testCase);

        assertEquals(1, manager.getTestCases().size());
    }

    @Test
    void shouldFindTestCaseById() {
        TestCaseManager manager = new TestCaseManager();

        TestCase testCase = new TestCase(
                1,
                "Login Test",
                "Check user login",
                "User logs in successfully"
        );

        manager.addTestCase(testCase);

        TestCase found = manager.findTestCaseById(1);

        assertEquals("Login Test", found.getTitle());
    }

    @Test
    void shouldReturnNullWhenTestCaseDoesNotExist() {
        TestCaseManager manager = new TestCaseManager();

        TestCase found = manager.findTestCaseById(999);

        assertNull(found);
    }
}
