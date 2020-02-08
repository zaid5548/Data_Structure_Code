package Array_Problem;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		//Rotate(arr,3);
		Rotate2(arr,3);
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
	}
	public static void Rotate(int[] arr,int r)
	{
		r=r%arr.length;
		if(r<0)
		{
			r+=arr.length;
		}
		for(int j=0;j<r;j++) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	}
  
	public static void Rotate2(int[] arr,int r)
	{
		int length=arr.length;
		int i=arr.length-r;
		reverse(arr,0,i-1);
		reverse(arr,i,length-1);
		reverse(arr,0,length-1);
	}
	public static void reverse(int[] arr,int i,int j)
	{
		int low=i;
		int high=j;
		while(low<high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}




}

