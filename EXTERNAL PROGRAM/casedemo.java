import java.util.*;
class casedemo
{
  public static void main (String args[])
  {
     Scanner sc=new Scanner (System.in);
	 
	 System.out.println("enter your choice:-");
	 int ch=sc.nextInt();
	 
	 switch(ch)
	 {
	    case 1 : System.out.println("monday");
		break;
		
		case 2 : System.out.println("thuesday");
		break;
		
		case 3 : System.out.println("whensday ");
		break;
		
		case 4 : System.out.println("thursday");
		break;
		
		case 5 : System.out.println("friday");
		break;
		
		case 6 : System.out.println("saturday");
		break;
		
		case 7 : System.out.println("sunday");
		break;
	 }
	 
  }
}