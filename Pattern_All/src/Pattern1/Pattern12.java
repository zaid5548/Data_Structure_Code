package Pattern1;
import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		
		
		        Scanner d=new Scanner(System.in);
		        int n=d.nextInt();
		        int nsp=2*n-1;
		        for(int row=n;row>=1;row--)
		        {
		        	for(int star=n;star>=row;star--)
			        	{
		        		System.out.print(star);
			        	}
		        	System.out.println();
		        }		                 
  }
}