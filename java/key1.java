import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class key1 extends Applet implements KeyListener
{
	String str = "";
	int x,y;
	public void init()
	{
		addKeyListener(this);
		x = y = 50;
	}
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_HOME)
			str = "Home Key Pressed";
		else if(e.getKeyCode() == KeyEvent.VK_F1)
			str = "F1 Pressed";
		repaint();
	}
	public void keyReleased(KeyEvent e)
	{
		System.out.println("Key Released");
	}
	public void keyTyped(KeyEvent e)
	{
		if(e.getKeyChar() == 8)
			str = str.substring(0,str.length()-1);
		else if(e.getKeyChar() == 10)
		{
			y += 20;
			str = "";
		}
		else
			str += e.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,x,y);
	}
}
/*
<applet code = key1 width = 500 height = 500>
</applet>
*/