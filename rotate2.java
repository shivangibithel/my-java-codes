import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
public class rotate2 extends Applet
{
	String str,font;
	int r,g,b,speed,size;
	Color c;
	Font f;
	public void init()
	{
		str = getParameter("text");
		font = getParameter("font");
		r = Integer.parseInt(getParameter("red"));
		g = Integer.parseInt(getParameter("green"));
		b = Integer.parseInt(getParameter("blue"));
		speed = Integer.parseInt(getParameter("speed"));
		size = Integer.parseInt(getParameter("size"));
		c = new Color(r,g,b);
		f = new Font(font,Font.BOLD,size);
	}
	public void paint(Graphics gr)
	{
		gr.setColor(c);
		gr.setFont(f);
		gr.drawString(str,100,100);
		int l = str.length();
		char ch = str.charAt(l-1);
		String s = str.substring(0,l-1);
		str = ch + s;
		try
		{
			Thread.sleep(speed);
		}
		catch(InterruptedException x){}
		repaint();
	}
}
/*
<applet code = rotate2 width = 500 height = 500>
<param name = text value = "Welcome To Applets">
<param name = red value = 0>
<param name = green value = 0>
<param name = blue value = 255>
<param name = speed value = 200>
<param name = size value = 40>
<param name = font value = "Monotype corsiva">
</applet>
*/