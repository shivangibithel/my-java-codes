import java.applet.Applet;
import java.awt.Graphics;
public class app extends Applet
{
	String s = "";
	public void destroy()
	{
		System.out.println("In Destroy");
	}
	/*public void stop()
	{
		s += "Stop Called.";
	}
	public void start()
	{
		s += "Start Called.";
	}*/
	public void init()
	{
		s += "Init Called.";
	}
	public void paint(Graphics g)
	{
		s += "Paint Called.";
		g.drawString(s,10,10);
	}
}
/*
<applet code = app width = 500 height = 500>
</applet>
*/