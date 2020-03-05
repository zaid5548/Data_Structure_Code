package DP_Example;

import java.util.Arrays;

public class Longest_Commen_SubSequence {

	public static void main(String[] args) {
//		String s1="Sunday",s2="Saturday";
//		System.out.println(LCS(s1, s2));
//		int[][] strg=new int [s1.length()+1][s2.length()+1]; 
//		for(int[] st: strg)
//		{
//			Arrays.fill(st, -1);
//		}
//		System.out.println(LCSTD(s1, s2, strg));
//		System.out.println(LCSBU(s1, s2));
//		System.out.println("**********");
//		System.out.println(EditDistance(s1, s2));
//		System.out.println("**********");
//		System.out.println(EditDistanceTD(s1, s2,strg));
//		System.out.println("**********");
//		System.out.println(EditDistanceBU(s1, s2));
////		
//		int[] wines= {2,3,5,1,4};
//		System.out.println(WineProblem(wines, 0, wines.length-1, 1));
//		System.out.println(WineProblem2(wines, 0, wines.length-1));
//		
//		int[][] strg=new int[wines.length][wines.length];
//		System.out.println(WineProblemTD(wines, 0, wines.length-1, strg));
//		System.out.println(WineProblemBU(wines));
//		int[] arr= {2,3,4,1,5};
//		System.out.println(MCM(arr, 0, arr.length-1));
//		int[][] strg=new int[arr.length][arr.length];
//		System.out.println(MCMTD(arr, 0, arr.length-1, strg));
//		MCMBU(arr);
		int[] weight= {10,20,30};
		int[] price= {60,100,120};
		int capacity= 50;
		int vidx=1;
		System.out.println(Knapsack(weight, price,vidx,capacity));
	}
	public static int LCS(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return 0;
		}
		char ch1=s1.charAt(0);
		char ch2=s2.charAt(0);
		int res=0;
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		if(ch1==ch2)
		{
			res=LCS(ros1,ros2)+1;
		}
		else
		{
			int f1=LCS(ros1,s2);
			int f2=LCS(s1,ros2);
			res=Math.max(f1, f2);
		}
		return res;
		
	}
	public static int LCSTD(String s1,String s2,int[][] strg)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return 0;
		}
		if(strg[s1.length()][s2.length()]!=-1)
		{
			return strg[s1.length()][s2.length()];
		}
		char ch1=s1.charAt(0);
		char ch2=s2.charAt(0);
		int res=0;
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		if(ch1==ch2)
		{
			res=LCSTD(ros1,ros2,strg)+1;
		}
		else
		{
			int f1=LCSTD(ros1,s2,strg);
			int f2=LCSTD(s1,ros2,strg);
			res=Math.max(f1, f2);
		}
		return strg[s1.length()][s2.length()]=res;
		
	}
	public static int LCSBU(String s1,String s2)
	{
		int[][] strg=new int[s1.length()+1][s2.length()+1];
		if(s1.length()==0 || s2.length()==0)
		{
			return 0;
		}
		for(int i=1;i<=s1.length();i++)
		{
			for(int j=1;j<=s2.length();j++)
			{
				char ch1=s1.charAt(s1.length()-i);
				char ch2=s2.charAt(s2.length()-j);
				if(ch1==ch2)
				{
					strg[i][j]=strg[i-1][j-1]+1;
				}
				else
				{
					strg[i][j]=Math.max(strg[i][j-1], strg[i-1][j]);
				}
			}
		}
		return strg[s1.length()][s2.length()];
	}
	public static int EditDistance(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return Math.max(s1.length(), s2.length());
		}
		char ch1=s1.charAt(0);
		char ch2=s2.charAt(0);
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		int res=0;
		if(ch1==ch2)
		{
			res=EditDistance(ros1, ros2);
		}
		else
		{
			int i=EditDistance(s1, ros2);
			int d=EditDistance(ros1, s2);
			int r=EditDistance(ros1, ros2);
			res=Math.min(i, Math.min(d, r)) + 1;
		}
		return res;
	}
	public static int EditDistanceTD(String s1,String s2,int[][] strg)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return Math.max(s1.length(), s2.length());
		}
		if(strg[s1.length()][s2.length()]!=0)
		{
			return strg[s1.length()][s2.length()];
		}
		char ch1=s1.charAt(0);
		char ch2=s2.charAt(0);
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		int res=0;
		if(ch1==ch2)
		{
			res=EditDistanceTD(ros1, ros2,strg);
		}
		else
		{
			int i=EditDistanceTD(s1, ros2,strg);
			int d=EditDistanceTD(ros1, s2,strg);
			int r=EditDistanceTD(ros1, ros2,strg);
			res=Math.min(i, Math.min(d, r)) + 1;
		}
		return strg[s1.length()][s2.length()]=res;
	}
	
	public static int EditDistanceBU(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0)
		{
			return Math.max(s1.length(), s2.length());
		}
		int[][] strg=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++)
		{
			for(int j=0;j<=s2.length();j++)
			{
				if(i==0 || j==0)
				{
					strg[i][j]=Math.max(i, j);
					continue;
				}
				char ch1=s1.charAt(s1.length()-i);
				char ch2=s2.charAt(s2.length()-j);
				if(ch1==ch2)
				{
					strg[i][j]=strg[i-1][j-1];
				}
				else
				{
					int in=strg[i][j-1];
					int d=strg[i-1][j];
					int r=strg[i-1][j-1];
					strg[i][j]=Math.min(in, Math.min(d, r)) + 1;
				}
			}
		}
		
		return strg[s1.length()][s2.length()];
	}
	
	public static int WineProblem(int[] wines,int si,int ei,int year)
	{
		if(si==ei)
		{
			return wines[si]*year;
		}
		int fh=WineProblem(wines, si+1, ei, year+1)+wines[si]*year;
		int sh=WineProblem(wines, si, ei-1, year+1)+wines[ei]*year;
		return Math.max(fh, sh);
	}
	public static int WineProblem2(int[] wines,int si,int ei)
	{
		int year=wines.length-ei+si;
		if(si==ei)
		{
			return wines[si]*year;
		}
		int fh=WineProblem2(wines, si+1, ei)+wines[si]*year;
		int sh=WineProblem2(wines, si, ei-1)+wines[ei]*year;
		return Math.max(fh, sh);
	}
	
	public static int WineProblemTD(int[] wines,int si,int ei,int[][] strg)
	{
		int year=wines.length-ei+si;
		if(si==ei)
		{
			return wines[si]*year;
		}
		if(strg[si][ei]!=0)
		{
			return strg[si][ei];
		}
		int fh=WineProblemTD(wines, si+1, ei,strg)+wines[si]*year;
		int sh=WineProblemTD(wines, si, ei-1,strg)+wines[ei]*year;
		return Math.max(fh, sh);
	}
	public static void WineProblemBU(int[] wines)
	{
		int[][] strg=new int[wines.length][wines.length];

		for(int slide=1;slide<=wines.length;slide++)
		{
			for(int si=0;si<=wines.length-slide-1;si++)
			{
				int year=wines.length-slide+si;
				int ei=si+slide;
				if(si==slide)
				{
					strg[si][slide]=wines[si]*year;
					continue;
				}

				int fh=strg[si+1][slide]+wines[si]*year;
				int sh=strg[si][slide-1]+wines[slide]*year;
				int max=Math.max(fh,sh);
			}
		}
		return ;
}
	public static int MCM(int[] arr,int si,int ei)
	{
		if(ei-si==1)
		{
			return 0;
		}
		int min=Integer.MAX_VALUE;
		for(int k=si+1;k<=ei-1;k++)
		{
			int fh=MCM(arr,si,k);
			int sh=MCM(arr,k,ei);
			int sw=arr[si]*arr[k]*arr[ei];
			int total=fh+sh+sw;
		min =  Math.min(min,total);
		}
		return min;		
	}
	
	public static int MCMTD(int[] arr,int si,int ei,int[][] strg)
	{
		if(ei-si==1)
		{
			return 0;
		}
		int min=Integer.MAX_VALUE;
		if(strg[si][ei]!=0)
		{
			return strg[si][ei];
		}
		for(int k=si+1;k<=ei-1;k++)
		{
			int fh=MCMTD(arr,si,k,strg);
			int sh=MCMTD(arr,k,ei,strg);
			int sw=arr[si]*arr[k]*arr[ei];
			int total=fh+sh+sw;
		min =  Math.min(min,total);
		}
		return min;		
	}
		
	
	public static void MCMBU(int[] arr)
	{
		int[][] strg=new int[arr.length][arr.length];

		for(int slide=1;slide<=arr.length;slide++)
		{
			for(int si=0;si<=arr.length-slide-1;si++)
			{
				int ei=si+slide;
				if(ei-si==1)
				{
					strg[si][ei]=0;
					continue;
				}
				int min=Integer.MAX_VALUE;
				for(int k=si+1;k<=ei-1;k++)
				{
					int fh=strg[si][k];
					int sh=strg[k][ei];
					int sw=arr[si]*arr[k]*arr[ei];
					int total=fh+sh+sw;
					min=Math.min(total, min);
				}
				strg[si][ei]=min;
			}
		}
		for(int[] st:strg)
		{
			for(int s:st)
			{
				System.out.print(s+" ");
			}
			System.out.println();
		}
	
//		return strg[si][ei];
	}
	
	public static int Knapsack(int[] wt,int[] pr,int vidx,int cap)
	{
		
		if(vidx==pr.length)
		{
			return 0;
		}
		int inc=0;
		if(cap-wt[vidx]>=0)
			inc=Knapsack(wt, pr, vidx+1, cap-wt[vidx])+pr[vidx];
		int exc=Knapsack(pr, wt, vidx+1, cap);
		return Math.max(inc, exc);
	}	
	
}