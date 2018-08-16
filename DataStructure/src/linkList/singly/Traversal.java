package linkList.singly;

import linkList.singly.SinglyLinkedList.Node;

public class Traversal {
	Node head;
	
	public Traversal(Node head) {
		if(head.next != null) {
			printData(head);
		}
	}
	
	public void printData(Node node) {
		System.out.println(node.data);
		if(node.next != null) {
			printData(node.next);
		}
	}
}
