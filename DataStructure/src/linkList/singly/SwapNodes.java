package linkList.singly;

import java.util.Optional;

import linkList.singly.SinglyLinkedList.Node;

public class SwapNodes {

	Node head;

	public SwapNodes(Node node) {
		head = node;
	}

	public Optional<Node> byValue(int value1, int value2) {
		Node node = head;

		Node value1PrevNode = null;
		Node value2PrevNode = null;
		Node value1Node = null;
		Node value2Node = null;
		
		Node tempNode = null;

		while (node.next != null) {
			if (node.next.data == value1) {
				value1PrevNode = node;
				value1Node = node.next;
			}
			if (node.next.data == value2) {
				value2PrevNode = node;
				value2Node = node.next;
			}
			if(node.data == value1 && value1Node == null) {
				value1Node = node;
			}
			if(node.data == value2 && value2Node == null) {
				value2Node = node;
			}
			node = node.next;
		}

		if (value1PrevNode != null) {
			value1PrevNode.next = value2Node;
		}
		if (value2PrevNode != null) {
			value2PrevNode.next = value1Node;
		}
		//swapping node
		tempNode = value1Node.next;
		value1Node.next = value2Node.next;
		value2Node.next = tempNode;
		
		Optional<Node> newHead = null;
		
		if(value1PrevNode == null) {
			newHead = Optional.of(value2Node);
			return newHead;
		}
		
		if(value2PrevNode == null) {
			newHead = Optional.of(value1Node);
			return newHead;
		}
		return newHead;
	}
}
