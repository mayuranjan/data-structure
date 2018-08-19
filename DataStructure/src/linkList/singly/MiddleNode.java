/**
 * 
 */
package linkList.singly;

import linkList.singly.SinglyLinkedList.Node;

public class MiddleNode {

	public void print(Node head) {
		Node node = head;
		Node slowNode = head;
		Node fastNode = head;

		while (node.next != null && node.next.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			node = fastNode;
		}

		if (node.next == null) {
			System.out.println("Middle node = " + slowNode.data);
		}

		else if (node.next.next == null) {
			System.out.println("Middle node = " + slowNode.next.data);
		}
	}
}
