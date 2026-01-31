import java.util.*;
class sumarray
{
	public static void main (String args[])
	{
	   int i, a[]=new int[100];
	int sum=0;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("eneter array size=");
		int n=sc.nextInt();
		
		System.out.println("enter arrya=");
		for (i=0;i<n;i++)
		{
		   a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
		  sum=sum+a[i];
		}
	   
	   System.out.println("addition of array element is="+sum);
	}
}