import java.awt.*;
import java.awt.event.*;
class color extends Frame implements ActionListener,FocusListener,AdjustmentListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1;
	Scrollbar s1,s2,s3;
	Panel p1,p2;
	color()
	{
		super("Color");
		l1 = new Label("Red : ");
		l2 = new Label("Green : ");
		l3 = new Label("Blue : ");
		tf1 = new TextField("0");
		tf2 = new TextField("0");
		tf3 = new TextField("255");
		b1 = new Button("Exit");
		s1 = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
		s2 = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
		s3 = new Scrollbar(Scrollbar.HORIZONTAL,255,1,0,256);
		p1 = new Panel();
		p2 = new Panel();
		p1.setLayout(new GridLayout(2,4,5,5));
		p2.setLayout(new GridLayout(3,1,5,5));
		p1.add(l1);p1.add(tf1);
		p1.add(l2);p1.add(tf2);
		p1.add(l3);p1.add(tf3);p1.add(b1);
		p2.add(s1);p2.add(s2);p2.add(s3);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		tf1.addFocusListener(this);
		tf2.addFocusListener(this);
		tf3.addFocusListener(this);
		b1.addActionListener(this);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
		setBackground(Color.blue);
		setSize(400,400);
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int r = s1.getValue();
		int g = s2.getValue();
		int b = s3.getValue();
		Color c = new Color(r,g,b);
		setBackground(c);
		p1.setBackground(c);
		p2.setBackground(c);
		l1.setBackground(c);
		l2.setBackground(c);
		l3.setBackground(c);
		tf1.setText(String.valueOf(r));
		tf2.setText(String.valueOf(g));
		tf3.setText(String.valueOf(b));
	}
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	public void focusLost(FocusEvent e)
	{
		int r = Integer.parseInt(tf1.getText());
		if(r < 0)
			r = 0;
		else if(r > 255)
			r = 255;
		int g = Integer.parseInt(tf2.getText());
		if(g < 0)
			g = 0;
		else if(g > 255)
			g = 255;
		int b = Integer.parseInt(tf3.getText());
		if(b < 0)
			b = 0;
		else if(b > 255)
			b = 255;
		tf1.setText(String.valueOf(r));
		tf2.setText(String.valueOf(g));
		tf3.setText(String.valueOf(b));
		s1.setValue(r);
		s2.setValue(g);
		s3.setValue(b);
		Color c = new Color(r,g,b);
		setBackground(c);
		p1.setBackground(c);
		p2.setBackground(c);
		l1.setBackground(c);
		l2.setBackground(c);
		l3.setBackground(c);
	}
	public void focusGained(FocusEvent e){}
	public static void main(String s[])
	{
		new color();
	}
}
	
