package Pattern1;

import java.util.Scanner;

public class sevenPattern {

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
			val=row;
			for(int space=1;space<=nsp;space++)
			{
				System.out.print(" "+" ");
			}
			for(int v=1;v<=nst;v++)
			{
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
			if(row<=n)
			{
				nst=nst+2;
				nsp=nsp-1;
			}
			else
			{
				nst=nst-2;
				nsp=nsp+1;
			}
			val=val+1;
			row++;
		}

	}

}
