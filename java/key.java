import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class key extends Applet implements KeyListener
{
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent e)
	{
		System.out.println("Key Pressed Is : "  + e.getKeyCode());
	}
	public void keyReleased(KeyEvent e)
	{
		System.out.println("Key Released");
	}
	public void keyTyped(KeyEvent e)
	{
		System.out.println("Key Typed Is + " + e.getKeyChar());
	}
}
/*
<applet code = key width = 500 height = 500>
</applet>
*/