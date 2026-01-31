class threadx extends Thread
{
  public void run ()
  {
         for(int i=0;i<10;i++)
		 {
		   System.out.println(i);
		   try
		   {
			   sleep(500);
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
		 }
  }
}
class thready extends Thread
{
   public void run ()
   {
       for(int j=0;j<10;j++)
	   {
	      System.out.println("\t"+j);
		  try
		   {
			   sleep(500);
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
	   }
   }
   
   public static void main(String a[])
   {
       threadx x =new threadx ();
	   thready y=new thready   ();
	   
	   x.start ();
	   y.start ();
   }  
}