package bitjava.year2016.day02;

public class Prob03
{

	public static void main(String[] args)
	{
		int ban = 3;
		Onecal cal = new Onecal();
		cal.cal(ban);
	}

}

class Onecal
{

	public void cal(int ban)
	{
		double result = ban * Math.PI;
		System.out.print(result);
	}

}
