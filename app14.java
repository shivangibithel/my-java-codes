import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class app14 extends Applet 

{	String s ="hello " ;
 int x =0;
	public void paint(Graphics g)
	{   
	
		
			 
			 g.drawString(s, x,50);
			  x+=1;
			 
		 if (x==700)
		 {
			 x=0;
		
		 }
           try 
           {        
                  
                     Thread.sleep(25); 
		   }
           catch (InterruptedException e) {}
		
			repaint();
		}
	}



//<applet code = app14 width = 700 height = 700>
//</applet>
//scrollin text to right
