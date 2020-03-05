package Graph;

public class GraphClient {

	public static void main(String[] args) {
		Graph_Consruct gp=new Graph_Consruct(7);
		gp.addEdge(1,2,3);
		gp.addEdge(1,4,2);
		gp.addEdge(2,3,4);
//		gp.addEdge(2,5,5);
		gp.addEdge(3,4,1);
		gp.addEdge(5,6,6);
		gp.addEdge(5,7,1);
		gp.addEdge(6,7,2);
//		System.out.println(gp);
//		System.out.println(gp.numEdge());
//		System.out.println(gp.containsEdge(2, 5));
//		System.out.println(gp.removeEdge(5, 7));
//		System.out.println(gp);
//		System.out.println(gp.hashPath(1, 7));
//		gp.removeEdge(2, 5);
//		System.out.println(gp.hashPath2(1, 7));
//		System.out.println(gp.BFS(1, 7));
//		System.out.println(gp);
//		gp.BFT();
//		System.out.println(gp.DFS(1, 6));
//		System.out.println(gp.DFS(1, 7));
//		System.out.println(gp.DFS(1, 2));
//		gp.DFT();
//		System.out.println(gp.isCyclic());
//		System.out.println(gp.isConnected());
//		System.out.println(gp.isTree());
		System.out.println(gp.getConnectComponents());
	}

}
