import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
public class all extends Applet 

{
	String str = "Scrolling Text";
	int x = 0;
	int y= 0;
	int z =700;
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
		
	 g.drawString("hello", x,50);
			  x+=1;
			 
		 if (x==700)
		 {
			 x=0;
		
		 }
		 try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException ex){}
		repaint();
		
	
		
			 g.drawString(str,y,150);
		if(scroll == 'r')
		{
			y++;
			if(x == 700-width)
				scroll = 'l';
		}
		else
		{
			y--;
			if(y == 0)
				scroll = 'r';
		}
		try
		{
			Thread.sleep(0);
		}
		catch(InterruptedException fxx){}
		repaint();
		
		
		{
			Font f = new Font("times new roman",Font.BOLD,20);
		FontMetrics fm = getFontMetrics(f);
		int width = fm.stringWidth(str);	
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString(str,z,300);
		z--;
		if(z == (-width))
			z = 700;
		}
		try
		{
			Thread.sleep(0);
		}
		catch(InterruptedException gxx){}
		repaint();
	}
	}
/*
<applet code = all width = 700 height = 700>
</applet>
*/	
