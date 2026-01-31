class threadx extends Thread
{
   public void run ()
   {
      for(int i=0;i<5;i++)
	  {
	    System.out.println("value of i="+i);
	  }
   }
}
class thread extends Thread
{
   public void run ()
   {
      for(int j=0;j<5;j++)
	  {
	    System.out.println("value of j="+j);
	  }
   }
    public static void main(String args[])
	{
	    threadx t=new threadx ();
		thread t2=new thread ();
		
		t.start();
		t2.start();
	}
}