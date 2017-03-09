class A extends Thread
{
	A(String s)
	{
		setName(s);
	}
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("In " + getName() + " I = " + i);
		}
	}
}
class thread9
{
	public static void main(String s[])
	{
		A a1= new A("First");
		a1.start();
		for(int i=1;i<=50;i++)
		{
			System.out.println("In Main I = " + i);
			if(i==10)
				a1.suspend();
			else if(i==25)
				a1.resume();
			else if(i==40)
				a1.stop();			
		}
	}
}