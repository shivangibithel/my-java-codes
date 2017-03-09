import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
public class left extends Applet
{
	String str = "Scrolling Text";
	int x = 0;
	int y = 50;
	public void paint(Graphics g)
	{
		g.setFont(new Font("times new roman",Font.BOLD,20));
		g.setColor(Color.blue);
		g.drawString(str,x,50);
		x++;
		if(x == 500)
			x = 0;
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
<applet code = left width = 500 height = 500>
</applet>
*/
