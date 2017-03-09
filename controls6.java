import java.awt.*;
import java.awt.event.*;
class controls6 extends Frame implements ActionListener,ItemListener
{
	Label l1,l2;
	Choice ch;
	List li;
	Button b1;
	controls6()
	{
		super("Stream/Subject");
		l1 = new Label("Stream : ");
		l2 = new Label("Subject(s) : ");
		ch = new Choice();
		ch.add("");
		ch.add("Arts");
		ch.add("Commerce");
		ch.add("Science");
		li = new List(10,true);
		li.add("Hindi");
		li.add("English");
		li.add("History");
		li.add("Banking");
		li.add("Banking");
		li.add("Economics");
		li.add("Physics");
		li.add("Chemistry");
		li.add("Maths");
		b1 = new Button("Exit");
		li.setEnabled(false);
		setLayout(new FlowLayout());
		add(l1);add(ch);add(l2);add(li);
		add(b1);
		b1.addActionListener(this);
		ch.addItemListener(this);
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
		for(int i=0;i<li.getItemCount();i++)
			li.deselect(i);
		if(ch.getSelectedItem().equalsIgnoreCase("arts"))
		{
			li.select(0);
			li.select(1);
			li.select(2);
		}
		else if(ch.getSelectedIndex() == 2)
		{
			li.select(3);
			li.select(4);
			li.select(5);
		}
		else if(ch.getSelectedIndex() == 3)
		{
			li.select(6);
			li.select(7);
			li.select(8);
		}
	}		
	public static void main(String s[])
	{
		new controls6();
	}
}