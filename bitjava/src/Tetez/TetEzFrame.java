package Tetez;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Tetez.FlyingTextEx.MyKeyListener;

public class TetEzFrame extends JFrame
{
	// 메인 패널
	JPanel contentPane = new JPanel();
	final int move = 40;

	//사각형 위치

	public static void main(String[] args)
	{
		new TetEzFrame();

	}

	TetEzFrame()
	{
		setTitle("사각형 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());

		setSize(300, 300);
		setVisible(true);
		contentPane.requestFocus();

		
		squXY xy= new squXY(5,6);
		xy.getX();
	}

	class MyKeyListener extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			switch (keyCode)
				{
				case KeyEvent.VK_UP:
					break;
				case KeyEvent.VK_DOWN:
					
					break;
				case KeyEvent.VK_LEFT:
					
					break;
				case KeyEvent.VK_RIGHT:
					
					break;
				}
		}
	}

	static class squXY
	{

		static int x;
		static int y;

		public squXY()
		{
			x = 0;
			y = 0;
		}

		public squXY(int x, int y)
		{
			this.x = x;
			this.y = y;

		}

		public int getX()
		{
			return x;
		}

		public void setX(int x)
		{
			this.x = x;
		}

		public int getY()
		{
			return y;
		}

		public void setY(int y)
		{
			this.y = y;
		}
	}

}
