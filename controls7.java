import java.awt.*;
import java.awt.event.*;
class controls7 extends Frame implements ActionListener
{
	List li1,li2;
	Button b1,b2,b3;
	controls7()
	{
		super("Stream/Subject");
		li1 = new List(10,true);
		li2 = new List(10,true);
		li1.add("Hindi");
		li1.add("English");
		li1.add("History");
		li1.add("Banking");
		li1.add("Accounts");
		li1.add("Economics");
		li1.add("Physics");
		li1.add("Chemistry");
		li1.add("Maths");
		li1.add("Computer Sc.");
		b1 = new Button(" > ");
		b2 = new Button(" >> ");
		b3 = new Button("Exit");
		setLayout(new FlowLayout());
		add(li1);add(b1);add(b2);add(b3);add(li2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(400,300);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b3)
			System.exit(0);	
		else if(e.getSource() == b1)
		{
			String sub[] = li1.getSelectedItems();
			for(int i=0;i<sub.length;i++)
			{
				li2.add(sub[i]);
				li1.remove(sub[i]);
			}
		}
		else
		{
			for(int i=0;i<li1.getItemCount();i++)
			{
				String str = li1.getItem(i);
				li2.add(str);
			}
			li1.removeAll();
		}
	}		
	public static void main(String s[])
	{
		new controls7();
	}
}