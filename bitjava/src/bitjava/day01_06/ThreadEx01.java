package bitjava.day01_06;

public class ThreadEx01
{

	public static void main(String[] args)
	{
		ThreadB b = new ThreadB();
		b.start();

		synchronized (b)
		{
			try
			{
				System.out.println("B wait for end");
				b.wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Total is : " + b.total);
	}

}

class ThreadB extends Thread
{
	int total;

	@Override
	public void run()
	{
		synchronized (this)
		{
			System.out.println("B start");
			for (int i = 0; i < 100; i++)
			{
				total++;
				notify(); //자고 있는 쓰레드를 깨운다
			}

		}
	}
}