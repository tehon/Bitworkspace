package bitjava.day01_06.CharEx02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

class ServerReceiver extends Thread {
    Socket socket;
    BufferedReader reader;
    PrintWriter writer;
    HashMap<String, PrintWriter> clients;
    
    public ServerReceiver(Socket socket, HashMap<String, PrintWriter> clients) {
        this.socket = socket;
        this.clients = clients;
        try {
        	//********************** 6. Socket으로부터 InputStream, OutputStream 을 얻음.
        	reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
        }
    }
    void sendToAll(String msg) {
        Iterator<String> it = clients.keySet().iterator();
        while (it.hasNext()) {
            PrintWriter writer = clients.get(it.next());
            writer.println(msg);
            writer.flush();
        } 
    } 
    
    @Override
    public void run() {
        String name = "";
        try {
            //name = in.readUTF();
        	name = reader.readLine();

        	clients.put(name, writer);
            sendToAll("*** " + name + "님이 들어오셨습니다. ***");
            System.out.println("*** 현재 서버접속자 수는 " 
                    + clients.size() + "입니다. ***");
            
            //*********************** 7. InputStream과 OutputStream을 이용한 통신
            //*********************** 8. 연결이 끊어질 때까지 통신
            while (reader != null) {
            	sendToAll(reader.readLine());
            }
        } catch (IOException e) {
            // ignore
        } finally {
            sendToAll("*** " + name + "님이 나가셨습니다. ***");
            clients.remove(name);
            System.out.println("*** [" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "에서 접속을 종료하였습니다. ***");
            System.out.println("*** 현재 서버접속자 수는 " + clients.size() + "입니다. ***");

        }
        
        try {
        	//*********************** 9. Socket의 close() 호출
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

    } 
} 

public class TcpIpMultichatServer3 {
	public static final int PORT = 3000;
	public static HashMap<String, PrintWriter> clients;
    public TcpIpMultichatServer3() {
        clients = new HashMap<String, PrintWriter>();
        //Collections.synchronizedMap(clients);
        
        //********************** 1. ServerSocket 생성
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("서버가 시작되었습니다. \n클라이언트의 접속을 기다립니다.");
            while (true) {
            	//************** 2. ServerSocket의 accept() 대기 (클라이언트가 접속할 때까지 대기)
            	//************** 5. 클라이언트가 접속을 시도하면 accept() 메소드가 클라이언트의 socket을 반환
            	socket = serverSocket.accept();
                System.out.println("[" + socket.getInetAddress() + ":"
                        + socket.getPort() + "]" + "에서 접속하였습니다.");

                ServerReceiver thread = new ServerReceiver(socket, clients);
                thread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String args[]) {
        new TcpIpMultichatServer3();
    }
    
    
}