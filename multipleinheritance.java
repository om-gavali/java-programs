interface A
{
   void get ();
}
interface B extends A
{
  void get1 ();
}
class multipleinheritance implements A,B
{
   public void get()
   {
     System.out.println("hello");
   }
   public void get1()
   {
     System.out.println("world");
   }
   void get2()
   {
     System.out.println("welcome");
   }
   
   public static void main(String args[])
   {
      multipleinheritance m=new multipleinheritance ();
	  
	  m.get();
	  m.get1();
	  m.get2();
	 
   }
}