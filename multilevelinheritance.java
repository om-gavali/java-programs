class A
{
	void display()
   {
     System.out.println("this is base class");
   }
}
class B extends A
{
	void display1()
   {
     System.out.println("this is derived class");
   }
}
class multilevelinheritance extends B
{
	void display2()
   {
     System.out.println("this is derived class from another derived class");
   }

   public static void main (String args[])
   {
    multilevelinheritance s=new multilevelinheritance();
	
	s.display();
	s.display1();
	s.display2();
   }
}