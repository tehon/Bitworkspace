package bitjava.day01_06.SocketEX;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain
{

	public static void main(String[] args)
	{
		new Server();
	}

}

class Server
{
	static final int PORT = 3000;
	ServerSocket serverSocket = null;
	Socket socket = null;

	InputStream in;
	OutputStream out;
	BufferedReader reader;
	PrintWriter writer;

	String strSendData;
	String strReceiveData;

	public Server()
	{
		try
		{
			// 1. 서버 소켓 생성
			serverSocket = new ServerSocket(PORT); // 새 서버 소켓 생성
			System.out.println("서버가 클라이언트의 접속을 기다림");

			// 2. 서버 소켓의 accept() . 클라이언트의 접속이 있을때까지 대기
			// 5. 클라이언트가 접속 시작하면 액셉트가 클라이언트의 소켓을 리턴함
			socket = serverSocket.accept(); // 소켓은 서버소켓 엑셉트의 참조값을 받음 ㅎㅎ
			System.out.println(socket.getInetAddress() + "에서 연결 요청");

			// 6. 소켓으로부터 인풋 스트림과 아웃풋스트림을 얻음
			in = socket.getInputStream();
			out = socket.getOutputStream();
			reader = new BufferedReader(new InputStreamReader(in));
			writer = new PrintWriter(new OutputStreamWriter(out));

			// 7. 인풋 스트림과 아웃풋 스트림을 이용하여 통신
			// 8 연결이 끊어질때까지 통신
			while ((strReceiveData =reader.readLine()) != null)
			{
				if (strReceiveData.equals("quit"))
					break;
				writer.println(strReceiveData);
				writer.flush();

			}
			// 9. 소켓 받음
			socket.close();
			in.close();
			out.close();
			reader.close();
			writer.close();
		} catch (Exception e)
		{
			e.printStackTrace();

		}

	}
}