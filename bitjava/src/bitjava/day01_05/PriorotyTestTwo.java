package bitjava.day01_05;

// Thread.MAX_PRIORITY
public class PriorotyTestTwo
{

	public static void main(String[] args)
	{
		MessageSendingThread2 tr1 = new MessageSendingThread2("asd", Thread.MAX_PRIORITY); // �������� �켱���� �������ֱ�
		MessageSendingThread2 tr2 = new MessageSendingThread2("erf", Thread.NORM_PRIORITY); // �켱������ 1-10���� 10�� �� ����
		MessageSendingThread2 tr3 = new MessageSendingThread2("zxc", Thread.MIN_PRIORITY);

		tr1.start();
		tr2.start();
		tr3.start();
	}

}

class MessageSendingThread2 extends Thread
{
	String message;

	public MessageSendingThread2(String str, int prioroty)
	{
		message = str;
		setPriority(prioroty);
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println(message + "	" + getPriority());
			try
			{
				sleep(1); // sleep() ȣ��� ������� CPU�� �Ҵ��� ���ʿ��� ���°� �ȴ�.
						  // ���� �ٸ� ���������� CPU�� �纸�Ѵ�

			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}
}