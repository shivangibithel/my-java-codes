class A extends Thread
{
	Thread t;
	A(Thread t)
	{
		this.t = t;
		start();
	}
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("In A i = " + i);
			if(i==25)
			{
				try
				{
					t.join();
				}
				catch(InterruptedException x){}
			}
		}
	}
}
class thread11
{
	public static void main(String s[])
	{
		Thread t = Thread.currentThread();
		A a1 = new A(t);
		for(int i=1;i<=50;i++)
		{
			System.out.println("In main i = " + i);
		}
		System.out.println("A1 isAlive() = " + a1.isAlive());
	}
}		