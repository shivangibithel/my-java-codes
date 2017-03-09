import java.awt.Color;
public class rotate extends java.applet.Applet implements Runnable
{
	int a = 0;
	Thread t;
	public void init()
	{
		t = new Thread(this);
		t.start();
	}
	public void paint(java.awt.Graphics g)
	{
		g.setColor(Color.red);
		g.fillArc(50,50,200,200,a,90);
		g.setColor(Color.green);
		g.fillArc(50,50,200,200,a+90,90);
		g.setColor(Color.magenta);
		g.fillArc(50,50,200,200,a+180,90);
		g.setColor(Color.yellow);
		g.fillArc(50,50,200,200,a+270,90);
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException x){}
		a += 90;
		if(a == 360)
			a = 0;
		repaint();
	}
	public void run()
	{
		for(int i=0;;i++)
		{
			showStatus("Applet Running From Last " + i + " Secs.");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException x){}
		}		
	}
}
/*
<applet code = rotate width = 500 height = 500>
<param 
</applet>
*/