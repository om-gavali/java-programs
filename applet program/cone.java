import java.awt.*;
import java.applet.*;
public class cone extends Applet
{
  public void paint(Graphics g)
  {
     g.drawOval(200,80,100,50);
	 g.drawLine(200,100,250,400);
	 g.drawLine(300,100,250,400);
  }
}
/*
<applet code="cone.class"  width="2000" height="2000"></applet>
*/