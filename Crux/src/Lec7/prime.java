package Lec7;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=scn.nextInt();
		int div=2;
		boolean flag=true;
		while(div<=n-1)
		{
			if(n%div==0)
			{
				flag=false;
			}
			div=div+1;
		}
		if(flag==true)
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
