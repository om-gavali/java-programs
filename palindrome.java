import java.util.*;
class palindrome
{
  public static void main (String args [])
  {
	  Scanner sc=new Scanner(System.in);
	  
	 System.out.println("enter String");
     String str=sc.next ();
	 
	 StringBuffer f=new StringBuffer(str);
	 f.reverse ();
	 String s=f.toString ();
	 
	 if(str.equals(s))
	 {
	 System.out.println("palindrome");
	 }
	 else
	 {
	   System.out.println("not palindrome");
	 }
  }
}