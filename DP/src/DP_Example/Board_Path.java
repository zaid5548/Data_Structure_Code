package DP_Example;

public class Board_Path {

	public static void main(String[] args) {
		int n=10;
		//System.out.println(boardpath(0,n,""));
		int[] strg=new int[n+1];
		//System.out.println(boardpathTD(0, n,strg));
		System.out.println(boardpathBU(0, n));
		System.out.println(boardpathBUSE(0, n));
	}
	public static int boardpath(int curr, int end, String ans) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int cnt = 0;
		for (int dice = 1; dice <= 6; dice++) {
			cnt += boardpath(curr + dice, end, ans + dice);

		}
		return cnt;
	}
	public static int boardpathTD(int curr, int end,int[] strg) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if(strg[curr]!=0)
		{
			return strg[curr];
		}
		int cnt = 0;
		for (int dice = 1; dice <= 6; dice++) {
			cnt += boardpathTD(curr + dice, end,strg);
		}
		return strg[curr]=cnt;
	}
	public static int boardpathBU(int curr, int end) {
		int[] strg=new int[end+6];
		strg[end]=1;
		for(int i=end-1;i>=0;i--)
		{
		int cnt = 0;
		for (int dice = 1; dice <= 6; dice++) {
			strg[i]+=strg[i+dice];
		}		
		}
		return strg[0];
	}
	public static int boardpathBUSE(int curr, int end) {
		int[] strg=new int[6];
		strg[0]=1;
		for(int i=0;i<=end-1;i++)
		{
			int sum=0;
			sum+=strg[0]+strg[1]+strg[2]+strg[3]+strg[4]+strg[5];
			strg[5]=strg[4];
			strg[4]=strg[3];
			strg[3]=strg[2];
			strg[2]=strg[1];
			strg[1]=strg[0];
			strg[0]=sum;
		}
		return strg[0];
	}
}
