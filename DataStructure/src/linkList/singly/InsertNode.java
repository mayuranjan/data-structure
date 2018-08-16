package linkList.singly;

import linkList.singly.SinglyLinkedList.Node;

public class InsertNode {

	Node head;
	Traversal traversal;

	public InsertNode(Node node) {
		head = node;
		traversal = new Traversal(head);
	}

	public Node push(Node newNode) {
		newNode.next = head;
		return newNode;
	}

	public void append(Node newNode) {
		Node lastNode = traversal.getLastNode(head);
		lastNode.next = newNode;
	}

	public void insertAfter(Node newNode, int index) {
		Node tempNode = traversal.getNodeAtIndex(index);
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}

}
