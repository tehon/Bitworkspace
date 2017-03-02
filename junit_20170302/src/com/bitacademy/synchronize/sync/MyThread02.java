package com.bitacademy.synchronize.sync;

public class MyThread02 extends Thread // Thread 상속?
{
	private MyArray myarray; // MyArray를 매개변수로 가지고 있다.

	public MyThread02(MyArray myArray)
	{
		this.myarray = myArray;
	}

	public void run()
	{
		try
		{
			while (true)
			{
				boolean go = myarray.push("MyThread02", 100);

				if (!go) // if(true)여야만 돌아가고 true=!false // go==false
				{
					break;
				}
			}
		}
		catch (Throwable e) // InterruptedException e
		{
			e.printStackTrace();
		}
	}
}
