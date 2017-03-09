class A extends Thread
{
	A(String s,int p)
	{
		setName(s);
		setPriority(p);
	}
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("In " + currentThread() + " I = " + i);
		}
	}
}
class B extends Thread
{
	A x;
	B(String s,int p,A obj)
	{
		setName(s);
		setPriority(p);
		x = obj;
	}
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("In " + currentThread() + " I = " + i);
			if(i==10)
			{
				try
				{
					x.join();
				}
				catch(InterruptedException x){}
			}	
		}
	}
}
class thread6
{
	public static void main(String s[])
	{
		A a1= new A("First",Thread.NORM_PRIORITY);
		B b1= new B("Second",Thread.NORM_PRIORITY,a1);
		a1.start();
		b1.start();
		for(int i=1;i<=50;i++)
		{
			System.out.println("In " + Thread.currentThread() + " I = " + i);
			if(i==10)
			{
				try
				{
					a1.join();
				}
				catch(InterruptedException x){}
			}
		}
	}
}