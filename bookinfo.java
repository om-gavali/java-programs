import java.util.*;
class book
{
	String author;
	String title;
	int price,stock;
	
	Scanner sc=new Scanner(System.in);
	
    void getinfo()
	{
	   System.out.println("enter author name=");
	   author=sc.next ();
	   
	   System.out.println("enter book title=");
	   title=sc.next ();
	   
	   System.out.println("enter book's price=");
	   price=sc.nextInt ();
	}
}
class bookinfo extends book
{
	   void bookinfo1 ()
	   {
	     System.out.println("enter books stocks=");
		 stock=sc.nextInt ();
	   }
	   
	   void display ()
	   {
	    System.out.println(" book's author="+author);
	    System.out.println(" book's title="+title);
	    System.out.println(" book's price="+price);
	    System.out.println(" book's int stock="+stock);
	   }
	   
	   public static void main(String args[])
	   {
	      bookinfo k=new bookinfo ();
	      bookinfo a=new bookinfo ();
	      bookinfo g=new bookinfo ();
		  
		  k.getinfo ();
		  k.bookinfo1();
		  
		  a.getinfo ();
		  a.bookinfo1();
		 
		  g.getinfo ();
		  g.bookinfo1();
		  
		  k.display ();
		  a.display ();
		  g.display ();
	   }
}