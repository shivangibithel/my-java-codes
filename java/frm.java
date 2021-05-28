import java.awt.Frame;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
class frm extends Frame implements WindowListener
{
	frm()
	{
		super("My Window");
		addWindowListener(this);
		setVisible(true);
		setLocation(50,50);
		setSize(300,300);
		setResizable(false);

	}
	public void windowActivated(WindowEvent e)
	{
		System.out.println("Window Activated");
	}
	public void windowOpened(WindowEvent e)
	{
		System.out.println("Window Opened");
	}
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("Window Deactivated");
	}
	public void windowIconified(WindowEvent e)
	{	
		System.out.println("Window Iconified");
	}
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("Window Deiconified");
	}
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Window Closing");
		System.exit(0);
	}
	public void windowClosed(WindowEvent e)
	{
		System.out.println("Window Closed");
	}
	public static void main(String s[])
	{
		new frm();
	}	
}