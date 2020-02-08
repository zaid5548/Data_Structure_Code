package Pattern1;

import java.util.Scanner;

public class FirstPattern {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter No of size of Create Pattern");
		int n=scn.nextInt();
		int nsp=n-1;
		int nst=1;
		int row=1;
		while(row<=n)
		{
			
			int space=1;
			while(space<=nsp)
			{
				System.out.print(" ");
				space++;
			}
			
			int star=1;
			while(star<=nst)
			{
				System.out.print("*");
				star++;
			}
			System.out.print("\n");
			nst=nst+1;
			nsp=nsp-1;
			row++;
		}

	}

}
