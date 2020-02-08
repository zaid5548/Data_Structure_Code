package linkedlist;

public class DisplayReverceStack{
	protected int[] data;
	protected int tos;
	public DisplayReverceStack()
	{
		this(5);
	}
	public DisplayReverceStack(int cap)
	{
		data=new int[cap];
		tos=-1;
	}
	public void push(int item)
	{
		if(tos==data.length)
		{
			System.out.println("Stack is Full");
			return;
		}
		this.tos++;
		data[tos]=item;
	}
	public int pop()
	{
		if(tos==-1)
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		int rv=data[tos];
		data[tos]=0;
		tos--;
		return rv;
	}
	public int peek()
	{
		if(tos==-1)
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return data[tos];
	}
	public boolean isEmpty()
	{
		if(tos==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if(tos==data.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int size()
	{
		return tos+1;
	}
	public void display()
	{
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("-----------------------");
	}
}
