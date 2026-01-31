import java.awt.*;
import java.applet.*;
public class get extends Applet
{
	int acc;
	int bal;
   public void init ()
   {
       acc=Integer.parseInt(getParameter("account_no"));
	   bal=Integer.parseInt(getParameter("balance"));
   }
   
   public void paint(Graphics g)
   {
	   if(bal>500)
	   {
	      g.drawString("high balance",100,100);
	   }
	   else
	   {
	   g.drawString("low balance",100,100);
	   }
   }
}
/*
  <applet code="get.class" width="500"  height="500">
  <param name="account_no"  value="123456">
  <param name="balance"  value="123456">
  </applet>
*/