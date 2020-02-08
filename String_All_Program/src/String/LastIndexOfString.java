package String;

public class LastIndexOfString {

	public static void main(String[] args) {
		String str="Hello java,Hello Robin";
		int index=str.lastIndexOf("Hello");
		if(index==-1)
			System.out.println("Hello is not found");
		else
			System.out.println("Last Occurence of Hello"+"- >  "+index);
	}

}
