package bitjava.day04;

// �迭{3,5,7,11,13,17,19}�� ������
public class ArrayEx05
{
	public static void showAll(int[] num)
	{
		for (int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + "	");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		int[] num = { 3, 5, 7, 11, 13, 17, 19 };
		int[] result = new int[num.length];

		//���� �迭 ���
		showAll(num);

		//������
		for (int i = 0; i<num.length; i++)
		{
			result[(num.length-1)-i]=num[i];
		}
		
		//������ �迭 ���
		showAll(result);

	}

}