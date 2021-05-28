import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.Graphics;
class pie extends Frame implements FocusListener
{
	Label l1,l2,l3,l4,l5;
	TextField tf1,tf2,tf3,tf4,tf5;
	int m1,m2,m3,m4,m5;
	pie()
	{
		super("Piechart");
		l1 = new Label("Maths");
		l2 = new Label("Computer Sc.");
		l3 = new Label("Physics");
		l4 = new Label("Chemistry");
		l5 = new Label("English");
		l1.setBackground(Color.red);
		l2.setBackground(Color.green);
		l3.setBackground(Color.blue);
		l4.setBackground(Color.magenta);
		l5.setBackground(Color.yellow);
		tf1 = new TextField("0",5);
		tf2 = new TextField("0",5);
		tf3 = new TextField("0",5);
		tf4 = new TextField("0",5);
		tf5 = new TextField("0",5);
		setLayout(new FlowLayout());
		add(l1);add(tf1);add(l2);add(tf2);
		add(l3);add(tf3);add(l4);add(tf4);
		add(l5);add(tf5);
		tf1.addFocusListener(this);
		tf2.addFocusListener(this);
		tf3.addFocusListener(this);
		tf4.addFocusListener(this);
		tf5.addFocusListener(this);
		addWindowListener(new close());
		setSize(600,600);
		setVisible(true);
		setResizable(false);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillArc(100,150,400,400,0,m1);
		g.setColor(Color.green);
		g.fillArc(100,150,400,400,m1,m2);
		g.setColor(Color.blue);
		g.fillArc(100,150,400,400,m1+m2,m3);
		g.setColor(Color.magenta);
		g.fillArc(100,150,400,400,m1+m2+m3,m4);
		g.setColor(Color.yellow);
		g.fillArc(100,150,400,400,m1+m2+m3+m4,m5);
	}
	public void focusLost(FocusEvent e)
	{
		m1 = Integer.parseInt(tf1.getText());
		m2 = Integer.parseInt(tf2.getText());
		m3 = Integer.parseInt(tf3.getText());
		m4 = Integer.parseInt(tf4.getText());
		m5 = Integer.parseInt(tf5.getText());
		int total = m1+m2+m3+m4+m5;
		m1 = m1*360/total;
		m2 = m2*360/total;
		m3 = m3*360/total;
		m4 = m4*360/total;
		m5 = 360-(m1+m2+m3+m4);
		repaint();
	}
	public void focusGained(FocusEvent e){}
	public static void main(String s[])
	{
		new pie();
	}
}
