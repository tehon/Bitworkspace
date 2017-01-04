package bitjava.day01_03;

import java.util.Scanner;

public class ExceptionHandleUseTryCatch
{

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i = 0; i < 3; i++)
		{

			try
			{
				System.out.println("������ �Է� : ");
				int num1 = kb.nextInt();

				System.out.println("���� �Է� : ");
				int num2 = kb.nextInt();

				System.out.println("�������� ���� �ε��� : ");
				int idx = kb.nextInt();

				arr[idx] = num1 / num2;

				System.out.println("������ ��� :" + arr[idx]);
				System.out.println("����� �ε��� ��ġ" + idx);

			} catch (ArithmeticException e)
			{
				System.out.println("������ 0�� �ɼ� ����");
				i--;
				continue;
			} catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("��ȿ���� ���� �ε���");
				i--;
				continue;
			}
		}
	}

}