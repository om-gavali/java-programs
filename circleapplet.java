import java.awt.*;
import java.applet.*;
class circleapplet extends Applet
{
   public void paint(Graphics g)
   {
     int x[]={100,200,500};
     int y[]={300,600,300};
	 int b=3;
	 
	 g.drawPolygon(x,y,b);
   }
}
/*
<applet code="circleapplet.class"  width="500"  height="500"
*/