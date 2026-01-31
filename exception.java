import java.util.*;
class exception extends Exception
{
   exception(String msg)
   {
     super(msg);
   }
}
class exceptiondemo
{
  public static void main (String args[])
  {
  int pass=1234;
    Scanner sc=new Scanner (System.in);
	
	System.out.println("enter your password=");
	int password=sc.nextInt();
	
		try
		{
		  if(pass==password)
		  {
			throw new exception("Authentication sucessfull");
		  }
		  else
		  {
		   throw new exception("Authentication Failure");
		  }
		}
		catch(exception e)
		{
			System.out.println(e);
		}
	
  }
} 