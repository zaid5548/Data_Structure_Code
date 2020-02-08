package linkedlist;

public class Sclient {

	public static void main(String[] args) {
		stack1 s=new stack1();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		System.out.println("poped element"+s.pop());
		System.out.println();
		s.display();
		s.push(60);
		s.push(70);
		System.out.println("peeked"+s.peek());
		s.display();
	}

}
