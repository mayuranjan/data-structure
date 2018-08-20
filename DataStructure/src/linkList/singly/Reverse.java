package linkList.singly;

import linkList.singly.SinglyLinkedList.Node;

public class Reverse {
	Node head;

	public Reverse(Node node) {
		head = node;
	}

	public Node getReversedList() {
		Node currentNode = head;
		Node prevNode = null;
		Node nextNode = head.next;

		while (nextNode != null) {
			prevNode = currentNode;
			currentNode = nextNode;
			
			if (currentNode.next != null) {
				nextNode = currentNode.next;
			} else {
				nextNode = currentNode;
				break;
			}
			currentNode.next = prevNode;

			if (prevNode == head) {
				prevNode.next = null;
			}
		}
		
		currentNode.next = prevNode;

		return currentNode;
	}
}
