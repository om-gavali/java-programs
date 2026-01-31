class A
{
	void get()
	{
	  System.out.println("this is base class");
	}
}
class singleinheritance extends A
{
		void display()
	{
	  System.out.println("this is derived class");
	}
  public static void main (String args[])
  {
     singleinheritance s=new singleinheritance();
	 s.get ();
	 s.display();
  }
}