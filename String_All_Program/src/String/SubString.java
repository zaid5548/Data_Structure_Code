package String;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=d.nextLine();
		SubString(str);

	}
	public static void SubString(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}

}
