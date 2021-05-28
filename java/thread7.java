class A
{
	synchronized void mesg()
	{
		System.out.println("Hello" + Thread.currentThread());
		System.out.println("World"  + Thread.currentThread());
		System.out.println("Welcome"  + Thread.currentThread());
		System.out.println("To"  + Thread.currentThread());
		System.out.println("Threads"  + Thread.currentThread());
		System.out.println("In"  + Thread.currentThread());
		System.out.println("Java"  + Thread.currentThread());
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
		obj.mesg();
	}
}
class thread7
{
	public static void main(String s[])
	{
		A a1 = new A();
		B b1 = new B(a1);		
		B b2 = new B(a1);		
		B b3 = new B(a1);		
		a1.mesg();
	}
}