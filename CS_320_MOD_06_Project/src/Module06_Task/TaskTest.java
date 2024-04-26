package Module06_Task;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTaskCreation() {
        Task task = new Task("T1", "Complete Assignment", "Finish coding and testing");
        assertEquals("T1", task.getTaskId());
        assertEquals("Complete Assignment", task.getName());
        assertEquals("Finish coding and testing", task.getDescription());
    }

}