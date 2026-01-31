import java.awt.*;
import java.applet.*;
public class circleapplet extends Applet
{
   public void paint(Graphics g)
   {
     int x[]={100,200,500,600};
     int y[]={300,600,300,700};
	 int b=3;
	 g.drawPolygon(x,y,b);
	 g.drawOval(100,200,100,100);
	 g.drawLine(300,100,300,600);
	 g.drawArc(500,400,100,100,0,270);
   }
}
/*
<applet code="circleapplet.class"  width="500"  height="500"></applet>
*/