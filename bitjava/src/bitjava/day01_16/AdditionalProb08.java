package bitjava.day01_16;

import java.util.ArrayList;
import java.util.Scanner;

// ���� 8 ���� �ߺ�ó��.. ġ�� ������ �׳� ����
// ����
public class AdditionalProb08
{

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("�Է� : ");
		String strInput = kb.nextLine();

		ArrayList<String> arrayStr = new ArrayList<String>();

		String s = "";
		for (int i = 0; i < strInput.length(); i++)
		{
			char ch = strInput.charAt(i);
			if (ch == ' ' || ch == ',' || ch == '.')
			{
				arrayStr.add(s);
				s = "";
			} else
			{
				s += ch;
			}
		}
		System.out.println(arrayStr.size()+"��");
		for (int i = arrayStr.size()-1; i >=0; i--)
		{
			System.out.println(arrayStr.get(i));
		}
		System.out.println();
	}

}