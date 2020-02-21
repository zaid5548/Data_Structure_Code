package Lac8;

import java.util.ArrayList;

public class Crux {
	public static void main(String arg[]) {
		ArrayList<String> rr = new ArrayList<>();
		 System.out.println(Subseq("abc"));
		// System.out.println(SubseqwithAscii("abc"));
		// System.out.println(cointoss(3));
		// System.out.println(mazepathDig(0, 0, 2, 2));
		// System.out.println(mazepathMM(0, 0, 2, 2));
		//System.out.println(BoardPath(0, 10));
		 System.out.println(mazepath(0, 0, 2, 2));

	}

	
	  public static ArrayList<String> Subseq(String str) { if(str.length()==0) {
	  ArrayList<String> br=new ArrayList<>(); br.add(""); return br; } char
	  ch=str.charAt(0);
	  
	  String ros=str.substring(1); ArrayList<String> rr=Subseq(ros);
	  //rr.add(ch);
	  ArrayList<String> mr=new ArrayList<>(); for(String val:rr) { mr.add(val);
	  mr.add(ch+val); } return mr;
	  
	  }
	 
	/*
	 * public static ArrayList<String> SubseqwithAscii(String str) { if
	 * (str.length() == 0) { ArrayList<String> br = new ArrayList<>(); br.add("");
	 * return br; } char ch = str.charAt(0);
	 * 
	 * String ros = str.substring(1); ArrayList<String> rr = SubseqwithAscii(ros);
	 * // rr.add(ch); ArrayList<String> mr = new ArrayList<>(); for (String val :
	 * rr) { mr.add(val); mr.add(ch + val); mr.add((int)ch+val); } return mr;
	 * 
	 * }
	 */
	/*
	 * public static ArrayList<String> cointoss(int n) { if(n==0) {
	 * ArrayList<String> br = new ArrayList<>(); br.add(""); return br; }
	 * ArrayList<String> rr=cointoss(n-1); ArrayList<String> mr=new ArrayList<>();
	 * for(String val:rr) { mr.add("H"+val); mr.add("T"+val); } return mr; }
	 */
	
	  public static ArrayList<String> mazepath(int cr, int cc, int er, int ec)
	  {
	if(cr == er && cc == ec) 
	{
		ArrayList<String> br = new ArrayList<>();
	  br.add("");
	  return br; 
	  }
	if (cr > er || cc > ec) {
		ArrayList<String> br = new ArrayList<>();
		return br;
	  }
	ArrayList<String> rr1 = mazepath(cr + 1, cc, er,ec);
	ArrayList<String> mr = new ArrayList<>(); 
	for (String val : rr1) {
	  mr.add("V" + val); 
	  }
	ArrayList<String> rr2 = mazepath(cr, cc + 1, er, ec);
	  for (String val : rr2) 
	  {
		  mr.add("H" + val);
		  }
	  ArrayList<String> rr3 = mazepath(cr+1, cc + 1, er, ec);
	  for (String val : rr3) 
	  {
		  mr.add("D" + val);
		  }
	  return mr; 
	  }
	 
	
	public static ArrayList<String> BoardPath(int cur, int end) {
		if (cur == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cur > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr1 = BoardPath(dice + cur, end);
			for (String val : rr1) {
				mr.add(dice + val);
			}

		}

		return mr;
	}
}