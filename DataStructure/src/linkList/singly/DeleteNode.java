package linkList.singly;

import linkList.singly.SinglyLinkedList.Node;

public class DeleteNode {

	Node head;

	public DeleteNode(Node node) {
		head = node;
	}

	public void deleteByKey(int key) {
		Node node = head;
		while (node.next != null) {
			if (node.next.data == key) {
				node.next = node.next.next;
			} else {
				node = node.next;
			}
		}
	}

	public void deleteByIndex(int index) {

	}
}
