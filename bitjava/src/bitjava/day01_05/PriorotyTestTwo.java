package bitjava.day01_05;

// Thread.MAX_PRIORITY
public class PriorotyTestTwo
{

	public static void main(String[] args)
	{
		MessageSendingThread2 tr1 = new MessageSendingThread2("asd", Thread.MAX_PRIORITY); // 쓰레드의 우선순위 지정해주기
		MessageSendingThread2 tr2 = new MessageSendingThread2("erf", Thread.NORM_PRIORITY); // 우선순위는 1-10까지 10이 젤 급함
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
				sleep(1); // sleep() 호출시 쓰레드는 CPU의 할당이 불필요한 상태가 된다.
						  // 따라서 다른 쓰레드한테 CPU를 양보한다

			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}
}