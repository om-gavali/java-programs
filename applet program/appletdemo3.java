import java.applet.*;
import java.awt.*;
public class appletdemo3 extends Applet
{
   public void paint(Graphics g)
   {
	g.drawLine(40,50,122,122);
	g.drawRect(100,100,122,122);
	g.drawOval(200,250,122,122);
	g.drawOval(500,600,122,122);
   }
}
/*<applet code="appletdemo3.class" width="1000" height="1000"></applet>*/