package bitjava.year2016.day02;

public class ReculFactorial
{

	public static void main(String[] args)
	{
		System.out.println(factorial(3));
		System.out.println(factorial(5));
		System.out.println(factorial(7));
	}

	public static int factorial(int n)
	{
		if (n == 1)
		{
			return 1;
		} else
		{
			return n * factorial(n - 1);
		}

	}

}
