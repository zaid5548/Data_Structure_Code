package Pattern1;
import java.util.*;
public class magicPattern {

	public static void main(String[] args) {
	
		        Scanner d=new Scanner(System.in);
		        int n=d.nextInt();
		        int nst=n-1;
		        int nsp=1;
		        
		        int row=1;
		        for(int star=1;star<=2*n-1;star++)
		            {
		                System.out.print("*");
		            } 
		        System.out.println();
		        while(row<=2*n-3)
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
		            if(row<n-1)
		            {
		                nst=nst-1;
		                nsp=nsp+2;
		            }
		            else{
		                nst=nst+1;
		                nsp=nsp-2;
		            }
		            row++;
		        }
		        for(int star=1;star<=2*n-1;star++)
		            {
		                System.out.print("*");
		            }

	}

}
