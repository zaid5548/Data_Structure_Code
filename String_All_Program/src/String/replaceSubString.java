package String;

import java.util.Scanner;

public class replaceSubString {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=d.nextLine();
		System.out.println(" Enter first Character");
		String ch1=d.nextLine();
		System.out.println(" Enter Second Character");
		String ch2=d.nextLine();
		System.out.println(str.replace(ch1, ch2));
	}

}
