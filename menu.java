import java.awt.*;
import java.awt.event.*;
class menu extends Frame implements ActionListener
{
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7;
	char shape,color;
	menu()
	{
		super("Menu");
		shape = color = ' ';
		mb = new MenuBar();
		m1 = new Menu("Shape");
		m2 = new Menu("Color");
		m3 = new Menu("Window");
		mi1 = new MenuItem("Line");
		mi2 = new MenuItem("Rectangle");
		mi3 = new MenuItem("Ellipse");
		mi4 = new MenuItem("Red");
		mi5 = new MenuItem("Green");
		mi6 = new MenuItem("Blue");
		mi7 = new MenuItem("Exit");
		m1.add(mi1);m1.add(mi2);m1.add(mi3);
		m2.add(mi4);m2.add(mi5);m2.add(mi6);
		m3.add(mi7);
		mb.add(m1);mb.add(m2);mb.add(m3);
		setMenuBar(mb);
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
		repaint();
	}
	public void paint(Graphics g)
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
	}
	public static void main(String s[])
	{
		new menu();
	}
}