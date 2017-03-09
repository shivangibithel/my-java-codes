import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class line3 extends Applet implements MouseListener
{
	int x1,y1,x2,y2;
	public void init()
	{
		x1 = y1 = x2 = y2 = 0;
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		x1 = e.getX();
		y1 = e.getY();
	}
	public void mouseReleased(MouseEvent e)
	{
		x2 = e.getX();
		y2 = e.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void paint(Graphics g)
	{
		g.drawLine(x1,y1,x2,y2);
	}
}
/*
<applet code = line3 width = 500 height = 500>
</applet>
*/