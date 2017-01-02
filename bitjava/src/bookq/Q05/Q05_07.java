package bookq.Q05;

public class Q05_07
{
	public static void main(String args[])
	{
		if (args.length != 1)
		{
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		// . . ���ڿ��� ���ڷ� ��ȯ�Ѵ� �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�
		int money = Integer.parseInt(args[0]);
		System.out.println("money=" + money);
		int[] coinUnit = { 500, 100, 50, 10 }; // ������ ����
		int[] coin = { 5, 5, 5, 5 }; // ������ ������ ����
		for (int i = 0; i < coinUnit.length; i++)
		{
			int coinNum = 0;
			/*
			 * (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�
			 * 1. (money) (coinNum) . �ݾ� �� ���������� ������ �ʿ��� ������ ���� �� ���Ѵ�
			 * 2. coin coinNum . �迭 ���� ��ŭ�� ������ ����
			 * ( coin .) ���� ����� ������ ���ٸ� �迭 �� �ִ� ��ŭ�� ����
			 * 3. (coinNum) . �ݾ׿��� ������ ���� �� ���������� ���� ���� ����
			 */
			//System.out.println(coinUnit[i]+"�� : "+money/coinUnit[i]);
			//money=money%coinUnit[i];

			//System.out.println(coinUnit[i]+"�� �ʿ��� ���� : "+money/coinUnit[i]);

			if (coin[i] - (money / coinUnit[i]) >= 0)
			{
				//���� ���� �Ѿ
				coinNum = money / coinUnit[i];
				money = money - ((money / coinUnit[i]) * coinUnit[i]);
				coin[i] -= coinNum;
			} else if (coin[i] - (money / coinUnit[i]) < 0)
			{
				//���� ���� 
				coinNum = coin[i];//money / coinUnit[i];
				money = money - (coinUnit[i] * coin[i]);
			}

			System.out.println(coinUnit[i] + "�� : " + coinNum);
		}
		if (money > 0)
		{
			System.out.println("�Ž������� �����մϴ�. ");
			System.exit(0); // . ���α׷��� �����Ѵ�
		}
		System.out.println("= ���� ������ ���� =");
		for (int i = 0; i < coinUnit.length; i++)
		{
			System.out.println(coinUnit[i] + "�� : " + coin[i]);
		}
	} // main
}