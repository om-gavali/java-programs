import java.applet.*;
import java.awt.*;
public class appletdemo2 extends Applet
{
	 Image a;
	public void init ()
	{
		
		 a=getImage(getDocumentBase(),"giphy.gif ");
	}
   public void paint(Graphics g)
   {
	   for(int i=0;i>5;i++)
	   {
			g.drawImage(a,i,100,this);
	   }
   }
}
/*<applet code="appletdemo2.class" width="1000" height="1000"></applet>*/