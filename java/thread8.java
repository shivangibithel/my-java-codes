class A
{
	synchronized void mesg() throws InterruptedException
	{
		System.out.println("Invoked By : " + Thread.currentThread());
		//Thread.sleep(1000);
		System.out.println("Hello");
		//Thread.sleep(1000);
		System.out.println("World");
		//Thread.sleep(1000);
		System.out.println("Welcome");
		//Thread.sleep(1000);
		System.out.println("To");
		//Thread.sleep(1000);
		System.out.println("Threads");
		//Thread.sleep(1000);
		System.out.println("In");
		//Thread.sleep(1000);
		System.out.println("Java");
		//Thread.sleep(1000);
	}
}
class B extends Thread
{
	A obj;
	B(A a1)
	{
		obj = a1;
		start();
	}
	public void run()
	{
		try
		{
			obj.mesg();
		}
		catch(InterruptedException x){}
	}
}
class thread8
{
	public static void main(String s[])
	{
		A a1 = new A();
		B b1 = new B(a1);		
		B b2 = new B(a1);		
		B b3 = new B(a1);		
		try
		{
			a1.mesg();
		}
		catch(InterruptedException x){}
	}
}