import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.*;
public class app15 extends Applet 

{	String s ="hello " ;
 int x =700;
 int width; 
	Font f;
 public void init()
 {
	 f = new Font("times new roman",Font.BOLD,20);
	 FontMetrics fm = getFontMetrics(f);
		width = fm.stringWidth(s);
 }
	public void paint(Graphics g)
	{   
		
		
			 g.drawString(s, x,50);
			  x--;
			 
		 if (x==(-width))
		 {
			 x=700;
		
		 }
           try 
           {        
                  
                     Thread.sleep(25); 
		   }
           catch (InterruptedException e) {}
		
			repaint();
		}
	}



//<applet code = app15 width = 700 height = 700>
//</applet>
//scrollin text to left

