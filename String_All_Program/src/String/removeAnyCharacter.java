package String;

import java.util.Scanner;

public class removeAnyCharacter {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=d.nextLine();
		System.out.println("Enter any position of String to Remove");
		int n=d.nextInt();
		System.out.println(removeCharAt(str,n));
	}
	public static String removeCharAt(String str,int pos)
	{
		return str.substring(0,pos)+str.substring(pos+1);
	}

}
