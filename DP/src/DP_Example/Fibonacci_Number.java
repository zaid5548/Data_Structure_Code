package DP_Example;

public class Fibonacci_Number {

	public static void main(String[] args) {
		int n=6;
		//System.out.println(Fibo(n));
		int[] strg=new int[n+1];
		//System.out.println(FiboTD(n,strg));
		//System.out.println(FiboBU(n));
		System.out.println(FiboBUSE(n));
	}
	public static int Fibo(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		int f1=Fibo(n-1);
		int f2=Fibo(n-2);
		return f1+f2;
	}
	public static int FiboTD(int n,int[] strg)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		if(strg[n]!=0)
		{
			return strg[n];
		}
		int f1=FiboTD(n-1,strg);
		int f2=FiboTD(n-2,strg);
		strg[n]=f1+f2;
		return strg[n];
	}
	public static int FiboBU(int n)
	{
		int[] strg=new int[n+1];
		strg[0]=0;
		strg[1]=1;
		for(int i=2;i<=n;i++)
		{
			strg[i]=strg[i-1]+strg[i-2];
		}
		return strg[n];
	}
	public static int FiboBUSE(int n)
	{
		int[] strg=new int[2];
		strg[0]=0;
		strg[1]=1;
		for(int i=2;i<=n;i++)
		{
			int sum=strg[0]+strg[1];
			strg[0]=strg[1];
			strg[1]=sum;
		}
		return strg[1];
	}
}
