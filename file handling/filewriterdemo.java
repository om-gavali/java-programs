import java.io.*;
class filewriterdemo
{
   public static void main (String args[])throws IOException
   {
		FileWriter f=new FileWriter ("om.txt");
		
		String s="om gavali";
		
		f.write(s);
		
		System.out.println("sucessfully");
		
		f.close ();
   }
}