import java.awt.*;
import java.applet.*;
import java.net.*;
import java.awt.event.*;

public class app4 extends Applet
{	int a= 0;
	public void init()
	{}
	
	public void paint(Graphics g)
	{  
		
					
		g.setColor(Color.black);
		g.fillArc(50,50,400,400,a,90);
		
		g.setColor(Color.blue);
		g.fillArc(50,50,400,400,a+90,90);
		
		g.setColor(Color.green);
		g.fillArc(50,50,400,400,a+180,90);
		
		g.setColor(Color.pink);
		g.fillArc(50,50,400,400,a+270,90);
		try{
			Thread.sleep(1000);
		}catch (InterruptedException x){}
		
		a = a+90;
		if (a==360)
		{ 
			a=0;
		}
		
		repaint();
	}
}
	

	
		
		
	