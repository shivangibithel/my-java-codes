import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class frm1 extends Frame 
{
	frm1()
	{
		super("My Window");
		addWindowListener(new close());
		setVisible(true);
		setLocation(50,50);
		setSize(300,300);
		setResizable(false);

	}
	public static void main(String s[])
	{
		new frm1();
	}	
}
class close extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
	