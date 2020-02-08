package LinkedList1;

public class LLClient {

	public static void main(String[] args) throws Exception {
		LinkList ll=new LinkList();
		ll.addLast(2);
		ll.addLast(4);
		ll.addLast(11);
		ll.addLast(34);
		ll.addLast(27);
		System.out.println("----All Adding Elements In LinkedList----");
		ll.display();
		/*System.out.println("First Element of LinkList"+"--->"+" "+ll.getFirst());
		System.out.println("Last Element of LinkList"+"--->"+" "+ll.getLast());
		System.out.println("Enter Index  get Element of LinkList"+"--->"+" "+ll.getAt(2));
		ll.AddFirst(8);
		ll.display();
		ll.AddAt(2,13);
		ll.display();
		System.out.println("--------------Then-----------");
		ll.AddAt(1,18);
		ll.display();
		System.out.println("--------------Then-----------");
		ll.AddAt(8,19);
		ll.display();
		System.out.println("----Remove first Element----");
		ll.RemoveFirst();
		ll.display();
		System.out.println("----Then Again Remove first Element----");
		System.out.println("Removed Element"+"---> "+ll.RemoveFirst());
		System.out.println("---Remove Last Element from Linkedlist----");
		System.out.println("Removed Element"+"---> "+ll.RemoveLast());
        System.out.println("Removed Indexed value"+"---> "+ll.RemoveAt(2));*/
//        ll.RDI();
        ll.display();
        System.out.println("----Reverse LinkedList with pointer----- ");
        ll.RPI();
        ll.display();
        //System.out.println("----print Reverse Recursivly-----");
        //ll.RPR();
        //ll.display();
	}

}
