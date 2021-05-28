import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class line1 extends Applet implements MouseListener
{
	int x1,y1,x2,y2,press;
	public void init()
	{
		x1 = y1 = x2 = y2 = press = 0;
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		if(press == 0)
		{
			x1 = e.getX();
			y1 = e.getY();
			press = 1;
		}
		else
		{
			x2 = e.getX();
			y2 = e.getY();
			press = 0;	
			repaint();
		}
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void paint(Graphics g)
	{
		g.drawLine(x1,y1,x2,y2);
	}
}
/*
<applet code = line1 width = 500 height = 500>
</applet>
*/