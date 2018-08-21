/*
	Datagram Socket-to establish communication -> connection less
	Datagram Packet->send or recieve packet
*/
import java.io.*;
import java.net.*;
class UDPSender
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		String str="hello World";
		InetAddress ip=InetAddress.getByName("127.0.0.1");
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.send(dp);
		ds.close();
	}
}