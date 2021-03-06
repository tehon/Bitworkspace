package bitjava.day01_05.Prob01;

public class ThreadHeapMultiAccess
{

	public static void main(String[] args)
	{
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s, 1, 50);
		AdderThread at2 = new AdderThread(s, 51, 100);

		at1.start(); //extends Thread한 클래스의 인스턴스를 start();
		at2.start();

		try
		{
			at1.join();
			at2.join();
		} catch (InterruptedException e)
		{
			System.out.println("1-100 sum" + s.getNum());
		}
	}

}

class Sum
{
	int num;

	public Sum()
	{
		//
		this.num = 0;
	}

	public void addNum(int n)
	{
		this.num += n;
	}

	public int getNum()
	{
		return this.num;
	}
}

class AdderThread extends Thread
{
	Sum sumInst;
	int start, end;

	public AdderThread(Sum sum, int start, int end)
	{
		sumInst = sum;
		this.start = start;
		this.end = end;
		for (int i = start; i <= end; i++)
		{
			sumInst.addNum(i);
		}
	}
}