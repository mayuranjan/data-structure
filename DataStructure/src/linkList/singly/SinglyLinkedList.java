package linkList.singly;

public class SinglyLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.createLinkedList();
		
		new Traversal(singlyLinkedList.head);
	}

	public void createLinkedList() {
		this.head = addNode(1);
		this.head = addNode(this.head, 2);
	}

	public Node addNode(int data) {
		Node node = new Node(data);
		return node;
	}

	public Node addNode(Node previousNode, int data) {
		Node node = new Node(data);
		previousNode.next = node;
		return previousNode;
	}
}
