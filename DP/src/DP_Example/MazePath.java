package DP_Example;

public class MazePath {

	public static void main(String[] args) {
		int n = 2;
		int m = 2;
		System.out.println(mazepath(0, 0, n, m));
		System.out.println("*************************************");
		int[][] strg = new int[n + 1][m + 1];
		System.out.println(mazepathTD(0, 0, n, m, strg));
		System.out.println("******************************");
		System.out.println(mazepathBU(n, m));
		System.out.println("*************************************");
		System.out.println(mazepathBUSE(n, m));
		System.out.println("*********");
		System.out.println(mazepathBUSE_dia(2, 2));
	}

	public static int mazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count += mazepath(cr, cc + 1, er, ec);
		count += mazepath(cr + 1, cc, er, ec);
		count += mazepath(cr + 1, cc + 1, er, ec);
		return count;
	}

	public static int mazepathTD(int cr, int cc, int er, int ec, int[][] strg) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (strg[cc][cr] != 0) {
			return strg[cc][cr];
		}
		int count = 0;
		count += mazepathTD(cr, cc + 1, er, ec, strg);
		count += mazepathTD(cr + 1, cc, er, ec, strg);
		count += mazepathTD(cr + 1, cc + 1, er, ec, strg);
		strg[cr][cc] = count;
		for (int[] st : strg) {
			for (int s : st) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		return count;
	}

	public static int mazepathBU(int er, int ec) {
		int[][] strg = new int[er + 2][ec + 2];
		for (int cr = er; cr >= 0; cr--) {
			for (int cc = ec; cc >= 0; cc--) {
				if (cr == er && cc == ec) {
					strg[cr][cc] = 1;
					continue;
				}
				strg[cr][cc] = strg[cr + 1][cc] + strg[cr][cc + 1];
			}
		}
		return strg[0][0];
	}

	public static int mazepathBUSE(int er, int ec) {
		int[] strg = new int[ec + 2];
		for (int cr = er; cr >= 0; cr--) {
			for (int cc = ec; cc >= 0; cc--) {
				if (cr == er && cc == ec) {
					strg[cc] = 1;
					continue;
				}
				strg[cc] = strg[cc] + strg[cc + 1];
			}
		}
		return strg[0];
	}

	public static int mazepathBUSE_dia(int er, int ec) {
		int[] strg = new int[ec + 2];
		for (int cr = er; cr >= 0; cr--) {

			int dia = 0;
			for (int cc = ec; cc >= 0; cc--) {

				int temp = strg[cc];
				if (cr == er && cc == ec) {
					strg[cc] = 1;
					continue;
				}
				strg[cc] = strg[cc] + strg[cc + 1] + dia;

				dia = temp;
			}
		}
		return strg[0];
	}
}
