package LinkedList1;

public class LinkList {

	public class Node {
		int data;
		Node Next;
	}

	Node Head;
	Node Tail;
	int size = 0;

	public int getFirst() {
		return Head.data;
	}

	public int getLast() {
		return Tail.data;
	}

	public void addLast(int item) {
		// creat node
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			Head = nn;
			Tail = nn;
		} else {
			// Attach
			Tail.Next = nn;
			// Update
			Tail = Tail.Next;
		}
		size++;
	}

	public int getAt(int idx) throws Exception {
		if (idx < 0 && idx >= size) {
			throw new Exception("Invalid index");
		}
		if (isEmpty()) {
			throw new Exception("---LinkedList is Empty---");
		}
		Node temp = Head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.Next;
		}
		return temp.data;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		Node temp = Head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.Next;
		}
		System.out.println();
	}

	public void AddFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		// Pointer change
		nn.Next = Head;
		// Head Change
		Head = nn;
		if (isEmpty()) {
			Tail = nn;
		}
	}

	public Node getNodeAt(int idx) throws Exception {
		if (idx < 0 && idx >= size) {
			throw new Exception("Invalid index");
		}
		if (isEmpty()) {
			throw new Exception("---LinkedList is Empty---");
		}
		Node temp = Head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.Next;
		}
		return temp;
	}

	public void AddAt(int idx, int item) throws Exception {
		Node nn = new Node();
		nn.data = item;
		if (isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (idx < 0 && idx > size) {
			throw new Exception("Invalid Index");
		}
		Node temp = getNodeAt(idx - 1);
		if (idx == 0) {
			AddFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			nn.Next = temp.Next;
			temp.Next = nn;
			size++;
		}
	}

	public int RemoveFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("UnderFlow");
		}
		int val;
		val = Head.data;
		if (size == 1) {
			Head = null;
			Tail = null;
			size = 0;
		} else {
			Head = Head.Next;
			size--;
		}
		return val;
	}

	public int RemoveLast() throws Exception {
		int val = Tail.data;
		if (isEmpty()) {
			throw new Exception("UnderFlow");
		}
		if (size == 1) {
			Head = null;
			Tail = null;
			size = 0;
		} else {
			Node temp = getNodeAt(size - 2);
			Tail = temp;
			Tail.Next = null;
			size--;
		}
		return val;
	}

	public int RemoveAt(int idx) throws Exception {
		int val = getAt(idx);
		if (idx < 0 && idx >= size) {
			throw new Exception("Invalid Index");
		}
		if (idx == 0) {
			RemoveFirst();
		} else if (idx == size - 1) {
			RemoveLast();
		} else {
			Node temp = getNodeAt(idx - 1);
			temp.Next = temp.Next.Next;
			size--;
		}
		return val;
	}

	public void RDI() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty LinkedList");
		}
		int i = 0;
		int j = size - 1;
		while (i < j) {
			Node low = getNodeAt(i);
			Node high = getNodeAt(j);
			int temp = low.data;
			low.data = high.data;
			high.data = temp;
			i++;
			j--;
		}
	}

	public void RPI() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty LinkedList");
		}
		Node prev = null;
		Node curr = Head;
		while (curr != null) {
			Node temp = curr.Next;
			curr.Next = prev;
			prev = curr;
			curr = temp;
		}
		Node temp = Head;
		Head = Tail;
		Tail = temp;
	}

	public void RPR() {
		RPR(null, Head);
		Node temp = Head;
		Head = Tail;
		Tail = temp;
	}

	public void RPR(Node prev, Node curr) {
		if (curr == null) {
			return;
		}
		RPR(curr, curr.Next);
		curr.Next = prev;
	}

}