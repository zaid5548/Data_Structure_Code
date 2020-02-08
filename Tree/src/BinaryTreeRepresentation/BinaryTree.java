package BinaryTreeRepresentation;

import java.util.Scanner;
import java.util.Stack;

import GenericTree.GenericTree.Node;

public class BinaryTree {

	Scanner scn;

	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree(String str) {

		scn = new Scanner(str);
		root = construct(null, false);
	}

	public Node construct(Node parent, boolean isLeftChild) {
		if (parent == null)
			System.out.println("Enter the Data of Root");
		else {
			if (isLeftChild == true) {
				System.out.println("Enter the Data for left child of " + parent.data);
			} else {
				System.out.println("Enter the Data for Right child of" + parent.data);
			}
		}

		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("is Left Child of" + nn.data);
		boolean b = scn.nextBoolean();
		if (b) {
			nn.left = construct(nn, true);
		}

		System.out.println("is Right Child of" + nn.data);
		boolean c = scn.nextBoolean();
		if (c) {

			nn.right = construct(nn, false);
		}
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

	public int max(Node node) {
		if (node == null) {
			return 0;
		}
		int lmax = max(node.left);
		int rmax = max(node.right);
		return Math.max(node.data, Math.max(lmax, rmax));
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

	public boolean find(int item) {
		return find(root, item);
	}

	public boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}

		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);
		return lf || rf;
	}

	public int dia() {
		return dia(root);
	}

	public int dia(Node node) {
		if (node == null) {
			return 0;
		}
		int ld = dia(node.left);
		int rd = dia(node.right);
		int sd = height(node.left) + height(node.right) + 2;
		return Math.max(sd, Math.max(ld, rd));
	}

	int dia = 0;

	public int dia2() {
		dia2(root);
		return dia;
	}

	private int dia2(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = dia2(node.left);
		int rh = dia2(node.right);
		int sd = lh + rh + 2;
		dia = Math.max(dia, sd);
		return Math.max(lh, rh) + 1;
	}

	public boolean balanced(Node node) {
		if (node == null) {
			return true;
		}
		boolean lh = balanced(node.left);
		boolean rh = balanced(node.right);
		int bf = height(node.left) - height(node.right);
		return lh && rh && Math.abs(bf) <= 1;
	}

	class balpair {
	}

	/*
	 * public balpair balanced2(Node node) { if(node==null) { return new balpair();
	 * } balpair lh=balanced2(node.left); balpair rh=balanced2(node.right);
	 * //balpair bf= }
	 */
	public void preorder1() {
		preorder1(root);
		System.out.println();
	}

	public void inorder1() {
		inorder1(root);
		System.out.println();
	}

	public void postorder1() {
		postorder1(root);
		System.out.println();
	}

	private void preorder1(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preorder1(node.left);
		preorder1(node.right);
	}

	private void inorder1(Node node) {
		if (node == null) {
			return;
		}
		inorder1(node.left);
		System.out.print(node.data + " ");
		inorder1(node.right);
	}

	private void postorder1(Node node) {
		if (node == null) {
			return;
		}
		postorder1(node.left);
		postorder1(node.right);
		System.out.print(node.data + " ");
	}

	class pair {
		Node node;
		boolean isLeft;
		boolean isRight;
		boolean isSelf;

		public pair(Node node) {
			this.node = node;
		}
	}

	public void PreorderItr(Node node) {
		Stack<pair> stack = new Stack<>();
		while (!stack.isEmpty()) {
			pair peekpair = stack.peek();
			stack.push(new pair(root));
			if (!peekpair.isSelf) {
				System.out.println(node.data);
				peekpair.isSelf = true;
			} 
			else if (!peekpair.isLeft) {
				pair lp = new pair(peekpair.node.left);
				if(peekpair.node.left!=null)
					stack.push(lp);
				peekpair.isLeft = true;

			}
			else if (!peekpair.isRight) {
				pair lp = new pair(peekpair.node.right);
				if(peekpair.node.right!=null)
					stack.push(lp);
				peekpair.isRight = true;

			}
			else
			{
				stack.pop();
			}
		}
	}

	public BinaryTree(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	public Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (plo > phi) {
			return null;
		}
		Node nn = new Node();
		nn.data = pre[plo];
		int idx = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (pre[plo] == in[i]) {
				idx = i;
				break;
			}
		}
		int nel = idx - ilo;
		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, idx - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, idx + 1, ihi);
		return nn;
	}
}
