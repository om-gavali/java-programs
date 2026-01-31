import java.io.*;
class coutword 
{
	public static void main(String args [])throws IOException
	{
		 
		 FileInputStream fin=new FileInputStream("abcd.txt");
		 fileOutputStream fout=new FileOutputStream("a.txt");
		 
		 int c=0;count=0;
		 
		 while((c=fin.read())!=0)
		 {
		    if(c==(char))
			{
			   count++;
			}
		 }
		 
		 System.out.println("counted numbers="+count);
	}
}