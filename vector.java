import java.util.*;
class vector
{
  public static void main (String args[])
  {
      Vector v=new Vector ();
	  
	  Integer a=new Integer (18);
	  Integer b=new Integer (19);
	  
	  Float p=new Float(18.5f);
	  Float s=new Float(152.5f);
	  
	  String s1=new String("vishal");
	  String v1=new String("sarde");
	  
	  
	  v.addElement(a);
	  v.addElement(b);
	  v.addElement(p);
	  v.addElement(s);
	  v.addElement(s1);
	  v.addElement(v1);
	  
	  System.out.println(v);
	  
	  v.removeElementAt(3);
	  
	   System.out.println(v);
	
  }
}