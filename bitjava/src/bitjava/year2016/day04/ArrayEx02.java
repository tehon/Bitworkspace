package bitjava.year2016.day04;

import java.util.Scanner;

// ���ڿ� 4�� �Է� �޾Ƽ� ���ĺ������� ����
public class ArrayEx02
{

	public static void main(String[] args)
	{
		String[] arr = new String[4];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����Է��ϼ���");
		//�Է�
		for (int i = 0; i <= 3; i++)
		{
			
			arr[i] = sc.nextLine();
		}
		
		//����
		for (int i = 0; i <= 2; i++)
		{
			for (int j = i + 1; j <= 3; j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0){
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
		
		//���
		System.out.print("�Է��� ���ڴ� : ");

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "	");
		}
	}

}