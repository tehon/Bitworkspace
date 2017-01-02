package bitjava.day05;

public class Overriding
{

	public static void main(String[] args)
	{
		BaseEnSpeaker bs = new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();
	}

}

class Speaker
{
	private int volumeRate;

	public void showCurrentState()
	{
		System.out.println(volumeRate);
	}

	public void setVolume(int vol)
	{
		volumeRate = vol;
	}
}

class BaseEnSpeaker extends Speaker
{
	private int baseRate;

	@Override //�ٸ� �����ڵ��� ���� �־��ִ� ������..
	public void showCurrentState() //�������̵� �ؼ� ������ �ϴ� ���̴�
	{
		super.showCurrentState();
		System.out.println(baseRate);
	}

	public void setBaseRate(int base)
	{
		baseRate = base;
	}
}