import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
public class scroll_frm extends Frame implements AdjustmentListener
{
	TextField tf;
	Scrollbar s;
	public scroll_frm()
	{
		super("Scrollbar");
		s = new Scrollbar(Scrollbar.HORIZONTAL,50,10,-100,200);
		tf = new TextField(5);
		tf.setText(String.valueOf(s.getValue()));
		setLayout(new FlowLayout());
		add(s);add(tf);
		s.addAdjustmentListener(this);
		setSize(300,300);
		setVisible(true);
		addWindowListener(new close());
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		tf.setText(String.valueOf(s.getValue()));
	}
	public static void main(String s[])
	{
		new scroll_frm();
	}
}