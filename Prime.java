import java.util.*;
public class Prime {

  public static void main(String[] args) {

   Scanner sc=new Scanner (System.in);
	    
			 System.out.println("enter number=");
			 int n=sc.nextInt();
	int flag = 0;
    for (int i=2;i<=n/2;++i)
	{    
      if (n%i==0)
	  {
        flag = 1;
        break;
      }
    }

    if (flag==0)
	{
      System.out.println(" is not a prime number");
	}
    else
	{
      System.out.println(" is  a prime number.");
	}
  }
}