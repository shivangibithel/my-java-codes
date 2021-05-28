import java.net.*;
class datagramserver2
{
	public static void main(String s[])
	{
		try
		{
			DatagramSocket soc = new DatagramSocket(1234);
			byte b[] = new byte[100];
			DatagramPacket pac = new DatagramPacket(b,b.length);
			System.out.println("Waiting for packet.....");
			soc.receive(pac);
			System.out.println("Packet received.....");
			String str = new String(pac.getData());
			int i = str.lastIndexOf('~');
			str = str.substring(0,i);
			System.out.println("Message Is : " + str + "end");
			InetAddress add = pac.getAddress();
			int port = pac.getPort(); 
			System.out.println("Received From : " + add  + " Using Port : " + port);
		}
		catch(Exception x)
		{
			System.out.println("Error : " + x);
		}
	}
}