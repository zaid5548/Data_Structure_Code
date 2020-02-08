package linkedlist;

public class DynemicStack extends stack1{

	public void push(int item)
	{
		if(isFull())
		{
			int[] na=new int[data.length*2];
			for(int i=0;i<=tos;i++)
			{
				na[i]=data[i];
			}
			data=na;
		}
		super.push(item);
	}
}
