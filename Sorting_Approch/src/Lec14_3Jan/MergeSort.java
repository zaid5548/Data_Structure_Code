package Lec14_3Jan;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr={1,4,3,7,5};
		int[] sol=mergesort(arr,0,arr.length-1);
		for(int val:sol)
		{
			System.out.println(val);
		}

	}
	public static int[] mergesort(int[] arr,int lo,int hi)
	{
		if(lo==hi)
		{
			int[] br=new int[1];
			br[0]=arr[lo];
			
			return br;
		}
		int mid=(lo+hi)/2;
		int[] fh=mergesort(arr,lo,mid);
		int[] sh=mergesort(arr,mid+1,hi);
		int[] ans=mergeTwosortArray(fh,sh);
		return ans;
	}
	public static int[] mergeTwosortArray(int[] one,int[] two)
	{
		int i=0,j=0,k=0;
		int[] res=new int[one.length+two.length];
		while(i<one.length && j<two.length)
		{
		if(one[i]<two[j])
		{
			res[k]=one[i];
			i++;
			k++;
		}
		else
		{
			res[k]=two[j];
			j++;
			k++;
		}
		}
		while(i<one.length)
		{
			res[k]=one[i];
			i++;
			k++;
		}
		while(j<two.length)
		{
			res[k]=two[j];
			j++;
			k++;
		}
		return res;
		
		}

}
