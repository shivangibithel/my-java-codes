import java.awt.*;
import java.applet.*;
import java.net.*;
import java.awt.event.*;

public class app9 extends Applet implements MouseListener,MouseMotionListener
{	int x=0 ;
	int y = 0;
	int x2=0;
	int y2= 0;
	public void init()
	{	
	String s = "";
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint (Graphics g)
	{
		g.drawLine(x,y,x2,y2);
	}
	 public void mousePressed(MouseEvent e)
	 {
		 x=e.getX();
		 y = e.getY();
		 repaint();
	 }
	public void mouseReleased(MouseEvent e)
	{
		
	}
public void mouseClicked(MouseEvent  e)
{  
	
}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mouseMoved(MouseEvent  e){}
public void mouseDragged(MouseEvent  e){
x2=e.getX();
		 y2 = e.getY();
		 repaint();}

	
}

/*<applet code = app9 width = 700 height = 700>
</applet>*/