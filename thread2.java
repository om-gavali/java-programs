class thread1 implements Runnable
{
      public void run ()
	  {
		  System.out.println("ascending order");
		  
	     for(int i=1;i<=50;i++)
		 {
		   System.out.println(i);
		 }
	  }
}
class thread2 implements Runnable
{
	  public void run ()
	  {
		  System.out.println("decending order");
		  
	     for(int i=50;i>0;i--)
		 {
		   System.out.println(i);
		 }
	  }
	  
	  public static void main (String args[])
	  {
	     thread1 t =new thread1 ();
	     thread2 t1 =new thread2 ();
		 
		 Thread t2=new Thread (t);
		 Thread t3=new Thread (t1);
		 
		 t3.start ();
		 t2.start ();
	  }
}
