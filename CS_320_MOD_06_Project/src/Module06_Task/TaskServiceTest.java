package Module06_Task;
//Selvadurai Pathmathasan_Mod_06_Project_Task
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
    @Test
    public void testAddTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("T1", "Complete Assignment", "Finish coding and testing");
        taskService.addTask(task);

        assertNotNull(taskService.getTaskById("T1"));
    }

}
