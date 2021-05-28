import java.net.*;
import java.io.*;
class client3
{
	public static void main(String s[])
	{
		try
		{
			Socket ser = new Socket("192.168.3.188",1234);
			System.out.println("Connected to server......");
			BufferedReader in = new BufferedReader(new InputStreamReader(ser.getInputStream()));
			BufferedReader in_key = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(ser.getOutputStream(),true);
			while(true)
			{
				String str = in.readLine();
				System.out.println("From Server : " + str);	
				if(str.equals("end"))
					break;
				System.out.print("To Server : ");
				String str1 = in_key.readLine();
				out.println(str1);
			}
		}
		catch(Exception x)
		{
			System.out.println("Error : " + x);
		}
	}
}