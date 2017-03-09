import java.net.*;
import java.io.*;
class server3
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
			BufferedReader in_cli = new BufferedReader(new InputStreamReader(cli.getInputStream()));
			String str = "";
			while(true)
			{
				System.out.print("To Client : ");
				str = in.readLine();
				out.println(str);
				if(str.equals("end"))
					break;
				String str1 = in_cli.readLine();
				System.out.println("From Client : " + str1);
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