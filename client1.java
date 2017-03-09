import java.net.*;
import java.io.*;
class client1 
{
	public static void main(String s[])
	{
		try
		{
			Socket ser = new Socket("192.168.3.188",1234);
			System.out.println("Connected to server......");
			BufferedReader in = new BufferedReader(new InputStreamReader(ser.getInputStream()));
			String str = in.readLine();
			System.out.println("From Server : " + str);	
		}
		catch(Exception x)
		{
			System.out.println("Error : " + x);
		}
	}
}