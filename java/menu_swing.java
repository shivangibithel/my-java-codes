import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class menu_swing extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu m1,m2,m3;
	JRadioButtonMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
	JMenuItem mi7;
	ButtonGroup bg1,bg2;
	char shape,color;
	menu_swing()
	{
		super("Menu");
		shape = color = ' ';
		mb = new JMenuBar();
		m1 = new JMenu("Shape");
		m2 = new JMenu("Color");
		m3 = new JMenu("Window");
		mi1 = new JRadioButtonMenuItem("Line");
		mi2 = new JRadioButtonMenuItem("Rectangle");
		mi3 = new JRadioButtonMenuItem("Ellipse");
		mi4 = new JRadioButtonMenuItem("Red");
		mi5 = new JRadioButtonMenuItem("Green");
		mi6 = new JRadioButtonMenuItem("Blue");
		mi7 = new JMenuItem("Exit");
		bg1 = new ButtonGroup();
		bg2 = new ButtonGroup();
		bg1.add(mi1);bg1.add(mi2);bg1.add(mi3);
		bg2.add(mi4);bg2.add(mi5);bg2.add(mi6);
		m1.add(mi1);m1.add(mi2);m1.add(mi3);
		m2.add(mi4);m2.add(mi5);m2.add(mi6);
		m3.add(mi7);
		mb.add(m1);mb.add(m2);mb.add(m3);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);
		mi7.addActionListener(this);
		addWindowListener(new close());
		setSize(500,500);
		setVisible(true);
		setJMenuBar(mb);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == mi1)
			shape = 'l';
		else if(e.getSource() == mi2)
			shape = 'r';
		else if(e.getSource() == mi3)
			shape = 'e';
		else if(e.getSource() == mi4)
			color = 'r';
		else if(e.getSource() == mi5)
			color = 'g';
		else if(e.getSource() == mi6)
			color = 'b';
		else
			System.exit(0);
		//repaint();
	}
	/*public void paint(Graphics g)
	{
		Color c = new Color(0,0,0);
		if(color == 'r')
			c = Color.red;
		else if(color == 'g')
			c = Color.green;
		else if(color == 'b')
			c = Color.blue;
		g.setColor(c);
		if(shape == 'l')
			g.drawLine(100,100,300,300);
		else if(shape == 'r')
			g.fillRect(100,100,300,300);
		else if(shape == 'e')
			g.fillOval(100,100,300,300);
	}*/
	public static void main(String s[])
	{
		new menu_swing();
	}
}