import java.awt.*;
import java.applet.*;


public class app5 extends Applet
{
String s = "hello world";
int i;
int a = 20;
public void init()
{}
public void paint (Graphics g)
{
	g.drawString("hello world",50,50);
for(int i = 0; i<= 10; i++)
{
	int len = s.length();
	char ch = s.charAt(len-1);
	String str = s.substring(0,len-1);
	s = ch + str;
	g.drawString(s,a+50,a+50);
	a= a+20;
}
}
}


