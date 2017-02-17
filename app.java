import java.awt.*;
import java.applet.Applet;

public class app extends Applet
{
	String s ="";
	Font f = new Font("Times New Roman" ,Font.BOLD , 50);
	public void destroy()
	{
		System.out.println("in destroy");
	}
	public void start()
	{
		s= s+ "in start";
	}
	public void stop()
	{
		s= s+ "in stop";
	}
	public void paint(Graphics g)
	{
		s= s+ "in paint";
		g.drawString(s,50,50);
		g.setFont(f);
	}
	public void init()
	{
		s= s+ "in init";
	}
}


