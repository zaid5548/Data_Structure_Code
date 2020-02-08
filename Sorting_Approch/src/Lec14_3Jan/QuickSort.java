package Lec14_3Jan;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 4, 7, 2, 9 };
		quicksort(arr, 0, arr.length - 1);
		for (int val : arr)

		{
			System.out.println(val + " ");
		}
	}

	public static void quicksort(int[] arr, int lo, int hi) {
		int lft = lo;
		int rgt = hi;
		int mid = (lft + rgt) / 2;
		int pivot = arr[mid];
		if (lft >= rgt)

		{
			return;
		}
		while (lft <= rgt) {
			while (arr[lft] < pivot) {
				lft++;
			}
			while (arr[rgt] > pivot) {
				rgt--;
			}
			if (lft <= rgt) {
				int tmp = arr[lft];
				arr[lft] = arr[rgt];
				arr[rgt] = tmp;
				lft++;
				rgt--;
			}
		}
		quicksort(arr, lo, rgt);
		quicksort(arr, lft, hi);
	}
}
