import java.io.*;	
class filecountword
{
   public static void main (String args [])throws IOException
   {
      FileWriter f=new FileWriter ("abcdef.txt");

		f.write("you are a best");
		
		f.close ();
		
		System.out.println("file created");
		
		FileInputStream fin=new FileInputStream("abcdef.txt");
		
		int x,c=0;
		
		while((x=fin.read())!=-1)
		{
			c++;
		}			
		System.out.println("number of charater in file="+c);
   }
}
	