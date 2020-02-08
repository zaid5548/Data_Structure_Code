package linkedlist;

public class DQclient extends Queue {
		@Override
		public void EnQueue(int item) throws Exception
		{
			
			if(isFull())
			{
			 int[] na=new int[2*data.length];
			 for(int i=0;i<size;i++)
			 {
				 na[i]=data[(front+i)%data.length];
			 }
			 data=na;
			 front=0;
			}
			super.EnQueue(item);
		}

}
