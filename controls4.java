import java.awt.*;
import java.awt.event.*;
class controls4 extends Frame implements ActionListener,ItemListener
{
	Label l1,l2;
	CheckboxGroup cbg;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
	Button b1;
	controls4()
	{
		super("Stream/Subject");
		l1 = new Label("Stream : ");
		l2 = new Label("Subject(s) : ");
		cbg = new CheckboxGroup();
		c1 = new Checkbox("Arts",cbg,false);
		c2 = new Checkbox("Commerce",cbg,false);
		c3 = new Checkbox("Science",cbg,false);
		c4 = new Checkbox("Hindi");
		c5 = new Checkbox("English");
		c6 = new Checkbox("History");
		c7 = new Checkbox("Banking");
		c8 = new Checkbox("Banking");
		c9 = new Checkbox("Economics");
		c10 = new Checkbox("Physics");
		c11 = new Checkbox("Chemistry");
		c12 = new Checkbox("Maths");
		b1 = new Button("Exit");
		c4.setEnabled(false);
		c5.setEnabled(false);
		c6.setEnabled(false);
		c7.setEnabled(false);
		c8.setEnabled(false);
		c9.setEnabled(false);
		c10.setEnabled(false);
		c11.setEnabled(false);
		c12.setEnabled(false);
		setLayout(new FlowLayout());
		add(l1);add(c1);add(c2);add(c3);add(l2);add(c4);
		add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);
		add(c11);add(c12);add(b1);
		b1.addActionListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		setSize(250,300);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	public void itemStateChanged(ItemEvent e)
	{
		c4.setState(false);
		c5.setState(false);
		c6.setState(false);
		c7.setState(false);
		c8.setState(false);
		c9.setState(false);
		c10.setState(false);
		c11.setState(false);
		c12.setState(false);
		if(c1.getState())
		{
			c4.setState(true);
			c5.setState(true);
			c6.setState(true);
		}
		else if(c2.getState())
		{
			c7.setState(true);
			c8.setState(true);
			c9.setState(true);
		}
		else if(c3.getState())
		{
			c10.setState(true);
			c11.setState(true);
			c12.setState(true);
		}
	}		
	public static void main(String s[])
	{
		new controls4();
	}
}