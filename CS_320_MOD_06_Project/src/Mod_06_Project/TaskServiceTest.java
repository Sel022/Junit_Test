package Mod_06_Project;
//Selvadurai Pathmathasan cs_320_module_06_Task
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Module06_Task.Task;
import Module06_Task.TaskService;

public class TaskServiceTest {
    @Test
    public void testAddTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("T1", "Complete Assignment", "Finish coding and testing");
        taskService.addTask(task);

        assertNotNull(taskService.getTaskById("T1"));
    }

}