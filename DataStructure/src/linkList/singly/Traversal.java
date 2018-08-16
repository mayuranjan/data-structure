package linkList.singly;

import linkList.singly.SinglyLinkedList.Node;

public class Traversal {
	Node head;

	public Traversal(Node head) {
		this.head = head;
		if (head.next != null) {
			printData(head);
		}
	}

	public void printData(Node node) {
		System.out.println(node.data);
		if (node.next != null) {
			printData(node.next);
		}
	}

	public Node getLastNode(Node node) {
		if (node.next != null) {
			return getLastNode(node.next);
		} else {
			return node;
		}
	}

	public Node getNodeAtIndex(int index) {
		Node tempNode = head;
		for (int i = 0; i < index - 1; i++) {
			if (tempNode.next != null) {
				tempNode = tempNode.next;
			} else {
				break;
			}
		}
		return tempNode;
	}
}
