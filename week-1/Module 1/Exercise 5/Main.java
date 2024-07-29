public class Main {
	public static void main(String[] args) {
		SinglyLinkedList taskList = new SinglyLinkedList();

		Task t1 = new Task("1", "Design Database", "Pending");
		Task t2 = new Task("2", "Implement API", "In Progress");
		Task t3 = new Task("3", "Test Application", "Completed");

		taskList.addTask(t1);
		taskList.addTask(t2);
		taskList.addTask(t3);

		System.out.println("All Tasks:");
		taskList.traverseTasks();

		System.out.println("\nSearching for Task 2:");
		Task result = taskList.searchTask("2");
		if (result != null) {
			System.out.println(result);
		} else {
			System.out.println("Task not found.");
		}

		System.out.println("\nDeleting Task 2:");
		taskList.deleteTask("2");

		System.out.println("\nAll Tasks after deletion:");
		taskList.traverseTasks();
	}
}
