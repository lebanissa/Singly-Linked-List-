
public class SinglyLinkedList {
	private Node head;
	private int size;

	SinglyLinkedList() {
		// Creates an empty list:
		// head has the default value null.
	}

	void addFirst(String e) {
		head = new Node(e, head);

		// The above line is equivalent to the following 3 lines:
		// Node nn = new Node(e, null);
		// nn.setNext(head);
		// head = nn;
	}

	int getSize() {
		int size = 0;
		Node current = head;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		return size;
	}

	Node getFirst() {
		return head;
	}

	Node getTail() {
		// set the current equal to head
		Node current = head;
		// set tail = null;
		Node tail = null;
		// while the current != null its gonna
		// stay in the loop and the tail = current
		// and current is equal to the next head.
		while (current != null) {
			tail = current;
			current = current.getNext();
		}
		return tail;

	}

	public Node getNodeAt(int i) {
		if (i < 0 || i >= getSize()) {
			throw new IllegalArgumentException("Invalid Index");
		} else {
			int index = 0;
			Node current = head;
			while (index < i) { /* exit when index == i */
				index++;
				/*
				 * current is set to node at index i last iteration: index incremented from i -
				 * 1 to i
				 */
				current = current.getNext();
			}
			return current;
		}
	}

	public void addAt(int i, String e) {
		if (i < 0 || i >= size) {
			throw new IllegalArgumentException("Invalid Index.");
		} else {
			if (i == 0) {
				addFirst(e);
			} else {
				Node nodeBefore = getNodeAt(i - 1);
				Node newNode = new Node(e, nodeBefore.getNext());
				nodeBefore.setNext(newNode);
				size++;
			}
		}
	}
}
