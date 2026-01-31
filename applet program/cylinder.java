import java.awt.*;
import java.applet.*;
public class cylinder extends Applet
{
  public void paint(Graphics g)
  {
     g.drawOval(200,80,100,50);
	 g.drawOval(200,200,100,50);
	 g.drawLine(200,105,200,225);
	 g.drawLine(300,105,300,225);
	 
  }
}
/*
<applet code="cylinder.class"  width="500" height="500"></applet>
*/