import java.awt.Scrollbar;
import java.awt.TextField;
import java.applet.Applet;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
public class scroll extends Applet implements AdjustmentListener
{
	TextField tf;
	Scrollbar s;
	public void init()
	{
		s = new Scrollbar(Scrollbar.HORIZONTAL,50,10,-100,200);
		tf = new TextField(5);
		tf.setText(String.valueOf(s.getValue()));
		add(s);add(tf);
		s.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		tf.setText(String.valueOf(s.getValue()));
	}
}
/*
<applet code = scroll width = 300 height = 300>
</applet>
*/