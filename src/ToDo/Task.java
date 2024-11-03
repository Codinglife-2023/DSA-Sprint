package ToDo;

public class Task {
    private final String description;
    private boolean isCompleted;

    // Constructor
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;  // New tasks are pending by default
    }

    // Method to mark the task as completed
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter for completion status
    public boolean isCompleted() {
        return isCompleted;
    }

    // toString method to display task information
    @Override
    public String toString() {
        return description + (isCompleted ? " (Completed)" : " (Pending)");
    }
}
