package Pattern1;

import java.util.Scanner;

public class tenPattern {

	public static void main(String args[]) {
        Scanner d=new Scanner(System.in);
        int n1=d.nextInt();
        int n2=d.nextInt();
        series(n1,n2);
    }
    public static void series(int n1,int n2)
    {
    	int t;
        for(int i=1;i<=n1;i++)
        {
            if((3*i+2)%4==0)
            {
            	n1=n1+1;
                continue;//return;
            }
            else
            {
                t=3*i+2;
            }
            System.out.println(t);
        }
    }
	}

