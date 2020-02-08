package Lec14_3Jan;

public class Stack {
	int[] data;
	int tos;

	public Stack() {
		this(5);
	}

	public Stack(int cap) {
		data = new int[cap];
		tos = -1;
	}

	public void push(int item) throws Exception {
		if (tos == data.length - 1) {
			throw new Exception("Stack is Full");
		}
		tos++;
		this.data[tos] = item;
	}

	public int pop() throws Exception {
		if (tos == -1) {
			throw new Exception("Stack is Empty");
		}
		int rv = data[tos];
		this.data[rv] = 0;
		tos--;
		return rv;
	}

	public int peek() {
		data[tos] = 0;
		return -1;
	}

	
	  public int size()
	  {
		  return tos+1;
	  }
	 
	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(data[i]);
		}
	}
}
