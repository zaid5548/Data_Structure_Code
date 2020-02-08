package String;

import java.util.Scanner;

public class LastIndexAnyInput {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		int index;
		System.out.println("Enter any String");
		String str=d.nextLine();
		System.out.println("Enter the Any Character to check Index in this String  ");
		String ch=d.nextLine();
		index=str.lastIndexOf(ch);
		if(index==-1)
			System.out.println("Hello is not found");
		else
			System.out.println("Last Occurence of Hello"+"- >  "+index);
	}

}
