package String;

import java.util.Scanner;

public class celsius {

	public static void main(String[] args) {
		        Scanner d=new Scanner(System.in);
		        System.out.println(" *********************");
		        int F=d.nextInt();
		        int maxf=d.nextInt();
		        int step=d.nextInt();
		        int C=0;
		        while(F<=maxf)
		        {
		            C = ((F-32)*5)/9;
		            System.out.println(F+" "+C);
		            F=F+step;
		        }
	}

}
