import javax.swing.*;
import java.awt.event.*;
class jtable extends JFrame implements ActionListener
{
	JTable jtable;
	JScrollPane jsp;
	JButton jb;
	JPanel jp;
	String head[] = {"Roll No.","Name","Subject","Marks","Result"};
	String data[][] = {{"101","Abcd","Maths","30","Fail"},
			{"102","Efgh","Computer","60","Pass"},
			{"103","Ijkl","Physics","50","Pass"},
			{"104","Mnop","Chemistry","70","Pass"},
			{"105","Qrst","Hindi","80","Pass"},
			{"106","Uvwx","English","55","Pass"},
			{"107","Yz","Maths","70","Pass"}};
	jtable()
	{
		super("JTable");
		jtable = new JTable(data,head);
		jsp = new JScrollPane(jtable);
		jb = new JButton("Exit");
		jtable.setEnabled(false);
		jp = new JPanel();
		jp.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
		jp.add(jb);
		add(jsp);
		add(jp,java.awt.BorderLayout.SOUTH);
		jb.addActionListener(this);
		setSize(600,600);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	public static void main(String s[])
	{
		new jtable();
	}
}