import java.io.*;
class readfile
{
  public static void main ( String args[])throws IOException
  {
             FileInputStream f=new FileInputStream ("om.txt");
			 int x;
			 
			 while((x=f.read())!=-1)
			 {
			    System.out.println((char)x);
			 }
  }
}