package Pattern1;
import java.util.Scanner;
public class Alex_shoping
{static Scanner scn=new Scanner(System.in);
public static void main(String args[]) {
    int arr[]=input();
    int[][] mon=Money();
    
    check(arr,mon);
    
}
    
public static int[] input()
{
    int n=scn.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<=arr.length-1;i++)
    {
        arr[i]=scn.nextInt();
    }
    return arr;
}
  public static int[][] Money()
{
    int q=scn.nextInt();
    int[][] mon=new int[q][2];
    for(int i=0;i<=mon.length-1;i++)
    {     for(int k=0;k<=1;k++)
    {
        mon[i][k]=scn.nextInt();
        
        
    }
    }
    return mon;
}
public static void check(int[] arr,int[][] mon)
{
    for(int i=0;i<=mon.length-1;i++)
    {    
        
        int x=0;
        for(int j=0;j<=arr.length-1;j++)
        {    
            if(mon[i][0]%arr[j]==0)
            x++;   
        }
        if(x==mon[i][1])
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
}