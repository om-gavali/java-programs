class A
{
   void display()
   {
     System.out.println("hellooooo");
   }
}
class overriding extends A
{
	void display()
    {
		super.display();
		 System.out.println("world");
	}
	
	public static void main(String args[])
	{
	   overriding b=new overriding ();
	   b.display ();
	}
}