import java.io.DataInputStream;
import java.io.IOException;
class input5
{
	public static void main(String s[])
	{
		DataInputStream i = new DataInputStream(System.in);
		String str = "";
		int num1=0,num2=0,sum=0;
		try
		{
			while(true)
			{
				try
				{
					System.out.print("Enter first number : ");				
					str = i.readLine();
					num1 = Integer.parseInt(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.print("Invalid Input.Try Again.");
				}
			}
			while(true)
			{
				try
				{
					System.out.print("Enter second number : ");				
					str = i.readLine();
					num2 = Integer.parseInt(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.print("Invalid Input.Try Again.");
				}
			}
			sum = num1 + num2;
			System.out.print("Sum = " + sum);
		}
		catch(java.io.IOException x){}
	}
}