import java.awt.*;
import java.awt.event.*;
class submenu1 extends Frame implements ActionListener,ItemListener
{
	MenuBar mb;
	Menu m1,m2,m3,mi2,me3,me4,me5;
	CheckboxMenuItem mi1,mi7,mi8,mi3,mi4,mi5,mi6,mi9,mi10,mi11,mi12;
	MenuItem m;
	
	char shape,color;
	submenu1()
	{
		super("Menu");
		shape = color = ' ';
		mb = new MenuBar();
		m1 = new Menu("Shape");
		m2 = new Menu("Color");
		m3 = new Menu("Window");
		mi1 = new CheckboxMenuItem("Line");
		mi2 = new Menu("Polygon");
		me3 = new Menu("Oval");
		me4 = new Menu("Fill");
		me5 = new Menu("Border");
		mi7 = new CheckboxMenuItem("Rectangle");
		mi8 = new CheckboxMenuItem("Triangle");
		mi3 = new CheckboxMenuItem("Ellipse");
		mi4 = new CheckboxMenuItem("Red");
		mi5 = new CheckboxMenuItem("Green");
		mi6 = new CheckboxMenuItem("Blue");
		mi10 = new CheckboxMenuItem("cyan");
		mi11 = new CheckboxMenuItem("Magenta");
		mi12 = new CheckboxMenuItem("Yellow");
		mi9 = new CheckboxMenuItem("circle");
		m = new MenuItem("Exit");
		m1.add(mi1);m1.add(mi2);mi2.add(mi7);
		mi2.add(mi8);m1.add(me3);
		me3.add(mi3);me3.add(mi9);
		m2.add(me4);me4.add(mi4);me4.add(mi5);me4.add(mi6);
		m2.add(me5);me5.add(mi10);me5.add(mi11);me5.add(mi12);
		
		m3.add(m);
		mb.add(m1);mb.add(m2);mb.add(m3);
		setMenuBar(mb);
		mi1.addItemListener(this);
		mi7.addItemListener(this);
		mi8.addItemListener(this);
		mi3.addItemListener(this);
		mi4.addItemListener(this);
		mi5.addItemListener(this);
		mi6.addItemListener(this);
		mi9.addItemListener(this);
		mi10.addItemListener(this);
		mi11.addItemListener(this);
		mi12.addItemListener(this);
		m.addActionListener(this);
		
		setSize(600,600);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		System.exit(0);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		
		if(e.getSource() == mi1)
		{	
			
			mi7.setState(false);
			mi8.setState(false);
			mi9.setState(false);
			mi3.setState(false);
			shape = 'l';
		}
		if(e.getSource() == mi7)
		{	
			mi9.setState(false);
			mi1.setState(false);
			mi3.setState(false);
			mi8.setState(false);
			shape = 'r';
		}
		if(e.getSource() == mi8)
		{	
			mi7.setState(false);
			mi1.setState(false);
			mi3.setState(false);
			mi9.setState(false);
			shape = 't';
		}
		if(e.getSource() == mi9)
		{	
	
			mi9.setState(true);
			mi1.setState(false);
			mi3.setState(false);
			mi7.setState(false);
			mi8.setState(false);
			
			shape = 'c';
		}
		if(e.getSource() == mi3)
		{
			mi9.setState(false);
			mi1.setState(false);
			mi8.setState(false);
			mi7.setState(false);
			shape = 'e';
		}
		if(e.getSource() == mi4)
		{	
			mi5.setState(false);
			mi6.setState(false);
			
			
			color = 'r';
		}
		if(e.getSource() == mi5)
		{	
			mi4.setState(false);
			mi6.setState(false);
			
			color = 'g';
		}
		if(e.getSource() == mi6)
		{	
			mi4.setState(false);
			mi5.setState(false);
			
			color = 'b';
		}
		if(e.getSource() == mi10)
		{	
			
			mi11.setState(false);
			mi12.setState(false);
			color = 'c';
		}
		
		if(e.getSource() == mi11)
		{	
			
			mi10.setState(false);
			
			mi12.setState(false);
			color = 'm';
		}
		
		if(e.getSource() == mi12)
		{	
			
			mi10.setState(false);
			mi11.setState(false);
			color = 'y';
		}
		
		
		
		repaint();
		
	}
	public void paint(Graphics g)
	{
		Color c1 = new Color(0,0,0);
		Color c2 = new Color(0,0,0);
		if(fcolor == 'r')
			c = Color.red;
		if(fcolor == 'g')
			c = Color.green;
		if(fcolor == 'b')
			c = Color.blue;
		if(color == 'c')
			c = Color.cyan;
		if(color == 'm')
			c = Color.magenta;
		if(color == 'y')
			c = Color.yellow;
		g.setColor(c);
		
		if ((mi4.getState() == true)||(mi5.getState() == true) || (mi6.getState() == true))
		{
		
		if(shape == 'l')
			g.drawLine(100,100,300,300);
		if(shape == 'r')
			g.fillRect(100,100,300,300);
		if(shape == 'e')
			g.fillOval(100,100,400,300);
		if(shape == 'c')
			g.fillOval(100,100,300,300);
		if(shape == 't')
		{
			int x[] ={200,300,300};
			int y[] = {200,300,100};
			g.fillPolygon(x,y,3);
		}
		}
		 if ((mi10.getState() == true)||(mi11.getState() == true) || (mi12.getState() == true))
		{
			
		if(shape == 'l')
			g.drawLine(90,90,301,301);
		if(shape == 'r')
			g.drawRect(99,99,301,301);
		if(shape == 'e')
			g.drawOval(99,99,401,301);
		if(shape == 'c')
			g.drawOval(99,99,301,301);
		if(shape == 't')
		{
			int x[] ={199,301,301};
			int y[] = {199,301,101};
			g.drawPolygon(x,y,3);
		}
		}
				
	}
	public static void main(String s[])
	{
		new submenu1();
	}
}
