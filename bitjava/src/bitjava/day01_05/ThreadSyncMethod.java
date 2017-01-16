package bitjava.day01_05;

public class ThreadSyncMethod
{

	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		at.start();
		mt.start();

		try
		{
			at.join();
			mt.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		cal.showopCnt();
	}

}

class Calculator
{
	int opCnt = 0;

	public/* synchronized */int add(int n1, int n2) // ����� �޼ҵ� ����ȭ synchronized
	{
		synchronized (this) // ���� ����ȭ
		{
			opCnt++; //���⼭ ����ȭ �ʿ�
			return n1 + n2;
		}
	}

	public/* synchronized */int min(int n1, int n2) // synchronized
	{
		synchronized (this)
		{
			opCnt++; //���⼭ ����ȭ �ʿ�
			return n1 - n2;
		}

	}

	public void showopCnt()
	{
		System.out.println("�� ����Ƚ�� : " + opCnt);
	}
}

class AddThread extends Thread
{
	Calculator cal;

	public AddThread(Calculator cal)
	{
		this.cal = cal;
	}

	@Override
	public void run()
	{
		System.out.println(cal.add(2, 3));
		System.out.println(cal.add(5, 3));
	}
}

class MinThread extends Thread
{
	Calculator cal;

	public MinThread(Calculator cal)
	{
		this.cal = cal;
	}

	@Override
	public void run()
	{
		System.out.println(cal.min(2, 3));
		System.out.println(cal.min(5, 3));
	}
}