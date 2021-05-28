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
class thread1
{
	public static void main(String s[])
	{
		A a1= new A("First");
		A a2= new A("Second");
		a1.start();
		a2.start();
		for(int i=1;i<=50;i++)
		{
			System.out.println("In Main I = " + i);
		}
	}
}