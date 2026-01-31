import java.util.*;
class Array
{
  public static void main (String args[])
  {
	  int i;
     int a[]=new int [100];
	 
	 Scanner sc=new Scanner (System.in);
	 
	 System.out.println("enter number");
	 int n=sc.nextInt();
	 
	 System.out.println("enyer array element=");
	 for( i=0;i<n;i++)
	 {
	 a[i]=sc.nextInt();
	 }
	 
	 System.out.println("array element=");
	 for(i=0;i<n;i++)
	 {
	 System.out.println(i);
	 }
	 
  }
}