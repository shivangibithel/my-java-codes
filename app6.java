import java.awt.*;
import java.applet.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;

public class app6 extends Applet
{
String s;
String s2;
int size;
int i = 0;
int a = 20;
int t; 
int r;
int g1;
int b;
Font f;
Color colour;
public void init()
{
	s =  getParameter( "str" ); 
	s2 = getParameter ("str2"); 
	size  = Integer.parseInt(getParameter("fontsize"));
	t = Integer.parseInt(getParameter("time1"));
	r= Integer.parseInt (getParameter ("red"));
	g1= Integer.parseInt (getParameter ("green"));
	b= Integer.parseInt (getParameter ("blue"));
	f = new Font(s2 , Font.PLAIN , size );
	colour = new Color(r,g1,b);
}
public void paint (Graphics g)
{	g.setColor( colour);
	g.setFont(f);
	g.drawString("hello world",50,50);
	int length1 = s.length();
for(int i = 0; i<=(length1-1); i++)
{
	int len = s.length();
	char ch = s.charAt(len-1);
	String str = s.substring(0,len-1);
	s = ch + str;
	
	g.drawString(s,a+50,a+50);
		a= a+20;
	try{
		Thread.sleep(t);
		
	}catch (InterruptedException e){}
	
}
}
}
/*<applet code = app6 width = 700 height = 700>
</applet>*/



