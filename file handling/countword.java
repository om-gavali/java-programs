import java.io.*;
class countword
{
   public static void main (String args [])throws IOException
   {
      FileInputStream fin=new FileInputStream ("om.txt");
	  //FileOutputStream fout=new FileOutputStream("omg.txt");
	  int c,count=0;
	  
	  while((c=fin.read())!=-1)
 	  {
		  if(c==(char)' ')
		  {
			  count++;
		  }
	  }
	  
	  System.out.println(count);
   }
}