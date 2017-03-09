import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class swing extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	Button b4;
	ImageIcon i1,i2,i3,i4,i5,i6;
	swing()
	{
		super("Swings");
		i1 = new ImageIcon("a.gif");
		i2 = new ImageIcon("b.gif");
		i3 = new ImageIcon("c.gif");
		i4 = new ImageIcon("d.gif");
		i5 = new ImageIcon("e.gif");
		i6 = new ImageIcon("f.gif");
		b1 = new JButton(i1);
		b2 = new JButton("Enable",i2);
		b3 = new JButton("Disable");
		b4 = new Button("Exit");		
		b1.setRolloverIcon(i3);
		b1.setPressedIcon(i4);
		b1.setDisabledIcon(i5);
		b1.setSelectedIcon(i6);
		setLayout(new java.awt.FlowLayout());
		add(b1);add(b2);add(b3);add(b4);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource() == b2)
			b1.setEnabled(true);
		else if(e.getSource() == b3)
			b1.setEnabled(false);
		else
			System.exit(0);
	}
	public static void main(String s[])
	{
		new swing();
	}
}