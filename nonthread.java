class A
{
	void fun()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("In A I = " + i);
		}
	}
}
class nonthread
{
	public static void main(String s[])
	{
		A a1= new A();
		a1.fun();
		for(int i=1;i<=50;i++)
		{
			System.out.println("In Main I = " + i);
		}
	}
}