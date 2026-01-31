class A
{
	void display()
   {
     System.out.println("this is base class");
   }
}
class singleinheritance extends A
{
	void display1()
   {
     System.out.println("this is derived class");
   }
   
   public static void main (String args[])
   {
    singleinheritance s=new singleinheritance();
	
	s.display();
	s.display1();
   }
}