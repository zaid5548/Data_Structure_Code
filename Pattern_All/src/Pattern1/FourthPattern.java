package Pattern1;

import java.util.Scanner;

public class FourthPattern {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter Number of Row");
		int n=d.nextInt();
		int nst=n/2;
		int nsp=1;
		int row=1;
		while(row<=n)
		{
			for(int star=1;star<=nst;star++)
			{
				System.out.print("*");
				
			}
			for(int space=1;space<=nsp;space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=nst;star++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(row<=n/2)
			{
				nsp=nsp+2;
				nst=nst-1;
			}
			else
			{
				nst=nst+1;
				nsp=nsp-2;
			}
			row++;
		}
	}
}
