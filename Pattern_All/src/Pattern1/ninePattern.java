package Pattern1;

import java.util.Scanner;

public class ninePattern {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter any number....");
		int n=d.nextInt();
		int nsp=n-1;
		int nst=1;
		int row=1;
		int val;
		while(row<=n)
		{
			val=1;
			for(int space=1;space<=nsp;space++)
			{
				System.out.print(" "+"\t");
			}
			for(int v=1;v<=nst;v++)
			{
				System.out.print(val+"\t");
				if(v<=nst/2)
				val++;
				else
					val--;
			}
			System.out.println();
			nsp--;
			nst+=2;
			row++;
		}

	}

}
