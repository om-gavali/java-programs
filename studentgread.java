import java.util.*;
class studentgread
{
	Scanner sc=new Scanner (System.in);
	int i,a[]=new int[6];
	int total=0,per;
	
    void getmark ()
	{
	  System.out.println("enter your all subject marks=");
	  for(i=0;i<6;i++)
	  {
	    a[i]=sc.nextInt();
	  }
	}
	
	void totalmarks ()
	{
	   for(i=0;i<6;i++)
	   {
	      total=total+a[i];
	   }
	   
	   System.out.println("total counted marks="+total);
	}
	
	void percentage ()
	{
	   per=total/600*100;
	   
	   System.out.println("percentage="+per);
	}
	
	void gread ()
	{
		if(per>35)
		{
		System.out.println("pass");
		}
		else if(per>50)
		{
		  System.out.println("grade C");
		}
		else if(per>65)
		{
		System.out.println("grade B");
		}
		else if(per>80)
		{
		System.out.println("grade A");
		}
		else
		{
		System.out.println("fail");
		}
	}
  public static void main(String args[])
  {
     studentgread s=new studentgread ();
	 
	 s.getmark ();
	 s.totalmarks();
	 s.percentage ();
	 s.gread ();
  }
}