package bitjava.year2016.day04;

import java.util.Scanner;

// ���� 4���� �Է¹޾Ƽ� ������������ �����Ͽ� ���
public class ArrayEx01
{

	public static void main(String[] args)
	{
		int[] num = new int[4];

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 4; i++)
		{
			System.out.println("�����Է��ϼ���");
			num[i - 1] = sc.nextInt();
		}
		//����
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
		//���
		System.out.print("�Է��� ���ڴ� : ");

		for (int i = 0; i <= num.length - 1; i++)
		{
			System.out.print(num[i] + "	");
		}
	}

}