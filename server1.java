import java.net.*;
import java.io.*;
class server1
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
			out.println("Welcome to socket programming");
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