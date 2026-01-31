class constructor
{
	constructor ()
	{
	  System.out.println("this is constructor");
	}
	constructor (int x,int y)
	{
	 System.out.println("Addition="+(x+y));
	}
  public static void main (String args[])
  {
     constructor c=new constructor();
	 constructor c1=new constructor(12,23);
  }
}