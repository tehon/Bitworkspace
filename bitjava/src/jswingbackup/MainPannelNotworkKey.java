package jswingbackup;

import javax.swing.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainPannelNotworkKey extends JFrame implements ActionListener, KeyListener
{
	// 메인 프레임
	JFrame mainFrame = new JFrame("");

	// 게임 패널
	JPanel gameFrame = new JPanel();

	//컨테이너
	Container container;

	//사각형 객체 세트를 담는 JsonArr
	public JSONArray squreArr = new JSONArray();;

	//사각형 객체 하나를 담는 jsonObj
	public JSONObject squreObj;

	//사각형 객체 숫자 세기  -- 없어도 될것같다.
	int squreCont;

	//타이머 
	Timer downtime;

	// 버튼 한개
	JButton startBtn = new JButton("start");

	// 움직이는 사각형 하나.. 나중에 여기서 사라져야함

	public static void main(String[] args)
	{
		new MainPannelNotworkKey(); // 메인 패널 실행
	}

	public MainPannelNotworkKey()
	{

		// 메인 프레임 설정
		mainFrame.setSize(600, 600); // 프레임 크기 지정
		mainFrame.setVisible(true); // 프레임 보이게 설정
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 버튼 설정

		// 메인 프레임 위치 설정
		Dimension frameSize = mainFrame.getSize(); // 메인 프레임 크기 구하기
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // 모니터 화면 크기 구하기

		mainFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2); // 가운데로 위치 설정

		// 컨테이너 설정
		container = mainFrame.getContentPane();
		container.setLayout(null);

		// 스타트 버튼 위치 설정
		startBtn.setSize(70, 30);
		startBtn.setLocation(350, 180);
		container.add(startBtn);

		// 스타트 버튼 이벤트 설정
		startBtn.addActionListener(this);

		// 게임 패널 설정
		gameFrame.setSize(300, 500);
		gameFrame.setLocation(5, 25);
		gameFrame.setVisible(true);
		gameFrame.setBackground(Color.white);
		container.add(gameFrame);

		
		mainFrame.addKeyListener(this);
		//gameFrame.addKeyListener(this);
	}

	//버튼,타이머 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//스타트 버튼 처리
		if (e.getSource().equals(startBtn))
		{
			//game 스타트 함수 실행
			GameStart();

		}
		
		//타이머 처리
		else if (e.getSource().equals(downtime))
		{
			//다운 타임 이랑 같은게 들어오면 게임 사각형 내려가는 함수 실행
			//게임 데이터 바뀌는 메소드
			GameGo();
		} else
		{
			System.out.println(e.getSource() + "??");

		}

	}

	//게임 시작하는 메소드1 - 반복문을 돌리는 메소드를 실행하고 패널에 필요한 것을 추가한다.
	public void GameStart()
	{

		//사각형 객체들을 생성 배열로 생성, 그 객체마다 다른 y값을 가지게 설정해야함

		//사각형 객체 숫자세기  -- 없어도 될것같다.
		squreCont = 1;

		//새 사각형 객체 넣는 메소드
		InputSqureArr();

		int squreY = 0;
		// while문 돌리기 위한 객체
		boolean end = false;
		downtime = new Timer(1000, this);

		//1초마다 타임 ㄱㄱ
		downtime.start();

	}

	private void InputSqureArr()
	{
		squreObj = new JSONObject(); //Obj 초기화
		squreObj.put("squreNum", squreCont++); // 사각형 객체 분류 번호..?????  -- 없어도 될것같다.
		squreObj.put("X", 120); //사각형의 X값
		squreObj.put("Y", 500); //사각형의 Y값
		squreObj.put("line", 0); //사각형이 어느 라인에 있는 지 나타내는 건데 어차피 라인 한칸씩 내려가니까 Y값을 라인이랑 연결 계산해서 만드는 것도 괜찮을듯
		squreObj.put("stopX", 300); //사각형이 멈춘 X값
		squreObj.put("stopY", 300); //사각형이 멈춘 Y값
		//회전 값
		squreObj.put("control", 1);//현재 내가 잡고 있는지
		squreArr.add(squreObj); //Arr이에 넣어줌
	}

	//게임 패널 다시 그려주는 메소드
	public void regameFrame()
	{
		gameFrame.revalidate();
		gameFrame.repaint();
	}

	//게임에서 반복되는 영역을 처리한다
	private void GameGo()
	{
		int Y = Integer.parseInt(squreObj.get("Y").toString());

		// 내가 움직인 값 더하기

		//움직이는 사각형에만 Y값 더해주기
		if (squreObj.get("control").toString().equals("1"))
		{
			squreObj.replace("Y", Y -= 50);
		}

		// 사각형들 그리기
		System.out.println("타임" + Y);
		regameFrame();

		//타임이 멈춰주기if(게임종료면)
		if (Y == 0)
		{
			downtime.stop();
			System.out.println("끝");
		}

	}

	//사각형들 그려주는 메소드 추가 해야함
	
	// 키값 받아서 처리하는 메소드들
	@Override
	public void keyTyped(KeyEvent e)
	{
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		System.out.println("keyPressed" + e.getKeyCode());
		squreMove(e.getKeyCode()); //obj도 같이 보내야하나..
		

	}
	@Override
	public void keyReleased(KeyEvent e)
	{
		//System.out.println("keyReleased"+e.getKeyCode());
	}
	// 키값 받아서 처리하는 메소드들 끝
	
	// 키 값 받아서 사각형 움직이게 하는 메소드
	private void squreMove(int keyCode)
	{
		if (keyCode == 65)
		{
			System.out.println("왼쪽");

		} else if (keyCode == 68)
		{
			System.out.println("오른쪽");

		} else if (keyCode == 83)
		{
			System.out.println("아래");
		} else
		{
			System.out.println("아무거나");
		}
	}

	
}