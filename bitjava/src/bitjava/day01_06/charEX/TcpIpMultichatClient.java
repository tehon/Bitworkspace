package bitjava.day01_06.charEX;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class TcpIpMultichatClient
{
	public static final int PORT = 3000;
	public static final String SERVER_IP = "127.0.0.1";

	public static void main(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("USAGE : TcpIpMultichatClient 대화명");
			System.exit(-1);
		}
		try
		{
			// 3 소켓 생성
			// 4 소켓 생성 > 접속 시작
			// 접속되면 다음 줄 / 접ㅂ속 안되면 오류 메세지
			Socket socket = new Socket(SERVER_IP, PORT);

			Thread sender = new ClientSender(socket, args[0]);
			Thread receive = new ClientReceiver(socket);

			sender.start();
			receive.start();

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}

class ClientSender extends Thread
{
	Socket socket;
	PrintWriter writer;
	String name;

	ClientSender(Socket socket, String name)
	{
		this.socket = socket;
		this.name = name;
		try
		{
			// 6. 소켓으로 부터 인풋스트림 아웃풋 스트림을 얻음
			writer = new PrintWriter(socket.getOutputStream());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void run()
	{
		Scanner kb = new Scanner(System.in);
		if (writer != null)
		{
			writer.println(name);
			writer.flush();
		}
		//7 인풋 아웃풋을 이용한 통신
		//8 연결이 끊어질때까지
		while (writer != null)
		{
			writer.println(name + " : " + kb.nextLine());
			writer.flush();
		}
		// 9 socket close
		try
		{
			socket.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		kb.close();
	}

}

class ClientReceiver extends Thread
{
	Socket socket;
	BufferedReader reader;

	public ClientReceiver(Socket socket)
	{
		this.socket = socket;
		try
		{
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run()
	{
		//7 인풋 아웃풋을 이용한 통신
		//8 소켓 꺼질때까지 통신 
		while (reader != null)
		{
			try
			{
				System.out.println(reader.readLine());
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			// 9. 소켓 닫음
			try
			{
				socket.close();
			} catch (Exception e)
			{
				e.printStackTrace();
			}

		}
	}
}