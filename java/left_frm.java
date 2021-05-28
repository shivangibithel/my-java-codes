import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
public class left_frm extends Frame
{
	String str = "Scrolling Text";
	int x = 0;
	int y = 50;
	left_frm()
	{
		super("Left Scroll");
		addWindowListener(new close());
		setSize(500,500);
		setVisible(true);
	}		
	public void paint(Graphics g)
	{
		g.setFont(new Font("times new roman",Font.BOLD,20));
		g.setColor(Color.blue);
		g.drawString(str,x,50);
		x++;
		if(x == 500)
			x = 0;
		rest();	
		repaint();
	}
	void rest()
	{
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException x){}
	}
	public static void main(String s[])
	{
		new left_frm();
	}
}