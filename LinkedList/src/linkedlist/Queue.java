package linkedlist;

public class Queue {
	int[] data;
	int front;
	int size;
	public Queue()
	{
		this(5);
	}
	public Queue(int cap)
	{
		data=new int[cap];
		front=0;
		size=0;
	}
	public void EnQueue(int item) throws Exception
	{
		if(isFull())
		{
		throw new Exception("Queue is Full");
		}
		int rear=(front+size)%data.length;
		data[rear]=item;
		size++;
	}
	public  boolean isFull()
	{
		return size==data.length;
	}
	public int DeQueue() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is Empty");
		}
		int rv=data[front];
		data[front]=0;
		front=(front+1)%data.length;
		size--;
		return rv;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public int getFront() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is Empty");
		}
		int rv=data[front];
		return rv;
	}
	public int size()
	{
		return size;
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			int idx=(front+i)%data.length;
			System.out.print(data[idx]+" ");
		}
		System.out.println("----------------------");
	}
}
