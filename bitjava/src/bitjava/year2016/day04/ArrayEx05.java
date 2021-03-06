package bitjava.year2016.day04;

// 배열{3,5,7,11,13,17,19}를 뒤집기
public class ArrayEx05
{
	public static void showAll(int[] num)
	{
		for (int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + "	");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		int[] num = { 3, 5, 7, 11, 13, 17, 19 };
		int[] result = new int[num.length];

		//기존 배열 출력
		showAll(num);

		//뒤집기
		for (int i = 0; i<num.length; i++)
		{
			result[(num.length-1)-i]=num[i];
		}
		
		//뒤집은 배열 출력
		showAll(result);

	}

}
