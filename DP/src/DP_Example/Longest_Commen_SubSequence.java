package DP_Example;

import java.util.Arrays;

public class Longest_Commen_SubSequence {

	public static void main(String[] args) {
		String s1="Sunday",s2="Saturday";
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
		System.out.println("**********");
		System.out.println(EditDistanceBU(s1, s2));
		int[] Rate= {2,3,5,1,4};
		int[] Year= {1,2,3,4,5};
		WineProblem(Rate, Year);
	
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
	
	public static void WineProblem(int[] rate,int[] year)
	{
		
		
		
		
	}
}
