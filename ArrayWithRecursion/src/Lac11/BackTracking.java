package Lac11;

import javax.sound.midi.Synthesizer;

public class BackTracking {

	public static void main(String[] args) {
		int n = 4;
		int m = 4;
		// boolean[][] board = new boolean[n][m];
		// queen_prmts(board,0,2,"");
		// queenCom(board,0,2,-1,"");

		// int[] coins= {2,3,5};
		// coinsprmt(coins, 0, 10, "");
		// coinsCom(coins, 0, 10,0, "");
		// QueenCombBoxrespect(board, 0, 0, 2, "");
		// NQueen(board, 0, 0, 4, "");
		//int[][] board = { { 0, 1, 0, 1 }, { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 1, 0, 0, 0 } };
		//boolean[][] visited = new boolean[board.length][board[0].length];
		//BlockedMaze(board, 0, 0, "", visited);
		char[][] board = { { 'A', 'B', 'c', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E'}};
		String word="SEE";
		boolean[][] visited = new boolean[board.length][board[0].length];
		boolean rr=false;
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[0].length;j++)
			{
				rr=rr||WordSearch(board,i,j,word,visited);
			}
		}
		System.out.println(rr);
		}

	/*
	 * public static void queen_prmts(boolean[] board,int qpsp,int tq,String ans) {
	 * if(qpsp==tq) { System.out.println(ans); return; } for(int
	 * i=0;i<board.length;i++) { if(board[i]==false) { board[i]=true;
	 * queen_prmts(board,qpsp+1,tq,ans+"b" + i+ "(q"+(qpsp+1)+")"); board[i]=false;
	 * } } }
	 */
	/*
	 * public static void queenCom(boolean[] board,int qpsp,int
	 * tq,intLastIndex,String ans) { if(qpsp==tq) { System.out.println(ans); return;
	 * } for(int i=LastIndex+1;i<board.length;i++) { if(board[i]==false) {
	 * board[i]=true; queenCom(board,qpsp+1,tq,i,ans+"b" + i+ "(q"+(qpsp+1)+")");
	 * board[i]=false; } } }
	 */
	/*
	 * public static void coinsprmt(int[] coins,int amt,int Target,String ans) {
	 * if(amt==Target) { System.out.println(ans); return; } if(amt>Target) {
	 * 
	 * return; } for(int i=0;i<coins.length;i++) {
	 * coinsprmt(coins,amt+coins[i],Target,ans+coins[i]); } }
	 */
	/*
	 * public static void coinsCom(int[] coins,int amt,int Target,int
	 * LastIndex,String ans) { if(amt==Target) { System.out.println(ans); return; }
	 * if(amt>Target) {
	 * 
	 * return; } for(int i=LastIndex;i<coins.length;i++) {
	 * coinsCom(coins,amt+coins[i],Target,i,ans+coins[i]); } }
	 */
	/*
	 * public static void QueenCombBoxrespect(boolean[] board, int vidx, int qpsp,
	 * int tq, String ans) { if (qpsp == tq) { System.out.println(ans); return; } if
	 * (qpsp > tq) { return; } if(vidx==board.length) { return; } // placed
	 * board[vidx] = true; QueenCombBoxrespect(board, vidx + 1, qpsp + 1, tq, ans +
	 * "b" + vidx + "(q" + (qpsp + 1) + ")"); board[vidx] = false; // UnPlaced
	 * QueenCombBoxrespect(board, vidx + 1, qpsp, tq, ans);
	 */
	/*
	 * public static void NQueen(boolean[][] board, int row, int qpsf, int tq,
	 * String ans) { if (qpsf == tq) { System.out.println(ans+"\t"); return; } if
	 * (row >= board[0].length) { return; } for (int col = 0; col < board.length;
	 * col++) { if (isItSafe(board, row, col)) { board[row][col] = true;
	 * NQueen(board, row + 1, qpsf + 1, tq, ans + "b" + row + "-" + "b" + col);
	 * board[row][col] = false; } } }
	 * 
	 * public static boolean isItSafe(boolean[][] board, int row, int col) { int cr
	 * = row; int cc = col - 1; while (cc >= 0) { if (board[cr][cc]) { return false;
	 * } cc--; } cr = row - 1; cc = col; while (cr >= 0) { if (board[cr][cc]) {
	 * return false; } cr--; } cr = row - 1; cc = col - 1; while (cr >= 0 && cc >=
	 * 0) { if (board[cr][cc]) { return false; } cr--; cc--; } cr = row - 1; cc =
	 * col + 1; while (cr >= 0 && cc < board[0].length) { if (board[cr][cc]) {
	 * return false; } cr--; cc--;
	 * 
	 * }
	 * 
	 * return true; }
	 */
	/*public static void BlockedMaze(int[][] board, int cr, int cc, String ans, boolean[][] visited) {
		if (cr == board.length - 1 && cc == board[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] == 1 || visited[cr][cc]) {
			return;
		}
		visited[cr][cc] = true;
		BlockedMaze(board, cr - 1, cc, ans + "U", visited);
		BlockedMaze(board, cr + 1, cc, ans + "D", visited);
		BlockedMaze(board, cr, cc - 1, ans + "L", visited);
		BlockedMaze(board, cr, cc + 1, ans + "R", visited);
		visited[cr][cc] = false;
	}*/
	public static boolean WordSearch(char[][] board,int cr,int cc,String word,boolean[][] visited)
	{
		if(word.length()==0)
		{
			return true;
		}
		if(cr<0||cc<0||cr>=board.length||cc>=board[0].length||visited[cr][cc])
		{
			return false;
		}
		char ch=word.charAt(0);
		if(word.charAt(0)!=board[cr][cc])
		{
			return false;
		}
		String row=word.substring(1);
		visited[cr][cc]=true;
		boolean up=WordSearch(board,cr-1,cc,row,visited);
		boolean down=WordSearch(board,cr+1,cc,row,visited);
		boolean left=WordSearch(board,cr,cc-1,row,visited);
		boolean right=WordSearch(board,cr,cc+1,row,visited);
		visited[cr][cc]=false;
		return up||down||left||right;
	}
}
