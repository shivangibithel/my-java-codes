import java.io.*;
class file
{
	public static void main(String s[])
	{
		try
		{
			FileReader f = new FileReader("file.java");
			BufferedReader in = new BufferedReader(f);
			String str = "";
			while((str = in.readLine()) != null)
			{
				System.out.println(str);
			}
		}
		catch(Exception x)
		{
			System.out.println("Error : " + x);
		}
	}
} 