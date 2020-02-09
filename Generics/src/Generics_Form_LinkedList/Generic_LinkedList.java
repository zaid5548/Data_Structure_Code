package Generics_Form_LinkedList;

public class Generic_LinkedList<T> {

		public class Node {
			T data;
			Node Next;
		}

		Node Head;
		Node Tail;
		int size = 0;

		public T getFirst() {
			return Head.data;
		}

		public T getLast() {
			return Tail.data;
		}

		public void addLast(T item) {
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

		public T getAt(int idx) throws Exception {
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
				System.out.println(temp.data + " ");
				temp = temp.Next;
			}
			System.out.println();
		}

		public void AddFirst(T item) {
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

		public void AddAt(int idx, T item) throws Exception {
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

		public T RemoveFirst() throws Exception {
			if (isEmpty()) {
				throw new Exception("UnderFlow");
			}
			T val;
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

		public T RemoveLast() throws Exception {
			T val = Tail.data;
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

		public T RemoveAt(int idx) throws Exception {
			T val = getAt(idx);
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
	}