package TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class TimeSpace_Compexity {

	public static void main(String[] args) {
		//String str="nitin";
		//pallindrome(str);
		Scanner d=new Scanner(System.in);
		/*int n=d.nextInt();
		int x=d.nextInt();
		System.out.println(PowerSeries(n,x));*/
		String str=d.nextLine();
		System.out.println(CountPallSubstr(str));
		SOE(25);		
	}
	/*public static int PowerSeries(int n,int x)
	{
		int sum=0;
		int p=(int)Math.pow(n,x);
		for(int i=1;i<=n;i++)
		{
			sum+=i*p;
			p=p/x;
		}
		return sum;

	}*/
	public static int CountPallSubstr(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			count+=grow(str,i,i);
			count+=grow(str,i,i+1);
		}
		return count;
	}
	public static int grow(String str,int si,int ei)
	{
		int count=0;
		while(si>=0 && ei<str.length() && str.charAt(si)==str.charAt(ei))
		{
			si--;
			ei++;
			count++;
		}
		return count;
	}
	public static void SOE(int n)
	{
		boolean[] board=new boolean[n];
		//Arrays.fill[board.true];
		board[0]=false;
		board[1]=false;
		
		
	}
}
