package bitjava.day03;

import java.util.Scanner;

public class Prob09
{
	//compareTo
	//���ڿ������͸� ���� StringBuffer Ŭ������ �����ϰ�, �̸� �־��� ���ڿ��� ���ϴ� �ڵ带 �ۼ��ϼ���
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer(); //StringBuffer sb = new StringBuffer("BitAcademy");
		sb.append("BitAcademy");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.print(sb.toString().compareTo(input));
		if(sb.toString().compareTo(input)<0){
			System.out.println(
					"��Ʈ��ī���̰� �ռ�"
					);
		}
		else if(sb.toString().compareTo(input)>0){
			System.out.println(
					"�� �ռ�"
					);
		}
		else{
			System.out.println(
					"���Ȱ� ��"
					);	
		}
	}

}