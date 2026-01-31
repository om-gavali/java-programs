class threaddemo extends Thread
{
   public void run ()
   {
      System.out.println("hello om");
   }
   
   public static void main (String args[])
   {
      threaddemo t=new threaddemo ();
      threaddemo t1=new threaddemo ();
      threaddemo t2=new threaddemo ();
	  
	  System.out.println("priority of thread="+t.getPriority());
	  System.out.println("priority of thread="+t1.getPriority());
	  System.out.println("priority of thread="+t2.getPriority());
	  
	  t.setPriority(5);
	  t1.setPriority(6);
	  t2.setPriority(3);
	  
	  System.out.println("priority of thread="+t.getPriority());
	  System.out.println("priority of thread="+t1.getPriority());
	  System.out.println("priority of thread="+t2.getPriority());
	  
	 
   }
   
}