package bookq.Q05;

public class Q05_05
{

	public static void main(String[] args)
	{
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		// ballArr . �迭 �� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�
		for (int i = 0; i < ballArr.length; i++)
		{
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp=ballArr[j];
			ballArr[j]=ballArr[i];
			ballArr[i]=tmp;
		}
		// ballArr 3 ball3 . �迭 �� �տ��� ���� ���� �迭 �� �����Ѵ�
		
		for (int i = 0; i < ball3.length; i++)
		{
			ball3[i]=ballArr[i];
		}
		// System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		for (int i = 0; i < ball3.length; i++)
		{
			System.out.print(ball3[i]);
		}
	} // end of main
} // end of class