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
		// creating a node
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.createLinkedList();
		
		new Traversal(singlyLinkedList.head);
		
		// pushing a node
		InsertNode insertNode = new InsertNode(singlyLinkedList.head);
		singlyLinkedList.head = insertNode.push(new Node(0));
		
		new Traversal(singlyLinkedList.head);

		// appending a node
		insertNode.append(new Node(4));

		new Traversal(singlyLinkedList.head);
		
		// inserting a node at index position
		insertNode.insertAfter(new Node(3), 2);

		new Traversal(singlyLinkedList.head);
		
		
		// Deleting node
		DeleteNode deleteNode = new DeleteNode(singlyLinkedList.head);
		deleteNode.deleteByKey(4);
		
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
