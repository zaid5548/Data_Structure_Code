package linkedlist;

import java.util.Stack;

public class StackNextLarger {

	public static void main(String[] args) {
		int[] arr= {4,9,2,3,1,0,8};
		int[] array=NextLarger(arr);
		for(int val:array)
		{
			System.out.println(val+" ");
		}
	}
	public static int[] NextLarger(int[] arr)
	{
		Stack<Integer> stack=new Stack<>();
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
			{
				res[stack.pop()]=arr[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty())
		{
			res[stack.pop()]=-1;
		}
		return res;
	}
}
