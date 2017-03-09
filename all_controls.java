import java.awt.*;
import java.awt.event.*;
class all_controls extends Frame implements ActionListener,ItemListener,FocusListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	TextField tf1,tf2,tf3;
	TextArea ta1,ta2;
	Choice ch;
	List li;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
	CheckboxGroup cbg1,cbg2;
	Button b1,b2;
	all_controls()
	{
		super("All Controls");
		l1 = new Label("Roll No. : ");
		l2 = new Label("Name : ");
		l3 = new Label("Address : ");
		l4 = new Label("Password : ");
		l5 = new Label("Stream : ");
		l6 = new Label("Subject(s) : ");
		l7 = new Label("Year : ");
		l8 = new Label("Lang. Known : ");
		l9 = new Label("Result : ");
		l10 = new Label("Output : ");
		tf1 = new TextField(5);
		tf2 = new TextField(10);
		tf3 = new TextField(10);
		tf3.setEchoChar('*');
		ta1 = new TextArea(5,20);
		ta2 = new TextArea(9,30);
		ta2.setEditable(false);
		ch = new Choice();
		ch.add("Computer Sc.");
		ch.add("Electrical");
		ch.add("Electronics");
		li = new List(4,true);
		li.add("Comp. Fund.");li.add("Comp. Graphics");
		li.add("Visual Programming");li.add("Switch Gear");
		li.add("Electrical 1");li.add("Electrical 2");
		li.add("Electronics 1");li.add("Electronics 2");
		li.add("Electronics 3");
		cbg1 = new CheckboxGroup();
		cbg2 = new CheckboxGroup();
		c1 = new Checkbox("1st",cbg1,true);
		c2 = new Checkbox("2nd",cbg1,false);
		c3 = new Checkbox("3rd",cbg1,false);
		c4 = new Checkbox("4th",cbg1,false);
		c5 = new Checkbox("C",true);
		c6 = new Checkbox("C++",true);
		c7 = new Checkbox("Java");
		c8 = new Checkbox("Oracle");
		c9 = new Checkbox("Pass",cbg2,true);
		c10 = new Checkbox("Fail",cbg2,true);
		c11 = new Checkbox("Awaited",cbg2,true);
		b1 = new Button("Show Output");
		b2 = new Button("Exit");
		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(ta1);
		add(l4);add(tf3);add(l5);add(ch);add(l6);add(li);
		add(l7);add(c1);add(c2);add(c3);add(c4);add(l8);
		add(c5);add(c6);add(c7);add(c8);add(l9);add(c9);
		add(c10);add(c11);add(l10);add(ta2);add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		c6.addItemListener(this);
		c7.addItemListener(this);
		c8.addItemListener(this);
		c9.addItemListener(this);
		c10.addItemListener(this);
		c11.addItemListener(this);
		ch.addItemListener(this);
		li.addItemListener(this);
		tf1.addFocusListener(this);
		tf2.addFocusListener(this);
		tf3.addFocusListener(this);
		ta1.addFocusListener(this);
		setSize(600,600);
		setVisible(true);
	}
	public void focusGained(FocusEvent e){}
	public void focusLost(FocusEvent e)
	{
		a();
	}
	public void itemStateChanged(ItemEvent e)
	{
		a();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b2)
			System.exit(0);
		else
		{
			a();
		}
	}
	void a()
	{
		String str = "";
		str += l1.getText();
		str += tf1.getText();
		str += "\n";
		str += l2.getText();
		str += tf2.getText();
		str += "\n";
		str += l3.getText();
		str += ta1.getText();
		str += "\n";
		str += l4.getText();
		str += tf3.getText();
		str += "\n";
		str += l5.getText();
		str += ch.getSelectedItem();
		str += "\n";
		str += l6.getText();
		String sub[] = li.getSelectedItems();
		for(int i=0;i<sub.length;i++)
		{
			str += sub[i];
			str += ",";
		}
		str += "\n";
		str += l7.getText();
		str += cbg1.getSelectedCheckbox().getLabel();
		str += "\n";
		str += l8.getText();
		if(c5.getState())
		{
			str += c5.getLabel();
			str += ",";
		}
		if(c6.getState())
		{
			str += c6.getLabel();
			str += ",";
		}
		if(c7.getState())
		{
			str += c7.getLabel();
			str += ",";
		}
		if(c8.getState())
		{
			str += c8.getLabel();
			str += ",";
		}
		str += "\n";
		str += l9.getText();
		str += cbg2.getSelectedCheckbox().getLabel();
		ta2.setText(str);
	}
	public static void main(String s[])
	{
		new all_controls();
	}
}