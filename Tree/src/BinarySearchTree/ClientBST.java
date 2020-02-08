package BinarySearchTree;

public class ClientBST {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		BST bst = new BST(arr);
		bst.display();
		System.out.println("******** Max**********");
		System.out.println(bst.max());
		System.out.println(bst.find(81));
		System.out.println("*****Range Data *****");
		//bst.printRange(2, 7);
		System.out.println("Replace with Larger");
		//bst.replaceWithLarger();
		//bst.display();
		System.out.println("*********Type-2 to replace with Larger");
		//bst.replaceWithLarger2();
		//bst.display();
		/*bst.add(5);
		bst.display();
		System.out.println("Type-2 Adding any Node******");
		bst.add(6);
		bst.display();*/
	}

}
