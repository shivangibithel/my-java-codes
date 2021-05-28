class A extends Thread
{
	A(String s,int p)
	{
		setName(s);
		setPriority(p);
	}
	public void run()
	{
		for(int i=1;;i++)
		{
			System.out.println("In " + currentThread() + " I = " + i);
		}
	}
}
class thread3
{
	public static void main(String s[])
	{
		A a1= new A("First",Thread.MIN_PRIORITY);
		A a2= new A("Second",Thread.MAX_PRIORITY);
		a1.start();
		a2.start();
		for(int i=1;;i++)
		{
			System.out.println("In " + Thread.currentThread() + " I = " + i);
		}
	}
}