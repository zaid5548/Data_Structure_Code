package String;

import java.util.Scanner;

public class OddEvenString {

	public static void main(String[] args) {
		
		        Scanner scn=new Scanner(System.in);
		        String str=scn.nextLine();
		        OddEvenString(str);
		    }
		    public static void OddEvenString(String str)
		    {
		    	String even="";
		    	String odd="";
		    	for(int i=0;i<str.length();i++)
		    	{
		    		if(i%2==0)
		    		{
		    			even+=str.charAt(i+1);
		    		}
		    		else
		    		{
		    			odd+=str.charAt(i-1);
		    		}
		    	}
		    	System.out.println(even+""+odd);
		    }
}
