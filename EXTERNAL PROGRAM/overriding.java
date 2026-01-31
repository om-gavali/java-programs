class A
{
    void display ()
	{
	  System.out.println("this is base class");
	}
}
class overriding extends A
{	
    void display ()
	{
		super.display();
		System.out.println("this is derived class");
	}
  public static void main (String args[])
  {
     overriding o=new overriding ();
	 o.display();
  }
}