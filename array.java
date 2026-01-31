 import java.util.*;
class array
{
  public static void main (String args[])
  {
    int a[]=new int [5];
	
	Scanner sc=new Scanner(System.in);

    System.out.println("enter array");
	for(int i=0;i<5;i++)
	{
	a[i]=sc.nextInt();
	}
	
	for(int i=0;i<5;i++)
	{
	System.out.println(a[i]);
	}
  }
}