class A implements Runnable
{
	Thread t;
	A(String s)
	{
		t = new Thread(this);
		t.setName(s);
		t.setPriority(7);
		t.start();
	}
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("In " + t.getName() + " having priority " + t.getPriority() + " I = " + i);
		}
	}
}
class thread10
{
	public static void main(String s[])
	{
		A a1= new A("First");
		
		for(int i=1;i<=50;i++)
		{
			System.out.println("In Main I = " + i);
		}
	}
}