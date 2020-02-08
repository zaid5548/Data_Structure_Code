package linkedlist;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		int[] arr= {4,2,2,4,1,6,3};
		int[] res=stockSpan(arr);
		for(int val:res)
		{
			System.out.println(val+" ");
		}
	}
	public static int[] stockSpan(int[] arr)
	{
		Stack<Integer> stack=new Stack<>();
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
			{
				stack.pop();
			}
			if(stack.isEmpty())
			{
				res[i]=i+1;
			}
			else
			{
				res[i]=i-stack.peek();
			}
			stack.push(i);
		}
		return res;
	}
}
