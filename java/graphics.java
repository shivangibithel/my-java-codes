import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
public class graphics extends Applet
{
	public void paint(Graphics g)
	{
		Font f = new Font("times new roman",Font.BOLD | Font.ITALIC,20);
		g.setFont(f);
		setBackground(new Color(230,236,193));
		g.setColor(Color.red);
		g.drawString("Hello World",50,50);
		g.setColor(Color.green);
		g.fillRoundRect(50,50,200,200,50,50);
		g.setColor(Color.blue);
		g.drawLine(50,50,250,250);
		g.setColor(Color.magenta);
		g.fillOval(50,50,200,200);
		g.setColor(new Color(127,127,127));
		g.fillArc(50,50,200,200,0,90);
		g.setColor(new Color(227,27,150));
		g.fillArc(50,50,200,200,90,90);
		g.setColor(Color.yellow);
		g.fillArc(50,50,200,200,180,90);
		g.setColor(Color.orange);
		g.fillArc(50,50,200,200,270,90);
		//int x[] = {200,350,100,400,150};
		//int y[] = {50,400,100,100,450};
		//g.fillPolygon(x,y,5);
		showStatus("Welcome To Applets");
	}
}
/*
<applet code = graphics width = 500 height = 500>
</applet>
*/