package qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCaseTest {

    @Test
    void testCaseStoresCorrectInformation() {
        TestCase testCase = new TestCase(
                1,
                "Login Test",
                "Check that a user can log in",
                "User is successfully logged in"
        );

        assertEquals(1, testCase.getId());
        assertEquals("Login Test", testCase.getTitle());
        assertEquals("Check that a user can log in", testCase.getDescription());
        assertEquals("User is successfully logged in", testCase.getExpectedResult());
    }
}
