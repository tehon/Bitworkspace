package bitjava.day01_16;

import java.util.Scanner;

public class Prob01
{

	public static void main(String[] args)
	{
		/*
		 * Scanner kb = new Scanner(System.in);
		 * String str = kb.nextLine();
		 */
		
		String str = "I am a Java Progammer";
		String[] strArr = new String[str.length()];
		
		// ���ڿ��� ������ ������ �迭�� �ֱ� �ٵ� �迭�ϱ� ������Ʈ�ϱ� �����ϱ� �װ� ���� 
		
		
	//strArr[2] = str.substring(0,1); 
	
		for (int i = 0; i < strArr.length; i++)
		{
			strArr[i] = str.substring(i,i+1); 
		}
		// ���� �� �ؾ����� �� �𸣰ڴ� �׷� ����
	System.out.println(strArr[6]);
		
	}

}

/*
 * ���� 8
 * 
 * -- 1�ܰ�
 * �Է� ���ڿ� i am a java progammer
 * ��� 5��
 * ���ڿ� ���� ��� �ϴ°�
 * 
 * -- 2�ܰ�
 * i am, a java programmer
 * ���� �ߺ�ó�� ��ǥ ��ħǥ ó��
 * 
 * -- 3�ܰ� ��� 5�� . ���� ��� ����
 * i am, a java programmer.
 * 
 * ��Ʈ���� ���� 1�ܰ� (awt)
 * rotate() �޼��� �ϼ�
 * �������� �̵� ���������� �̵� �� ��Ȯ�� �˻� ���� �߰�
 */