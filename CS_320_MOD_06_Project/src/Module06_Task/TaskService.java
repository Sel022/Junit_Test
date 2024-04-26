package Module06_Task;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private Map<String, Task> tasks = new HashMap<>();

    public void addTask(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    public void deleteTask(String taskId) {
        tasks.remove(taskId);
    }

    public void updateTask(Task updatedTask) {
        tasks.put(updatedTask.getTaskId(), updatedTask);
    }

    public Task getTaskById(String taskId) {
        return tasks.get(taskId);
    }
}