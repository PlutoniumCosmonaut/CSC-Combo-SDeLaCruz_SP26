
public class LinkedList {
	private Node head;

	// nested Class
	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;
	}

	public boolean search(int target) {
		Node current = head;
		while (current != null) {
			if (current.data == target)
				return true;
			current = current.next;
		}
		return false;
	}

	public void delete(int key) {
		if (head == null)
			return;

		if (head.data == key) {
			head = head.next;
		}

		Node current = head;
		while (current.next != null && current.next.data != key) {
			current = current.next;
		}

		if (current.next != null)
			current.next = current.next.next;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("Null");
	}

}
