import java.awt.*;
import java.awt.event.*;
class controls_err extends Frame implements ActionListener,FocusListener
{
	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3;
	CheckboxGroup cbg;
	Checkbox c1,c2,c3,c4,c5;
	Button b2;
	Panel p1,p2;
	controls_err()
	{
		super("Result");
		l1 = new Label("Max. Marks  : ",Label.CENTER);
		l2 = new Label("Marks Ob.  : ",Label.CENTER);
		l3 = new Label("Percentage : ",Label.CENTER);
		l4 = new Label("Result : ",Label.CENTER);
		tf1 = new TextField("100");
		tf2 = new TextField("0");
		tf3 = new TextField("0");
		cbg = new CheckboxGroup();
		c1 = new Checkbox("Distinction",cbg,false);
		c2 = new Checkbox("First",cbg,false);
		c3 = new Checkbox("Second",cbg,false);
		c4 = new Checkbox("Third",cbg,false);
		c5 = new Checkbox("Fail",cbg,true);
		b2 = new Button("Exit");
		p1 = new Panel();
		p2 = new Panel();
		tf3.setEditable(false);
		c1.setEnabled(false);
		c2.setEnabled(false);
		c3.setEnabled(false);
		c4.setEnabled(false);
		c5.setEnabled(false);
		setLayout(new GridLayout(6,2,10,10));
		add(l1);add(tf1);add(l2);add(tf2);add(l3);add(tf3);
		add(l4);add(c1);
		p1.add(c2);p1.add(c3);p2.add(c4);p2.add(c5);
		add(p1);add(p2);
		add(b2);
		tf1.addFocusListener(this);
		tf2.addFocusListener(this);
		b2.addActionListener(this);
		setSize(250,300);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	public void focusGained(FocusEvent e){}
	public void focusLost(FocusEvent e)
	{
		int mm = 100;
		int mo = 0;
		try
		{
			mm = Integer.parseInt(tf1.getText());
			if(mm < 50 || mm > 100)
			{
				tf1.setText("100");
				mm = 100;
				new error(this,"Max. Marks Must Be Between 50 and 100");
			}
		}
		catch(NumberFormatException x)
		{
			tf1.setText("100");
			mm = 100;
			new error(this,"Max. Marks Must Be A Numeric Value");
		}
		try
		{
			mo = Integer.parseInt(tf2.getText());
			if(mo > mm)
			{
				tf2.setText("0");
				mo = 0;
				new error(this,"Marks Ob. Must Be Less Than Or Equal To Max. Marks");
			}
		}
		catch(NumberFormatException x)
		{
			tf2.setText("0");
			mo = 0;
			new error(this,"Marks Ob. Must Be A Numeric Value");
		}
		int per = mo*100/mm;
		if(per >= 75)
			c1.setState(true);
		else if(per >= 60)
			c2.setState(true);
		else if(per >= 45)
			c3.setState(true);
		else if(per >= 33)
			c4.setState(true);
		else
			c5.setState(true);
		tf3.setText(String.valueOf(per));
	}		
	public static void main(String s[])
	{
		new controls_err();
	}
}
class error extends Dialog implements ActionListener
{
	Label l;
	Button b;
	Panel p;
	error(controls_err e,String str)
	{
		super(e,"Error",true);
		l = new Label(str,Label.CENTER);
		b = new Button("Ok");
		p = new Panel();
		p.add(b);
		add(l,BorderLayout.NORTH);
		add(p,BorderLayout.SOUTH);
		b.addActionListener(this);
		setSize(300,100);
		setLocation(0,100);
		setVisible(true);		
		setResizable(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		setVisible(false);
	} 
}