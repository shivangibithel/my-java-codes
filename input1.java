class input1
{
	public static void main(String s[])
	{
		char a;
		System.out.print("Enter any character : ");			
		try
		{
			a = (char)System.in.read();
			System.out.print("A = " + a);
		}
		catch(java.io.IOException x){}
	}
}