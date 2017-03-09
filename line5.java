import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
public class line5 extends Applet implements MouseListener,MouseMotionListener
{
	int x[],y[],i;
	public void init()
	{
		x = new int[200];
		y = new int[200];
		i = 0;
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		x[i] = e.getX();
		y[i] = e.getY();
		i++;
	}
	public void mouseReleased(MouseEvent e)
	{
		i = 0;
	}
	public void mouseMoved(MouseEvent e){}
	public void mouseDragged(MouseEvent e)
	{
		x[i] = e.getX();
		y[i] = e.getY();
		i++;
		repaint();
	}	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void paint(Graphics g)
	{
		for(int j=0;j<i-1;j++)
			g.drawLine(x[j],y[j],x[j+1],y[j+1]);
	}
}
/*
<applet code = line5 width = 500 height = 500>
</applet>
*/