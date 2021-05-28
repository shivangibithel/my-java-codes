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

class thread5
{
	public static void main(String s[])
	{
		A a1= new A("First",Thread.NORM_PRIORITY);
		a1.start();
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