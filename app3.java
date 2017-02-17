import java.awt.*;
import java.applet.*;
import java.util.*;
import java.net.*;
import java.awt.event.*;
public class app3 extends Applet
{int i;
	Date date = new Date();
        
	public void init()
	{}
	public void paint(Graphics g)
	{
		g.drawString("hello world",100,100);
		
		showStatus(date.toString());
		for (int i =0 ; i>0; i++)
		{
			System.out.println(i);
			String s = Integer.toString( i);
			
		}
		updtate();
		showStatus("Using from last " + s);
		
	}
	
}