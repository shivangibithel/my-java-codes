import java.io.DataInputStream;
import java.io.IOException;
class input3
{
	public static void main(String s[])
	{
		DataInputStream i = new DataInputStream(System.in);
		String str = "";
		System.out.print("Enter any string : ");			
		try
		{
			str = i.readLine();
			System.out.print("String = " + str);
		}
		catch(java.io.IOException x){}
	}
}