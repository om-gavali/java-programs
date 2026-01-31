import java.awt.*;
import java.applet.*;
public class appletloop extends Applet
{
   public void paint(Graphics g)
   {
      for(int i=0;i<4;i++)
	  {
	    g.drawOval(i*50+10,i*50+10,50,50);
	  }
   }
}
/*
<applet code="appletloop.class"  width="1000" height="1000"></applet>
*/