import java.util.ArrayList;
import java.util.HashMap;

public class Max_Frequency_Character {

	public static void main(String[] args) {
		//String str="aaagffgghssss";
		//System.out.println(maxFreqChar(str));
		int[] arr= {5,1,6,2,3,10,11,4,7,6,15};
		maxCountIncr(arr);
	}
	public static char maxFreqChar(String str)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				int ov=map.get(ch);
				map.put(ch, ov+1);
			}
			else
			{
				map.put(ch, 1);
			}
			//map.getOrDefault(ch, map.getOrDefault(ch, 0)+1);
		}
		int max=0;
		char res='$';
		for(char ch:map.keySet())
		{
			if(map.get(ch)>max)
			{
				max=map.get(ch);
				res=ch;
			}
		}
		return res;
		//System.out.println(map);
	}
	public static void maxCountIncr(int[] arr)
	{
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int val:arr)
		{
			if(map.containsKey(val-1))
			{
				map.put(val, false);
			}
			else
			{
				map.put(val, true);
			}
			if(map.containsKey(val+1))
				map.put(val, false);
		}
		int start=0;
		int max=0;
		for(int val:map.keySet())
		{
			int count=1;
			if(map.get(val))
			{	
			while(map.containsKey(val+count))
				count++;
			}
			if(count>max)
			{
				max=count;
				start=val;
			}
			}
		for(int i=start;i<=max;i++)
		{
			System.out.print(i+" ");
		}
	}

	
}
