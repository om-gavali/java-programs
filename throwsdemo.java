import java.util.*;
class throwsdemo
{
 
   public static void main(String args[])throws ArithmeticException,NullPointerException
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enetr age=");
	   int m=sc.nextInt();
		try
		{
			if(m>18)
			{
				throw new ArithmeticException(" eligible");
			}
			else
			{
			throw new ArithmeticException("not eligible");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

   }
   
}