package Module06_Task;

public class Task {
    private String taskId;
    private String name;
    private String description;

    public Task(String taskId, String name, String description) {
        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    // Getters and setters

    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}