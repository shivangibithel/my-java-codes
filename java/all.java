import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
public class all extends Applet
{
	String str = "Scrolling Text";
	int x1 = 0,x2 = 500, x3 = 0;
	char scroll = 'r';
	public void paint(Graphics g)
	{
		g.setFont(new Font("times new roman",Font.BOLD,20));
		g.setColor(Color.blue);
		g.drawString(str,x1,50);
		x1++;
		if(x1 == 500)
			x1 = 0;
		g.drawString(str,x2,150);
		x2--;
		if(x2 == 0)
			x2 = 500;
		g.drawString(str,x3,250);
		if(scroll == 'r')
		{
			x3++;
			if(x3 == 500)
				scroll = 'l';
		}
		else
		{
			x3--;
			if(x3 == 0)
				scroll = 'r';
		}
		rest();	
		repaint();
	}
	void rest()
	{
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException x){}
	}
}
/*
<applet code = all width = 500 height = 500>
</applet>
*/
