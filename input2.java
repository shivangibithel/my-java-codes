class input2
{
	public static void main(String s[])
	{
		char a = ' ';
		String str = "";
		System.out.print("Enter any string : ");			
		try
		{
			while(a != 13)
			{
				a = (char)System.in.read();
				str += a;
			}
			System.out.print("String = " + str);
		}
		catch(java.io.IOException x){}
	}
}