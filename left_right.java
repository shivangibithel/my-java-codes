import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
public class left_right extends Applet
{
	String str = "Scrolling Text";
	int x = 0;
	int y = 50;
	char scroll = 'r';
	int width; 
	Font f;
	public void init()
	{
		f = new Font("times new roman",Font.BOLD,20);
		FontMetrics fm = getFontMetrics(f);
		width = fm.stringWidth(str);	
	}
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString(str,x,50);
		if(scroll == 'r')
		{
			x++;
			if(x == 500-width)
				scroll = 'l';
		}
		else
		{
			x--;
			if(x == 0)
				scroll = 'r';
		}
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException x){}
		repaint();
	}
}
/*
<applet code = left_right width = 500 height = 500>
</applet>
*/	