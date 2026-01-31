interface A
{
   void get ();
}
interface B
{
  void display ();
}
class multipleinheritance implements A,B
{
     public void get ()
	 {
	   System.out.println("this is from interface A");
	 }
	 public void display ()
	 {
	   System.out.println("this is from interface B");
	 }
	 
	 public static void main (String args[])
	 {
	  multipleinheritance m=new multipleinheritance ();
	  m.get ();
	  m.display();
	 }
}