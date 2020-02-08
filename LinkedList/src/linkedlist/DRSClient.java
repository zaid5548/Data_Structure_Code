package linkedlist;

public class DRSClient {

	public static void main(String[] args) {
		DisplayReverceStack drs=new DisplayReverceStack();
		drs.push(10);
		drs.push(20);
		drs.push(30);
		drs.push(40);
		drs.push(50);
		drs.display();
		drs.pop();
		drs.pop();
		drs.pop();
		drs.push(60);
		drs.push(70);
		drs.push(80);
		drs.display();
	}

}
