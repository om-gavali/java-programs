import java.util.*;
class vector
{
  public static void main (String args[])
  {
     Vector v=new Vector ();
	 
	 v.addElement(100);
	 v.addElement(200);
	 v.addElement(300);
	 v.addElement(400);
	 v.insertElementAt(900,1);
	 v.removeElement(400);
	 v.removeElementAt(3);
	 
	 System.out.println(v);
  }
}