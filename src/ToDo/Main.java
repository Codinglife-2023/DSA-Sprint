package ToDo;

public class Main {
    private static final int MAX_USERS = 10; // Maximum number of users
    private static final User[] users = new User[MAX_USERS];
    private static int userCount = 0;

    public static void main(String[] args) {
        try {

            // Add users to the application
            addUser("Alice");
            addUser("Bob");

            // Add tasks to each user's to-do list
            users[0].addTask("Buy groceries");
            users[0].addTask("Finish homework");
            users[1].addTask("Walk the dog");

            // Mark a task as completed for a user
            users[0].markTaskAsCompleted("Buy groceries");

            // Display all tasks for each user
            for (int i = 0; i < userCount; i++) {
                users[i].printTasks();
            }

        } catch (Exception e) {
        }
    }

    // Method to add a user to the application
    private static void addUser(String name) {
        if (userCount < MAX_USERS) {
            users[userCount++] = new User(name);
        } else {
            System.out.println("User limit reached.");
        }
    }

    public static User[] getUsers() {
        return users;
    }
}
