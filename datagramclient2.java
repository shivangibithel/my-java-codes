import java.net.*;
class datagramclient3
{
	public static void main(String s[])
	{
		try
		{
			DatagramSocket soc = new DatagramSocket(1000);
			String str = "           Welcome to datagram sockets.          ~";
			byte b[] = str.getBytes();
			DatagramPacket pac = new DatagramPacket(b,b.length,InetAddress.getByName("localhost"),1234);
			soc.send(pac);
			System.out.println("Packet sent......");
		
		}
		catch(Exception x)
		{
			System.out.println("Error : " + x);
		}
	}
}