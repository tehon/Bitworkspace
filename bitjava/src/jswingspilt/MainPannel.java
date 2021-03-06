package jswingspilt;

import javax.swing.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class MainPannel extends JFrame implements ActionListener, KeyListener //jfram 상속하던거 jpanel로 바꿈
{
	// 메인 프레임
	JFrame mainFrame = new JFrame("");

	GamePannel gamepannel; //= new GamePannel();

	//컨테이너
	Container container;

	// 버튼 한개
	JButton startBtn = new JButton("start");

	public static void main(String[] args)
	{
		new MainPannel(); // 메인 패널 실행
	}

	public MainPannel()
	{
		gamepannel = new GamePannel();
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
		container.add(gamepannel);

		// 키 리스너 이벤트 설정
		mainFrame.addKeyListener(this);
		// this는 keyPressed를 가르킴

		/*DrawSqure drawSqure = new DrawSqure();
		mainFrame.add(drawSqure);*/
	}

	//버튼,타이머 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//스타트 버튼 처리
		if (e.getSource().equals(startBtn))
		{
			//game 스타트 함수 실행

			gamepannel.GameStart();
			mainFrame.requestFocusInWindow(); //키 프레스의 메인 포커스를 강제로 요청해서 얻어내는 메소드
		}

		//타이머 처리
		else
		{
			System.out.println("무언가 잘못 되었다" + e.getSource());

		}

	}

	// 키값 받아서 처리하는 메소드들
	@Override
	public void keyTyped(KeyEvent e)
	{
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		//System.out.println("main" + e.getKeyCode());
		gamepannel.squreMove(e.getKeyCode()); //obj도 같이 보내야하나..

	}

}
