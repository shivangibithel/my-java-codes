import java.awt.Color;
class A extends Thread
{
	rotate1 R;
	A(rotate1 r)
	{
		R = r;
	}
	public void run()
	{
		for(int i=0;;i++)
		{
			R.showStatus("Applet Running From Last " + i + " Secs.");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException x){}
		}
	}
}
public class rotate1 extends java.applet.Applet 
{
	int a = 0;
	A a1;
	public void init()
	{
		a1 = new A(this);
		a1.start();
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
}
/*
<applet code = rotate1 width = 500 height = 500>
</applet>
*/