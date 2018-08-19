package linkList.singly;

import java.util.Optional;

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
		
		System.out.println("Traversing linked list:");
		new Traversal(singlyLinkedList.head);
		
		// pushing a node
		System.out.println("Pushing a new node:");
		InsertNode insertNode = new InsertNode(singlyLinkedList.head);
		singlyLinkedList.head = insertNode.push(new Node(0));
		
		new Traversal(singlyLinkedList.head);

		// appending a node
		System.out.println("Appending a new node:");
		insertNode.append(new Node(4));

		new Traversal(singlyLinkedList.head);
		
		// inserting a node at index position
		System.out.println("Inserting a new node after index position:");
		insertNode.insertAfter(new Node(3), 2);

		new Traversal(singlyLinkedList.head);
		

		// Deleting node
		DeleteNode deleteNode = new DeleteNode(singlyLinkedList.head);
		System.out.println("Deleting a node by key:");
		deleteNode.byKey(4);
		
		new Traversal(singlyLinkedList.head);
		// Deleting node
		System.out.println("Deleting a node by index position:");
		deleteNode.byIndex(2);
		
		new Traversal(singlyLinkedList.head);

		insertNode.append(new Node(4));
		insertNode.append(new Node(5));
		// Swapping Node
		System.out.println("Swapping node by value:");
		SwapNodes swapNodes = new SwapNodes(singlyLinkedList.head);
		Optional.of(swapNodes.byValue(3, 0)).ifPresent(newHead -> singlyLinkedList.head = newHead.get());
		
		new Traversal(singlyLinkedList.head);
		
		MiddleNode middleNode = new MiddleNode();
		middleNode.print(singlyLinkedList.head);
		System.out.println();
		
		insertNode.append(new Node(6));
		new Traversal(singlyLinkedList.head);
		middleNode.print(singlyLinkedList.head);
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
