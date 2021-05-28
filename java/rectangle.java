import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
public class rectangle extends Applet implements MouseListener,MouseMotionListener
{
	int x1,y1,x2,y2;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		x1 = e.getX();
		y1 = e.getY();
	}
	public void mouseReleased(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
	public void mouseDragged(MouseEvent e)
	{
		x2 = e.getX();
		y2 = e.getY();
		repaint();
	}	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void paint(Graphics g)
	{
		int x,y,width,height;
		if(x2 > x1 && y2 > y1)
		{
			x = x1;
			y = y1;
			width = x2 - x1;
			height = y2 - y1;
		}
		else if(x2 > x1 && y2 < y1)
		{
			x = x1;
			y = y2;
			width = x2 - x1;
			height = y1 - y2;
		}
		else if(x2 < x1 && y2 > y1)
		{
			x = x2;
			y = y1;
			width = x1 - x2;
			height = y2 - y1;
		}
		else
		{
			x = x2;
			y = y2;
			width = x1 - x2;
			height = y1 - y2;
		}
		g.drawRect(x,y,width,height);
	}
}
/*
<applet code = rectangle width = 500 height = 500>
</applet>
*/