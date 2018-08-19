package linkList.singly;

import linkList.singly.SinglyLinkedList.Node;

public class DeleteNode {

	Node head;

	public DeleteNode(Node node) {
		head = node;
	}

	public void byKey(int key) {
		Node node = head;
		
		while (node.next != null) {
			if (node.next.data == key) {
				node.next = node.next.next;
			} else {
				node = node.next;
			}
		}
	}

	public void byIndex(int index) {
		Node node = head;
		int counter = 0;
		
		while (node.next != null) {
			if (counter == index - 1) {
				node.next = node.next.next;
			} else {
				node = node.next;
			}
			counter++;
		}
	}
}
