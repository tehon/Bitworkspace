package bitjava.day04;

import java.util.Scanner;

// ���� 1���� �Է¹޾� �־��� �迭{3,5,7,11,13,17,19}�� �ش� ���ڰ� �����ϴ��� �Ǵ��Ͽ� ��� ���
public class ArrayEx03
{

	public static void main(String[] args)
	{
		int[] num = { 3, 5, 7, 11, 13, 17, 19 };
		Scanner sc = new Scanner(System.in);
		int numFind;

		//�Է�
		System.out.println("�����Է��ϼ���");
		numFind = sc.nextInt();

		//����
		boolean bResult = false;
		for (int i = 0; i < num.length; i++)
		{
			if (num[i] == numFind)
			{
				bResult = true;
			}
		}

		//���
		if (!bResult)
		{
			System.out.println("����");
		} else
		{
			System.out.println("�ִ�");
		}
	}

}