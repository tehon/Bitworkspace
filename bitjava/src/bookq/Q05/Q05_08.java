package bookq.Q05;

public class Q05_08
{

	public static void main(String[] args)
	{
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		for (int i = 0; i < answer.length; i++)
		{
			/* (1) .�˸��� �ڵ带 �־� �ϼ��Ͻÿ� */
			switch (answer[i])
				{
				case 1:
					counter[0]+=1;
					break;
				case 2:
					counter[1]+=1;
					break;
				case 3:
					counter[2]+=1;
					break;
				case 4:
					counter[3]+=1;
					break;
				default:
					break;
				}
			//counter �Լ��� ����ߴ�..
		}
		for (int i = 0; i < counter.length; i++)
		{
			System.out.print(counter[i]+"");
			for (int j = 0; j < counter[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	} // end of main
} // end of class