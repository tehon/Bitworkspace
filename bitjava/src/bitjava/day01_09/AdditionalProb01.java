package bitjava.day01_09;

import java.util.Scanner;

public class AdditionalProb01
{
	public static final boolean SHOW_PROGRESS = false;

	public static void main(String[] args)
	{
		// 입력
		Scanner kb = new Scanner(System.in);
		System.out.println("방번호 입력");
		int roomNum = 0;
		while (true)
		{
			roomNum = kb.nextInt();
			if (roomNum >= 1 && roomNum <= 1000 * 1000)
			{
				break;
			}
			System.out.println("다시 입력");
		}
		
		//
		int[] arrNumCount = new int[10];
		String strNum = "" + roomNum;
		for (int i = 0; i < strNum.length(); i++)
		{
			int nowNum = strNum.charAt(i) - '0';
			arrNumCount[nowNum]++;
		}
		
		//필요한 스티커 개수 계산
		int maxNum = 0;
		arrNumCount[6] += arrNumCount[9];
		arrNumCount[9] = 0;
		for (int i = 0; i <= 9; i++)
		{
			if (i != 6 && i != 9 && arrNumCount[i] > maxNum)
			{
				maxNum = arrNumCount[i];
			} else
			{
				if (arrNumCount[i] / 2.0f > maxNum)
				{
					maxNum = Math.round(arrNumCount[i] / 2.0f);
				}
			}
		}
		
		//결과 출력
		System.out.println();
		System.out.println(maxNum);
	}
}
