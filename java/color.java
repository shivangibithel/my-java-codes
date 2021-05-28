import java.awt.*;
class color extends Frame
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
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String s[])
	{
		new color();
	}
}
	
