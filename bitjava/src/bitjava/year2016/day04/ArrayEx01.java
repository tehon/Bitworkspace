package bitjava.year2016.day04;

import java.util.Scanner;

// 숫자 4개를 입력받아서 오름차순으로 정렬하여 출력
public class ArrayEx01
{

	public static void main(String[] args)
	{
		int[] num = new int[4];

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 4; i++)
		{
			System.out.println("숫자입력하세요");
			num[i - 1] = sc.nextInt();
		}
		//정렬
		for (int i = 0; i <= 2; i++)
		{
			for (int j = i + 1; j <= 3; j++)
			{
				if (num[i] > num[j])
				{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		//출력
		System.out.print("입력한 숫자는 : ");

		for (int i = 0; i <= num.length - 1; i++)
		{
			System.out.print(num[i] + "	");
		}
	}

}
