import java.applet.*;
import java.awt.*;

public class app extends Applet
{	
	public void paint(Graphics g)
	{
		g.drawRect(300,300,300,300);
		g.drawRect(200,200,300,300);
		g.drawLine(200,200,300,300);
		g.drawLine(200,500,300,600);
		g.drawLine(500,200,600,300);
		g.drawLine(500,500,600,600);
		
		g.drawRect(300,300,100,100);
		g.fillRect(400,300,100,100);
		g.drawRect(500,300,100,100);
		g.fillRect(300,400,100,100);
		g.drawRect(300,500,100,100);
		g.drawRect(400,400,100,100);
		g.fillRect(400,500,100,100);
		g.drawRect(500,500,100,100);
		g.fillRect(500,400,100,100);
	}
}

/*
<applet code="app.class" width="1000" height="1000"></applet>
*/