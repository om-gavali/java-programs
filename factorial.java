import java.util.*;
class factorial
{
	public static void main(String args[])
	{
	  int n,i,fact=0;
	  
	  Scanner sc=new Scanner (System.in);
	  
	  System.out.println("enter number");
	  n=sc.nextInt();
	  
	  for(i=1;i<=n;i++)
	  {
		fact=fact*i;
	  }
	  
	  System.out.println("factorial of is="+fact);
	}
}