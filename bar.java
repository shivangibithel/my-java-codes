import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.Graphics;
class bar extends Frame implements FocusListener
{
	Label l1,l2,l3,l4,l5;
	TextField tf1,tf2,tf3,tf4,tf5;
	int m1,m2,m3,m4,m5;
	bar()
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
		setSize(650,700);
		setVisible(true);
		setResizable(false);
	}
	public void paint(Graphics g)
	{
		g.drawLine(50,100,50,600);
		int j = 100;
		for(int i=100;i<=600;i+=50)
		{
			g.drawLine(50,i,550,i);
			g.drawString(String.valueOf(j),20,i);
			j -= 10;
		}
		g.setColor(Color.red);
		g.fillRect(100,600-m1,50,m1);
		g.drawString("Maths",100,620);
		g.setColor(Color.green);
		g.fillRect(200,600-m2,50,m2);
		g.drawString("Comp. Sc.",200,620);
		g.setColor(Color.blue);
		g.fillRect(300,600-m3,50,m3);
		g.drawString("Physics",300,620);
		g.setColor(Color.magenta);
		g.fillRect(400,600-m4,50,m4);
		g.drawString("Chemistry",400,620);
		g.setColor(Color.yellow);
		g.fillRect(500,600-m5,50,m5);
		g.drawString("English",500,620);
		g.setColor(Color.black);
		g.drawLine(125,600-m1,225,600-m2);
		g.drawLine(225,600-m2,325,600-m3);
		g.drawLine(325,600-m3,425,600-m4);
		g.drawLine(425,600-m4,525,600-m5);
	}
	public void focusLost(FocusEvent e)
	{
		m1 = Integer.parseInt(tf1.getText());
		m2 = Integer.parseInt(tf2.getText());
		m3 = Integer.parseInt(tf3.getText());
		m4 = Integer.parseInt(tf4.getText());
		m5 = Integer.parseInt(tf5.getText());
		m1 *= 5;
		m2 *= 5;
		m3 *= 5;
		m4 *= 5;
		m5 *= 5;
		repaint();
	}
	public void focusGained(FocusEvent e){}
	public static void main(String s[])
	{
		new bar();
	}
}
