import java.io.*;
class countspace
{
  public static void main ( String args[])throws IOException
  {
             FileInputStream f=new FileInputStream ("om.txt");
			 int x,c=0;
			 
			 while((x=f.read())!=-1)
			 {
			 
			 char ch=(char)x;
			   if(ch == ' ')
			   {
			    c++;
			   }
			 }
			 System.out.println(c);
			 f.close ();
			 
  }
}