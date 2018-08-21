import java.io.*;
import java.net.*;
import java.util.Scanner;
class TCPReceiver
{
	public static void main(String args[])
	{
		try
		{
		//connection establishment
		Socket s=new Socket("localhost",6666);
		//Streams
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());
		Scanner scr=new Scanner(System.in);
		String strS,strR; //message to Receiver//message frm Reciever
		System.out.println("Enter any message for transfer : ");
		 
		do
		{
		 strS=scr.nextLine();
		dos.writeUTF(strS);
		dos.flush();
		strR=dis.readUTF();
		System.out.println("Server says....."+strR);
		}while(!strS.equals("end"));
		dos.close();
		s.close();
		}
		catch(Exception e)
		{
		System.out.println("Error while handling"+e);
		}
	}
}