package bitjava.year2016.day02;

public class Prob06_1
{

	public static void main(String[] args)
	{
		int n=26;
		System.out.print(n+"의 2진수는 ");
		myToBinary(n);

	}

	public static void myToBinary(int num)
	{
		
		if (num == 0)
		{
			return ; //void에서 반환하는 값이 없게 하고 싶으면 return 쓰면 된다.
		} else
		{
			myToBinary(num/2);
			System.out.print(num%2);
		}

	}

}
