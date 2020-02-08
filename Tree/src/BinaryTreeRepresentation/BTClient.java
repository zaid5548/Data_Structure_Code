package BinaryTreeRepresentation;

public class BTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="10 true 20 true 40 false false true 50 true 80 false false true 90 false false true 30 true 70 false false false ";
		BinaryTree bt=new BinaryTree(str);
		//String str="10 true 20 true 40 true 70 true 80 true 90 true 100 true 110 true 111 false false false false false false false false true 50 false true 11 false true 12 false true 13 false true 14 false true 15 false true 16 false true 17 false false true 30 false true 60 false false";
		/*BinaryTree bt=new BinaryTree(str);
		int[] a= {10,20,40,50,30,70};
		int[] b= {40,20,50,10,30,70};
		BinaryTree bt1=new BinaryTree(a,b);*/
		/*bt.display();
		System.out.println(bt.size());
		System.out.println(bt.max());
		System.out.println(bt.height());
		System.out.println(bt.find(100));
		System.out.println(bt.dia());
		System.out.println(bt.dia2());// Error*/
		System.out.println("========*****=========");
		bt.preorder1();
		bt.inorder1();
		bt.postorder1();
	}

}
