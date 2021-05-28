import java.awt.*;
import java.awt.event.*;
class controls1 extends Frame
{
	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3,tf4;
	Button b1,b2;
	controls1()
	{
		super("Result");
		l1 = new Label("Max. Marks  : ",Label.CENTER);
		l2 = new Label("Marks Ob.  : ",Label.CENTER);
		l3 = new Label("Percentage : ",Label.CENTER);
		l4 = new Label("Result : ",Label.CENTER);
		tf1 = new TextField("100");
		tf2 = new TextField("0");
		tf3 = new TextField("0");
		tf4 = new TextField("Fail");
		b1 = new Button("Show Result");
		b2 = new Button("Exit");
		setLayout(new GridLayout(5,2,10,10));
		add(l1);add(tf1);add(l2);add(tf2);add(l3);add(tf3);
		add(l4);add(tf4);add(b1);add(b2);
		setSize(250,250);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String s[])
	{
		new controls1();
	}
}