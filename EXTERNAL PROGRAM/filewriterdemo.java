import java.io.*;
class filewriterdemo
{
   public static void main (String args[])
   {
		Filewriter f=new Filewriter ("om.txt")
		
		String s="om gavali";
		
		f.write(s);
   }
}