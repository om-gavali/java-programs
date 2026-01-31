import java.io.*;
class countchar
{
  public static void main ( String args[])throws IOException
  {
             FileInputStream f=new FileInputStream ("om.txt");
			 int x,c=0;;
			 
			 while((x=f.read())!=-1)
			 {
			    c++;
			 }
			 System.out.println(c);
			 f.close ();
			 
  }
}