package bitjava.year2016.day03;

public class SelfReference
{

	public static void main(String[] args)
	{
		SimpleAdder adder = new SimpleAdder();
		adder.add(1).add(3).add(5).showResult();
	}

}

class SimpleAdder
{
	private int num;

	public SimpleAdder()
	{
		num = 0;
	}

	public SimpleAdder add(int num)
	{
		this.num += num;
		return this;//null;
	}

	public void showResult()
	{
		System.out.println("add result : " + num);
	}

}