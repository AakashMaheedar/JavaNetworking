import java.io.*;
import java.net.*;
class TCPSender
{
	public static void main(String args[])
	{
		try
		{
		//connection establishment
		ServerSocket ss=new ServerSocket(6666);
		Socket s=ss.accept();
		//Recieve msg from client-Inputstream
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String)dis.readUTF();
		System.out.println("The client says...."+str);
		
		}
		catch(Exception e)
		{
		System.out.println("Error while handling"+e);
		}
	}
}