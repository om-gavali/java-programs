class throwdemo
{
     
	void get (int n)
	{
		try
		{
			if(n>18)
			{
				throw new ArithmeticException(" eligible");
			}
			else
			{
			throw new ArithmeticException("not eligible");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

   public static void main(String args[])
   {
      throwdemo t=new throwdemo ();
	  t.get(125);
   }
   
}