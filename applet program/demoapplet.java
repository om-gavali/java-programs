import java.applet.*;
import java.awt.*;

public class demoapplet extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=1;i<=4;i++)
		{
			if(i%2==0)
			{
				g.setColor(Color.black);
				g.drawOval(100,i*50+10,50,50);
			}
			else
			{
				g.setColor(Color.red);
				g.fillOval(100,i*50+10,50,50);
			}
		}
	}
}
/*
<applet code="demoapplet.class" width="1000" height="1000"></applet>
*/
