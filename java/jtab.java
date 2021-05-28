import javax.swing.*;
import java.awt.event.*;
class jtab extends JFrame implements ActionListener
{
	JTabbedPane jtab;
	JButton jb;
	JPanel jp;
	jtab()
	{
		super("JTabbedPane");
		jtab = new JTabbedPane();
		jtab.addTab("Result",new controls1());
		jtab.addTab("Pie Chart",new pie());
		jb = new JButton("Exit");
		jp = new JPanel();
		jp.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
		jp.add(jb);
		add(jtab);
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
		new jtab();
	}
}