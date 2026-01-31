import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
import java.applet.*;
/*
<Applet code="labledemo" height=300 width=300>
</Applet>
*/ 
public class labledemo extends Applet implements ActionListener
{
	Button r,l2,l3;
	public void init()
	{
		Button r=new Button("Red");
		Button l2=new Button("No");
		Button l3=new Button("Cancle");
		
		add(r);
		add(l2);
		add(l3);
		
		r.addActionListener(this);
		l2.addActionListener(this);
		l3.addActionListener(this);
	}
	public void actionPerformed (ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Red"))
		{
			str="You Clicked Red !!!";
		}
	}
}