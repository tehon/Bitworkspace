package jswingbackup;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPannelOfTheadSleep extends JFrame implements ActionListener
{
	// ���� ������
	JFrame mainFrame = new JFrame("");

	// ���� �г�
	JPanel gameFrame = new JPanel();

	//�����̳�
	Container container;

	//���� �����̳�

	// ��ư �Ѱ�
	JButton startBtn = new JButton("start");

	// �����̴� �簢�� �ϳ�.. ���߿� ���⼭ ���������

	public static void main(String[] args)
	{
		new MainPannelOfTheadSleep(); // ���� �г� ����
	}

	public MainPannelOfTheadSleep()
	{
		// ���� ������ ����
		mainFrame.setSize(600, 600); // ������ ũ�� ����
		mainFrame.setVisible(true); // ������ ���̰� ����
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ��ư ����

		// ���� ������ ��ġ ����
		Dimension frameSize = mainFrame.getSize(); // ���� ������ ũ�� ���ϱ�
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // ����� ȭ�� ũ�� ���ϱ�

		mainFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2); // ����� ��ġ ����

		// �����̳� ����
		container = mainFrame.getContentPane();
		container.setLayout(null);

		// ��ŸƮ ��ư ��ġ ����
		startBtn.setSize(70, 30);
		startBtn.setLocation(350, 180);
		container.add(startBtn);

		// ��ŸƮ ��ư �̺�Ʈ ����
		startBtn.addActionListener(this);

		// ���� �г� ����
		gameFrame.setSize(300, 500);
		gameFrame.setLocation(5, 25);
		gameFrame.setVisible(true);
		gameFrame.setBackground(Color.white);
		container.add(gameFrame);

	}

	//��ư �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(startBtn))
		{
			//game ��ŸƮ �Լ� ����
			GameStart();
		}
	}

	//���� �����ϴ� �޼ҵ�
	public void GameStart()
	{

		JLabel startlabel = new JLabel("�����մϴ�..");
		startlabel.setSize(5, 25);
		startlabel.setLocation(100, 100);
		startlabel.setBackground(Color.red);
		gameFrame.add(startlabel);

		//�ٽ� �׷���
		regameFrame();

		// 1�� �ڿ� 
		try
		{
			Thread.sleep(500);
			GameGo();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		//���� ���� > �Ⱥ������� �����صξ��µ� �ƿ� �����ϴ°� ���� �Ű���. �ٵ� �����ϴ� ���� �־���
		//startlabel.setVisible(false); �ȵȴ� �� �����̰� ���� ���������

		//���� ����

	}

	//���� �г� �ٽ� �׷��ִ� �޼ҵ�
	public void regameFrame()
	{
		System.out.println("regameFrame.");
		gameFrame.revalidate();
		gameFrame.repaint();
	}

	private void GameGo()
	{

		//�簢�� ��ü���� ���� �迭�� ����, �� ��ü���� �ٸ� y���� ������ �����ؾ���
		int squreY = 0;

		// while�� ������ ���� ��ü
		boolean end = false;

		//for�� while�� �̿��ؼ� ���� ���������� �ݺ���Ŵ
		while (!end)
		{

			//0.5�� �ڿ� �簢�� �������� ���� ǥ��
			try
			{
				Thread.sleep(500);
				//�簢���� ������!
				squreY += 100;

			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			//�ٽ� �� �׷���
			regameFrame();

			//���� ������ ���� ����
			if (squreY > 700)
			{
				end = true;
			}

		}
	}

	//�� > �׷��ִ� �޼ҵ�

}