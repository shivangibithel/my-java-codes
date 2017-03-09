import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class line extends MouseAdapter
{
	line2 l;
	line(line2 l)
	{
		this.l = l;
	}
	public void mouseClicked(MouseEvent e)
	{
		if(l.press == 0)
		{
			l.x1 = e.getX();
			l.y1 = e.getY();
			l.press = 1;
		}
		else
		{
			l.x2 = e.getX();
			l.y2 = e.getY();
			l.press = 0;	
			l.repaint();
		}
	}
}
public class line2 extends Applet
{
	int x1,y1,x2,y2,press;
	line l;
	public void init()
	{
		x1 = y1 = x2 = y2 = press = 0;
		l = new line(this);
		addMouseListener(l);
	}
	public void paint(Graphics g)
	{
		g.drawLine(x1,y1,x2,y2);
	}
}
/*
<applet code = line2 width = 500 height = 500>
</applet>
*/