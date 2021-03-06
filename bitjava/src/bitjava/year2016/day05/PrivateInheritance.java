package bitjava.year2016.day05;

public class PrivateInheritance
{

	public static void main(String[] args)
	{
		SavingAccount sa = new SavingAccount(100000);
		sa.saveMoney(1000);
		sa.saveMoney(50000);
		sa.showSavedMoney();
	}

}

class Accumulator
{
	private int val;

	Accumulator(int init)
	{
		val = init;
	}

	protected void accumulate(int num)
	{
		if (num < 0)
			return;
		val += num;
	}

	protected int getAccVal()
	{
		return val;
	}
}

class SavingAccount extends Accumulator
{

	public SavingAccount(int initdeep)
	{
		super(initdeep);
	}

	public void saveMoney(int money)
	{
		accumulate(money);
	}

	public void showSavedMoney()
	{
		System.out.println(getAccVal());
	}

}