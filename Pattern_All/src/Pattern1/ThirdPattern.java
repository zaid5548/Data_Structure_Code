package Pattern1;

import java.util.Scanner;

public class ThirdPattern {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter Number of Term");
		int n=d.nextInt();
		
		int nr=2*n-1;
		int nst=1;
		int row=1;
		while(row<=nr)
		{
			int star=1;
			while(star<=nst)
			{
				System.out.print("*");
				star++;
			}
			System.out.println();
			if(row<=nr/2)
			{
				nst=nst+1;
			}
			else
			{
				nst=nst-1;
			}
			row++;
			
		}
	}

}
