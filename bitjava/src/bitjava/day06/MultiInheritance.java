package bitjava.day06;

public class MultiInheritance
{

	public static void main(String[] args)
	{
		IPTV iptv = new IPTV();
		iptv.on();

		TV tv = iptv;
		Computer com = iptv;
	}
}

/*
 * class TV
 * {
 * public void showTV()
 * {
 * System.out.print("���� ���");
 * }
 * }
 */
interface TV
{
	public void showTV();
}

/*
 * class Computer{
 * public void dataReceive(){
 * System.out.print("���� ������ ����");
 * }
 * }
 */
interface Computer
{
	public void dataReceive();
}

class IPTV implements TV, Computer
{
	public void dataReceive()
	{
		System.out.print("���� ������ ����");
	}

	public void showTV()
	{
		System.out.print("���� ���");
	}

	public void on()
	{
		dataReceive();
		showTV();
	}
}