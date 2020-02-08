package Pattern1;

import java.util.Scanner;

public class fifthPattern {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=d.nextInt();
		int nsp=n-1;
		int nst=1;
		int row=1;
		while(row<=n)
		{
			for(int space=1;space<=nsp;space++)
			{
				System.out.print(" "+" ");
			}
			for(int v=1;v<=nst;v++)
			{
				System.out.print("1"+" ");
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
			row++;
		}

	}

}
