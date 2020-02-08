package BinarySearchTree;

import BinaryTreeRepresentation.BinaryTree.Node;

public class BST {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BST(int[] arr) {
		root = construct(arr, 0, arr.length-1);
	}

	public Node construct(int[] inorder, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		Node nn = new Node();

		int mid = lo + (hi - lo) / 2;
		nn.data = inorder[mid];
		nn.left = construct(inorder, lo, mid - 1);
		nn.right = construct(inorder, mid + 1, hi);
		return nn;
	}

	public void display() {
		display(root);
	}

	public void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "<--" + node.data + "-->";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}

		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;
	}
	public int size() {
		return size(root);
	}

	public int size(Node node) {
		if (node == null) {
			return 0;
		}
		int lns = size(node.left);
		int rns = size(node.right);
		return lns + rns + 1;
	}
	public int max() {
		return max(root);
	}

	public int max(Node node)
	{
		if(node.right==null)
		{
			return node.data;
		}
		return max(node.right);
	}
	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item)
	{
		if(node==null)
		{
			return false;
		}
		if(node.data==item)
		{
			return true;
		}
		if(node.data<item)
		{
			return find(node.right,item);
		}
		else
		{
			return find(node.left,item);
		}
	}
	public void printRange(int ll,int ul)
	{
		printRange(root,ll, ul);
	}
	private void printRange(Node node,int ll,int ul)
	{
		if(node==null)
		{
			return ;
		}
		if(node.data<ll)
		{
			printRange(node.right, ll, ul);
		}
		else if(node.data>ul)
		{
			printRange(node.left, ll, ul);
		}
		else
		{
			printRange(node.left,ll, ul);
			System.out.print(node.data+" ");
			printRange(node.right,ll, ul);
		}		
	}
	
	public void replaceWithLarger()
	{
		replaceWithLarger(root);
	}
	int sum=0;
	private void replaceWithLarger(Node node)
	{
		if(node==null)
		{
			return;
		}
		replaceWithLarger(node.right);
		int temp=node.data;
		node.data=sum;
		sum+=temp;
		replaceWithLarger(node.left);
	}
	public void replaceWithLarger2()
	{
		replaceWithLarger2(root,0);
	}

	private int replaceWithLarger2(Node node,int ssf)
	{
		if(node==null)
		{
			return ssf;
		}
		ssf=replaceWithLarger2(node.right,ssf);
		int temp=node.data;
		node.data=ssf;
		ssf+=temp;
		 return replaceWithLarger2(node.left,ssf);
//		 return ssf;
	}
	public void add(int item)
	{
		add(null,root,item);
	}
	public void add(Node parent,Node child,int item)
	{
		if(child==null)
		{
			Node nn=new Node();
			nn.data=item;
			if(parent.data<item)
			{
				parent.right=nn;
			}
			else
			{
				parent.left=nn;
			}
			return;
		}
		if(child.data<item)
		{
			add(child,child.right,item);
		}
		else
		{
			add(child,child.left,item);
		}
	}
	public void add2(int item)
	{
		add2(root,item);
	}
	public Node add2(Node node,int item)
	{
		if(node==null)
		{
			Node nn=new Node();
			nn.data=item;
			return nn;
		}
		if(node.data<item)
		{
			node.right=add2(node.right,item);
		}
		else
		{
			node.left=add2(node.left,item);
		}
		return node;
	}
}