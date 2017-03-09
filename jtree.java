import javax.swing.JTree;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class jtree extends JFrame implements ActionListener
{
	JTree jtree;
	JScrollPane jsp;
	JButton jb;
	JPanel jp;
	DefaultMutableTreeNode n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
	DefaultMutableTreeNode n11,n12,n13,n14,n15,n16,n17,n18,n19,n20;
	DefaultMutableTreeNode n21,n22,n23;
	jtree()
	{
		super("JTree");
		n1 = new DefaultMutableTreeNode("Desktop");
		n2 = new DefaultMutableTreeNode("My Computer");
		n3 = new DefaultMutableTreeNode("C:");
		n4 = new DefaultMutableTreeNode("Program Files");
		n5 = new DefaultMutableTreeNode("Java");
		n6 = new DefaultMutableTreeNode("jdk1.6.0");
		n7 = new DefaultMutableTreeNode("bin");
		n8 = new DefaultMutableTreeNode("a.java");
		n9 = new DefaultMutableTreeNode("a.class");
		n10 = new DefaultMutableTreeNode("Windows");
		n11 = new DefaultMutableTreeNode("System32");
		n12 = new DefaultMutableTreeNode("sol.exe");
		n13 = new DefaultMutableTreeNode("freecell.exe");
		n14 = new DefaultMutableTreeNode("D:");
		n15 = new DefaultMutableTreeNode("My Programs");
		n16 = new DefaultMutableTreeNode("jtable.java");
		n17 = new DefaultMutableTreeNode("Recycle Bin");
		n18 = new DefaultMutableTreeNode("a.class");
		n19 = new DefaultMutableTreeNode("jtable.class");
		n20 = new DefaultMutableTreeNode("Network Neighbourhood");
		n21 = new DefaultMutableTreeNode("System 1");
		n22 = new DefaultMutableTreeNode("Shared Documents");
		n23 = new DefaultMutableTreeNode("resume.doc");
		n1.add(n2);n1.add(n17);n1.add(n20);
		n2.add(n3);n2.add(n14);
		n3.add(n4);n3.add(n10);
		n4.add(n5);n5.add(n6);n6.add(n7);
		n7.add(n8);n7.add(n9);
		n10.add(n11);n11.add(n12);n11.add(n13);
		n14.add(n15);n15.add(n16);
		n17.add(n18);n17.add(n19);
		n20.add(n21);n21.add(n22);n22.add(n23);
		jtree = new JTree(n1);
		jsp = new JScrollPane(jtree);
		jb = new JButton("Exit");
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
		new jtree();
	}
}