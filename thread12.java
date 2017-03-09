class thread12
{
	public static void main(String s[])
	{
		Thread t = Thread.currentThread();
		t.setName("Parent");
		t.setPriority(7);
		for(int i=1;i<=50;i++)
		{
			System.out.println("In " + t.getName() + " having priority " + t.getPriority() + " I = " + i);
		}
	}
}