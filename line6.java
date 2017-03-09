import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
public class line6 extends Applet implements MouseListener,MouseMotionListener
{
	LinkedList x,y;
	public void init()
	{
		x = new LinkedList();
		y = new LinkedList();
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		x.add(e.getX());
		y.add(e.getY());
	}
	public void mouseReleased(MouseEvent e)
	{
		x.clear();
		y.clear();
	}
	public void mouseMoved(MouseEvent e){}
	public void mouseDragged(MouseEvent e)
	{
		x.add(e.getX());
		y.add(e.getY());
		repaint();
	}	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void paint(Graphics g)
	{
		for(int j=0;j<x.size()-1;j++)
		{
			Integer x1 = (Integer)x.get(j);
			Integer x2 = (Integer)x.get(j+1);
			Integer y1 = (Integer)y.get(j);
			Integer y2 = (Integer)y.get(j+1);
			g.drawLine(x1,y1,x2,y2);
		}
	}
}
/*
<applet code = line6 width = 500 height = 500>
</applet>
*/