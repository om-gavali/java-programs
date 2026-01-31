import java.util.*;
class myexception extends Exception
{
		myexception(String a)
		{
		  super(a);
		}
}
class userexception
{
 public static void main (String args[])
 {
     String password="MSBTE";
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("enter password=");
	 String pass=sc.next();
	 
	 try
	 {
		if(pass.equals(password))
		{
		 throw new myexception(" Match Exception");
		}
		else
		{
		throw new myexception("No Match Exception");
		}
	 }
	 catch(myexception a)
	 {
	 System.out.println(a);
	 }
 }
}