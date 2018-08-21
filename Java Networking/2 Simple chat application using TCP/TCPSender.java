import java.io.*;
import java.net.*;
import java.util.Scanner;
class TCPSender
{
	public static void main(String args[])
	{
		try
		{
		//connection establishment
		ServerSocket ss=new ServerSocket(6666);
		Socket s=ss.accept();
		//DataTranfer
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		Scanner scr=new Scanner(System.in);
		String strS,strR;   //message to Receiver//message frm Reciever
		
		do
		{
		strR=(String)dis.readUTF(); 
		System.out.println("The client says...."+ strR);
		strS=scr.nextLine();
		dos.writeUTF(strS);
		dos.flush();
		}while(!strS.equals("end"));
		dis.close();
		s.close();
		}
		catch(Exception e)
		{
		System.out.println("Error while handling"+e);
		}
	}
}