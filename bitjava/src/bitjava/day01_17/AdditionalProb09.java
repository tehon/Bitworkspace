package bitjava.day01_17;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionalProb09
{

	public static void main(String[] args)
	{
		/*
		 * Scanner kb = new Scanner(System.in);
		 * System.out.print("입력 : ");
		 * String strInput = kb.nextLine();
		 */

		String strInput = ":-) 행복하니 안행복하니 :-( :() :-(그건 아무도 모르지 :-(  ::";

		int happy = 0;
		int unhappy = 0;

		ArrayList<String> arrayStr = new ArrayList<String>();

		for (int i = 0; i <= strInput.length() - 1; i++)
		{
			char ch = strInput.charAt(i);
			if (ch == ':')
			{

				//System.out.println("찾음");

				if (strInput.length() - i > 2)// 해결은 함 / 마지막칸에 : 들어가면 오류남 해결할 방법을 생각해봐 
				{

					//-도 생각해 줘야하나 찾는건 어렵지 않은데 무지 귀찮네 흠 할일 없으니까 해주자
					char chx = strInput.charAt(i + 1);
					if (chx == '-')
					{
						char chy = strInput.charAt(i + 2);
						if (chy == ')')
						{
							//System.out.println("웃음");
							happy++;
						} else if (chy == '(')
						{
							//System.out.println("움");
							unhappy++;
						}
					}
				}

			}

		}

		//
		System.out.println(happy+"	"+unhappy);
		if (happy > unhappy)
		{
			System.out.println("행복함");
		} else if (happy < unhappy)
		{
			System.out.println("안행복함");
		} else if (happy == unhappy)
		{
			System.out.println("똑같음");
		} else if (happy == 0 & unhappy == 0)
		{
			System.out.println("감정 없음");
		}

	}

}
//문제 9
//:-) 개수랑
//:-( 개수를 비교
//		
//		chatAt()
//		indexOf()