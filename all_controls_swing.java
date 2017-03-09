import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class all_controls_swing extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField tf1,tf2;
	JPasswordField tf3;
	JTextArea ta1,ta2;
	JComboBox ch;
	JList li;
	JCheckBox c5,c6,c7,c8;
	JRadioButton c1,c2,c3,c4,c9,c10,c11;
	ButtonGroup bg1,bg2;
	JButton b1,b2;
	JScrollPane jsp1,jsp2,jsp3;
	all_controls_swing()
	{
		super("All Controls");
		l1 = new JLabel("Roll No. : ");
		l2 = new JLabel("Name : ");
		l3 = new JLabel("Address : ");
		l4 = new JLabel("Password : ");
		l5 = new JLabel("Stream : ");
		l6 = new JLabel("Subject(s) : ");
		l7 = new JLabel("Year : ");
		l8 = new JLabel("Lang. Known : ");
		l9 = new JLabel("Result : ");
		l10 = new JLabel("Output : ");
		tf1 = new JTextField(5);
		tf2 = new JTextField(10);
		tf3 = new JPasswordField(10);
		ta1 = new JTextArea(5,10);
		ta2 = new JTextArea(9,30);
		ta2.setEditable(false);
		String stream[] = {"Computer Sc.","Electrical","Electronics"};
		ch = new JComboBox(stream);
		String sub[] = {"Comp. Fund.","Comp. Graphics","Visual Programming","Switch Gear","Electrical 1","Electrical 2","Electronics 1","Electronics 2","Electronics 3"};
		li = new JList(sub);		
		bg1 = new ButtonGroup();
		bg2 = new ButtonGroup();
		c1 = new JRadioButton("1st");
		c2 = new JRadioButton("2nd");
		c3 = new JRadioButton("3rd");
		c4 = new JRadioButton("4th",true);
		c5 = new JCheckBox("C",true);
		c6 = new JCheckBox("C++",true);
		c7 = new JCheckBox("Java");
		c8 = new JCheckBox("Oracle");
		c9 = new JRadioButton("Pass",true);
		c10 = new JRadioButton("Fail");
		c11 = new JRadioButton("Awaited");
		bg1.add(c1);bg1.add(c2);bg1.add(c3);bg1.add(c4);
		bg2.add(c9);bg2.add(c10);bg2.add(c11);
		b1 = new JButton("Show Output");
		b2 = new JButton("Exit");
		jsp1 = new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp2 = new JScrollPane(ta2);
		jsp3 = new JScrollPane(li);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(jsp1);
		add(l4);add(tf3);add(l5);add(ch);add(l6);add(jsp3);
		add(l7);add(c1);add(c2);add(c3);add(c4);add(l8);
		add(c5);add(c6);add(c7);add(c8);add(l9);add(c9);
		add(c10);add(c11);add(l10);add(jsp2);add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(600,600);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b2)
			System.exit(0);
	}
	public static void main(String s[])
	{
		new all_controls_swing();
	}
}