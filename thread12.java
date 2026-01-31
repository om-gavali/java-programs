import java.lang.*; 
 
public class thread12 extends Thread 
{ 
	 public void run() 
	{ 
	System.out.println("Inside the run() method"); 
	} 
	public static void main(String argvs[]) 
	{ 
		thread12 th1 = new thread12(); 
		thread12 th2 = new thread12(); 
		thread12 th3 = new thread12(); 
		 System.out.println(" thread th1 is : " + th1.getPriority()); 
		 System.out.println(" thread th2 is : " + th2.getPriority()); 
		 System.out.println(" thread th2 is : " + th2.getPriority()); 
		 
		th1.setPriority(6); 
		th2.setPriority(3); 
		th3.setPriority(9); 
		
		 System.out.println("Priority of the thread th1 is : " + th1.getPriority()); 
		 System.out.println("Priority of the thread th2 is : " + th2.getPriority()); 
		 System.out.println("Priority of the thread th3 is : " + th3.getPriority()); 
		 //System.out.println("Currently Executing The Thread : " + Thread.currentThread().gtName());
		 //System.out.println("Priority of the main thread is : " + Thread.currentThread().getPrority());
		 
		//hread.currentThread().setPriority(10); 
		//System.out.println("Priority of the main thread is : " + Thread.currentThread().getPiority());
	}
}