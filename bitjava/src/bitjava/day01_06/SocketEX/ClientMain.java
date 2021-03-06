package bitjava.day01_06.SocketEX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain
{

	public static void main(String[] args)
	{
		new Client("localhost");
	}

}

class Client
{
	Socket socket = null;
	static final int PORT = 3000;

	Scanner kb = new Scanner(System.in);

	InputStream in;
	OutputStream out;
	BufferedReader reader;
	PrintWriter writer;

	String strSendData;
	String strReceiveData;

	public Client(String strMyIpAddress)
	{
		try
		{
			System.out.println("클라이언트가 서버로 접속중");
			//3. 소켓 생성
			//4. 소켓 생성시 접속 시도
			socket = new Socket(strMyIpAddress, PORT);

			//6. 소켓으로부터 인풋스트림과 아웃풋 스트림을 이용한 통신
			out = socket.getOutputStream();
			in = socket.getInputStream();
			writer = new PrintWriter(new OutputStreamWriter(out));
			reader = new BufferedReader(new InputStreamReader(in));

			System.out.print("input : ");

			//7. 인풋스트림과 아웃풋 스트림을 이용한 통신
			//8. 연결이 끊어질때까지 통신
			while ((strSendData = kb.nextLine()) != null)
			{
				writer.println(strSendData);
				writer.flush();

				if (strSendData.equals("quit"))
				{
					break;
				}
				strReceiveData = strSendData;

		
					System.out.println(socket.getInetAddress() + " : " + strReceiveData);
					System.out.print("input : ");
			
			}
			//9. 소켓 닫음
			socket.close();
			in.close();
			out.close();
			reader.close();
			writer.close();
		} catch (Exception e)
		{
			System.out.println("error");
			//System.out.print("input : ");
		}
	}

}