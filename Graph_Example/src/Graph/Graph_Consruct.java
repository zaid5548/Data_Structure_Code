package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph_Consruct {

	private int[][] matrix;
	private int numV;
//	public Graph_Consruct()
//	{
//		this.Graph_Consruct(5);
//	}
	public Graph_Consruct(int vertices)
	{
		numV=vertices;
		matrix=new int[numV+1][numV+1];
	}
	public void addEdge(int u,int v,int wt)
	{
		matrix[u][v]=wt;
		matrix[v][u]=wt;
	}
	
	@Override
	public String toString()
	{
		String str="";
		for(int u=1;u<=numV;u++)
		{
			str+=u+"-> ";
			for(int v=1;v<=numV;v++)
			{
				if(matrix[u][v]!=0)
					str+=(v+", ");
			}
			str+="\n";
		}
		return str;
	
	}
	public int numEdge()
	{
		int count=0;
		for(int u=1;u<=numV;u++)
		{
			for(int v=1;v<=numV;v++)
			{
				if(matrix[u][v]!=0)
					count++;
			}
		}
	return count/2;
	}
	
	public boolean containsEdge(int u,int v)
	{
		return matrix[u][v]!=0;
	}
	public int removeEdge(int u,int v)
	{
		int val=matrix[u][v];
		matrix[u][v]=0;
		matrix[v][u]=0;
		return val;
	}
	public boolean hashPath(int u,int v)
	{
		return hashPath(u, v,new HashMap<>());
	}
	private boolean hashPath(int u,int v,HashMap<Integer, Boolean> visited)
	{
		if(u==v||containsEdge(u, v)) {
			return true;
		}
		
		visited.put(u, true);
		for(int nbr=1;nbr<=numV;nbr++)
		{
			if(containsEdge(u, nbr)&&!visited.containsKey(nbr))
			{
				boolean ans=hashPath(nbr, v, visited);
				if(ans)
				{
					return true;
				}
			}
			
		}
		return false;
	}
	public boolean hasPath(int u, int v) {



		return hasPath(u, v, new HashMap<>(), "");

	}



	private boolean hasPath(int u, int v, HashMap<Integer, Boolean> visited, String asf) {



		if (containsEdge(u, v)) {

			System.out.println(asf + u + v);

			return true;

		}



		visited.put(u, true);



		for (int nbr = 1; nbr <= numV; nbr++) {



			if (containsEdge(u, nbr) && !visited.containsKey(nbr)) {



				boolean ans = hasPath(nbr, v, visited, asf + u);

				if (ans) {

					return true;

				}

			}



		}



		return false;



	}
	
	private void hasAllPath(int u, int v, HashMap<Integer, Boolean> visited, String asf) {



		if (u == v) {

			System.out.println(asf + v);

			return;

		}



		visited.put(u, true);



		for (int nbr = 1; nbr <= numV; nbr++) {



			if (containsEdge(u, nbr) && !visited.containsKey(nbr)) {



				hasAllPath(nbr, v, visited, asf + u);



			}



		}



		visited.remove(u);



	}



	class pair {

		int data;

		String psf;



		public pair(int d, String p) {

			data = d;

			psf = p;

		}

	}
	
	public boolean BFS(int u, int v) {



		LinkedList<pair> queue = new LinkedList<>();



		pair np = new pair(u, "");

		queue.addLast(np);



		HashMap<Integer, Boolean> visited = new HashMap<>();



		while (!queue.isEmpty()) {



			pair rp = queue.removeFirst();



			if (visited.containsKey(rp.data)) {



				// isCyclic

				continue;

			}



			if (rp.data == v) {

				System.out.println(rp.psf + v);

				return true;

			}



			System.out.println(rp.data + "->" + rp.psf + rp.data);



			visited.put(rp.data, true);



			for (int nbr = 1; nbr <= numV; nbr++) {



				if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {

					pair nbrPair = new pair(nbr, rp.psf + rp.data);

					queue.addLast(nbrPair);

				}

			}



		}



		return false;



	}
	
	public void BFT() {



		HashMap<Integer, Boolean> visited = new HashMap<>();



		for (int u = 1; u <= numV; u++) {



			if (visited.containsKey(u)) {

				continue;

			}



			LinkedList<pair> queue = new LinkedList<>();

			pair np = new pair(u, "");

			queue.addLast(np);



			while (!queue.isEmpty()) {



				pair rp = queue.removeFirst();



				if (visited.containsKey(rp.data)) {



					// isCyclic

					continue;

				}



				System.out.println(rp.data + " -> " + rp.psf + rp.data + ", ");



				visited.put(rp.data, true);



				for (int nbr = 1; nbr <= numV; nbr++) {



					if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {

						pair nbrPair = new pair(nbr, rp.psf + rp.data);

						queue.addLast(nbrPair);

					}

				}



			}



		}

	}
	
	public boolean DFS(int u, int v) {
		LinkedList<pair> stack = new LinkedList<>();
		pair np = new pair(u, "");
		stack.push(np);
		HashMap<Integer, Boolean> visited = new HashMap<>();
		while (!stack.isEmpty()) {
			pair rp = stack.pop();
			if (visited.containsKey(rp.data)) {
				// isCyclic
				continue;
			}
			if (rp.data == v) {
				System.out.println(rp.psf + v);
				return true;
			}
			System.out.println(rp.data + "->" + rp.psf + rp.data);
			visited.put(rp.data, true);
			for (int nbr = 1; nbr <= numV; nbr++) {
				if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {
					pair nbrPair = new pair(nbr, rp.psf + rp.data);
					stack.push(nbrPair);
				}
			}
		}
		return false;
	}

	public void DFT() {
		HashMap<Integer, Boolean> visited = new HashMap<>();
		for (int u = 1; u <= numV; u++) {
			if (visited.containsKey(u)) {
				continue;
			}
			LinkedList<pair> stack = new LinkedList<>();
			pair np = new pair(u, "");
			stack.push(np);
			while (!stack.isEmpty()) {
				pair rp = stack.pop();
				if (visited.containsKey(rp.data)) {
					// isCyclic
					continue;
				}
				System.out.println(rp.data + " -> " + rp.psf + rp.data + ", ");
				visited.put(rp.data, true);
				for (int nbr = 1; nbr <= numV; nbr++) {
					if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {
						pair nbrPair = new pair(nbr, rp.psf + rp.data);
						stack.push(nbrPair);
					}
				}
			}
		}
	}
	
	public boolean isCyclic()
	{
		HashMap<Integer, Boolean> visited = new HashMap<>();
		for (int u = 1; u <= numV; u++) {
			if (visited.containsKey(u)) {
				continue;
			}
			LinkedList<pair> stack = new LinkedList<>();
			pair np = new pair(u, "");
			stack.push(np);
			while (!stack.isEmpty()) {
				pair rp = stack.pop();
				if (visited.containsKey(rp.data)) {
					return true;
				}
//				System.out.println(rp.data + " -> " + rp.psf + rp.data + ", ");
				visited.put(rp.data, true);
				for (int nbr = 1; nbr <= numV; nbr++) {
					if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {
						pair nbrPair = new pair(nbr, rp.psf + rp.data);
						stack.push(nbrPair);
					}
				}
			}
		}
		return false;
		
	}

	
	
	public boolean isConnected()
	{
		int connect=0;
		HashMap<Integer, Boolean> visited = new HashMap<>();
		for (int u = 1; u <= numV; u++) {
			if (visited.containsKey(u)) {
				continue;
			}
			connect++;
			
			LinkedList<pair> stack = new LinkedList<>();
			pair np = new pair(u, "");
			stack.push(np);
			while (!stack.isEmpty()) {
				pair rp = stack.pop();
				if (visited.containsKey(rp.data)) {
					// isCyclic
					continue;
				}
			
//				System.out.println(rp.data + " -> " + rp.psf + rp.data + ", ");
				visited.put(rp.data, true);
				for (int nbr = 1; nbr <= numV; nbr++) {
					if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {
						pair nbrPair = new pair(nbr, rp.psf + rp.data);
						stack.push(nbrPair);
					}
				}
			}
		}
		return connect==1;
	}
	

	public boolean isTree()
	{
		return !isCyclic()&&isConnected();
	}
	
	public ArrayList<ArrayList<Integer>> getConnectComponents(){
		HashMap<Integer, Boolean> visited = new HashMap<>();
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		for (int u = 1; u <= numV; u++) {
			if (visited.containsKey(u)) {
				continue;
			}
			ArrayList<Integer> list1=new ArrayList<>();
			LinkedList<pair> queue = new LinkedList<>();
			pair np = new pair(u, "");
			queue.addLast(np);
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();
				if (visited.containsKey(rp.data)) {
					// isCyclic
					continue;
				}
				list1.add(rp.data);
				System.out.println(rp.data + " -> " + rp.psf + rp.data + ", ");
				visited.put(rp.data, true);
				for (int nbr = 1; nbr <= numV; nbr++) {
					if (containsEdge(rp.data, nbr) && !visited.containsKey(nbr)) {
						pair nbrPair = new pair(nbr, rp.psf + rp.data);
						queue.addLast(nbrPair);
					}
				}
			}
			ans.add(list1);
		}
		return ans;
	}
}
