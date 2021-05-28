import java.net.*;
class datagramserver1
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
			str = str.trim();
			System.out.println("Message Is : " + str + "end");
		}
		catch(Exception x)
		{
			System.out.println("Error : " + x);
		}
	}
}