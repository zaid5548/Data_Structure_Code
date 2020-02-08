package linkedlist;

public class stack1 {
	int[] data;
	int tos;
	public stack1()
	{
		this.data=new int[5];
		 tos=-1;
	}
	public void stack1(int cap)
	{
		this.data=new int[cap];
		this.tos=-1;
	}
	public void push(int item)
	{
		if(isFull())
		{
			System.out.println("Overflow");
			return;
		}
		this.tos++;
		this.data[tos]=item;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Underflow");
			return -1;
		}
		int temp=data[tos];
		data[tos]=0;
		tos--;
		return temp;
	}
	public int peek()
	{
		if(tos==-1)
		{
			System.out.println("Emplty");
			return -1;
		}
		return data[tos];
	}
	public int size()
	{
		return tos+1;
	}
	public boolean isFull()
	{
		if(tos==data.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
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
	public void display()
	{
		for(int i=tos;i>=0;i--)
		{
			System.out.println(data[i]);
		}
	}
}
