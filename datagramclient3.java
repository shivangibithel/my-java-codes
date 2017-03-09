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
			byte b1[] =  new byte[50];
			pac = new DatagramPacket(b1,b1.length);
			soc.receive(pac);
			String str1 = new String(pac.getData());
			str1 = str1.trim();
			System.out.println(str1);
		}
		catch(Exception x)
		{
			System.out.println("Error : " + x);
		}
	}
}