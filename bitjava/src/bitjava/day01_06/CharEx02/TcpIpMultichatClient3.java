package bitjava.day01_06.CharEx02;

/**
 * @file name : TcpIpMultichatClient.java
 * @date : 2013. 9. 29.
 * @discription : 채팅 프로그램 - 클라이언트
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

class ClientSender extends Thread {
    Socket socket;
	PrintWriter writer;
    String name;
    
    ClientSender(Socket socket, String name) {
        this.socket = socket;
        try {
        	//************* 6. Socket으로부터 InputStream, OutputStream을 얻음
        	writer = new PrintWriter(socket.getOutputStream());
            this.name = name;
        } catch (Exception e) {
        }
    }
    @Override
    public void run() {
        Scanner kb = new Scanner(System.in);
        if (writer != null) {
            writer.println(name);
            writer.flush();
        }
        //***************** 7. InputStream, OutputStream을 이용한 통신
    	//***************** 8. 연결이 끊어질 때까지 통신
        while (writer != null) {
        	writer.println("[" + name + "]" + kb.nextLine());
            writer.flush();
        }
        kb.close();
        //***************** 9. Socket close()
        try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    } 
}

class ClientReceiver extends Thread {
    Socket socket;
    BufferedReader reader;
    ClientReceiver(Socket socket) {
        this.socket = socket;
        try {
        	//************* 6. Socket으로부터 InputStream, OutputStream을 얻음
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
        }
    }
    @Override
    public void run() {
        //***************** 7. InputStream, OutputStream을 이용한 통신
    	//***************** 8. 연결이 끊어질 때까지 통신
    	while (reader != null) {
            try {
                System.out.println(reader.readLine());
            } catch (IOException e) {
            }
        }
    	//***************** 9. Socket close()
        try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
}

public class TcpIpMultichatClient3 {
	public static final int PORT = 3000;
	public static final String SERVER_IP = "127.0.0.1";
	
    public static void main(String args[]) {

    	if (args.length != 1) {
            System.out.println("USAGE: java TcpIpMultichatClient 대화명");
            System.exit(0);
        }
        
    	try {
    		//****************** 3. Socket 생성
    		//****************** 4. Socket 생성 -> 접속을 시도 (접속 시작). 접속되면 다음줄 / 접속안되면 Exception.
            Socket socket = new Socket(SERVER_IP, PORT);

            System.out.println("서버에 연결되었습니다.");

            Thread sender = new ClientSender(socket, args[0]);
            Thread receiver = new ClientReceiver(socket);
            
            sender.start();
            receiver.start();
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (Exception e) { }
    }
    
    
}