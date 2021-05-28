import java.net.*;
import java.io.*;
class server2
{
	public static void main(String s[])
	{
		try
		{
			ServerSocket ser = new ServerSocket(1234);
			System.out.println("Waiting for client......");
			Socket cli = ser.accept();
			System.out.println("Connected to client......");
			PrintWriter out = new PrintWriter(cli.getOutputStream(),true);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			while(true)
			{
				System.out.print("To Client : ");
				str = in.readLine();
				out.println(str);
				if(str.equals("end"))
					break;
			}
		}
		catch(SocketException x)
		{
			System.out.println("Error : " + x);
		}
		catch(java.io.IOException x)
		{
			System.out.println("Error : " + x);
		}
	}
}