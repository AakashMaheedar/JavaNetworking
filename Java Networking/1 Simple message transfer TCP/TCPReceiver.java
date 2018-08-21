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
		//send data to Server -OutPutStream
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter any message for transfer : ");
		String str1=scr.nextLine();
		dos.writeUTF(str1);
		
		}
		catch(Exception e)
		{
		System.out.println("Error while handling"+e);
		}
	}
}