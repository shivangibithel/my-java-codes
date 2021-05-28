import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
public class right extends Applet
{
	String str = "Scrolling Text";
	int x = 500;
	int y = 50;
	public void paint(Graphics g)
	{
		Font f = new Font("times new roman",Font.BOLD,20);
		FontMetrics fm = getFontMetrics(f);
		int width = fm.stringWidth(str);	
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString(str,x,50);
		x--;
		if(x == (-width))
			x = 500;
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException x){}
		repaint();
	}
}
/*
<applet code = right width = 500 height = 500>
</applet>
*/
