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
				System.out.println("피제수 입력 : ");
				int num1 = kb.nextInt();

				System.out.println("제수 입력 : ");
				int num2 = kb.nextInt();

				System.out.println("연산결과를 넣을 인덱스 : ");
				int idx = kb.nextInt();

				arr[idx] = num1 / num2;

				System.out.println("나눗셈 결과 :" + arr[idx]);
				System.out.println("저장된 인덱스 위치" + idx);

			} catch (ArithmeticException e)
			{
				System.out.println("제수는 0이 될수 없음");
				i--;
				continue;
			} catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("유효하지 않은 인덱스");
				i--;
				continue;
			}
		}
	}

}
