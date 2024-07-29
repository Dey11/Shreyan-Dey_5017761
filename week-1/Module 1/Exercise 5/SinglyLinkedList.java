public class SinglyLinkedList {
	private Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public void addTask(Task task) {
		Node newNode = new Node(task);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public Task searchTask(String taskId) {
		Node current = head;
		while (current != null) {
			if (current.data.getTaskId().equals(taskId)) {
				return current.data;
			}
			current = current.next;
		}
		return null;
	}

	public void traverseTasks() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void deleteTask(String taskId) {
		if (head == null) return;

		if (head.data.getTaskId().equals(taskId)) {
			head = head.next;
			return;
		}

		Node current = head;
		while (current.next != null) {
			if (current.next.data.getTaskId().equals(taskId)) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
}
