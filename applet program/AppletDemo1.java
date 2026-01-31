import java.applet.*; 
import java.awt.*; 
public class AppletDemo1 extends Applet 
{ 
	 int account, balance; 
	 public void init() 
	 { 
		 account=Integer.parseInt(getParameter("acc_no")); 
		 balance=Integer.parseInt(getParameter("bal")); 
	 } 
	 public void paint(Graphics g) 
	 { 
		 if(balance<500) 
		 { 
		 g.drawString("Low Balance",100,150); 
		 } 
		 else 
		 { 
		 g.drawString("Sufficient Balance",100,150); 
		 } 
	 } 
} 
/* 
<applet code="AppletDemo1.class" width="500" height="500"> 
 <param name="acc_no" value="10101010"> 
 <param name="bal" value="350"> 
</applet> 
*/