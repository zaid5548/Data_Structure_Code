package Lac10;

public class PrintApproch {

	public static void main(String[] args) {
		// subseq("abc","");
		// subseqAscii("abc","");
		keypad("145", "");
		// prmt("abe", "");
		// mazepath(0,0,2,2,"");
		// mazepathMM(0,0,2,2,"");
		// System.out.println(mazepathMMCount(0, 0, 2, 2, ""));
//		System.out.println(boardpath(0,10,""));
		// Lexicography(0,1000);
	}

	/*
	 * public static void subseq(String ques,String ans) { if(ques.length()==0) {
	 * System.out.print(" "+ans); return; } char ch=ques.charAt(0); String
	 * ros=ques.substring(1);
	 * 
	 * subseq(ros,ans+ch); subseq(ros,ans); }
	 */
	/*
	 * public static void subseqAscii(String ques,String ans) { if(ques.length()==0)
	 * { System.out.print(" "+ans); return; } char ch=ques.charAt(0); String
	 * ros=ques.substring(1); subseqAscii(ros,ans+ch); subseqAscii(ros,ans); }
	 */

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch =='6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else
			return "";
	}

	public static void keypad(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
//		System.out.println(ques);
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
//			System.out.println("**");
			keypad(ros, ans + code.charAt(i));
		}

	}

	/*
	 * public static void prmt(String ques, String ans) { if (ques.length() == 0) {
	 * System.out.println(ans); return; } for (int i = 0; i < ques.length(); i++) {
	 * char ch = ques.charAt(i); String ros = ques.substring(0, i) +
	 * ques.substring(i + 1); prmt(ros, ans + ch); } }
	 */
	/*
	 * public static void mazepathMM(int cr,int cc,int/ er,int ec,String ans) {
	 * if(cr==er && cc==ec) { System.out.println(ans); return; } if(cr>er || cc>ec)
	 * { return; } for(int m=1;m<=ec;m++) { mazepathMM(cr,cc+m,er,ec,ans+"H"); }
	 * for(int m=1;m<=er;m++) { mazepathMM(cr+m,cc,er,ec,ans+"V"); } for(int
	 * m=1;m<=ec&&m<=er;m++) { mazepathMM(cr+m,cc+m,er,ec,ans+"D"); } }
	 */
	public static int mazepathMMCount(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(" " + ans);
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count += mazepathMMCount(cr, cc + 1, er, ec, ans + "H");
		count += mazepathMMCount(cr + 1, cc, er, ec, ans + "V");
		count += mazepathMMCount(cr + 1, cc + 1, er, ec, ans + "D");
		return count;
	}

	public static int boardpath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int cnt = 0;
		for (int dice = 1; dice <= 6; dice++) {
			cnt += boardpath(curr + dice, end, ans + dice);

		}
		return cnt;
	}
	/*
	 * public static void Lexicography(int curr,int end) {
	 * 
	 * if(curr>end) { return; } int i=0; System.out.println(curr); if(curr==0) {
	 * i=1; } while(i<=9) { Lexicography(curr*10+i,end); i++; } }
	 */
}
