package qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugReportTest {

    @Test
    void bugShouldStoreCorrectInformation() {
        BugReport bug = new BugReport(
                1,
                "Login button not working",
                "The login button does not respond"
        );

        assertEquals(1, bug.getId());
        assertEquals("Login button not working", bug.getTitle());
        assertEquals("The login button does not respond", bug.getDescription());
        assertEquals("OPEN", bug.getStatus());
    }

    @Test
    void bugShouldBeClosed() {
        BugReport bug = new BugReport(
                1,
                "Login button not working",
                "The login button does not respond"
        );

        bug.close();

        assertEquals("CLOSED", bug.getStatus());
    }

    @Test
    void bugShouldBeInProgress() {
        BugReport bug = new BugReport(
                1,
                "Login button not working",
                "The login button does not respond"
        );

        bug.inProgress();

        assertEquals("IN PROGRESS", bug.getStatus());
    }
}