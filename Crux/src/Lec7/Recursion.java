package Lec7;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 9, 2, 6 };
		// printArray(arr,0);
		// System.out.println(max(arr,0));
		// System.out.println(firstOccurence(arr,0,2));
		//System.out.println(SecondOccurence(arr, 0, 2));
		System.out.println(AllOccurence(arr, 0, 2,0));
	}

	/*
	 * public static void printArray(int[] arr,int vidx) { if(vidx==arr.length) {
	 * return; } System.out.println(arr[vidx]); printArray(arr,vidx+1);
	 * 
	 * }
	 */
	/*
	 * public static int max(int[] arr,int vidx) { if(vidx==arr.length) { return
	 * Integer.MIN_VALUE; } int m=max(arr,vidx+1); if(m>arr[vidx]) return m; else
	 * return arr[vidx]; }
	 */
	/*
	 * public static int firstOccurence(int[] arr,int vidx,int item) {
	 * if(vidx==arr.length) { return -1; }
	 * 
	 * if(arr[vidx]==item) { return vidx; } else { int
	 * rr=firstOccurence(arr,vidx+1,item); return rr; } }
	 */
	/*public static int SecondOccurence(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}

		int s = SecondOccurence(arr, vidx + 1, item);

		if (arr[vidx] == item) {
			// return vidx;
			return Math.max(vidx, s);

		} else {
			return s;
		}
	}*/
	public static int[] AllOccurence(int[] arr, int vidx, int item,int count) {
		if (vidx == arr.length) {
			int[] br=new int[count];
			return br;
		}
		if(vidx!=item)
		{
			return AllOccurence(arr,vidx+1,item,count);
		}
		else
		{
			int[] rr= AllOccurence(arr,vidx+1,item,count+1);
		   rr[count]=vidx;
			return rr;
		}
	}
}
