import java.util.*;
class vectordemo
{
  public static void main(String args[])
  {
      Vector v= new Vector ();
	  
	  v.addElement(13);
	  v.addElement(20);
	  v.insertElementAt(45,1);
	  v.removeElementAt(1);
	  v.remove(0);
	  
	  System.out.println(v);
  }
}