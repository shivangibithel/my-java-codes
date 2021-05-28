import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
public class mouse extends Applet implements MouseListener,MouseMotionListener
{
	int x,y;
	String str;
	public void init()
	{
		x = y = 0;
		str = "";
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseExited(MouseEvent e)
	{
		showStatus("Mouse Exited At : " + e.getX() + "," + e.getY());
	}
	public void mouseEntered(MouseEvent e)
	{
		showStatus("Mouse Entered At : " + e.getX() + "," + e.getY());
	}
	public void mouseReleased(MouseEvent e)
	{
		str = "Mouse Released";
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		str = "Mouse Pressed";
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent e)
	{
		str = "Mouse Clicked";
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent e)
	{
		showStatus(e.getX() + "," + e.getY());
	}
	public void mouseDragged(MouseEvent e)
	{
		str = "*";
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,x,y);
	}
}
/*
<applet code = mouse width = 500 height = 500>
</applet>
*/