package linkedlist;

public class ReverseQueue {

	public static void main(String args[]) throws Exception
	{
		Queue q=new Queue();
		q.EnQueue(1);
		q.EnQueue(2);
		q.EnQueue(3);
		q.EnQueue(4);
		q.EnQueue(5);
		System.out.println("------Actual Reverse-------");
		ActualReverse(q);
		System.out.println("------Real Reverse Queue-----------");
		q.display();
		System.out.println("------Display Reverse Queue------");
		DisplayReverse(q,0);
		System.out.println("------Real Queue----------");
		q.display();
				
	}
	public static void ActualReverse(Queue q) throws Exception
	{
		if(q.isEmpty())
		{
			return;
		}
		int val=q.DeQueue();
		ActualReverse(q);
		System.out.println(val);
		q.EnQueue(val);
	}
	public static void DisplayReverse(Queue q,int count) throws Exception
	{
		if(count==q.size())
		{
			return;
		}
		int val=q.DeQueue();
		q.EnQueue(val);
		DisplayReverse(q,count+1);
		System.out.println(val);
		
	}
}
