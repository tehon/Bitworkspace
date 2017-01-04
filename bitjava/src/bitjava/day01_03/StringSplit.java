package bitjava.day01_03;

import java.util.StringTokenizer;

public class StringSplit
{

	public static void main(String[] args)
	{
		String str1 = "java servlet & java spring framework";
		String[] strArr = str1.split(" ");

		for (int i = 0; i < strArr.length; i++)
		{
			System.out.println(i + " : " + strArr[i]);
		}
		
		System.out.println("");
		
		StringTokenizer st = new StringTokenizer(str1," ");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			
		}
	}

}
