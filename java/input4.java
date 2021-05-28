import java.io.DataInputStream;
import java.io.IOException;
class input4
{
	public static void main(String s[])
	{
		DataInputStream i = new DataInputStream(System.in);
		String str = "";
		int num1,num2,sum;
		try
		{
			System.out.print("Enter first number : ");			
			str = i.readLine();
			num1 = Integer.parseInt(str);
			System.out.print("Enter second number : ");			
			str = i.readLine();
			num2 = Integer.parseInt(str);
			sum = num1 + num2;
			System.out.print("Sum = " + sum);
		}
		catch(java.io.IOException x){}
	}
}