package jswingspilt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.Timer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class GamePannel extends JPanel implements ActionListener
{
	// 게임 패널
	//static JPanel gameFrame;

	//사각형 객체 세트를 담는 JsonArr
	public JSONArray squreArr = new JSONArray();

	//사각형 객체 하나를 담는 jsonObj
	public JSONObject squreObj;

	//사각형 객체 숫자 세기  -- 없어도 될것같다. //필요한거 같다.. 사각형 분류를 해야하는데 번호말고 따로 할거있냐.  미리 객체들을 만들어놓고 하나씩 꺼내서 쓸건지, 필요할때 새 객체를 만들어서 뽑아 낼건지..
	int squreCont;

	//타이머 
	Timer downtime;

	//drawsqure 연동중
	DrawSqure drawSqure;

	public GamePannel()

	{
		this.setSize(300, 500);
		this.setLocation(5, 25);
		this.setVisible(true);
		this.setBackground(Color.white);

		//this.addKeyListener(this); -- 이건 여기말고 메인 패널에 액션리스너가 들어갔다.
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
		//this.removeAll();//gameFrame.removeAll();
		this.revalidate(); //gameFrame.revalidate();
		this.repaint(); //gameFrame.repaint();

	}

	//게임에서 반복되는 영역을 처리한다
	private void GameGo()
	{
		//System.out.println("game go 호출"); // 반복 안됨
		//Graphics g; // 이거 왜 있는 거지?
		int X = Integer.parseInt(squreObj.get("X").toString()); // 값받아오는 거 ㅂ확인 되면 지워도 됨
		int Y = Integer.parseInt(squreObj.get("Y").toString());

		// 내가 움직인 값 더하기 키 리스너받을때 값 바꿔주기

		//움직이는 사각형에만 Y값 더해주기
		if (squreObj.get("control").toString().equals("1"))
		{
			System.out.println("스퀘어 오브젝트");
			squreObj.replace("Y", Y -= 50);
			// 사각형들 그리기 // 화면 다시 그려주기9
			
			//
			Graphics g = getGraphics();

		    Graphics2D g2d = (Graphics2D)g;
		    System.out.println(g);
			g2d.fillRect(X, Y, 250, 250);
			g2d.setColor(Color.black);
			//
	
			// this.add(new DrawSqure()); // > 그림도 안그려지면서 페인트 호출만 늘어남 
			//new DrawSqure(); >페인트 호출 안됨
			regameFrame();

		}

		System.out.println("타임" + X + "," + Y);

		//타임이 멈춰주기if(게임종료면)
		if (Y <= 0)
		{
			downtime.stop();
			System.out.println("끝");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(downtime))
		{
			//다운 타임 이랑 같은게 들어오면 게임 사각형 내려가는 함수 실행
			//게임 데이터 바뀌는 메소드
			GameGo();

		}
	}

	// 키 값 받아서 사각형 움직이게 하는 메소드
	void squreMove(int keyCode)
	{
		if (squreArr.size() > 0)
		{ //squreArr 안에 객체가 한개라도 들어야 키 프레스 값이 활성화됨
			if (keyCode == 65)
			{

				if (squreObj.get("control").toString().equals("1"))
				{
					//System.out.println("왼쪽");
					int X = Integer.parseInt(squreObj.get("X").toString());
					if (X >= 10)
					{ // X를 0이하로 안 보낼것이다 --유동적으로 바뀌어야함 game프레임의 Y값에서 이동거리를 더한 값, 그러려면 X랑 Y의 이동거리 변수?를 위에서 지정해줘야함 
						squreObj.replace("X", X - 10);
					}
					// 사각형 그리고 화면 다시 그리기

					regameFrame();

				}
			} else if (keyCode == 68)
			{

				if (squreObj.get("control").toString().equals("1"))
				{
					//System.out.println("오른쪽");
					int X = Integer.parseInt(squreObj.get("X").toString());
					if (X <= 490)
					{ // X를 490이상로 안 보낼것이다 --유동적으로 바뀌어야함 game프레임의 Y값크기에서 이동거리를 뺀 값, 그러려면 X랑 Y의 이동거리 변수?를 위에서 지정해줘야함 
						squreObj.replace("X", X + 10);
					}
					// 사각형 그리고 화면 다시 그리기

					regameFrame();

				}

			} else if (keyCode == 83)
			{
				if (squreObj.get("control").toString().equals("1"))
				{
					//System.out.println("아래");
					int Y = Integer.parseInt(squreObj.get("Y").toString());
					squreObj.replace("Y", Y - 10);

				}
				// 사각형 그리고 화면 다시 그리기

				regameFrame();
			} else
			{
				//System.out.println("아무거나");
			}

			regameFrame(); // 다시 그리기
		}//squreArr 안에 객체가 한개라도 들어야 키 프레스 값이 활성화됨 끝
	}
/*	 @Override
	    public void paint(Graphics g) {//Component
		  System.out.println("paint 호출"); 
		  //rectangle originates at 10,10 and ends at 240,240
			Graphics2D g2d = (Graphics2D)g;
			g2d.fillRect(410, 150, 250, 250);
			g2d.setColor(Color.black);
			 g.fillRect(100, 10, 60, 50);
	    }*/ // 판이 새로 생김? ㅋ
}
