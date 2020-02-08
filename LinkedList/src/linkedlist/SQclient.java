package linkedlist;

public class SQclient {

	public static void main(String[] args) throws Exception {
	 Queue q=new Queue();
	 q.EnQueue(10);
	 q.EnQueue(20);
	 q.EnQueue(30);
	 q.EnQueue(40);
	 q.EnQueue(50);
	 System.out.println(q.DeQueue());
	 System.out.println(q.DeQueue());
	 q.EnQueue(60);
	 q.EnQueue(70);
	 //q.EnQueue(80);  // Stack is Full Exception
	 q.display();
	}

}
