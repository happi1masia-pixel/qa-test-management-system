package qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugReportManagerTest {

    @Test
    void shouldAddBug() {
        BugReportManager manager = new BugReportManager();

        BugReport bug = new BugReport(
                1,
                "Login button not working",
                "The login button does not respond when clicked"
        );

        manager.addBug(bug);

        assertEquals(1, manager.getBugs().size());
    }

    @Test
    void shouldFindBugById() {
        BugReportManager manager = new BugReportManager();

        BugReport bug = new BugReport(
                1,
                "Login button not working",
                "The login button does not respond when clicked"
        );

        manager.addBug(bug);

        BugReport found = manager.findBugById(1);

        assertEquals("Login button not working", found.getTitle());
    }

    @Test
    void shouldReturnNullWhenBugDoesNotExist() {
        BugReportManager manager = new BugReportManager();

        BugReport found = manager.findBugById(999);

        assertNull(found);
    }
}
