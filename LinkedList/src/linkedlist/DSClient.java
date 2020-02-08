package linkedlist;

public class DSClient extends stack1{

	public static void main(String[] args) {
		stack1 st=new stack1();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.display();
		System.out.println("------Display Reverce------");
		displayRev(st);
		System.out.println("-------Real Stack--------");
		st.display();
		System.out.println("-------Actual Reverce--------");
		stack1 h=new stack1();
		ActualRev(st,h);
		st.display();
	}
	public static void displayRev(stack1 s)
	{
		if(s.isEmpty())
		{
			return;
		}
		int val=s.pop();
		displayRev(s);
		System.out.println(val);
		s.push(val);;
	}
	public static void ActualRev(stack1 s,stack1 h)
	{
		if(s.isEmpty())
		{
			if(s.isEmpty())
			{
				return;
			}
		int val=h.pop();
		ActualRev(s,h);
		s.push(val);
		return;
		}
	int val=s.pop();
	h.push(val);
	System.out.println(val);
	ActualRev(s,h);
	}
	/*public static void cloneStack(stack1 s,stack1 h)
	{
		if(h.isEmpty())
		{
			return;
		}
		int val=h.pop();
		cloneStack(s, h);
		s.push(val);
	}*/
}
