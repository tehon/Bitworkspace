package bitjava.day03;

public class Prob17
{
//��Ʈ�� Ŭ������ chatAt()����ϴ� ����̶� StringBuolder Ŭ������ �̿��ϴ� ���
	public static void main(String[] args)
	{
		String str = "1234567890ABCDEFG";
		StringBuilder sb = new StringBuilder(str);
		//1)
		for (int i = str.length() - 1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		
		}
		System.out.println();
		//2)
		/*
		 * ���� Ǭ ��� sb.chatAt���� ���� string�̿��ϵ� �̿��ߴ�.
		 * for (int i = sb.toString().length() - 1; i >= 0; i--)
		{
			System.out.print(sb.charAt(i));		
		}*/
		System.out.print(sb.reverse());  //stringbuilder�� reverse�Լ��� �ִ�.
		
	}

}