package ToDo;
public class User {
    private final String name;
    private final TaskList toDoList;

    // Constructor
    public User(String name) {
        this.name = name;
        this.toDoList = new TaskList();
    }

    // Method to add a task to the user's task list
    public void addTask(String description) {
        toDoList.addTask(description);
    }

    // Method to mark a task as completed
    public boolean markTaskAsCompleted(String description) {
        return toDoList.markTaskAsCompleted(description);
    }

    // Method to print all tasks for the user
    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        toDoList.printTasks();
    }
}
