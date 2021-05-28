package input;
import java.io.DataInputStream;
import java.io.IOException;
public class Input
{
	String str;
	DataInputStream i = new DataInputStream(System.in);
	public int intInput(String s)
	{
		int num=0;
		try
		{
			while(true)
			{
				try
				{
					System.out.print(s);				
					str = i.readLine();
					num = Integer.parseInt(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.println("Invalid Input.Try Again.");
				}
			}	
		}
		catch(java.io.IOException x){}
		return num;
	}
	public float floatInput(String s)
	{
		float num=0;
		try
		{
			while(true)
			{
				try
				{
					System.out.print(s);				
					str = i.readLine();
					num = Float.parseFloat(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.println("Invalid Input.Try Again.");
				}
			}	
		}
		catch(java.io.IOException x){}
		return num;
	}
	public byte byteInput(String s)
	{
		byte num=0;
		try
		{
			while(true)
			{
				try
				{
					System.out.print(s);				
					str = i.readLine();
					num = Byte.parseByte(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.println("Invalid Input.Try Again.");
				}
			}	
		}
		catch(java.io.IOException x){}
		return num;
	}
	public long longInput(String s)
	{
		long num=0;
		try
		{
			while(true)
			{
				try
				{
					System.out.print(s);				
					str = i.readLine();
					num = Long.parseLong(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.println("Invalid Input.Try Again.");
				}
			}	
		}
		catch(java.io.IOException x){}
		return num;
	}
	public short shortInput(String s)
	{
		short num=0;
		try
		{
			while(true)
			{
				try
				{
					System.out.print(s);				
					str = i.readLine();
					num = Short.parseShort(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.println("Invalid Input.Try Again.");
				}
			}	
		}
		catch(java.io.IOException x){}
		return num;
	}
	public double doubleInput(String s)
	{
		double num=0;
		try
		{
			while(true)
			{
				try
				{
					System.out.print(s);				
					str = i.readLine();
					num = Double.parseDouble(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.println("Invalid Input.Try Again.");
				}
			}	
		}
		catch(java.io.IOException x){}
		return num;
	}
	public boolean booleanInput(String s)
	{
		boolean num=false;
		try
		{
			while(true)
			{
				try
				{
					System.out.print(s);				
					str = i.readLine();
					num = Boolean.parseBoolean(str);
					break;
				}
				catch(NumberFormatException x)
				{
				 	System.out.println("Invalid Input.Try Again.");
				}
			}	
		}
		catch(java.io.IOException x){}
		return num;
	}
	public String stringInput(String s)
	{
		try
		{
			System.out.print(s);				
			str = i.readLine();
		}
		catch(java.io.IOException x){}
		return str;
	}
}