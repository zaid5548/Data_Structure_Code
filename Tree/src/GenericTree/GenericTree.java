package GenericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class GenericTree {

	public class Node
	{
		int data;
		ArrayList<Node> children=new ArrayList<>();
		
	}
	private Node root;
	Scanner scn=new Scanner(System.in);
	public GenericTree() {
		root=construct(null,0);
	}
	public Node construct(Node parent,int ith)
	{
		if(root==null)
		System.out.println("Enter Root Node of Tree");
		else
			System.out.println("Enter Child of Root Node");
		int item=scn.nextInt();
		Node nn=new Node();
		nn.data = item;
		System.out.println("Enter Data of Child");
		int noc=scn.nextInt();
		for(int i=0;i<noc;i++)
		{
			Node child=construct(nn,i);
			nn.children.add(child);
		}
		return nn;
	}
	public void display()
	{
		display(root);
	}
	public void display(Node node)
	{
		System.out.print(node.data+"->");
		for(Node child: node.children)
		{
			System.out.print(child.data+" ");
		}
		if(node.children.size()==0)
		
			
		{
			System.out.print(".");
		}
		System.out.println();
		for(Node child: node.children)
		{
			display(child);
		}
	}
		public int size()
	{
		return size(root);
	}
	private int size(Node node)
	{
		int ts=0;

		for(Node child: node.children)
		{
			ts+=size(child);
		}
		ts=ts+1;
		return ts;
	}
	public int height()
	{
		return height(root);
	}
	private int height(Node node)
	{
		int sh=-1;
		for(Node child: node.children)
		{
			int th=height(child);
			if(th>sh)
				sh=th;
		}
		return sh+1;
	}
	public int max()
	{
		return max(root);
	}
	public int max(Node node)
	{
		int max=node.data;
		for(Node child: node.children)
		{
			int tmp=max(child);
			if(tmp>max)
				max=tmp;
		}
		return max;
	}
	public boolean find()
	{
		return find(root,110);
	}
	public boolean find(Node node,int item)
	{
		if(node.data==item)
		{
			return true;
		}
		for(Node child: node.children)
		{
			boolean rr=find(child,item);
			if(rr)
				return true;
		}
		return false;
	}
	/*public void mirror()
	{
		 mirror(root);
	}*/
	 public void Preorder()
	 {
		 Preorder(root);
	 }
	 public void Preorder(Node node)
	 {
		 System.out.print(node.data+" ");
		 for(Node child: node.children)
		 {
			 Preorder(child);
		 }
	 }
	 public void Postorder()
	 {
		 Preorder(root);
	 }
	 public void Postorder(Node node)
	 {
		 for(Node child: node.children)
		 {
			 Postorder(child);
		 }
		 System.out.print(node.data+" ");
		
	 }
	 public void LO()
	 {
		 LO(root);
	 }
	 public void  LO(Node node)
	 {
		 LinkedList<Node> queue=new LinkedList<>();
		 queue.addLast(root);
		 while(!queue.isEmpty())
		 {
			 Node rn=queue.removeFirst();
			 System.out.print(rn.data+" ");
			 for(Node child: rn.children)
			 {
				 queue.addLast(child);
			 }
		 }		 
	 }
	 public void LOLL()
	 {
		 LOLL(root);
	 }
	 public void LOLL(Node node)
	 {
		 LinkedList<Node> queue=new LinkedList<>();
		 queue.addLast(root);
		 queue.addLast(null);
		 while(!queue.isEmpty())
		 {
			 Node rn=queue.removeFirst(); 
			 if(rn==null)
			 {
				 if(queue.isEmpty())
				 {
					 break;
				 }
				 System.out.println();
				 queue.addLast(null);
				 
				 continue;
			 }
			 System.out.print(rn.data+" ");
			 for(Node child: rn.children)
			 {
				 queue.addLast(child);
			 }
		 }	
	 }
	 public void LOLL2()
	 {
		 LOLL2(root);
	 }
	 public void  LOLL2(Node node)
	 {
		 LinkedList<Node> queue=new LinkedList<>();
		 LinkedList<Node> helper=new LinkedList<>();
		 queue.addLast(root);
		 while(!queue.isEmpty())
		 {
			 Node rn=queue.removeFirst();
			 System.out.print(rn.data+" ");
			 for(Node child: rn.children)
			 {
				 helper.addLast(child);
			 }
			 if(queue.isEmpty())
			 {
				 System.out.println();
				  queue=helper;
				  helper=new LinkedList<>();
				  			 
			 }
		 }		 
	 }
}
// 10 3 20 1 50 0 30 1 60 0 40 3 70 0 80 0 90 0
// 100 3 40 3 90 0 80 0 70 0 30 1 60 0 20 1 50 0